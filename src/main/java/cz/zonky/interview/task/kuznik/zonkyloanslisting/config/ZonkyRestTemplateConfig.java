package cz.zonky.interview.task.kuznik.zonkyloanslisting.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.time.Duration;

@Configuration
public class ZonkyRestTemplateConfig {

    @Autowired
    private ResponseErrorHandler responseErrorHandler;

    @Value("${zonky.rest.connect.timeout.milliseconds:5000}")
    private Long connectTimeout;

    @Value("${zonky.rest.read.timeout.milliseconds:5000}")
    private Long readTimeout;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        RestTemplate restTemplate = builder
                .setConnectTimeout(Duration.ofMillis(connectTimeout))
                .setReadTimeout(Duration.ofMillis(readTimeout))
                .errorHandler(responseErrorHandler)
                .build();
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate;
    }
}
