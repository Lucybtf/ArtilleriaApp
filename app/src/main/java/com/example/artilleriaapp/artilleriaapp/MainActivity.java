package com.example.artilleriaapp.artilleriaapp;

import android.content.Intent;
import android.support.v4.view.MenuCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.hp.hpl.jena.sparql.core.Var;

import java.util.List;

public class MainActivity extends AppCompatActivity {

   // private Spinner spinner1;
    //private List<String> lista;
    Button btnAceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
      //  btnAceptar = (Button)findViewById(R.id.btnAceptar);
       // btnAceptar.setOnClickListener(new View.OnClickListener() {

                                    /*      @Override
                                          public void onClick(View v) {
                                              Intent intent = new Intent(MainActivity.this, MenuRegistro.class);
                                              startActivity(intent);
                                          }
                                      });*/
      /*  spinner1 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.versiones,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);*/
    }

    public void PasarMenuRegistro(View view){
        Intent menuregistro=new Intent(this, MenuRegistro.class);
        startActivity(menuregistro);

    }

    public void PasarMenuConsulta(View view){
        Intent menuconsulta=new Intent(this, MenuConsulta.class);
        startActivity(menuconsulta);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       getMenuInflater().inflate(R.menu.menu_registro, menu);
        return true;
    }
}
