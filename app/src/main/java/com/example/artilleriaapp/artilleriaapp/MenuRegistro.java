package com.example.artilleriaapp.artilleriaapp;


import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MenuRegistro extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_registro);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
       // ViewPager pager = (ViewPager) findViewById(R.id.pager);
     //   pager.setAdapter(new CustomPagerAdapter(this));
      /*  spinner = (Spinner) findViewById(R.id.spinner);

        String []opciones={"teórico","práctico"};
        System.out.print("HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        ArrayAdapter<String> contenido=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
      //  if(contenido== null)
            System.out.print("FIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            System.out.print(contenido);
        // else
           spinner.setAdapter(contenido);*/
    }

    private class MyPageAdapter extends FragmentPagerAdapter
    {
        public MyPageAdapter(FragmentManager fm)
        {
            super(fm);
        }
        @Override
        public int getCount()
        {
            return 1;
        }
        @Override
        public Fragment getItem(int position)
        {
            return FirstFragment.newInstance("FirstFragment, Instance 1");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registro, menu);
        return true;
    }

}

