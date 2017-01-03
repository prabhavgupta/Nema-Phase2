package com.nemetologydept.nematodeinfo.ScrollableTabs;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nemetologydept.nematodeinfo.R;

/**
 * Created by Weirdo on 15-06-2016.
 */
public class Tab5 extends android.support.v4.app.Fragment {


    int value[];
    private ImageView Img1, Img2 , Img3, Img4 , Img5;
    private Bitmap b1, b2 , b3 , b4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab5, container, false);

        Img1 = (ImageView) v.findViewById(R.id.Img1);
        Img2 = (ImageView) v.findViewById(R.id.Img2);
        Img3 = (ImageView) v.findViewById(R.id.Img3);
        Img4 = (ImageView) v.findViewById(R.id.Img4);
        Img5 = (ImageView) v.findViewById(R.id.Img5);

        value=getArguments().getIntArray("id");
        int x = value[0];
        int y = value[1];
        if(x==1 && y==1){

            b1= BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.mg1);
            b2= BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.mg2);
            b3= BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.mg3);
            b4= BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.mg4);

            Img1.setImageBitmap(b1);
            Img2.setImageBitmap(b2);
            Img3.setImageBitmap(b3);
            Img4.setImageBitmap(b4);

        }else if(x==1 && y==2){

            Img1.setImageResource(R.drawable.hi1);
            Img2.setImageResource(R.drawable.hi2);

        } else if(x==1 && y==3){

            Img1.setImageResource(R.drawable.d1);
            Img2.setImageResource(R.drawable.d2);

        }else if(x==1 && y==4){


        }else if(x==2 && y==1){

            Img1.setImageResource(R.drawable.h1);
            Img2.setImageResource(R.drawable.h2);
            Img3.setImageResource(R.drawable.h3);
        }


        return v;
    }
}

