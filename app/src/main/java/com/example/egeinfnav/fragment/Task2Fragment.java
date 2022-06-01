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
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));
        ImageView imageView1 = view.findViewById(R.id.image1_fragment2);
        String imageview1_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment2%2Finversion1.png?alt=media&token=c86fee55-edc1-4544-9368-c48953fbfcb7";
        Glide.with(getActivity().getApplicationContext()).load(imageview1_url).into(imageView1);

        // конъюкция
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment2);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));
        ImageView imageView2 = view.findViewById(R.id.image2_fragment2);
        String imageview2_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment2%2Fconjuction.png?alt=media&token=9738eacc-bd18-4231-bb5b-78d8cf40b4a8";
        Glide.with(getActivity().getApplicationContext()).load(imageview2_url).into(imageView2);

        // дизъюнкция
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment2);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));
        ImageView imageView3 = view.findViewById(R.id.image3_fragment2);
        String imageview3_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment2%2Fdisjunction.png?alt=media&token=59f0a98e-85d6-45f6-9c73-2aca5126500a";
        Glide.with(getActivity().getApplicationContext()).load(imageview3_url).into(imageView3);

        // импликация
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment2);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));
        ImageView imageView4 = view.findViewById(R.id.image4_fragment2);
        String imageview4_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment2%2Fimplication.png?alt=media&token=aba41ba9-116d-4c92-88e9-b208046f4f64";
        Glide.with(getActivity().getApplicationContext()).load(imageview4_url).into(imageView4);

        // Следствия из таблиц истинности
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment2);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));


        //задача 1
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment2);
        paragraph6.setText(Html.fromHtml(array_of_paragraphs[5]));

        ImageView imageView6 = view.findViewById(R.id.image6_fragment2);
        String imageview6_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment2%2Ftask1_fragment2_table.png?alt=media&token=efa42f8f-6e2c-4639-8f2d-be3ab4e2990c";
        Glide.with(getActivity().getApplicationContext()).load(imageview6_url).into(imageView6);

        TextView paragraph7 = (TextView)view.findViewById(R.id.paragraph7_fragment2);
        paragraph7.setText(Html.fromHtml(array_of_paragraphs[6]));

        ImageView imageView7 = view.findViewById(R.id.image7_fragment2);
        String imageview7_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment2%2Ftask1_fragment2_python_solution.png?alt=media&token=47965806-ddeb-4d35-9ded-030df0da6a52";
        Glide.with(getActivity().getApplicationContext()).load(imageview7_url).into(imageView7);




        return view;
    }
}