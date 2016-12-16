package com.nemetologydept.nematodeinfo.ScrollableTabs;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nemetologydept.nematodeinfo.R;

/**
 * Created by Weirdo on 15-06-2016.
 */
public class Tab2 extends android.support.v4.app.Fragment {


    int value[];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab2, container, false);


        value=getArguments().getIntArray("id");
        TextView t= (TextView) v.findViewById(R.id.tab2textView);
        int x = value[0];
        int y = value[1];

        if(x==1 && y==1){
            t.setText(R.string.rice_1_spread);
        }else if(x==1 && y==2){
            t.setText(R.string.rice_2_spread);
        }else if(x==1 && y==3){
            t.setText(R.string.rice_3_spread);
        }else if(x==1 && y==4){
            t.setText(R.string.rice_4_spread);
        }else if(x==2 && y==1){
            t.setText(R.string.wheat_1_spread);
        }

        return v;

    }
}
