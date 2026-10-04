package com.example.contry.resource;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private List<Country> countryList;

    public List<Country> getCountryList(){
        return countryList;
    }

    @PostConstruct
    public void init(){
        countryList = new ArrayList<>();
        List<State> indianStates = List.of(
                new State(1, "Kerala"),
                new State(2, "Tamil Nadu"),
                new State(3, "Karnadaka"),
                new State(4, "Andhra"),
                new State(5, "Thelungana"),
                new State(6, "Goa"),
                new State(7, "Maharashtra")
        );
        Country india = new Country(1, "IND", "India", indianStates);

        List<State> americanStates = List.of(
                new State(1, "California"),
                new State(2, "Texas"),
                new State(3, "Florida"),
                new State(4, "New York"),
                new State(5, "Alaska"),
                new State(6, "Hawaii")
        );
        Country northAmerica = new Country(2, "USA", "America", americanStates);

        countryList.add(india);
        countryList.add(northAmerica);
    }

}
