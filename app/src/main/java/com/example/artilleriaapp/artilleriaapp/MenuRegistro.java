package com.example.artilleriaapp.artilleriaapp;



import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;


public class MenuRegistro extends AppCompatActivity implements ActionBar.OnNavigationListener {

    private Spinner spinner;
    private MenuItem mSpinnerItem1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_registro);

        //getActionBar().setDisplayShowTitleEnabled(false);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        final String[] dropdownValues=getResources().getStringArray(R.array.tipoarma);
        ArrayAdapter adapter= new ArrayAdapter(actionBar.getThemedContext(),android.R.layout.simple_spinner_item,android.R.id.text1,dropdownValues);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(adapter,this);
       // ViewPager pager = (ViewPager) findViewById(R.id.pager);
       // pager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));


    }

   /* private class MyPageAdapter extends FragmentPagerAdapter
    {
        public MyPageAdapter(FragmentManager fm)
        {
            super(fm);
        }
        @Override
        public int getCount()
        {
            return 2;
        }
        @Override
        public Fragment getItem(int position)
        {
            if(position==0)
                return FirstFragment.newInstance();
            if(position==1)
                return SecondFragment.newInstance();
            else
                return FirstFragment.newInstance();
        }
    }*/


    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        switch (itemPosition) {
            case 0:
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.red), Toast.LENGTH_SHORT).show();
                //View v=inflater.inflate(R.layout.first_frag, container, false);
                setContentView(R.layout.first_frag);
                break;
            case 1:
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.blue), Toast.LENGTH_SHORT).show();
               // ViewPager pager =null;
                setContentView(R.layout.second_frag);
                break;
        }
        return false;
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //MenuInflater mi=getMenuInflater();
       // mi.inflate(R.menu.menu_registro, menu);
       // mSpinnerItem1=menu.findItem(R.id.spinner);
       getMenuInflater().inflate(R.menu.menu_registro, menu);
        return true;
    }

}

