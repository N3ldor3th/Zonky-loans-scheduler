package cz.zonky.interview.task.kuznik.zonkyloanslisting.services;


import cz.zonky.interview.task.kuznik.zonkyloanslisting.connectors.LoansConnector;
import cz.zonky.interview.task.kuznik.zonkyloanslisting.domain.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class ZonkyScheduler {

    @Autowired
    private LoansConnector connector;

    @Autowired
    private ZonkyPrinter zonkyPrinter;

    @Scheduled(fixedDelayString = "${zonky.scheduled.interval.milliseconds}")
    public void fetchAllLoans() {
        List<Loan> loans = connector.getAllLoans();
        if (!CollectionUtils.isEmpty(loans)) {
            zonkyPrinter.printAllLoans(loans);
        }
    }
}
