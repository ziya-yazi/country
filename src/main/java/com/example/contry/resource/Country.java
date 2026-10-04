package com.example.contry.resource;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Country {
    private int id;
    private String countryCode;
    private String countryName;
    private List<State> stateList;

    public Country(int id, String countryCode, String countryName, List<State> stateList) {
        this.id = id;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.stateList = stateList;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<State> getStateList() {
        return stateList;
    }
    public void setStateList(List<State> stateList) {
        this.stateList = stateList;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
