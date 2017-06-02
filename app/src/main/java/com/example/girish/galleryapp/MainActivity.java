package com.example.girish.galleryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
// Finally done with this assignment
    HomeListAdapter homeListAdapter;
    List<HomePageListBean> homePageListBeen = new ArrayList<>();
    RecyclerView homeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeList = (RecyclerView) findViewById(R.id.home_list);
        homeList.setLayoutManager(new LinearLayoutManager(this));

        homePageListBeen.add(new HomePageListBean("Animals",getResources().getDrawable(R.drawable.animal_one)));
        homePageListBeen.add(new HomePageListBean("Architecture",getResources().getDrawable(R.drawable.architecture_one)));
        homePageListBeen.add(new HomePageListBean("Food",getResources().getDrawable(R.drawable.food_one)));
        homePageListBeen.add(new HomePageListBean("Posters",getResources().getDrawable(R.drawable.posters_one)));
        homePageListBeen.add(new HomePageListBean("Scenery",getResources().getDrawable(R.drawable.scenery_one)));

        homeListAdapter = new HomeListAdapter(MainActivity.this,MainActivity.this,homePageListBeen);
        homeList.setAdapter(homeListAdapter);

    }

}
