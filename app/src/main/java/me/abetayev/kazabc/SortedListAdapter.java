package me.abetayev.kazabc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.util.SortedListAdapterCallback;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SortedListAdapter extends RecyclerView.Adapter<SortedListViewHolder> {
    private static final String TAG = "SortedListAdapter";

    SortedList<Article> articleSortedList;
    private Context mContext;

    public SortedListAdapter(Context context, ArrayList<Article> articles) {
        mContext = context;
        articleSortedList =
                new SortedList<>(Article.class, new SortedListAdapterCallback<Article>(this) {
                    @Override
                    public int compare(Article o1, Article o2) {
                        return o1.compare(o2);
                    }

                    @Override
                    public boolean areContentsTheSame(Article oldItem, Article newItem) {
                        return oldItem.areContentsTheSame(newItem);
                    }

                    @Override
                    public boolean areItemsTheSame(Article item1, Article item2) {
                        return item1.areItemsTheSame(item2);
                    }
                });
        articleSortedList.addAll(articles);
    }

    @Override
    public SortedListViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        return SortedListViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(final SortedListViewHolder holder, final int position) {
        final Article article = articleSortedList.get(position);
        holder.bindTo(article);
        holder.mCardViewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: number 3");
                Intent intent = new Intent(mContext, LetterActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("letter_image", article.getImageId());
                bundle.putInt("letter_picture", article.getPictureId());
                intent.putExtras(bundle);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return articleSortedList.size();
    }

}
