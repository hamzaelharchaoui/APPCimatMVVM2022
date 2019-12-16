package com.example.appcimatmvvm.Proj_database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.example.appcimatmvvm.Proj_Dao.ItemDao;
import com.example.appcimatmvvm.Proj_Entiite.Item;

@Database(entities={Item.class},version=1)
public abstract class ItemDatabase extends RoomDatabase {
  private  static  ItemDatabase instance;
  public abstract ItemDao itemDao();

 public static  synchronized  ItemDatabase getInstance(Context context){
        if (instance== null){
    instance =Room.databaseBuilder(context.getApplicationContext(),ItemDatabase.class,
            "note_database")
            .fallbackToDestructiveMigration()
           // .addCallback(roomCallBack)
            .build();

}

return instance;

 }



}
