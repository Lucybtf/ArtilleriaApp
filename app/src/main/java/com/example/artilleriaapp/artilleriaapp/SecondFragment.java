package com.example.artilleriaapp.artilleriaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lulu on 03/05/2016.
 */
public class SecondFragment  extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.second_frag, container, false);
        FloatingActionButton myFab2 = (FloatingActionButton)v.findViewById(R.id.fab);
        myFab2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent hoa=new Intent(getActivity(), MenuConsulta.class);
                startActivity(hoa);
            }
        });
        return v;
    }

    public static SecondFragment newInstance() {

        SecondFragment f = new SecondFragment();
        //   Bundle b = new Bundle();
        // b.putString("msg", text);

        // f.setArguments(b);

        return f;
    }
}
