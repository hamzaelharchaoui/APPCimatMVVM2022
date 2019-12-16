package com.example.appcimatmvvm.UI;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appcimatmvvm.Proj_reotrfit.DCchargeTravaux;
import com.example.appcimatmvvm.allViewModel.LoginViewModel;
import com.example.appcimatmvvm.R;

import com.example.appcimatmvvm.databinding.ActivityMainBinding;
import com.example.appcimatmvvm.presenter.Presenter;

import java.util.List;

public class MainActivity extends AppCompatActivity {


   /* public static  final  String EXTRA_Matricule="com.example.application.example.EXTRA_Matricule";
    public static  final  String EXTRA_NomPrenom ="com.example.application.example.EXTRA_NomPrenom";
    public static  final  String EXTRA_chargeTravaux="com.example.application.example.EXTRA_chargeTravaux";
    public static  final  String EXTRA_chargeConsigantionB ="com.example.application.example.EXTRA_chargeConsigantionB";
    public static  final  String EXTRA_chargedeconduit="com.example.application.example.EXTRA_chargedeconduit";
    public static  final  String EXTRA_chargeconsigantionH ="com.example.application.example.EXTRA_chargeconsigantionH";
    public static  final  String EXTRA_adminh ="com.example.application.example.EXTRA_adminh";*/

    private ActivityMainBinding activityMainBinding;
    private LoginViewModel loginViewModel;
    private String   matrculelogin,nomprenomlogin;
    private boolean HchargeConduit=false,HChargeTrav=false,HChargeConsiB=false,HchargeConsH=false,HADmin=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        loginViewModel=ViewModelProviders.of(this).get(LoginViewModel.class);

        loginViewModel.getMsgFaillelogin().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                showToaset(s);
                activityMainBinding.progressBar.setVisibility(View.INVISIBLE);
            }
        });

        loginViewModel.getData().observe(this, new Observer<List<DCchargeTravaux.LoginPerson>>() {
           @Override
           public void onChanged(@Nullable List<DCchargeTravaux.LoginPerson> loginPeople) {

               showToaset("Login Succes");
               activityMainBinding.progressBar.setVisibility(View.INVISIBLE);

             /* matrculelogin.equals(loginPeople.get(0).getMATRICULE());
             HchargeConduit=loginPeople.get(0).isH_Charge_conduite();
               HChargeTrav=loginPeople.get(0).isH_Charge_Travaux();
               HchargeConsH=loginPeople.get(0).isH_Consignation_HT();
               HChargeConsiB=loginPeople.get(0).isH_Consigantio_BT();
               HADmin=loginPeople.get(0).isAdminAPP();*/

               //nomprenomlogin.equals(loginPeople.get(0).getNom_Prenom());
               activityMainBinding.Mytext.setText("loginSucces");
               gotoactivite();
           }
       });

        activityMainBinding.setPresenter(new Presenter() {
            @Override
            public void loginData() {


            }

            @Override
            public void getData() {

                showToaset("iam in getdata");
                activityMainBinding.progressBar.setVisibility(View.VISIBLE);
                activityMainBinding.Mytext.setText( activityMainBinding.txtmatriculeLogin.getText().toString());
               loginViewModel.sendingLogRequeste( activityMainBinding.txtmatriculeLogin.getText().toString(),
                activityMainBinding.txtPassordlogin.getText().toString());


            }
        });


}

public  void  gotoactivite(){

          Intent intent= new Intent(MainActivity.this,Dashbord_Activity.class);
          /* intent.putExtra(EXTRA_Matricule,matrculelogin);
           intent.putExtra(EXTRA_NomPrenom,nomprenomlogin);
           intent.putExtra(EXTRA_chargeTravaux,HChargeTrav);
           intent.putExtra(EXTRA_chargedeconduit,HchargeConduit);
           intent.putExtra(EXTRA_chargeConsigantionB,HChargeConsiB);
          intent.putExtra(EXTRA_chargeconsigantionH,HchargeConsH);
           intent.putExtra(EXTRA_adminh,HADmin);*/
          startActivity(intent);

}

void showToaset(String msg){
Toast.makeText(this,msg,Toast.LENGTH_LONG).show();

}

}
