package com.example.pronto_a_comer.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.pronto_a_comer.model.Product;

import java.util.List;

@Dao
public interface CartDao {

    @Insert
    public void addToCart(Cart cart);

    @Query("SELECT * FROM cart_table")
    public LiveData<List<Cart>> getData();

    @Query("SELECT EXISTS (SELECT 1 FROM cart_table WHERE id = :id)")
    public int selectProductFromCart(int id);

    @Query("SELECT COUNT (*) FROM cart_table")
    public int countCart();

    @Query("DELETE FROM cart_table")
    public int deleteProductsFromCart();

    @Query("DELETE FROM cart_table WHERE id = :id ")
    public int deleteProductFromCart(int id);


}

















