package com.example.pronto_a_comer;

public class Order {

private int mOrderNumber;

private String mOrderDate;

private Double mOrderTotalAmount;

public Order(int orderNumber, String orderDate, Double orderTotalAmount){

    this.mOrderNumber = orderNumber;

    this.mOrderDate = orderDate;

    this.mOrderTotalAmount = orderTotalAmount;

}


    public int getOrderNumber() {
        return mOrderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.mOrderNumber = orderNumber;
    }

    public String getOrderDate() {
        return mOrderDate;
    }

    public void setmOrderDate(String orderDate) {
        this.mOrderDate = orderDate;
    }

    public Double getOrderTotalAmount() {
        return mOrderTotalAmount;
    }

    public void setOrderTotalAmount(Double orderTotalAmount) {
        this.mOrderTotalAmount = orderTotalAmount;
    }
}
