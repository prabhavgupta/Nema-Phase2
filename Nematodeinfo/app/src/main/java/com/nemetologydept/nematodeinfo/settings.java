package com.nemetologydept.nematodeinfo;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_2);


        Button english = (Button) findViewById(R.id.button_english);
        Button hindi = (Button) findViewById(R.id.button_hindi);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Locale locale = new Locale("en");
                Locale.setDefault(locale);
                Configuration config = getBaseContext().getResources().getConfiguration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());



                SharedPreferences.Editor editor = getSharedPreferences("ABC", MODE_PRIVATE).edit();
                editor.putString("lan", "en");
                editor.commit();

            }
        });

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Locale locale = new Locale("hi");
                Locale.setDefault(locale);
                Configuration config = getBaseContext().getResources().getConfiguration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());


                SharedPreferences.Editor editor = getSharedPreferences("ABC", MODE_PRIVATE).edit();
                editor.putString("lan", "hi");
                editor.commit();
            }
        });



    }
}
