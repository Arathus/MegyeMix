package com.megyemix.controller.adatbank;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.megyemix.model.adatbank.Match;
import com.megyemix.model.adatbank.Round;

import java.util.Map;

public class AdatbankManager {

    private String databaseName;
    private int seasonID;
    private DatabaseReference rootRef;

    public AdatbankManager(String databaseName, int seasonID) {
        this.databaseName = databaseName;
        this.seasonID = seasonID;
        rootRef  = FirebaseDatabase.getInstance().getReference().child("matches");
    }


    public void GetRoundMatches(String type,String roundNumber){
        DatabaseReference mSeasonDatabase = rootRef.child(type).child(roundNumber);
        mSeasonDatabase.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                GenericTypeIndicator <Map<String,Match>>  t = new GenericTypeIndicator<Map<String,
                        Match>> () {};

                Map<String,Match> matchesMap = dataSnapshot.getValue(t);

                Round round = new Round();

                for (String key : matchesMap.keySet()) {

                    Match mMatch = matchesMap.get(key);
                    round.getMatches().add(mMatch);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    public void GetMatch(String type,String round,String match){

        DatabaseReference mMatch = FirebaseDatabase.getInstance().getReference().child("matches").child(type).child(round).child(match);
        mMatch.addValueEventListener(new ValueEventListener() {
            @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                            Match myMatch = dataSnapshot.getValue(Match.class);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    System.out.println("The read failed: " + databaseError.getCode());
                }
            });

    }
}
