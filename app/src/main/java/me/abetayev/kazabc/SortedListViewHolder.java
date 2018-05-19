package me.abetayev.kazabc;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SortedListViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = "SortedListViewHolder";

    private ImageView letter;
    CardView mCardViewLayout;

    public SortedListViewHolder(View itemView) {
        super(itemView);
        letter = itemView.findViewById(R.id.letter);
        mCardViewLayout = itemView.findViewById(R.id.cardView);
    }

    public static SortedListViewHolder create(ViewGroup parent) {
        ViewGroup itemView = (ViewGroup) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_grid_article, parent, false);
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        layoutParams.width = parent.getWidth() / 3;
//        layoutParams.height = layoutParams.width;
        itemView.setLayoutParams(layoutParams);
        return new SortedListViewHolder(itemView);
    }

    public void bindTo(final Article article) {
        letter.setImageResource(article.getImageId());
    }

}
