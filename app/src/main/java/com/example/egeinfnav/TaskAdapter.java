package com.example.egeinfnav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter  extends RecyclerView.Adapter<ViewHolder>{

    interface OnTaskClickListener{
        void onTaskClick(Task state, int position);
    }

    private final OnTaskClickListener onClickListener;

    private final List<Task> tasks;

    public TaskAdapter(List<Task> states, OnTaskClickListener onClickListener) {
        this.onClickListener = onClickListener;
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
        holder.numberView.setText(Integer.toString(state.getNum()));

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onTaskClick(state, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

}
