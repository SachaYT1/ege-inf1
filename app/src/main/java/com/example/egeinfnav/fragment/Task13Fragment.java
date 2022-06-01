package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.egeinfnav.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task13Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task13Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task13Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task13Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task13Fragment newInstance(String param1, String param2) {
        Task13Fragment fragment = new Task13Fragment();
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
        // Inflate the layout for this fragment
        String[] array_of_paragraphs = getResources().getStringArray(R.array.TheoryFragment13);
        View view = inflater.inflate(R.layout.fragment_task13, container, false);

        //граф
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment13);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));

        //условие задачи 1
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment13);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));

        //решение задачи 2
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment13);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));

        //условие задачи 1
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment13);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));
        //решение задачи 2
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment13);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));


        // изображения
        ImageView imageView2 = view.findViewById(R.id.image2_fragment13);
        String imageview2_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment13%2Ftask1_fragment13_condition.png?alt=media&token=353fa0ef-a573-4aa2-a333-5baaf37c17fd";
        Glide.with(getActivity().getApplicationContext()).load(imageview2_url).into(imageView2);
        ImageView imageView3 = view.findViewById(R.id.image3_fragment13);
        String imageview3_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment13%2Ftask1_fragment13_solution.png?alt=media&token=c9bf2d1f-ccfa-4b80-92c9-3c113961b7dd";
        Glide.with(getActivity().getApplicationContext()).load(imageview3_url).into(imageView3);
        ImageView imageView4 = view.findViewById(R.id.image4_fragment13);
        String imageview4_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment13%2Ftask2_fragment13_condition.png?alt=media&token=9afedc19-9e0a-4eb7-91ab-e49687064f4c";
        Glide.with(getActivity().getApplicationContext()).load(imageview4_url).into(imageView4);
        ImageView imageView5 = view.findViewById(R.id.image5_fragment13);
        String imageview5_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment13%2Ftask2_fragment13_solution.png?alt=media&token=d08e6620-d866-4954-aa95-dbed51b9f103";
        Glide.with(getActivity().getApplicationContext()).load(imageview5_url).into(imageView5);
        return view;
    }
}