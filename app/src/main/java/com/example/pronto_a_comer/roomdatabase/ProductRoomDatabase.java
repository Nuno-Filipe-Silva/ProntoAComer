package com.example.pronto_a_comer.roomdatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.pronto_a_comer.model.Product;

@Database(entities = {Cart.class}, version = 1, exportSchema = false)
public abstract class ProductRoomDatabase extends RoomDatabase {

    public abstract CartDao cartDao();

    private static ProductRoomDatabase INSTANCE;

    public static ProductRoomDatabase getDatabase(final Context context) {

        if (INSTANCE == null) {

            synchronized (ProductRoomDatabase.class) {

                if (INSTANCE == null) {



                }

            }

        }

        return INSTANCE;

    }

}
















