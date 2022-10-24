package com.example.hw5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    ArrayList<String> stringList = new ArrayList<>();
    ArrayAdapter<String> stringArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringList.add("c");
        stringList.add("b");
        stringList.add("a");
        stringList.add("e");
        stringList.add("d");

        stringArrayAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, stringList);

        myListView = findViewById(R.id.myListView);
        myListView.setAdapter(stringArrayAdapter);

        registerForContextMenu(myListView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        View targetView = info.targetView;

        switch (item.getItemId()) {
            case R.id.greenMenuItem:
                targetView.setBackgroundColor(Color.parseColor("green"));
                break;
            case R.id.redMenuItem:
                targetView.setBackgroundColor(Color.parseColor("red"));
                break;
            case R.id.yellowMenuItem:
                targetView.setBackgroundColor(Color.parseColor("yellow"));
                break;
            default:
                targetView.setBackgroundColor(Color.parseColor("white"));
        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.delete:
                stringList.clear();
                stringArrayAdapter.notifyDataSetChanged();
                break;
            case R.id.sort:
                Collections.sort(stringList);
                stringArrayAdapter.notifyDataSetChanged();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}