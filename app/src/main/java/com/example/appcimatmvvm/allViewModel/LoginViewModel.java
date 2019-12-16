package com.example.appcimatmvvm.allViewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;
import android.widget.Toast;

import com.example.appcimatmvvm.Proj_Dao.UserDao;
import com.example.appcimatmvvm.Proj_Entiite.User;
import com.example.appcimatmvvm.Proj_Repository.UserRepository;
import com.example.appcimatmvvm.Proj_reotrfit.ApiService;
import com.example.appcimatmvvm.Proj_reotrfit.DCchargeTravaux;
import com.example.appcimatmvvm.Proj_reotrfit.RetroClass;
import com.example.appcimatmvvm.UI.Dashbord_Activity;
import com.example.appcimatmvvm.UI.MainActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewModel extends ViewModel {

    public MutableLiveData<List<DCchargeTravaux.LoginPerson>> data;

    public  MutableLiveData<String> msgFaillelogin;

    public MutableLiveData<String> getMsgFaillelogin(){

         if (msgFaillelogin == null){
             msgFaillelogin=new MutableLiveData<>();
         }
        return msgFaillelogin;
    }


    public MutableLiveData<List<DCchargeTravaux.LoginPerson>> getData() {

        if (data == null) {

            data=new MutableLiveData<>();
        }


        return data;
    }





    public void sendingLogRequeste(String matricule,String pwd) {



        ApiService apiService=RetroClass.getApiservice();
        Call<List<DCchargeTravaux.LoginPerson>> call=apiService.getallperson(matricule, pwd);
        call.enqueue(new Callback<List<DCchargeTravaux.LoginPerson>>() {
            @Override
            public void onResponse(Call<List<DCchargeTravaux.LoginPerson>> call, Response<List<DCchargeTravaux.LoginPerson>> response) {
                List<DCchargeTravaux.LoginPerson> loginPeoples=response.body();
                    data.setValue(loginPeoples);
            }

            @Override
            public void onFailure(Call<List<DCchargeTravaux.LoginPerson>> call, Throwable t) {

                msgFaillelogin.setValue(t.getMessage());
              //  msgFaillelogin.setValue("Mots de passe ou matricule et Incorrecte");
            }
        });

    }



    /*public ObservableInt progressBar;

  //  public final ObservableField<String> matricule= new ObservableField<>("");
    //public final ObservableField<String> pwd= new ObservableField<>("");

     //private UserDao userDao;

    private Context context;
    public LoginViewModel(Context context)
    {

        this.context= context;

        progressBar=new ObservableInt(View.GONE);

    }

    public  void  sendingLogRequeste(String m,String pwd){

       progressBar.set(View.VISIBLE);

      //  showToaset("inside login_viewmodele");
        ApiService apiService =RetroClass.getApiservice();
        Call<List<DCchargeTravaux.LoginPerson>> call= apiService.getallperson(m,pwd);
        call.enqueue(new Callback<List<DCchargeTravaux.LoginPerson>>() {
            @Override
            public void onResponse(Call<List<DCchargeTravaux.LoginPerson>> call, Response<List<DCchargeTravaux.LoginPerson>> response) {
                List<DCchargeTravaux.LoginPerson> loginPeoples =response.body();



               progressBar.set(View.GONE);

                if (loginPeoples.size() == 0){

                    showToaset("Passe word or matricule incorrecte ");

                } else {

                    showToaset("Wellcome Mr " +"\n" + loginPeoples.get(0).getNom_Prenom().toString());
                   // userDao.insert(new User(loginPeoples.get(0).getMATRICULE(),loginPeoples.get(0).getNom_Prenom()));

                }

            }

            @Override
            public void onFailure(Call<List<DCchargeTravaux.LoginPerson>> call, Throwable t) {

                showToaset("Passe word or matricule incorrecte ");

                showToaset("on faille "+t.getMessage());
                progressBar.set(View.GONE);

            }
        });

    }



    void showToaset(String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();

    }*///



}