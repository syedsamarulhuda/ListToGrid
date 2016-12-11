package com.example.samar.listtogrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.example.samar.listtogrid.activity.SingleViewActivity;
import com.example.samar.listtogrid.adapter.ImageGridAdapter;
import com.example.samar.listtogrid.adapter.ImageListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    GridView gridview;
    ImageGridAdapter imageAdapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ImageListAdapter imageListAdapter;
    Button btnGrid, btnList;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    public void initView() {
        gridview = (GridView) findViewById(R.id.gridview);
        imageAdapter = new ImageGridAdapter(this, getArrayListExample());
        imageListAdapter= new ImageListAdapter(this,getArrayListExample());
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.rList);

        btnGrid=(Button)findViewById(R.id.btnGrid);
        btnList=(Button)findViewById(R.id.btnList);
    }

    public void initData() {


        btnGrid.setOnClickListener(this);
        btnList.setOnClickListener(this);

        gridview.setAdapter(imageAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(imageListAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), SingleViewActivity.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });


    }


    public ArrayList<Integer> getArrayListExample() {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(R.drawable.img1);
        items.add(R.drawable.img2);
        items.add(R.drawable.img3);
        items.add(R.drawable.img4);
        items.add(R.drawable.img5);
        items.add(R.drawable.img6);
        items.add(R.drawable.img7);
        items.add(R.drawable.img8);
        items.add(R.drawable.img9);
        items.add(R.drawable.img10);
        items.add(R.drawable.img11);
        items.add(R.drawable.img12);
        return items;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnGrid:
                gridview.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);
                Log.d("##GRID","Grid Visible");
                break;
            case  R.id.btnList:
                gridview.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);
                Log.d("##LIST","List Visible");
                break;

        }
    }
}
