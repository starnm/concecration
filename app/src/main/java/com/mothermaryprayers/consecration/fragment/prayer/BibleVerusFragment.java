package com.mothermaryprayers.consecration.fragment.prayer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mothermaryprayers.consecration.R;

public class BibleVerusFragment extends Fragment {


    private static int mDay;
    private TextView mTitleText;
    private TextView mContentText;

    public static Fragment newInstance(int day) {
        mDay = day;
        BibleVerusFragment fragment = new BibleVerusFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_bible_versus, container, false);
        mTitleText = (TextView) fragmentView.findViewById(R.id.bible_versus_title_text);
        mContentText = (TextView) fragmentView.findViewById(R.id.bible_versus_content_text);
        return fragmentView;
    }

    @Override
    public void onResume() {
        super.onResume();
        setupVerus();
    }

    private void setupVerus() {
        // TODO move this switch to the BibleVersusFragment
        switch (mDay) {
            case 1:
                mTitleText.setText(R.string.short_versus_day_one);
                mContentText.setText(R.string.versus_day_one);
                Toast.makeText(getContext(),String.valueOf(mDay), Toast.LENGTH_SHORT).show();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:

            default:
        }
    }

}



