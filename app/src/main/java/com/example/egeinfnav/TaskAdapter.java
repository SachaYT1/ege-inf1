package com.example.egeinfnav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.egeinfnav.model.Task;

import java.util.List;

public class TaskAdapter  extends RecyclerView.Adapter<ViewHolder>{

    private final List<Task> tasks;

    public TaskAdapter(List<Task> states) {
        this.tasks = states;
    }
    @Override
    public int getItemViewType(final int position) {
        return R.layout.list_task;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Task state = tasks.get(position);
        holder.iconView.setImageResource(state.getIcon());
        holder.nameView.setText(state.getName());
        holder.numberView.setText(state.getNum());
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

}
