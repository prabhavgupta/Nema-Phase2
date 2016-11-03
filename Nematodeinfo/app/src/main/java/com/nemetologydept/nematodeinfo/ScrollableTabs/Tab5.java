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
public class Tab5 extends android.support.v4.app.Fragment {


    int value[];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab5, container, false);


        value=getArguments().getIntArray("id");
        TextView t= (TextView) v.findViewById(R.id.tab5textView);
        int x = value[0];
        int y = value[1];


        return v;
    }
}

