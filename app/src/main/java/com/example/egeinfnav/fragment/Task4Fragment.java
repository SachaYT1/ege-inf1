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
 * Use the {@link Task4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task4Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task4Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task4Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task4Fragment newInstance(String param1, String param2) {
        Task4Fragment fragment = new Task4Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment4);
        View view = inflater.inflate(R.layout.fragment_task4, container, false);

        //кодирование и условие фано
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment4);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));

        //условие задачи 1
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment4);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));

        //решение задачи 1
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment4);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));

        //условие задачи 2
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment4);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));
        ImageView imageView4 = view.findViewById(R.id.image4_fragment4);
        String imageview4_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment4%2Ftask2_fragment4_table.png?alt=media&token=9593f7a0-2866-426a-8776-9dfb9e7a5955";
        Glide.with(getActivity().getApplicationContext()).load(imageview4_url).into(imageView4);

        //решение задачи 2
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment4);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));
        return view;
    }
}