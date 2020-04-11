package com.example.pronto_a_comer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.Stack;

public class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.OrderViewHolder> {


    private LayoutInflater mLayoutInflater;

    private StackLinkedList<Order> orderStack = new LinkedList<Order>();


    class OrderViewHolder extends RecyclerView.ViewHolder{

        public final TextView orderNumberTV;

        public final TextView orderDateTV;

        public final TextView orderTotalAmount;

        final OrderListAdapter mOrderListAdapter;

        public OrderViewHolder(View itemView, OrderListAdapter orderListAdapter){

            super(itemView);

            this.mOrderListAdapter = orderListAdapter;

            orderNumberTV = itemView.findViewById(R.id.orderNumber);

            orderDateTV = itemView.findViewById(R.id.orderDate);

            orderTotalAmount = itemView.findViewById(R.id.orderTotalAmount);

        }



    }

    @NonNull
    @Override
    public OrderListAdapter.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderListAdapter.OrderViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
