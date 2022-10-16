package com.example.hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Currency> arrayListOfCurrencies = new ArrayList<>();

        arrayListOfCurrencies.add(new Currency(R.drawable.usd, "USD", "United State Dollar", "110", "100"));
        arrayListOfCurrencies.add(new Currency(R.drawable.eur, "EUR", "Euro", "120", "110"));
        arrayListOfCurrencies.add(new Currency(R.drawable.lira, "TRY", "Turkish Lira", "50", "40"));

        // what is wrong with the passed arraylist -> only the last one gets rendered / the rendered views overlap each other
        CurrencyAdapter currencyAdapter = new CurrencyAdapter(this, arrayListOfCurrencies);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(currencyAdapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            TextView textViewSellPrice = view.findViewById(R.id.textViewSellPrice);
            TextView textViewBuyPrice = view.findViewById(R.id.textViewBuyPrice);
            Currency currency = (Currency) listView.getItemAtPosition(i);

            Log.d("status", String.valueOf(currency));

            textViewSellPrice.setText(currency.sellPrice);
            textViewBuyPrice.setText(currency.buyPrice);
        });

        currencyAdapter.add(new Currency(R.drawable.usd, "USD", "United State Dollar", "110", "100"));
    }
}