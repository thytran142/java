package com.thy;

public class VipCustomer {
    private String name;
    private Double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default Name",3000.00,"default@gmail.com");
    }

    public VipCustomer(String name, String email) {
        this.name = name;
        this.email = email;
        this.creditLimit = 0.0;
    }

    public VipCustomer(String name, Double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
