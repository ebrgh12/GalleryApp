package com.example.girish.galleryapp;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Girish on 6/1/2017.
 */

public class ImageDialogFragment extends DialogFragment {

    String dataValue = null;
    RecyclerView images;
    LinearLayoutManager layoutManager;
    List<DetailPageBean> detailPageBeen = new ArrayList<DetailPageBean>();
    Bundle bundle;
    DialogAdapter dialogAdapter;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.dialog_layout,container,false);
        images = (RecyclerView)view.findViewById(R.id.images);
        layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        images.setLayoutManager(layoutManager);
        bundle = getArguments();
        if(bundle != null){
            dataValue = bundle.getString("label_name");
        }

        if(dataValue != null){
            detailPageBeen.clear();
            loadData();
        }else {
            Toast.makeText(getActivity(), "no data received", Toast.LENGTH_SHORT).show();
        }

        return view;
    }

    private void loadData() {
        switch (dataValue){
            case "Animals":
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_one)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_two)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_three)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_four)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_five)));
                //detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_six)));
                break;
            case "Architecture":
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.architecture_one)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.architecture_two)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.architecture_three)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.architecture_four)));
                break;
            case "Food":
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.food_one)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.food_two)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.food_three)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.food_four)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.food_five)));
                break;
            case "Posters":
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.posters_one)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.posters_two)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.posters_three)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.posters_four)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.posters_five)));
                break;
            case "Scenery":
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.scenery_one)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.scenery_two)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.scenery_three)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.scenery_four)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.scenery_five)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.scenery_six)));
                break;

        }

        dialogAdapter = new DialogAdapter(getActivity(),detailPageBeen);
        images.setAdapter(dialogAdapter);

    }

}
