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

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> productList;

    private final LayoutInflater layoutInflater;

    public ProductAdapter(Context context, List<Product> productList) {

        layoutInflater = LayoutInflater.from(context);

        this.productList = productList;

    }



    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.product_item, parent, false);

        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {

        Product product = productList.get(position);

        holder.tvProductName.setText(product.getProductName());

        holder.tvProductPrice.setText(String.valueOf(product.getProductPrice()));

        holder.ivProductImage.setImageResource(R.drawable.logo);


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

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
}
