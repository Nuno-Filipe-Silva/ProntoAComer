package com.example.pronto_a_comer.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CartDao {

    @Insert
    public void addToCart(Cart cart);

    @Query("SELECT * FROM cart_table")
    public List<Cart> getData();

    @Query("SELECT EXISTS (SELECT 1 FROM cart_table WHERE id = :id)")
    public int selectProductFromCart(int id);

    @Query("SELECT COUNT (*) FROM cart_table")
    public int countCart();

    @Query("DELETE FROM cart_table WHERE id = :id ")
    public int deleteProductFromCart(int id);


}

















