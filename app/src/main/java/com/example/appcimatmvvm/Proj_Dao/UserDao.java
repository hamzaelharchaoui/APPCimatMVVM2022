package com.example.appcimatmvvm.Proj_Dao;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.appcimatmvvm.Proj_Entiite.Item;
import com.example.appcimatmvvm.Proj_Entiite.User;

import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void insert(User user);
    @Update
    void update(User user);
    @Delete
    void delete(User user);

    @Query(" Delete From User_table")
    void deleteAllUsers();
      @Query("Select* from User_table ")
        LiveData<List<User>> getALLUser();


}
