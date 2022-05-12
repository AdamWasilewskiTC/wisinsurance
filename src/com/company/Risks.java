package com.company;

import java.math.BigDecimal;
import java.util.Date;

public class Risks {
    private Integer id;
    private BigDecimal min_price;
    private BigDecimal max_price;
    private Date protection_from;
    private Date protaction_to;
    private String description;
    private PolicyType policyType;

    public Risks(Integer id, BigDecimal min_price, BigDecimal max_price, Date protection_from, Date protaction_to, String description, PolicyType policyType) {
        this.id = id;
        this.min_price = min_price;
        this.max_price = max_price;
        this.protection_from = protection_from;
        this.protaction_to = protaction_to;
        this.description = description;
        this.policyType = policyType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMin_price() {
        return min_price;
    }

    public void setMin_price(BigDecimal min_price) {
        this.min_price = min_price;
    }

    public BigDecimal getMax_price() {
        return max_price;
    }

    public void setMax_price(BigDecimal max_price) {
        this.max_price = max_price;
    }

    public Date getProtection_from() {
        return protection_from;
    }

    public void setProtection_from(Date protection_from) {
        this.protection_from = protection_from;
    }

    public Date getProtaction_to() {
        return protaction_to;
    }

    public void setProtaction_to(Date protaction_to) {
        this.protaction_to = protaction_to;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }


}
