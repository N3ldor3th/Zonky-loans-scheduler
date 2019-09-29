package cz.zonky.interview.task.kuznik.zonkyloanslisting.connectors;


import cz.zonky.interview.task.kuznik.zonkyloanslisting.domain.Loan;

import java.util.List;

public interface LoansConnector {

    List<Loan> getAllLoans();
}
