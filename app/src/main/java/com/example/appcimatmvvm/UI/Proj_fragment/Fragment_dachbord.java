package com.example.appcimatmvvm.UI.Proj_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.appcimatmvvm.R;


public class Fragment_dachbord extends Fragment {





    private static final String TAG="Fragment1";

    private TextView textView;
    private LinearLayout btncompte,btnFormulaireConsig,btnMyworkk;
    private String NomPrenom;


    private boolean HchargeConduit=false, HChargeTrav=false, HChargeConsiB=false, HchargeConsH=false, HADmin=false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_dashbord, container, false);




      /*  NomPrenom=intent.getStringExtra(MainActivity.EXTRA_NomPrenom);
        btnFormulaireConsig=view.findViewById(R.id.btnConsignationF);
        textView=view.findViewById(R.id.txtname1);
        btncompte=view.findViewById(R.id.btnmoncompte1);
       // btnMyworkk=view.findViewById(R.id.btnmyw*/





        return view;
    }



}