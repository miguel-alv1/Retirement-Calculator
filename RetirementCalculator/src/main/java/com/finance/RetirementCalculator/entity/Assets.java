package com.finance.RetirementCalculator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Assets {
    // fields
    @Id
    @Column(name="customer_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private String age;

    @Column(name="stocks_value")
    private int stocksVal;

    @Column(name="alt_assets_value")
    private int altAssetsVal;

    @Column(name="real_estate_value")
    private int realEstate;

    @Column(name="cash_holdings")
    private int cash;

    @Column(name="total_networth")
    private int networth;

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="zip")
    private String zip;

    @Column(name="state")
    private String state;

    @Column(name="country")
    private String country;

    // empty constructor
    public Assets() {

    }

    public Assets(int stocksVal, int altAssetsVal, int realEstate, int cash){
        this.stocksVal = stocksVal;
        this.altAssetsVal = altAssetsVal;
        this.realEstate = realEstate;
        this.cash = cash;
    }

    public int getStocksVal() {
        return stocksVal;
    }

    public void setStocksVal(int stocksVal) {
        this.stocksVal = stocksVal;
    }

    public int getAltAssetsVal() {
        return altAssetsVal;
    }

    public void setAltAssetsVal(int altAssetsVal) {
        this.altAssetsVal = altAssetsVal;
    }

    public int getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(int realEstate) {
        this.realEstate = realEstate;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

}