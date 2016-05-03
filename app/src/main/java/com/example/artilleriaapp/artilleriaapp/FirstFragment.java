package com.example.artilleriaapp.artilleriaapp;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.example.artilleriaapp.artilleriaapp.*;
import android.widget.TextView;

/**
 * Created by lulu on 28/04/2016.
 */
public class FirstFragment extends Fragment {

    private Spinner spinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_frag, container, false);


   //     TextView tv = (TextView) v.findViewById(R.id.tvFragFirst);
      //  tv.setText(getArguments().getString("msg"));
        spinner = (Spinner) v.findViewById(R.id.spinner);

        String []opciones={"teórico","práctico"};
        ArrayAdapter<String> contenido= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(contenido);

        return v;
    }

    public static FirstFragment newInstance() {

        FirstFragment f = new FirstFragment();
     //   Bundle b = new Bundle();
       // b.putString("msg", text);

       // f.setArguments(b);

        return f;
    }
}
