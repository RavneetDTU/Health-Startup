package com.example.ravneet.gymproject.Activities;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ravneet.gymproject.R;

import java.util.ArrayList;

/**
 * Created by HP on 09-08-2017.
 */

public class Adapter extends ArrayAdapter<String> {

    public Adapter(@NonNull Context context, ArrayList<String> resource) {
        super(context, 0, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.eachitem, parent, false);
        }
        String currentWord = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_view);
        defaultTextView.setText(currentWord);
        return listItemView;
    }
}