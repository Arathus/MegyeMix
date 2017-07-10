package com.megyemix.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import megyemix.com.megyemix.R;

/**
 * Created by arathus on 2017.07.10..
 */

public class MatchCardView extends Fragment {

    public static MatchCardView newInstance(String text) {



        MatchCardView f = new MatchCardView();

        //This is the place where you can add extra information to the fragment. This information can be any type of variable.
        Bundle b = new Bundle();
        b.putString("textsample", "ize");
        f.setArguments(b);
        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.matchcard, container, false);




        return v;
    }
}

