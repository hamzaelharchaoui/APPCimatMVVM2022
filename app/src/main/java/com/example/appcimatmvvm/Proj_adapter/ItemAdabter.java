package com.example.appcimatmvvm.Proj_adapter;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appcimatmvvm.Proj_Entiite.Item;
import com.example.appcimatmvvm.R;

import java.util.ArrayList;
import java.util.List;

public class ItemAdabter extends RecyclerView.Adapter <ItemAdabter.NoteHolder>{

    private List<Item> items =new ArrayList<>();

    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View itemView =LayoutInflater.from(parent.getContext() )

                .inflate(R.layout.note_item,parent,false);

        return new NoteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int i) {
        Item currentNote =items.get(i);
         holder.textTitile.setText(currentNote.getTagequippemnt());
         holder.textDescription.setText(currentNote.getItemeqipement());
         holder.textPriority.setText(String.valueOf(currentNote.getCodeArticle()));


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public  void  setNotes(List<Item> notes){
       this.items = notes;
       notifyDataSetChanged();

    }

    class  NoteHolder extends RecyclerView.ViewHolder{
        private TextView textTitile;
        private TextView textDescription;
        private TextView textPriority;


        public NoteHolder(@NonNull View itemView) {
            super(itemView);
            textTitile= itemView.findViewById(R.id.text_view_title);
            textDescription=itemView.findViewById(R.id.txtdescription);
            textPriority=itemView.findViewById(R.id.text_view_priority);
        }
    }
}
