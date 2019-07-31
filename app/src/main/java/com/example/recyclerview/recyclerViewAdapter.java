package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.ViewHolder> {

    private ArrayList <String> webNames = new ArrayList<>();
    private ArrayList <String> webPasswords = new ArrayList<>();
    private Context mContext;

    public recyclerViewAdapter(ArrayList<String> webNames, ArrayList<String> webPasswords, Context mContext) {
        this.webNames = webNames;
        this.webPasswords = webPasswords;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.webName.setText(webNames.get(i));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView webName;
        TextView webPass;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            webName = itemView.findViewById(R.id.liName);
            webPass = itemView.findViewById(R.id.liPassword);
            linearLayout = itemView.findViewById(R.id.lineaR);

        }
    }
}
