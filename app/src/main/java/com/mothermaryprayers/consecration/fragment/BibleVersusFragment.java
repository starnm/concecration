package com.mothermaryprayers.consecration.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mothermaryprayers.consecration.R;

public class BibleVersusFragment extends Fragment {


    public static Fragment newInstance() {
        BibleVersusFragment fragment = new BibleVersusFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_bible, container, false);
        return fragmentView;
    }
}



