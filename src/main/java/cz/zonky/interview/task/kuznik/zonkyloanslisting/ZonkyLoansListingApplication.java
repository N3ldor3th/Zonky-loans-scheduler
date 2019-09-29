package cz.zonky.interview.task.kuznik.zonkyloanslisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ZonkyLoansListingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZonkyLoansListingApplication.class, args);
    }
}
