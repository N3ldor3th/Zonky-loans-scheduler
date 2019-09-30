package cz.zonky.interview.task.kuznik.zonkyloanslisting.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

import static org.springframework.http.HttpStatus.Series.CLIENT_ERROR;
import static org.springframework.http.HttpStatus.Series.SERVER_ERROR;

@Component
public class ZonkyRestTemplateErrorHandler implements ResponseErrorHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZonkyRestTemplateErrorHandler.class);

    @Override
    public boolean hasError(ClientHttpResponse httpResponse) throws IOException {

        return (httpResponse.getStatusCode().series() == CLIENT_ERROR || httpResponse.getStatusCode().series() == SERVER_ERROR);
    }

    @Override
    public void handleError(ClientHttpResponse httpResponse) throws IOException {

        if (httpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
            LOGGER.error("It's server error. Something has ZONKed out. HTTP error code : "
                    + httpResponse.getRawStatusCode() + " : " + httpResponse.getStatusCode().getReasonPhrase());
        } else if (httpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
            LOGGER.error("It's client error. Check the doc carefully at https://zonky.docs.apiary.io/#. HTTP error code : "
                    + httpResponse.getRawStatusCode() + " : " + httpResponse.getStatusCode().getReasonPhrase());
        }
    }
}
