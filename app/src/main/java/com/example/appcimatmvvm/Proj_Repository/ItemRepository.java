package com.example.appcimatmvvm.Proj_Repository;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.appcimatmvvm.Proj_Dao.ItemDao;
import com.example.appcimatmvvm.Proj_Entiite.Item;
import com.example.appcimatmvvm.Proj_database.ItemDatabase;

import java.util.List;

public class ItemRepository {

    private ItemDao itemDao;

    private LiveData<List<Item>> allItems;
    public ItemRepository(Application application){

        ItemDatabase database = ItemDatabase.getInstance(application);
        itemDao =database.itemDao();

        allItems= itemDao.getAllItem();
    }


    public void  insert (Item item){
        new InsertItemAsynTask(itemDao).execute(item);

    }
    public void  update (Item item){
         new UpdateItemAsynTask(itemDao).execute(item);
    }
    public void  delete (Item item){
        new DeleteItemAsynTask(itemDao).execute(item);

    }
    public void  deleteALL (Item item){
        new DeleteALLItemAsynTask(itemDao).execute();

    }
    public  LiveData<List<Item>> getALLItems(){
        return  allItems;
    }

    private  static  class  InsertItemAsynTask extends AsyncTask<Item,Void,Void>{

          private  ItemDao itemDao;
          private  InsertItemAsynTask(ItemDao itemDao){
              this.itemDao=itemDao;
          }
        @Override
        protected Void doInBackground(Item... items) {
              itemDao.insert(items[0]);
            return null;
        }
    }
    private  static  class  UpdateItemAsynTask extends AsyncTask<Item,Void,Void>{

        private  ItemDao itemDao;
        private  UpdateItemAsynTask(ItemDao itemDao){
            this.itemDao=itemDao;
        }
        @Override
        protected Void doInBackground(Item... items) {
            itemDao.update(items[0]);
            return null;
        }
    }
    private  static  class  DeleteItemAsynTask extends AsyncTask<Item,Void,Void>{

        private  ItemDao itemDao;
        private  DeleteItemAsynTask(ItemDao itemDao){
            this.itemDao=itemDao;
        }
        @Override
        protected Void doInBackground(Item... items) {
            itemDao.delete(items[0]);
            return null;
        }
    }
    private  static  class  DeleteALLItemAsynTask extends AsyncTask<Void,Void,Void>{

        private  ItemDao itemDao;
        private  DeleteALLItemAsynTask(ItemDao itemDao){
            this.itemDao=itemDao;
        }
        @Override
        protected Void doInBackground(Void... voids) {
            itemDao.deleteAllItems();
            return null;
        }
    }


}
