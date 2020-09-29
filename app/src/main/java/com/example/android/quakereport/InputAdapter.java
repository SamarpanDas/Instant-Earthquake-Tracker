package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InputAdapter extends ArrayAdapter<Input> {
    private static final String LOG_TAG = InputAdapter.class.getSimpleName();

    public InputAdapter(Activity context, ArrayList<Input> input) {super(context, 0, input); }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Input currentInput = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitudeTextView);
        magnitudeTextView.setText(currentInput.getMagnitude());


        TextView locationTextView = (TextView) listItemView.findViewById(R.id.locationTextView);
        locationTextView.setText(currentInput.getLocationName());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.dateTextView);
        dateTextView.setText(currentInput.getDate());

        return listItemView;
    }
}
