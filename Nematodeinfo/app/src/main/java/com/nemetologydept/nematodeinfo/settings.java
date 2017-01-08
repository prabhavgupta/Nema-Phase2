package com.nemetologydept.nematodeinfo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_2);
        Typeface fontHindi = Typeface.createFromAsset(getAssets(),
                "hindi.ttf");
        //Typeface.createFromAsset(getAssets(),)
        TextView tv= (TextView) findViewById(R.id.tex2);
        Button english = (Button) findViewById(R.id.button_english);
        Button hindi = (Button) findViewById(R.id.button_hindi);
        tv.setText(R.string.hindi_select);
        tv.setTypeface(fontHindi);
        hindi.setText(R.string.hindi);
        hindi.setTypeface(fontHindi);

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
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

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
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });



    }
}
