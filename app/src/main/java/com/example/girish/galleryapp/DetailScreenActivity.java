package com.example.girish.galleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Girish on 6/1/2017.
 */

public class DetailScreenActivity extends AppCompatActivity {

    String dataValue = null;
    List<DetailPageBean> detailPageBeen = new ArrayList<DetailPageBean>();
    DetailPageAdapter detailPageAdapter;
    ImageView back;
    RecyclerView detailList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_screen);

        back = (ImageView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        if(intent != null){
            dataValue = intent.getStringExtra("label_name");
        }

        detailList = (RecyclerView) findViewById(R.id.detail_list);
        detailList.setLayoutManager(new LinearLayoutManager(this));

        if(dataValue != null){
            detailPageBeen.clear();
            loadData();
        }else {
            Toast.makeText(this, "no data received", Toast.LENGTH_SHORT).show();
        }
    }

    private void loadData() {
        switch (dataValue){
            case "Animals":
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_one)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_two)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_three)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_four)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_five)));
                detailPageBeen.add(new DetailPageBean(getResources().getDrawable(R.drawable.animal_six)));
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

        detailPageAdapter = new DetailPageAdapter(DetailScreenActivity.this,detailPageBeen);
        detailList.setAdapter(detailPageAdapter);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
