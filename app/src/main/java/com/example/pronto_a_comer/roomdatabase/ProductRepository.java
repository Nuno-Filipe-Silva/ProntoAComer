package com.example.pronto_a_comer.roomdatabase;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.pronto_a_comer.model.Product;

import java.util.List;

public class ProductRepository {

    private CartDao mCartDao;

    private LiveData<List<Cart>> mListProductsLiveData;

    public ProductRepository(Application application) {

        ProductRoomDatabase productRoomDatabase = ProductRoomDatabase.getDatabase(application);

        mCartDao = productRoomDatabase.cartDao();

        mListProductsLiveData = mCartDao.getData();

    }

    LiveData<List<Cart>> getListProductsLiveData() {

        return mListProductsLiveData;

    }

    public void insert(Cart product) {

        new insertAsyncTask(mCartDao).execute(product);

    }

    private static class insertAsyncTask extends AsyncTask<Cart, Void, Void> {

        private CartDao cartAsyncTask;

        insertAsyncTask(CartDao cartDao) {

            cartAsyncTask = cartDao;

        }

        @Override
        protected Void doInBackground(Cart... products) {

            cartAsyncTask.addToCart(products[0]);

            return null;
        }
    }



}













