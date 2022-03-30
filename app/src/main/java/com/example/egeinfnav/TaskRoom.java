package com.example.egeinfnav;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TaskRoom {

    @PrimaryKey
    public long id;

    public String theory;

    public int nums;
}
