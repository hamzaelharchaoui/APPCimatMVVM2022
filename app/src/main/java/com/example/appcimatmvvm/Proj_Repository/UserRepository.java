package com.example.appcimatmvvm.Proj_Repository;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.appcimatmvvm.Proj_Dao.ItemDao;
import com.example.appcimatmvvm.Proj_Dao.UserDao;
import com.example.appcimatmvvm.Proj_Entiite.Item;
import com.example.appcimatmvvm.Proj_Entiite.User;
import com.example.appcimatmvvm.Proj_database.ItemDatabase;
import com.example.appcimatmvvm.Proj_database.UserDatabase;

import java.util.List;

public class UserRepository {

    private UserDao userDao;
    private LiveData<List<User>> allUser;
    public UserRepository(Application application){

        UserDatabase database = UserDatabase.getInstance(application);
        userDao =database.userDao();
        allUser= userDao.getALLUser();
    }
    public void  insert (User user){
        new InsertUserAsynTask(userDao).execute(user);
    }
    public void  update (User user){
         new UpdateUserAsynTask(userDao).execute(user);
    }
    public void  delete (User user){
        new DeleteUserAsynTask(userDao).execute(user);

    }
    public void  deleteALL (Item item){
        new DeleteALLUseerAsynTask(userDao).execute();

    }
    public  LiveData<List<User>> getALLUser(){
        return  allUser;
    }

    private  static  class  InsertUserAsynTask extends AsyncTask<User,Void,Void>{

        private  UserDao userDao;
        private  InsertUserAsynTask(UserDao userDao){
            this.userDao=userDao;
        }
        @Override
        protected Void doInBackground(User... users) {
            userDao.insert(users[0]);
            return null;
        }
    }

    private  static  class  UpdateUserAsynTask extends AsyncTask<User,Void,Void>{

        private  UserDao userDao;
        private  UpdateUserAsynTask(UserDao userDao){
            this.userDao=userDao;
        }
        @Override
        protected Void doInBackground(User... users) {
            userDao.update(users[0]);
            return null;
        }
    }
    private  static  class  DeleteUserAsynTask extends AsyncTask<User,Void,Void>{

        private  UserDao userDao;
        private  DeleteUserAsynTask(UserDao userDao){
            this.userDao=userDao;
        }
        @Override
        protected Void doInBackground(User... users) {
            userDao.delete(users[0]);
            return null;
        }
    }
    private  static  class  DeleteALLUseerAsynTask extends AsyncTask<Void,Void,Void>{

        private  UserDao userDao;
        private  DeleteALLUseerAsynTask(UserDao userDao){
            this.userDao=userDao;
        }
        @Override
        protected Void doInBackground(Void... voids) {
            userDao.deleteAllUsers();
            return null;
        }
    }

}
