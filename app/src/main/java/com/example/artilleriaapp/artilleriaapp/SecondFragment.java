package com.example.artilleriaapp.artilleriaapp;

import android.os.Bundle;
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
