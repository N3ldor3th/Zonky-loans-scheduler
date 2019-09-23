package cz.zonky.interview.task.kuznik.zonkyloanslisting.domain;


import com.fasterxml.jackson.databind.JsonNode;

import java.math.BigDecimal;
import java.util.List;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(Integer termInMonths) {
        this.termInMonths = termInMonths;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getRevenueRate() {
        return revenueRate;
    }

    public void setRevenueRate(BigDecimal revenueRate) {
        this.revenueRate = revenueRate;
    }

    public BigDecimal getAnnuityWithInsurance() {
        return annuityWithInsurance;
    }

    public void setAnnuityWithInsurance(BigDecimal annuityWithInsurance) {
        this.annuityWithInsurance = annuityWithInsurance;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Boolean getTopped() {
        return topped;
    }

    public void setTopped(Boolean topped) {
        this.topped = topped;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getRemainingInvestment() {
        return remainingInvestment;
    }

    public void setRemainingInvestment(BigDecimal remainingInvestment) {
        this.remainingInvestment = remainingInvestment;
    }

    public BigDecimal getReservedAmount() {
        return reservedAmount;
    }

    public void setReservedAmount(BigDecimal reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public BigDecimal getInvestmentRate() {
        return investmentRate;
    }

    public void setInvestmentRate(BigDecimal investmentRate) {
        this.investmentRate = investmentRate;
    }

    public Boolean getCovered() {
        return covered;
    }

    public void setCovered(Boolean covered) {
        this.covered = covered;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Integer getInvestmentsCount() {
        return investmentsCount;
    }

    public void setInvestmentsCount(Integer investmentsCount) {
        this.investmentsCount = investmentsCount;
    }

    public Integer getQuestionsCount() {
        return questionsCount;
    }

    public void setQuestionsCount(Integer questionsCount) {
        this.questionsCount = questionsCount;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMainIncomeType() {
        return mainIncomeType;
    }

    public void setMainIncomeType(String mainIncomeType) {
        this.mainIncomeType = mainIncomeType;
    }

    public Boolean getInsuranceActive() {
        return insuranceActive;
    }

    public void setInsuranceActive(Boolean insuranceActive) {
        this.insuranceActive = insuranceActive;
    }

    public List<JsonNode> getInsuranceHistory() {
        return insuranceHistory;
    }

    public void setInsuranceHistory(List<JsonNode> insuranceHistory) {
        this.insuranceHistory = insuranceHistory;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", story='" + story + '\'' +
                ", purpose=" + purpose +
                ", photos=" + photos +
                ", nickName='" + nickName + '\'' +
                ", termInMonths=" + termInMonths +
                ", interestRate=" + interestRate +
                ", revenueRate=" + revenueRate +
                ", annuityWithInsurance=" + annuityWithInsurance +
                ", rating='" + rating + '\'' +
                ", topped=" + topped +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", remainingInvestment=" + remainingInvestment +
                ", reservedAmount=" + reservedAmount +
                ", investmentRate=" + investmentRate +
                ", covered=" + covered +
                ", datePublished='" + datePublished + '\'' +
                ", published=" + published +
                ", deadline='" + deadline + '\'' +
                ", investmentsCount=" + investmentsCount +
                ", questionsCount=" + questionsCount +
                ", region='" + region + '\'' +
                ", mainIncomeType='" + mainIncomeType + '\'' +
                ", insuranceActive=" + insuranceActive +
                ", insuranceHistory=" + insuranceHistory +
                '}';
    }
}
