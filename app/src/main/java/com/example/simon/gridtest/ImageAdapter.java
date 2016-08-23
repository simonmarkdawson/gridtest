package com.example.simon.gridtest;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;



public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }
    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return 0;
    }

    public long getItemId(int position) {
        return 0;
    }


    // create a new ImageView for each item referenced by the Adapter

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);

        }
        else
        {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array


    public Integer[] mThumbIds = {
            R.drawable.littlefood1, R.drawable.littlefood2,
            R.drawable.littlefood3, R.drawable.littlefood4,
            R.drawable.littlefood5, R.drawable.littlefood6,
            R.drawable.littlefood7, R.drawable.littlefood8,
            R.drawable.littlefood9, R.drawable.littlefood10,
            R.drawable.littlefood1, R.drawable.littlefood2,
            R.drawable.littlefood3, R.drawable.littlefood4,
            R.drawable.littlefood5, R.drawable.littlefood6,
            R.drawable.littlefood7, R.drawable.littlefood8,
            R.drawable.littlefood9, R.drawable.littlefood10
    };
}