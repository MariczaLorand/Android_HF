package com.example.hw4;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CurrencyAdapter extends ArrayAdapter<Currency> {

    Activity contextFromParam;

    public CurrencyAdapter(
            Activity context,
            ArrayList<Currency> currencyArrayList) {
        super(context, 0, currencyArrayList);
        contextFromParam = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        Currency currency = getItem(position);

//        Log.d("status", String.valueOf(getContext().equals(contextFromParam)));

        try {
            if (convertView == null) {
                convertView =
                        LayoutInflater
                                .from(getContext())
                                .inflate(R.layout.currency, parent, false);
            }
        } catch (Exception e) {
            Log.d("status", e.getMessage());
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textViewAbrivationName = convertView.findViewById(R.id.textViewAbrivationName);
        TextView textViewDetailedName = convertView.findViewById(R.id.textViewDetailedName);
//        TextView textViewSellPrice = convertView.findViewById(R.id.textViewSellPrice);
//        TextView textViewBuyPrice = convertView.findViewById(R.id.textViewBuyPrice);

        imageView.setImageDrawable(imageView.getResources().getDrawable(currency.drawable));
        textViewAbrivationName.setText(currency.abrivationName);
        textViewDetailedName.setText(currency.detaildName);
//        textViewSellPrice.setText(currency.sellPrice);
//        textViewBuyPrice.setText(currency.buyPrice);

        return convertView;
    }


}
