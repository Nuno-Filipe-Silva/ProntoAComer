package com.example.pronto_a_comer.roomdatabase;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.pronto_a_comer.model.Product;

import java.util.List;

public class ProductViewModel extends AndroidViewModel {

    private ProductRepository productRepository;

    private LiveData<List<Cart>> productsListLiveData;

    public ProductViewModel(Application application) {

        super(application);

        productRepository = new ProductRepository(application);

        productsListLiveData = productRepository.getListProductsLiveData();

    }

    public LiveData<List<Cart>> getProductsListLiveData() {

        return productsListLiveData;

    }

    public void insertProduct(Cart product) {

        productRepository.insert(product);

    }





}
