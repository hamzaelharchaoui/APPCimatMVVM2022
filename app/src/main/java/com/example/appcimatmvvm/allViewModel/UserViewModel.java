package com.example.appcimatmvvm.allViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.appcimatmvvm.Proj_Entiite.User;
import com.example.appcimatmvvm.Proj_Repository.UserRepository;

import java.util.List;

public class UserViewModel extends AndroidViewModel {


    private UserRepository repository;
    private LiveData<List<User>> allUser;
    public UserViewModel(@NonNull Application application) {
        super(application);
        repository=new UserRepository(application);
        allUser =repository.getALLUser();

    }

    public  void  insert (User user){
        repository.insert(user);

    }

    public  void update(User user){
        repository.update(user);
    }
    public  void delete(User user){
        repository.delete(user);
    }

   public  LiveData<List<User>> getAllUser(){

        return  allUser;
   }

    }



