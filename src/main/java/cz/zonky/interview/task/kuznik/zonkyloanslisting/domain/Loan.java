package cz.zonky.interview.task.kuznik.zonkyloanslisting.domain;


import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Data is a convenient lombok shortcut annotation that bundles the features of
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
 * More info on setting everything up in here https://www.baeldung.com/lombok-ide .
 */

@Data
public class Loan {

    private Integer id;
    private String url;
    private String name;
    private String story;
    private Purpose purpose;
    private List<Photo> photos;
    private String nickName;
    private Integer termInMonths;
    private BigDecimal interestRate;
    private BigDecimal revenueRate;
    private BigDecimal annuityWithInsurance;
    private String rating;
    private Boolean topped;
    private BigDecimal amount;
    private String currency;
    private BigDecimal remainingInvestment;
    private BigDecimal reservedAmount;
    private BigDecimal investmentRate;
    private Boolean covered;
    private String datePublished;
    private Boolean published;
    private String deadline;
    private Integer investmentsCount;
    private Integer questionsCount;
    private String region;
    private String mainIncomeType;
    private Boolean insuranceActive;
    private List<JsonNode> insuranceHistory;

}
