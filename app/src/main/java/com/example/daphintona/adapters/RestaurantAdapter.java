package com.example.daphintona.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.daphintona.R;
import com.example.daphintona.models.Business;
import com.example.daphintona.ui.RestaurantDetailActivity;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

        private List<Business> mRestaurants;
        private Context mContext;

        public RestaurantAdapter(Context context, List<Business> restaurants) {
            mContext = context;
            mRestaurants = restaurants;

        }
        @Override
        public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_list_item, parent, false);
            RestaurantViewHolder viewHolder = new RestaurantViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(RestaurantAdapter.RestaurantViewHolder holder, int position) {
            holder.bindRestaurant(mRestaurants.get(position));
        }

        @Override
        public int getItemCount() {
            return mRestaurants.size();
        }

        public class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            @BindView(R.id.restaurantImageView) ImageView restaurantImageViewd;
            @BindView(R.id.restaurantNameTextView) TextView mNameTextView;
            @BindView(R.id.categoryTextView) TextView mCategoryTextView;
            @BindView(R.id.ratingTextView)
            TextView mRatingTextView;

            private Context mContext;

            public RestaurantViewHolder(View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
                mContext = itemView.getContext();
                itemView.setOnClickListener(this);
            }
            @Override
            public void onClick(View v) {
                int itemPosition = getLayoutPosition();
                Intent intent = new Intent(mContext, RestaurantDetailActivity.class);
                intent.putExtra("position", itemPosition);
                intent.putExtra("restaurants", Parcels.wrap(mRestaurants));
                mContext.startActivity(intent);
            }

            public void bindRestaurant(Business restaurant) {
                Picasso.get().load(restaurant.getImageUrl()).into(restaurantImageViewd);
                mNameTextView.setText(restaurant.getName());
                mCategoryTextView.setText(restaurant.getCategories().get(0).getTitle());
                mRatingTextView.setText("Rating: " + restaurant.getRating() + "/5");
            }
        }
    }


