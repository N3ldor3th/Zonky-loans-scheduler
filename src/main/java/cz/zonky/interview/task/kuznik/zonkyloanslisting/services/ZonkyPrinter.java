package cz.zonky.interview.task.kuznik.zonkyloanslisting.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ZonkyPrinter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZonkyPrinter.class);

    void printAllLoans(String loans) {
        LOGGER.info(loans);
    }


}
