package com.example.pronto_a_comer.roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "cart_table")
public class Cart {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "price")
    public double price;

    @ColumnInfo(name = "imageId")
    public int imageId;


    public Cart(int id, String name, double price, int imageId) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
