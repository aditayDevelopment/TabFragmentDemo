package com.cws.ecom.tabfragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cws on 7/1/16.
 */
public class ThirdFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.firstfragmetn, parentViewGroup, false);
        TextView tf = (TextView) rootView.findViewById(R.id.sas);
        tf.setText("Third Fragment");



        return rootView;
    }
}