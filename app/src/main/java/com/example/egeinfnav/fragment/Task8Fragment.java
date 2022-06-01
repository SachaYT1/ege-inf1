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
 * Use the {@link Task8Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task8Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task8Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task8Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task8Fragment newInstance(String param1, String param2) {
        Task8Fragment fragment = new Task8Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.TheoryFragment8);
        View view = inflater.inflate(R.layout.fragment_task8, container, false);

        //условие задачи 1
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment8);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));
        //фото 1
        ImageView imageView1 = view.findViewById(R.id.image1_fragment8);
        String imageview1_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment8%2Fn2l.png?alt=media&token=0b3dca98-f75e-450f-966e-d253929104d3";
        Glide.with(getActivity().getApplicationContext()).load(imageview1_url).into(imageView1);

        //условие задачи 2
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment8);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));
        //фото 2
        ImageView imageView2 = view.findViewById(R.id.image2_fragment8);
        String imageview2_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment8%2Fqnl.png?alt=media&token=9db16952-c378-4501-ac07-b3143a6b0be2";
        Glide.with(getActivity().getApplicationContext()).load(imageview2_url).into(imageView2);

        //условие задачи 3
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment8);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));
        //фото 3
        ImageView imageView3 = view.findViewById(R.id.image3_fragment8);
        String imageview3_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment8%2Fnn1n2.png?alt=media&token=27e30a35-7aea-483c-9267-fbaae43e5d76";
        Glide.with(getActivity().getApplicationContext()).load(imageview3_url).into(imageView3);


        //условие задачи 4
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment8);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));
        //фото 4
        ImageView imageView4 = view.findViewById(R.id.image4_fragment8);
        String imageview4_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment8%2Fcombinatorics.png?alt=media&token=4538391c-ea86-4a28-aed1-1f7574972ed2";
        Glide.with(getActivity().getApplicationContext()).load(imageview4_url).into(imageView4);

        //условие задачи 1
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment8);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));
        //решение задачи 1
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment8);
        paragraph6.setText(Html.fromHtml(array_of_paragraphs[5]));
        //условие задачи 2
        TextView paragraph7 = (TextView)view.findViewById(R.id.paragraph7_fragment8);
        paragraph7.setText(Html.fromHtml(array_of_paragraphs[6]));
        //решение задачи 2
        TextView paragraph8 = (TextView)view.findViewById(R.id.paragraph8_fragment8);
        paragraph8.setText(Html.fromHtml(array_of_paragraphs[7]));


        return view;
    }
}