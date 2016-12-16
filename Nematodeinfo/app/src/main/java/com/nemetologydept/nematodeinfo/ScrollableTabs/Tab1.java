package com.nemetologydept.nematodeinfo.ScrollableTabs;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nemetologydept.nematodeinfo.R;
import com.nemetologydept.nematodeinfo.settings;

/**
 * Created by Weirdo on 15-06-2016.
 */
public class Tab1 extends android.support.v4.app.Fragment {


    int value[];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.tab1, container, false);

        Log.d("Tab1 called", "Hogyaaaa Callll");

        Log.i("k","tab0.0");

        value=getArguments().getIntArray("id");
        TextView t= (TextView) v.findViewById(R.id.tab1textView);
        int x = value[0];
        int y = value[1];

        if(x==1 && y==1){
            t.setText(R.string.rice_1_intro);
        }else if(x==1 && y==2){
            t.setText(R.string.rice_2_intro);
        }else if(x==1 && y==3){
            t.setText(R.string.rice_3_intro);
        }else if(x==1 && y==4){
            t.setText(R.string.rice_4_intro);
        }else if(x==2 && y==1){
            t.setText(R.string.wheat_1_intro);
        }



        return v;

    }


}
