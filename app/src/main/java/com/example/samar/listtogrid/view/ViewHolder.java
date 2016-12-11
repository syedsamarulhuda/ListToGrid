package com.example.samar.listtogrid.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.samar.listtogrid.R;

/**
 * Created by samar on 13/11/16.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    private ImageView img;
    public ViewHolder(View itemView) {
        super(itemView);
        img=(ImageView)itemView.findViewById(R.id.ivImg);
    }

    public ImageView getImg() {
        return img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }
}
