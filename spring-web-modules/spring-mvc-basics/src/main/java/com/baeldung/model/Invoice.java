package com.baeldung.model;

public class Invoice {
    private Long id;
    private String concept;
    private int amount;
    private double percentage;

    public Invoice() {
    }
    
    public Invoice(Long id, String concept, int amount, double percentage) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.percentage = percentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
