package com.example.q.multicoordinatorlayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.q.multicoordinatorlayout.adapter.RVAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<String> texts=new ArrayList<>();
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.rv_app_activity_main_rv);
        appBarLayout=(AppBarLayout) findViewById(R.id.app_abl);
        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.ctl_app);
        toolbar=(Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        collapsingToolbarLayout.setTitle("我是toolbar");
        collapsingToolbarLayout.setTitleEnabled(true);
        for(int i=0;i<20;i++){
            texts.add("文本"+i);
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RVAdapter rvAdapter=new RVAdapter(this,texts);
        recyclerView.setAdapter(rvAdapter);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {

            }
        });

    }
}
