package com.megyemix.model.adatbank;

import java.util.ArrayList;
import java.util.List;

public class Season {

    public Season() {
        if(roundList == null){
            roundList = new ArrayList<>();
        }
    }

    public Season(List<Round> roundList) {
        this.roundList = roundList;
    }

    private List<Round> roundList;

    public List<Round> getRoundList() {
        return roundList;
    }

    public void setRoundList(List<Round> roundList) {
        this.roundList = roundList;
    }
}
