package com.example.egeinfnav;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    final ImageView iconView;
    final TextView nameView, numberView;



    ViewHolder(View view) {
        super(view);
        iconView = view.findViewById(R.id.list_icon);
        nameView = view.findViewById(R.id.name);
        numberView = view.findViewById(R.id.num_task);
    }

    public ImageView getIconView() {
        return iconView;
    }

    public TextView getNameView() {
        return nameView;
    }

    public TextView getNumberView() {
        return numberView;
    }
}
