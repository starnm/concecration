package com.mothermaryprayers.consecration.fragment.prayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mothermaryprayers.consecration.R;

public class VeniCreatorFragment extends Fragment {


    public static Fragment newInstance() {
        VeniCreatorFragment fragment = new VeniCreatorFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_veni_creator, container, false);
        return fragmentView;
    }
}



