package com.company;

import java.util.List;

public class Damages {
    private Integer id;
    private List<Policy> policy;
    private String documents;
    private DamageType damageType;
    private String victim;

    public Damages(Integer id, List<Policy> policy, String documents, DamageType damageType, String victim) {
        this.id = id;
        this.policy = policy;
        this.documents = documents;
        this.damageType = damageType;
        this.victim = victim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Policy> getPolicy() {
        return policy;
    }

    public void setPolicy(List<Policy> policy) {
        this.policy = policy;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public String getVictim() {
        return victim;
    }

    public void setVictim(String victim) {
        this.victim = victim;
    }
}
