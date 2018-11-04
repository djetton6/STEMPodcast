package com.example.android.stempodcast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongHolder> {

    private ArrayList<song> SongItems;
    private LayoutInflater inflater;
    private CustomClickListener clickListener;

    public SongAdapter(Context context, ArrayList<song> SongItems, CustomClickListener clickListener ) {

        this.SongItems = SongItems;
        this.clickListener = clickListener;
        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public SongHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        final SongHolder songHolder = new SongHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClick(v, songHolder.getLayoutPosition());

            }

        });
            return songHolder;
    }
}
