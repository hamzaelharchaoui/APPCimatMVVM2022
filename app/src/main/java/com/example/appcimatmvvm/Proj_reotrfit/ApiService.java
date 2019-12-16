package com.example.appcimatmvvm.Proj_reotrfit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {


    @GET("values/{MATRICULE}/{PWD_USER}")
    Call<List<DCchargeTravaux.LoginPerson>> getallperson(@Path("MATRICULE") String Matrule, @Path("PWD_USER") String pwd);


    @PUT("values/{MATRICULE}/changePWD")
    Call<DCchargeTravaux.LoginPerson> updatepwd(@Body DCchargeTravaux.LoginPerson loginPerson);

    @POST("Traiteurdemande")
    Call<DemandeDC>  DCcmd(@Body DemandeDC demandeDC);

    @GET("Traiteurdemande/{MATRICULE}")
    Call<List<DCchargeTravaux>>  DCofchargetravaux (@Path("MATRICULE") String Matrule);

    //to get all DC for chargeTravaux
    @GET("Traiteurdemande/{MATRICULE}/shortinfo")
    Call<List<dcchargeTravauxinterface>> DCshortinfo (@Path("MATRICULE") String Matriule);
}
