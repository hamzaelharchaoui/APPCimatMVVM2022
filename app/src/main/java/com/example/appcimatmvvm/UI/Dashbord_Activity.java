package com.example.appcimatmvvm.UI;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.appcimatmvvm.R;
import com.example.appcimatmvvm.UI.Proj_fragment.Fragment_dachbord;

public class Dashbord_Activity extends AppCompatActivity {

    public   String  NomPrenom,Matricule,fonction;
    public  static FragmentManager fragmentManager;


    private boolean HchargeConduit=false,
            HChargeTrav=false,HChargeConsiB=false,HchargeConsH=false,HADmin=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord_);


        fragmentManager= getSupportFragmentManager();

        if (findViewById(R.id.fragment_container1)!=null){

            if(savedInstanceState!=null)
            {


                return;
            }


        }
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        Fragment_dachbord fragment_dachbord=new Fragment_dachbord();
        fragmentTransaction.add(R.id.fragment_container1, fragment_dachbord, null);
        fragmentTransaction.commit();

       /* Intent intent= getIntent();
        NomPrenom =intent.getStringExtra(MainActivity.EXTRA_NomPrenom);
        Matricule=intent.getStringExtra(MainActivity.EXTRA_Matricule);
        HChargeTrav=intent.getBooleanExtra(MainActivity.EXTRA_chargeTravaux,HChargeTrav);
        HchargeConduit=intent.getBooleanExtra(MainActivity.EXTRA_chargedeconduit,HchargeConduit);
        HChargeConsiB=intent.getBooleanExtra(MainActivity.EXTRA_chargeConsigantionB,HChargeConsiB);
        HchargeConsH=intent.getBooleanExtra(MainActivity.EXTRA_chargeconsigantionH,HchargeConsH);
        HADmin=intent.getBooleanExtra(MainActivity.EXTRA_adminh,HADmin);*/


    }
}

