package cz.zonky.interview.task.kuznik.zonkyloanslisting.services;

import cz.zonky.interview.task.kuznik.zonkyloanslisting.domain.Loan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZonkyPrinter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZonkyPrinter.class);

    void printAllLoans(List<Loan> loans) {
        loans.forEach(loan -> LOGGER.info(loan.toString()));
    }


}
