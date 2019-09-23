package cz.zonky.interview.task.kuznik.zonkyloanslisting.services;


import cz.zonky.interview.task.kuznik.zonkyloanslisting.connectors.ZonkyRestConnector;
import cz.zonky.interview.task.kuznik.zonkyloanslisting.domain.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class ZonkyCustomScheduler {

    @Autowired
    private ZonkyRestConnector connector;

    @Scheduled(fixedDelayString = "${zonky.scheduled.interval.milliseconds}")
    public void fetchAllLoans() {
        List<Loan> loans = connector.getAllLoans();
        if (!CollectionUtils.isEmpty(loans)) {
            printAllLoans(loans);
        }
    }

    private void printAllLoans(List<Loan> loans) {
        loans.forEach(System.out::println);
    }

}
