package com.example.egeinfnav;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TaskRoomDao {
    @Query("SELECT * FROM taskroom")
    List<TaskRoom> getAll();

    @Query("SELECT * FROM taskroom WHERE id = :id")
    TaskRoom getById(long id);

    @Insert
    void insert(TaskRoom taskRoom);

    @Update
    void update(TaskRoom taskRoom);

    @Delete
    void delete(TaskRoom taskRoom);
}
