package com.mothermaryprayers.consecration.fragment.prayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mothermaryprayers.consecration.R;

public class PrayerAveMariasStellaFragment extends Fragment {


    public static Fragment newInstance() {
        PrayerAveMariasStellaFragment fragment = new PrayerAveMariasStellaFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_ave_marias_stella, container, false);
        return fragmentView;
    }
}



