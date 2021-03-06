package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment1);

        View view = inflater.inflate(R.layout.fragment_task1, container, false);
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment1);

        //?????????????????????? ???????????????? ????????????
        paragraph1.setText(array_of_paragraphs[0]);


        // ??????????????????
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment1);
        paragraph2.setText(array_of_paragraphs[1]);

        ImageView imageView = view.findViewById(R.id.image1_fragment1);
        imageView.setImageResource(R.drawable.set_img);


        // ???????????????? ????????????
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment1);
        paragraph3.setText(array_of_paragraphs[2]);

//in your OnCreate() method
        return view;
    }
}