package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

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
 * Use the {@link Task15Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task15Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task15Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task15Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task15Fragment newInstance(String param1, String param2) {
        Task15Fragment fragment = new Task15Fragment();
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

        String[] array_of_paragraphs = getResources().getStringArray(R.array.TheoryFragment15);
        View view = inflater.inflate(R.layout.fragment_task15, container, false);

        // теория из фрагмента 2
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment15);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));

        //кнопка для перехода на фрагмент
        Button btn_to_fragment2 = (Button) view.findViewById(R.id.btn_fragment15_to_fragment2);
        btn_to_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_task15Fragment_to_task2Fragment);
            }
        });

        // таблица
        ImageView imageView1 = view.findViewById(R.id.image1_fragment15);
        imageView1.setImageResource(R.drawable.table_fragment15);

        // условие для задачи 1
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment15);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));
        //решение задачи 1
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment15);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));
        ImageView imageView3 = view.findViewById(R.id.image3_fragment15);
        imageView3.setImageResource(R.drawable.task1_fragment15);

        //ответ + примечание 1
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment15);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));


        return view;
    }
}