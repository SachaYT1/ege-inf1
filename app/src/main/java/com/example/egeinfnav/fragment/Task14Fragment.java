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
 * Use the {@link Task14Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task14Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task14Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task14Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task14Fragment newInstance(String param1, String param2) {
        Task14Fragment fragment = new Task14Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.TheoryFragment14);
        View view = inflater.inflate(R.layout.fragment_task14, container, false);

        // перевод из n в десятичную систему
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment14);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));
        ImageView imageView1 = view.findViewById(R.id.image1_fragment14);
        imageView1.setImageResource(R.drawable.n_to_10_fragment14);

        //основное правило
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment14);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));
        ImageView imageView2 = view.findViewById(R.id.image2_fragment14);
        imageView2.setImageResource(R.drawable.rule_fragment14);
        // перевод из 10 в n систему
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment14);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));
        ImageView imageView3 = view.findViewById(R.id.image3_fragment14);
        imageView3.setImageResource(R.drawable.a_10_to_n_fragment14);

        // сложение + вычитание
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment14);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));

        // условие задачи 1
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment14);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment14);
        paragraph6.setText(Html.fromHtml(array_of_paragraphs[5]));

        return view;
    }
}