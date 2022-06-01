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
 * Use the {@link Task6Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task6Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task6Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task6Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task6Fragment newInstance(String param1, String param2) {
        Task6Fragment fragment = new Task6Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment6);
        View view = inflater.inflate(R.layout.fragment_task6, container, false);

        //условие задачи 1
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment6);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));

        //решение задачи 1
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment6);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));

        //условие задачи 2
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment6);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));

        //решение задачи 2
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment6);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));

        //изображения для условий
        ImageView imageView1 = view.findViewById(R.id.image1_fragment6);
        String imageview1_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment6%2Ftask1_fragment6_table.png?alt=media&token=3076c32e-3a5f-4dbb-a6d2-3b294ff11ec5";
        Glide.with(getActivity().getApplicationContext()).load(imageview1_url).into(imageView1);
        ImageView imageView2 = view.findViewById(R.id.image2_fragment6);
        String imageview2_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment6%2Ftask2_fragment6.png?alt=media&token=b7299b63-aff0-4176-91be-372b588ee504";
        Glide.with(getActivity().getApplicationContext()).load(imageview2_url).into(imageView2);

        return view;
    }
}