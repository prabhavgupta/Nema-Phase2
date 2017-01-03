package com.nemetologydept.nematodeinfo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    GridView grid;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedpreferences = getSharedPreferences("ABC", Context.MODE_PRIVATE);
        String language = sharedpreferences.getString("lan", "en");
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        //Toast.makeText(getBaseContext(),"aalalala",Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_main);


        String[] web = getApplicationContext().getResources().getStringArray(R.array.crops);
        int[] imageId = {
                R.drawable.rice,
                R.drawable.wheat
        };


        CustomGrid adapter = new CustomGrid(MainActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.gridview);
        grid.setAdapter(adapter);


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                    Intent i= new Intent(MainActivity.this,Cropnema.class);
                    i.putExtra("key",position);

                    startActivity(i);
                finish();



            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.m1, menu);//Menu Resource, Menu
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                //Toast.makeText(MainActivity.this, "settings is Selected", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(this,settings.class);
                startActivity(i);
                return true;

            default:

                return super.onOptionsItemSelected(item);

        }
    }

}