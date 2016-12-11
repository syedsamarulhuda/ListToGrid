package com.example.samar.listtogrid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.samar.listtogrid.MainActivity;
import com.example.samar.listtogrid.R;
import com.example.samar.listtogrid.adapter.ImageListAdapter;

import java.util.ArrayList;

public class SingleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view);

        // Get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");

        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
        imageView.setImageResource(getArrayListExample().get(position));

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
}
