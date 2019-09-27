package cz.zonky.interview.task.kuznik.zonkyloanslisting.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.time.Duration;

@Configuration
public class ZonkyRestTemplateConfig {

    @Value("${zonky.rest.connect.timeout.milliseconds:5000}")
    private Long connectTimeout;

    @Value("${zonky.rest.read.timeout.milliseconds:5000}")
    private Long readTimeout;

    @Value("${zonky.api.marketplace.paging.page:0}")
    private Integer pageHeaderName;

    @Value("${zonky.api.marketplace.paging.size:20}")
    private Integer sizeHeaderName;

    private static final String X_PAGE_HEADER = "X-Page";
    private static final String X_SIZE_HEADER = "X-Size";

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        RestTemplate restTemplate = builder
                .setConnectTimeout(Duration.ofMillis(connectTimeout))
                .setReadTimeout(Duration.ofMillis(readTimeout))
                .build();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate;
    }

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
