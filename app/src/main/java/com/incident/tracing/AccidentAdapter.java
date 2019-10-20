package com.incident.tracing;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by L on 9.4.2018.
 */

public class AccidentAdapter extends BaseAdapter {


    private LayoutInflater mInflater;
    private Accident[] accidents;


    public AccidentAdapter(Context context, Accident[]accidents){
        this.accidents = accidents;
        mInflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
    }

        @Override
        public int getCount () {
        return accidents.length;
    }

        @Override
        public Object getItem ( int position){
        return accidents[position];
    }

        @Override
        public long getItemId ( int position){
        return position;
    }




        @Override
        public View getView ( int position, View convertView, ViewGroup parent){

        View rowView = mInflater.inflate(R.layout.list_item, null);
        ((TextView) rowView.findViewById(R.id.name)).setText(accidents[position].getName());
        ((RoundedImageView) rowView.findViewById(R.id.photo)).setImageResource(accidents[position].getImageResourceID());
        return rowView;

    }


}