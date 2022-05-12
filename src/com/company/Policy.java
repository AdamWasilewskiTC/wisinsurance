package com.company;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Policy {
    private Integer id;
    private String policyholder;
    private String insured;
    private String salaried;
    private List<Risks> risks;
    private Date from;
    private Date to;
    private BigDecimal price;
    private PolicyType policyType;

    public Policy(Integer id, String policyholder, String insured, String salaried, List<Risks> risks, Date from, Date to, BigDecimal price, PolicyType policyType) {
        this.id = id;
        this.policyholder = policyholder;
        this.insured = insured;
        this.salaried = salaried;
        this.risks = risks;
        this.from = from;
        this.to = to;
        this.price = price;
        this.policyType = policyType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyholder() {
        return policyholder;
    }

    public void setPolicyholder(String policyholder) {
        this.policyholder = policyholder;
    }

    public String getInsured() {
        return insured;
    }

    public void setInsured(String insured) {
        this.insured = insured;
    }

    public String getSalaried() {
        return salaried;
    }

    public void setSalaried(String salaried) {
        this.salaried = salaried;
    }

    public List<Risks> getRisks() {
        return risks;
    }

    public void setRisks(List<Risks> risks) {
        this.risks = risks;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public PolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }
}
