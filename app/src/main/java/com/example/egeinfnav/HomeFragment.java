package com.example.egeinfnav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private final String TAG = "HOME_FRAGMENT";
    public ArrayList<Task> tasks = new ArrayList<Task>();
    private RecyclerView recyclerView;
    NavController navController;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment task1.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        setInitialData();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(false);
        //System.out.println(tasks);

        TaskAdapter.OnTaskClickListener taskClickListener = new TaskAdapter.OnTaskClickListener() {
            @Override
            public void onTaskClick(Task state, int position) {

                Toast.makeText(view.getContext(), "Был выбран пункт " + state.getName(),
                        Toast.LENGTH_SHORT).show();
                int num_fragment = state.getNum();
                getResources().getIdentifier("action_homeFragment_to_task" + Integer.toString(num_fragment) + "Fragment", "navigation", getContext().getPackageName());
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_task1Fragment);

            }
        };
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new TaskAdapter(tasks, taskClickListener));
        return view;
    }

    private void setInitialData() {
        for (int i = 1; i <= 27; i++) {
         /*   String task = "task" + Integer.toString(i);*/
         int task_id = getResources().getIdentifier("task" + Integer.toString(i), "string",getContext().getPackageName());
            Log.d(TAG, Integer.toString(task_id));
            tasks.add(new Task(getString(task_id), i, R.drawable.info1));
        }
    }
}