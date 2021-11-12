package tabian.com.instagramclone2.recyclercard;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import tabian.com.instagramclone2.R;

public class FoodCardAdapter extends RecyclerView.Adapter<FoodCardAdapter.ViewHolder>{
    ArrayList<FoodCard> items = new ArrayList<FoodCard>();

    public void addItem(FoodCard item) {
        items.add(item);
    }

//    public void setItems(ArrayList<FoodCard> items) {
//        this.items = items;
//    }

    public FoodCard getItem(int position) {
        return items.get(position);
    }

//    public void setItem(int position, FoodCard item) {
//        items.set(position, item);
//    }

    @Override
    public FoodCardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.food_card, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FoodCardAdapter.ViewHolder holder, int position) {
        FoodCard item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView storeName;
        TextView tag;
        TextView content;
        ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);

            storeName = itemView.findViewById(R.id.storeName);
            tag = itemView.findViewById(R.id.tag);
            img = itemView.findViewById(R.id.img);
            content = itemView.findViewById(R.id.content);
        }

        public void setItem(FoodCard item) {
            storeName.setText(item.getStoreName());
            tag.setText(item.getTag());
            img.setImageResource(R.drawable.food_sample);
            content.setText(item.getReviewContent());
        }
    }
}
