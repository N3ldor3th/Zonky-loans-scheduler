package cz.zonky.interview.task.kuznik.zonkyloanslisting.connectors;

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

    @Value("${zonky.api.marketplace.url}")
    private String marketPlaceUrl;

    public String getAllLoans() {
        ResponseEntity<String> response;

        response = restTemplate.exchange(marketPlaceUrl, HttpMethod.GET, httpEntity, String.class);

        return response.getStatusCode() == HttpStatus.OK ? response.getBody() : null;
    }
}
