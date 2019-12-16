package com.example.appcimatmvvm.Proj_Dao;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.appcimatmvvm.Proj_Entiite.Item;

import java.util.List;

@Dao
public interface ItemDao {
    @Insert
    void insert(Item item);
    @Update
    void update(Item item);
    @Delete
    void delete(Item item);

    @Query("Delete From item_table")
    void deleteAllItems();
      @Query("Select* from item_table ")
        LiveData<List<Item>> getAllItem();



}
