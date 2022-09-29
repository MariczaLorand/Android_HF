package com.example.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkActivity2 extends AppCompatActivity {

    List<Product> products = new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework2);

        EditText prodCode = findViewById(R.id.prodCode);
        EditText prodName = findViewById(R.id.prodName);
        EditText prodPrice = findViewById(R.id.prodPrice);

        Button cancelProd = findViewById(R.id.buttonCancelProd);
        Button addProd = findViewById(R.id.buttonAddProd);
        Button showProds = findViewById(R.id.buttonShowProds);

        TextView showProductsView = findViewById(R.id.textViewShowProducts);

        cancelProd.setOnClickListener(view -> {
            prodCode.setText("");
            prodName.setText("");
            prodPrice.setText("");
        });

        addProd.setOnClickListener(view -> {
            String code = prodCode.getText().toString();
            String name = prodName.getText().toString();
            String price = prodPrice.getText().toString();

            Product product = new Product(code, name, price);
            products.add(product);
        });

        showProds.setOnClickListener(view -> {
            showProductsView.setText(Arrays.toString(products.toArray()));
        });
    }
}