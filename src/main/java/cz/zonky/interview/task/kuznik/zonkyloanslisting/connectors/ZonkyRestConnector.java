package cz.zonky.interview.task.kuznik.zonkyloanslisting.connectors;

import cz.zonky.interview.task.kuznik.zonkyloanslisting.domain.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ZonkyRestConnector {

    @Value("${zonky.api.marketplace.url}")
    private String marketPlaceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public List<Loan> getAllLoans() {
        ResponseEntity<List<Loan>> response;

        response = restTemplate.exchange(
                marketPlaceUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Loan>>(){});

        return response.getStatusCode() == HttpStatus.OK ? response.getBody() : null;
    }
}
