package com.demo.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by 1027 on 2016-12-03.
 */

public class MyGridAdapter extends BaseAdapter {
    Context context;
    int[] poster = {
         R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,
         R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,
         R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,
         R.drawable.mov10,R.drawable.mov11,R.drawable.mov12,
         R.drawable.mov13,R.drawable.mov14,R.drawable.mov15
    };
    public MyGridAdapter(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return poster.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int l) {
        return l;
    }

    @Override
    public View getView(int i, View v, ViewGroup g) {
        
        return null;
    }
}
