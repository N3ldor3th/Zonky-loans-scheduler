package cz.zonky.interview.task.kuznik.zonkyloanslisting.connectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ZonkyRestConnector implements LoansConnector {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpEntity<String> httpEntity;

    private static final Logger LOGGER = LoggerFactory.getLogger(ZonkyRestConnector.class);

    @Value("${zonky.api.marketplace.url}")
    private String marketPlaceUrl;

    public String getAllLoans() {
        ResponseEntity<String> response = null;

        try {
            response = restTemplate.exchange(marketPlaceUrl, HttpMethod.GET, httpEntity, String.class);
        } catch (RuntimeException runtimeException) {
            LOGGER.error(runtimeException.getLocalizedMessage());
        }

        return response != null && response.getStatusCode() == HttpStatus.OK ? response.getBody() : null;
    }
}
