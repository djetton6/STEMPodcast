package com.example.android.stempodcast;
import android.support.v7.app.AlertController.RecycleListView
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class stemModelAdapter extends RecycleListView.Adapter<stemModelAdapter.stemModelHolder> {

    private ArrayList<stemModel> stemModels;
    private LayoutInflater inflater;
    private CustomClickListener clickListener;

    //create new constructor
    public stemModelAdapter(Context context, ArrayList<stemModel> stemModels, CustomClickListener clickListener ) {
        //construct adapter with items declared privately and new created interface
        this.stemModels = stemModels;
        this.clickListener = clickListener;
        this.inflater  = LayoutInflater.from(context);


    }

    @Override
    public @stemModelHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_item, parent, false);
        final_stemModelHolder stemModelHolder =  new stemModelHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //use customClickListener
                clickListener.onItemClick(v,stemModelHolder.getLayoutPosition());
            }
        });
        return stemModelHolder;


    }

    @Override
    public void onBindViewHolder (stemModelHolder holder, int position) {
        stemModel currentstemModel = stemModels.get(position);
        holder.stemModel.setText(currentstemModel.getModelName());
        holder.stemModel.setText(currentstemModel.getModelOccupation());
        holder.stemModel.setText(currentstemModel.getModelCity());
        //holder.stemModel.setText(currentstemModel.getModelImage());

    }

    @Override
    public int getItemCount() { return stemModels.size(); }

    class stemModelHolder extends RecyclerView.ViewHolder: {
        private TextView modelName;
        private TextView modelOccupation;
        private TextView modelCity;

        public stemModelHolder (View stemModelView) {
            super (stemModelView);
            modelName = stemModelView.findViewById(R.id.stem_mentor_name);
            modelOccupation = stemModelView.findViewById(R.id.stem_mentor_occupation);
            modelCity = stemModelView.findViewById(R.id.stem_mentor_city);

        }
    }
}
