package cz.zonky.interview.task.kuznik.zonkyloanslisting.services;


import cz.zonky.interview.task.kuznik.zonkyloanslisting.connectors.LoansConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ZonkyScheduler {

    @Autowired
    private LoansConnector connector;

    @Autowired
    private ZonkyPrinter zonkyPrinter;

    @Scheduled(fixedDelayString = "${zonky.scheduled.interval.milliseconds}")
    public void fetchAllLoans() {
        String loans = connector.getAllLoans();
        if (!StringUtils.isEmpty(loans)) {
            zonkyPrinter.printAllLoans(loans);
        }
    }
}
