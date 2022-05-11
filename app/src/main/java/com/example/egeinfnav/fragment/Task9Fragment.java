package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egeinfnav.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task9Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task9Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task9Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task9Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task9Fragment newInstance(String param1, String param2) {
        Task9Fragment fragment = new Task9Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment9);
        View view = inflater.inflate(R.layout.fragment_task9, container, false);

        //формулы excel
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment9);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));

        //относительная ссылка
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment9);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));
        ImageView imageView2 = view.findViewById(R.id.image2_fragment9);
        imageView2.setImageResource(R.drawable.otnositelnaya_sylka);

        //смешанная ссылка
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment9);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));
        ImageView imageView3 = view.findViewById(R.id.image3_fragment9);
        imageView3.setImageResource(R.drawable.smeshannay_sylka);

        //абсолютная ссылка
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment9);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));
        ImageView imageView4 = view.findViewById(R.id.image4_fragment9);
        imageView4.setImageResource(R.drawable.absolytnaya_sylka);

        //условие задачи
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment9);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));

        //максмальное занчение
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment9);
        paragraph6.setText(Html.fromHtml(array_of_paragraphs[5]));
        ImageView imageView6 = view.findViewById(R.id.image6_fragment9);
        imageView6.setImageResource(R.drawable.task1_max_fragment9);

        // среднее значение
        TextView paragraph7 = (TextView)view.findViewById(R.id.paragraph7_fragment9);
        paragraph7.setText(Html.fromHtml(array_of_paragraphs[6]));
        ImageView imageView7 = view.findViewById(R.id.image7_fragment9);
        imageView7.setImageResource(R.drawable.task1_srznach_fragment9);

        // ответ
        TextView paragraph8 = (TextView)view.findViewById(R.id.paragraph8_fragment9);
        paragraph8.setText(Html.fromHtml(array_of_paragraphs[7]));
        ImageView imageView8 = view.findViewById(R.id.image8_fragment9);
        imageView8.setImageResource(R.drawable.task1_otv_fragment9);



        return view;
    }
}