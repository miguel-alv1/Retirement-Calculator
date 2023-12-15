package com.finance.RetirementCalculator.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
    // fields
    @Id
    @Column(name="id")
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
    public Customer() {

    }

    public Customer(int stocksVal, int altAssetsVal, int realEstate, int cash){
        this.stocksVal = stocksVal;
        this.altAssetsVal = altAssetsVal;
        this.realEstate = realEstate;
        this.cash = cash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public int getNetworth() {
        return networth;
    }

    public void setNetworth(int networth) {
        this.networth = networth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Assets [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", stocksVal=" + stocksVal + ", altAssetsVal=" + altAssetsVal + ", realEstate=" + realEstate
                + ", cash=" + cash + ", networth=" + networth + ", address=" + address + ", city=" + city + ", zip="
                + zip + ", state=" + state + ", country=" + country + "]";
    }

}