package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egeinfnav.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task1Fragment extends Fragment {

    private Button task1Btn;
    private Toolbar toolbar;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task1Fragment newInstance(String param1, String param2) {
        Task1Fragment fragment = new Task1Fragment();
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
            setHasOptionsMenu(true);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment1);

        View view = inflater.inflate(R.layout.fragment_task1, container, false);
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment1);


        //определение струкрты данных
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));


        // множество
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment1);
        paragraph2.setText(Html.fromHtml((String) array_of_paragraphs[1]));

        ImageView imageView1 = view.findViewById(R.id.image1_fragment1);
        imageView1.setImageResource(R.drawable.set_img);


        // линейный список
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment1);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));

        ImageView imageView2 = view.findViewById(R.id.image2_fragment1);
        imageView2.setImageResource(R.drawable.linear_list);

        // граф
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment1);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));

        ImageView imageView3 = view.findViewById(R.id.image3_fragment1);
        imageView3.setImageResource(R.drawable.graph);

        // таблица
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment1);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));

        ImageView imageView4 = view.findViewById(R.id.image4_fragment1);
        imageView4.setImageResource(R.drawable.table);

        // дерево
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment1);
        paragraph6.setText(Html.fromHtml(array_of_paragraphs[5]));


        //задача1
        TextView paragraph8 = (TextView)view.findViewById(R.id.paragraph8_fragment1);
        paragraph8.setText(Html.fromHtml(array_of_paragraphs[6]));

        ImageView imageView5 = view.findViewById(R.id.image5_fragment1);
        imageView5.setImageResource(R.drawable.task1_fragment1);

        ImageView imageView6 = view.findViewById(R.id.image6_fragment1);
        imageView6.setImageResource(R.drawable.task1_fragment1_table);

        TextView paragraph9 = (TextView)view.findViewById(R.id.paragraph9_fragment1);
        paragraph9.setText(Html.fromHtml(array_of_paragraphs[7]));


        // задача 2
        TextView paragraph10 = (TextView)view.findViewById(R.id.paragraph10_fragment1);
        paragraph10.setText(Html.fromHtml(array_of_paragraphs[8]));

        ImageView imageView7 = view.findViewById(R.id.image7_fragment1);
        imageView7.setImageResource(R.drawable.task2_fragment1);

        TextView paragraph11 = (TextView)view.findViewById(R.id.paragraph11_fragment1);
        paragraph11.setText(Html.fromHtml(array_of_paragraphs[9]));
//in your OnCreate() method
        return view;
    }
}