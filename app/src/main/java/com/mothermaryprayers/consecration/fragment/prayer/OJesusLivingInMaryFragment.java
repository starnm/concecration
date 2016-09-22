package com.mothermaryprayers.consecration.fragment.prayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mothermaryprayers.consecration.R;

public class OJesusLivingInMaryFragment extends Fragment {


    public static Fragment newInstance() {
        OJesusLivingInMaryFragment fragment = new OJesusLivingInMaryFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_o_jesus_living_in_mary, container, false);
        return fragmentView;
    }

    public static class StLouisDeMontfortsFragment extends Fragment {


        public static Fragment newInstance() {
            StLouisDeMontfortsFragment fragment = new StLouisDeMontfortsFragment();
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View fragmentView = inflater.inflate(R.layout.fragment_o_jesus_living_in_mary,
                    container, false);
            return fragmentView;
        }
    }
}



