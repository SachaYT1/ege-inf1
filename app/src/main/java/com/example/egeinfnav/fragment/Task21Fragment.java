package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.egeinfnav.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task21Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task21Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task21Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task21Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task21Fragment newInstance(String param1, String param2) {
        Task21Fragment fragment = new Task21Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.TheoryFragment21);
        View view = inflater.inflate(R.layout.fragment_task21, container, false);


        //задача 1
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment21);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment21);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));

        return view;
    }
}