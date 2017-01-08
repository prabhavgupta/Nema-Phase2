package com.nemetologydept.nematodeinfo.ScrollableTabs;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dexafree.materialList.card.Card;
import com.nemetologydept.nematodeinfo.R;

/**
 * Created by Weirdo on 15-06-2016.
 */
public class Tab5 extends android.support.v4.app.Fragment {


    int value[];
    private ImageView Img1, Img2 , Img3, Img4 , Img5;
    private Bitmap b1, b2 , b3 , b4;
    private TextView t1, t2, t3, t4 ;
    CardView c1, c2, c3 , c4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab5, container, false);

        Img1 = (ImageView) v.findViewById(R.id.Img1);
        Img2 = (ImageView) v.findViewById(R.id.Img2);
        Img3 = (ImageView) v.findViewById(R.id.Img3);
        Img4 = (ImageView) v.findViewById(R.id.Img4);
       // Img5 = (ImageView) v.findViewById(R.id.Img5);

        t1 = (TextView) v.findViewById(R.id.t1);
        t2 = (TextView) v.findViewById(R.id.t2);
        t3 = (TextView) v.findViewById(R.id.t3);
        t4 = (TextView) v.findViewById(R.id.t4);

        c1 = (CardView) v.findViewById(R.id.card_view1);
        c2 = (CardView) v.findViewById(R.id.card_view2);
        c3 = (CardView) v.findViewById(R.id.card_view3);
        c4 = (CardView) v.findViewById(R.id.card_view4);

        value=getArguments().getIntArray("id");
        int x = value[0];
        int y = value[1];
        if(x==1 && y==1){

            b1= BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.m_g1);
            b2= BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.m_g2);
            b3= BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.m_g3);
            b4= BitmapFactory.decodeResource(getActivity().getResources(), R.drawable.m_g4);

            Img1.setImageBitmap(b1);
            Img2.setImageBitmap(b2);
            Img3.setImageBitmap(b3);
            Img4.setImageBitmap(b4);
            t1.setText("Meloidogyne");
            t2.setText("Mg infested plant");
            t3.setText("Mg nursery");
            t4.setText("Mg seedling");

        }else if(x==1 && y==2){

            Img1.setImageResource(R.drawable.hi1);
            Img2.setImageResource(R.drawable.hi2);
            t1.setText("Hirschmanniella anterior  view");
            t2.setText("Hirschmanniella infested  roots");

            c3.setVisibility(View.GONE);
            c4.setVisibility(View.GONE);

        } else if(x==1 && y==3){

            Img1.setImageResource(R.drawable.d1);
            Img2.setImageResource(R.drawable.d2);
            t1.setText("Ditylenchus");
            t2.setText("Ditylenchus");


            c3.setVisibility(View.GONE);
            c4.setVisibility(View.GONE);

        }else if(x==1 && y==4){



            c1.setVisibility(View.GONE);
            c2.setVisibility(View.GONE);
            c3.setVisibility(View.GONE);
            c4.setVisibility(View.GONE);

        }else if(x==2 && y==1){

            Img1.setImageResource(R.drawable.h1);
            Img2.setImageResource(R.drawable.h2);
            Img3.setImageResource(R.drawable.h3);
            t1.setText("Heterodera cyst");
            t2.setText("Heterodera infested field");
            t3.setText("Heterodera white cyst");

            c4.setVisibility(View.GONE);
        }


        return v;
    }
}

