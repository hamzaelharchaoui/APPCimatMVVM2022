package com.example.appcimatmvvm.allViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.appcimatmvvm.Proj_Entiite.Item;
import com.example.appcimatmvvm.Proj_Repository.ItemRepository;

import java.util.List;

public class ItemViewModel extends AndroidViewModel {


    private ItemRepository repository;
    private LiveData<List<Item>> allItems;
    public ItemViewModel(@NonNull Application application) {
        super(application);
        repository=new ItemRepository(application);
        allItems =repository.getALLItems();

    }

    public  void  insert (Item item){
        repository.insert(item);

    }

    public  void update(Item item){
        repository.update(item);
    }
    public  void delete(Item item){
        repository.delete(item);
    }
    public  void deleteAllNotes(Item item){
        repository.deleteALL(item);
    }
   public  LiveData<List<Item>> getAllItems(){

        return  allItems;
   }

    }



