package com.example.pronto_a_comer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pronto_a_comer.adapter.ProductAdapter;
import com.example.pronto_a_comer.model.Product;
import com.example.pronto_a_comer.roomdatabase.Cart;
import com.example.pronto_a_comer.roomdatabase.ProductViewModel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private ProductViewModel productViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.productsRV);

        final ProductAdapter productAdapter = new ProductAdapter(this);

        recyclerView.setAdapter(productAdapter);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        productViewModel = ViewModelProviders.of(this).get(ProductViewModel.class);

        productViewModel.getProductsListLiveData()
                .observe(this, new Observer<List<Cart>>() {
            @Override
            public void onChanged(List<Cart> productList) {

                productAdapter.setProductList(productList);

            }
        });

    }

    /*private List<Product> getProducts() {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));

        products.add(new Product(1, "Name", 2.33, R.drawable.logo));


        return products;


    }*/


}
