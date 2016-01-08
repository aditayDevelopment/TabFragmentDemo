package com.cws.ecom.tabfragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cws on 7/1/16.
 */
public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.firstfragmetn, parentViewGroup, false);
        TextView tf =  (TextView) rootView.findViewById(R.id.sas);
        tf.setText("First Fragment");



        tf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* getFragmentManager().beginTransaction()
                        .replace(R.id.fragmentParentViewGroup, new MySecondFragment())
                .addToBackStack(null)
                                .commit();*/
            }
        });
        return rootView;
    }

}