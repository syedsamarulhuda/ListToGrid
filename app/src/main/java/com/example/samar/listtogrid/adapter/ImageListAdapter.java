package com.example.samar.listtogrid.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samar.listtogrid.R;
import com.example.samar.listtogrid.activity.SingleViewActivity;
import com.example.samar.listtogrid.view.ViewHolder;

import java.util.ArrayList;

/**
 * Created by samar on 13/11/16.
 */

public class ImageListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Integer> img;

    public ImageListAdapter(Context context, ArrayList<Integer> img) {
        this.context = context;
        this.img = img;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        View v= inflater.inflate(R.layout.layout_img_list, viewGroup, false);
        viewHolder = new ViewHolder(v);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        ViewHolder vh = (ViewHolder) holder;
        ((ViewHolder) holder).getImg().setImageResource(img.get(position));

        ((ViewHolder) holder).getImg().setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(context, SingleViewActivity.class);
                // Pass image index
                i.putExtra("id", position);
               context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return img.size();
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
