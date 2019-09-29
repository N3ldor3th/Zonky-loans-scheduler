package cz.zonky.interview.task.kuznik.zonkyloanslisting.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@Configuration
public class ZonkyHttpEntityConfig {

    @Value("${zonky.api.marketplace.paging.page:0}")
    private Integer pageHeaderName;

    @Value("${zonky.api.marketplace.paging.size:20}")
    private Integer sizeHeaderName;

    private static final String X_PAGE_HEADER = "X-Page";
    private static final String X_SIZE_HEADER = "X-Size";

    @Bean
    public HttpEntity<String> httpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(X_PAGE_HEADER, String.valueOf(pageHeaderName));
        headers.set(X_SIZE_HEADER, String.valueOf(sizeHeaderName));
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        return entity;
    }
}
