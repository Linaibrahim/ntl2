package com.example.pcworld.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<DetailsList> {
    public GuideAdapter(Context context, ArrayList<DetailsList> arraylist) {
        super(context, 0, arraylist);
    }

    @Override
    public View getView(int position, View comeView, ViewGroup parent) {
        View view = comeView;
        if (view == null) {
            LayoutInflater layoutInflater = null;
            view = layoutInflater.from(getContext()).inflate(R.layout.item_design, null);
        }
        DetailsList dataPosition = getItem(position);
        TextView titleName = (TextView) view.findViewById(R.id.title_text);
        TextView subTitleName = (TextView) view.findViewById(R.id.subTitle_text);
        ImageView image = view.findViewById(R.id.imageView2);
        titleName.setText(dataPosition.getTitle());
        subTitleName.setText(dataPosition.getDescription());
        if (dataPosition.listWithImageOrNot()) {
            image.setImageResource(dataPosition.getImageId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }
        return view;
    }
}
