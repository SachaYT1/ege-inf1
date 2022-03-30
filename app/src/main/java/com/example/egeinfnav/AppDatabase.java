package com.example.egeinfnav;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {TaskRoom.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskRoomDao taskRoomDao();
}
