package com.megyemix.controller.adatbank;


//TODO visszaállítani. Csak azért kapcsoltam ki ideiglenesen, hogy foglalkozni tudjak a designnal.
public class AdatbankManager {/*

    private String databaseName;
    private int seasonID;
*//*
    private DatabaseReference rootRef;
*//*

    public AdatbankManager(String databaseName, int seasonID) {
        this.databaseName = databaseName;
        this.seasonID = seasonID;
        rootRef  = FirebaseDatabase.getInstance().getReference().child("matches");
    }


    *//**
     *  Egy adott forduló meccseit letölti a db-ből
     * @param type : megye1 vagy megye2
     * @param roundNumber : forduló szám
     *//*
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

    *//**
     * Egy adott forduló adott mérkőzését tölti le
     * @param type : megye1 vagy megye2
     * @param round : forduló szám
     * @param match : adott id-jú meccs
     *//*
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

    }*/
}
