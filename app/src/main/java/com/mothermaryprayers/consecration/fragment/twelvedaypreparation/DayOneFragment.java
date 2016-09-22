package com.mothermaryprayers.consecration.fragment.twelvedaypreparation;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mothermaryprayers.consecration.Callbacks;
import com.mothermaryprayers.consecration.R;

public class DayOneFragment extends Fragment {


    private Callbacks mCallbacks;

    public static Fragment newInstance() {
        DayOneFragment fragment = new DayOneFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_day_one, container, false);
        TextView bibleVersusText = (TextView) fragmentView.findViewById(R.id.day_one_bible_versus);

        SpannableString spannableString = new SpannableString(bibleVersusText.getText());
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                System.out.println("Clicked");
                mCallbacks.onBibleVersusClicked(1);
            }
        };
        spannableString.setSpan(clickableSpan, 0, bibleVersusText.getText().length()-1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        bibleVersusText.setMovementMethod(LinkMovementMethod.getInstance());
        bibleVersusText.setText(spannableString);


        return fragmentView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallbacks = (Callbacks) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + "must implement mCallbacks");
        }
    }
}



