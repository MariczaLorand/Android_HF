package com.example.s4_2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.ViewHolder> {
    Activity context;
    List<Animal> animalList;

    public CustomRecyclerViewAdapter(Activity context, List<Animal> animalList) {
        this.context = context;
        this.animalList = animalList;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View view;
        ImageView imageView;
        TextView textViewName;
        TextView textViewDetails;

        public ViewHolder(@NonNull View itemView, Activity context) {
            super(itemView);
            view = itemView;
            imageView = itemView.findViewById(R.id.imageView4);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDetails = itemView.findViewById(R.id.textViewDetails);

            itemView.setOnClickListener(view -> {
                String name = textViewName.getText().toString();
                Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
            });
        }
    }

    @NonNull
    @Override
    public CustomRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_2, parent, false);
        return new ViewHolder(itemView, context);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerViewAdapter.ViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        holder.view.setTag(animal);
        holder.textViewName.setText(animal.name);
        holder.textViewDetails.setText(animal.details);
        holder.imageView.setImageResource(animal.thumbnailDrawable);
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
