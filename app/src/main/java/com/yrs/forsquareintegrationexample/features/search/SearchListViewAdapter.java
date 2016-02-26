package com.yrs.forsquareintegrationexample.features.search;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.yrs.forsquareintegrationexample.R;
import com.yrs.forsquareintegrationexample.models.Venue;

import java.util.List;

/**
 * Created by yaros on 26/02/16.
 */
public class SearchListViewAdapter extends ArrayAdapter<Venue> {

    private Context context;
    private List<Venue> venuesList;

    public SearchListViewAdapter(@NonNull Context context,
                                 @NonNull int resource,
                                 List<Venue> venuesList) {
        super(context, resource, venuesList);
        this.context = context;
        this.venuesList = venuesList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label_textView);
        textView.setText(venuesList.get(position).getName());

//        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
//        textView.setText(values[position]);
//        // change the icon for Windows and iPhone
//        String s = values[position];
//        if (s.startsWith("iPhone")) {
//            imageView.setImageResource(R.drawable.no);
//        } else {
//            imageView.setImageResource(R.drawable.ok);
//        }

        return rowView;
    }
}
