package com.megyemix.model.adatbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by i302657 on 2017. 07. 09..
 */

public class Round {


    private List<Match> matches;


    public Round() {
        if(matches == null){
            matches = new ArrayList<>();
        }
    }

    public Round(List<Match>  matches) {
        this.matches = matches;
    }


    public List<Match>  getMatches() {
        return matches;
    }

    public void setMatches(List<Match>  matches) {
        this.matches = matches;
    }

}
