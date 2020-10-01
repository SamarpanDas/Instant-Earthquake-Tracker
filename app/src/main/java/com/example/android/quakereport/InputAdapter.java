package com.example.android.quakereport;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InputAdapter extends ArrayAdapter<Input>
{
    private static final String LOG_TAG = InputAdapter.class.getSimpleName();

    public InputAdapter(Activity context, ArrayList<Input> input) {super(context, 0, input); }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Input currentInput = getItem(position);





        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitudeTextView);
        magnitudeTextView.setText(currentInput.getMagnitude());

        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeTextView.getBackground();
        int magnitudeColor = getMagnitudeColor(currentInput.getMagnitude());
        magnitudeCircle.setColor(magnitudeColor);


        TextView locationTextView = (TextView) listItemView.findViewById(R.id.locationTextView);
        locationTextView.setText(currentInput.getLocationName());

        TextView locationMainTextView = (TextView) listItemView.findViewById(R.id.locationMainTextView);
        locationMainTextView.setText(currentInput.getLocationMainName());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.dateTextView);
        dateTextView.setText(currentInput.getDate());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.timeTextView);
        timeTextView.setText(currentInput.getTime());

        return listItemView;
    }


    private int getMagnitudeColor(String Magnitude)
    {
        double magnitude = Double.parseDouble(Magnitude);

        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
