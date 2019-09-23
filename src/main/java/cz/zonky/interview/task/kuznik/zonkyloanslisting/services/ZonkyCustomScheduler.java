package cz.zonky.interview.task.kuznik.zonkyloanslisting.services;


import cz.zonky.interview.task.kuznik.zonkyloanslisting.connectors.ZonkyRestConnector;
import cz.zonky.interview.task.kuznik.zonkyloanslisting.domain.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZonkyCustomScheduler {

    @Autowired
    private ZonkyRestConnector connector;

    @Scheduled(fixedDelayString = "${zonky.scheduled.interval.seconds}000")
    public void printAllLoans() {
        List<Loan> loans = connector.getAllLoans();
        if (loans != null) {
            loans.forEach(System.out::println);
        }
    }
}
