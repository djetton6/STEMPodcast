package com.example.android.stempodcast;

import android.support.v7.app.AlertController;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class stemModelAdapter extends AlertController.RecycleListView.Adapter<stemModelAdapter.stemModelHolder> {

    private ArrayList<stemModel> stemModels;
    private LayoutInflater inflater;
    private CustomClickListener clickListener;


}
