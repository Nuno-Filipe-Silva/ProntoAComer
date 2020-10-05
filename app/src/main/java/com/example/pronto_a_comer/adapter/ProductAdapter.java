package com.example.pronto_a_comer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pronto_a_comer.R;
import com.example.pronto_a_comer.model.Product;
import com.example.pronto_a_comer.roomdatabase.Cart;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    class ProductViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvProductName;

        private final TextView tvProductPrice;

        private final ImageView ivProductImage;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            tvProductName = itemView.findViewById(R.id.tvProductName);

            tvProductPrice = itemView.findViewById(R.id.tvProductPrice);

            ivProductImage = itemView.findViewById(R.id.ivProductImage);

        }
    }

    private final LayoutInflater layoutInflater;

    private List<Cart> mProductList;


    public ProductAdapter(Context context) {

        layoutInflater = LayoutInflater.from(context);

        this.mProductList = new ArrayList<>();

    }


    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.product_item, parent, false);

        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {

        Cart product = mProductList.get(position);

        holder.tvProductName.setText(product.getName());

        holder.tvProductPrice.setText(String.valueOf(product.getPrice()));

        holder.ivProductImage.setImageResource(R.drawable.logo);

    }

    public void setProductList(List<Cart> productList) {

        mProductList = productList;

        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return mProductList.size();
    }

}
