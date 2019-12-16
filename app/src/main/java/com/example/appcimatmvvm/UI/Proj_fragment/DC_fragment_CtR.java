package com.example.appcimatmvvm.UI.Proj_fragment;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.appcimatmvvm.Proj_Entiite.Item;
import com.example.appcimatmvvm.R;
import com.example.appcimatmvvm.allViewModel.ItemViewModel;
import com.example.appcimatmvvm.Proj_adapter.ItemAdabter;

import java.util.List;



public class DC_fragment_CtR extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

private  ItemViewModel itemViewModel;

    public DC_fragment_CtR() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view =inflater.inflate(R.layout.fragment_dc_fragment__ct_r, container, false);

        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        final ItemAdabter adapter =new ItemAdabter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity() ));
        itemViewModel=ViewModelProviders.of(getActivity()).get(ItemViewModel.class);
        itemViewModel.getAllItems().observe(this, new Observer<List<Item>>() {
            @Override
            public void onChanged(@Nullable List<Item> items) {

                Toast.makeText(getActivity(),"on change",Toast.LENGTH_SHORT);
                adapter.setNotes(items);
            }
        });



        return view;
    }

}
