package com.example.pronto_a_comer.roomdatabase;

import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.pronto_a_comer.R;
import com.example.pronto_a_comer.model.Product;

import java.util.ArrayList;
import java.util.List;

@Database(entities = {Cart.class}, version = 1, exportSchema = false)
public abstract class ProductRoomDatabase extends RoomDatabase {

    public abstract CartDao cartDao();

    private static ProductRoomDatabase INSTANCE;

    public static ProductRoomDatabase getDatabase(final Context context) {

        if (INSTANCE == null) {

            synchronized (ProductRoomDatabase.class) {

                if (INSTANCE == null) {

                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ProductRoomDatabase.class, "cart_table")
                            .fallbackToDestructiveMigration()
                            .addCallback(roomCallback)
                            .build();

                }

            }

        }

        return INSTANCE;

    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {

        @Override
        public void onOpen(SupportSQLiteDatabase sqLiteDatabase) {

            super.onOpen(sqLiteDatabase);

            new PopulateDbAsync(INSTANCE).execute();

        }

    };


    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final CartDao mCartDao;

        List<Cart> productList = new ArrayList<>();

        public List<Cart> getProductList() {

            productList.add(new Cart(1, "Ref1", 2.00,
                    R.drawable.logo));

            productList.add(new Cart(2, "Ref2", 3.00,
                    R.drawable.logo));

            productList.add(new Cart(3, "Ref3", 4.00,
                    R.drawable.logo));

            productList.add(new Cart(4, "Ref4", 5.00,
                    R.drawable.logo));

            productList.add(new Cart(5, "Ref5", 6.00,
                    R.drawable.logo));

            productList.add(new Cart(6, "Ref6", 6.00,
                    R.drawable.logo));



            return productList;
        }

        PopulateDbAsync(ProductRoomDatabase productRoomDatabase) {

            mCartDao = productRoomDatabase.cartDao();

        }

        @Override
        protected Void doInBackground(Void... voids) {

            mCartDao.deleteProductsFromCart();

            productList = getProductList();

            for (Cart product : productList) {

                mCartDao.addToCart(product);

            }

            return null;
        }
    }

}
















