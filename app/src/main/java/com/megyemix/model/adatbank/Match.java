package com.megyemix.model.adatbank;

import java.util.Date;

/**
 * Created by i302657 on 2017. 07. 09..
 */

public class Match {

    private int id;
    private Team home;
    private Team away;
    private String matchDate;
    private String location;


    public Match() {
    }

    public Match(int id, Team home, Team away, String matchDate, String location) {
        this.id = id;
        this.home = home;
        this.away = away;
        this.matchDate = matchDate;
        this.location = location;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
