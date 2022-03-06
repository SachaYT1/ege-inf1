package com.example.egeinfnav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.example.egeinfnav.model.Task;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    NavController navController;
    public ArrayList<Task> tasks = new ArrayList<Task>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        TaskAdapter adapter = new TaskAdapter(tasks);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

//        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        findViewById(R.id.btn_task1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                navController.navigate(R.id.task_1);
//            }
//        });
    }
    private void setInitialData(){
        tasks.add(new Task ("Бразилия", 1, R.drawable.info1));
        tasks.add(new Task ("Аргентина", 2, R.drawable.info1));
        tasks.add(new Task ("Колумбия", 3, R.drawable.info1));
        tasks.add(new Task ("Уругвай", 4, R.drawable.info1));
        tasks.add(new Task ("Чили", 5, R.drawable.info1));
    }


}