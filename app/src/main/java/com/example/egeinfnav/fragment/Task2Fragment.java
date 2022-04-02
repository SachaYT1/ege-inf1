package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egeinfnav.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task2.
     */
    // TODO: Rename and change types and number of parameters
    public static Task2Fragment newInstance(String param1, String param2) {
        Task2Fragment fragment = new Task2Fragment();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment2);
        View view = inflater.inflate(R.layout.fragment_task2, container, false);

        //Инверсия
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment2);
        paragraph1.setText(array_of_paragraphs[0]);
        ImageView imageView1 = view.findViewById(R.id.image1_fragment2);
        imageView1.setImageResource(R.drawable.inversion1);

        // конъюкция
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment2);
        paragraph2.setText(array_of_paragraphs[1]);
        ImageView imageView2 = view.findViewById(R.id.image2_fragment2);
        imageView2.setImageResource(R.drawable.conjuction);

        // дизъюнкция
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment2);
        paragraph3.setText(array_of_paragraphs[2]);
        ImageView imageView3 = view.findViewById(R.id.image3_fragment2);
        imageView3.setImageResource(R.drawable.disjunction);

        // импликация
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment2);
        paragraph4.setText(array_of_paragraphs[3]);
        ImageView imageView4 = view.findViewById(R.id.image4_fragment2);
        imageView4.setImageResource(R.drawable.implication);



        return view;
    }
}