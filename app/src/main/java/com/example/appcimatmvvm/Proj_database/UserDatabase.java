package com.example.appcimatmvvm.Proj_database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.example.appcimatmvvm.Proj_Dao.ItemDao;
import com.example.appcimatmvvm.Proj_Dao.UserDao;
import com.example.appcimatmvvm.Proj_Entiite.Item;
import com.example.appcimatmvvm.Proj_Entiite.User;

@Database(entities={User.class},version=1)
public abstract class UserDatabase extends RoomDatabase {
  private  static UserDatabase instance;
  public abstract UserDao userDao();

 public static  synchronized UserDatabase getInstance(Context context){
        if (instance== null){
    instance =Room.databaseBuilder(context.getApplicationContext(), UserDatabase.class,
            "user_database")
            .fallbackToDestructiveMigration()
            .build();

}

return instance;

 }




}
