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
        String imageview2_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment9%2Fotnositelnaya_sylka.png?alt=media&token=db6e160e-9d75-487c-bc5f-f540a56dabc2";
        Glide.with(getActivity().getApplicationContext()).load(imageview2_url).into(imageView2);

        //смешанная ссылка
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment9);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));
        ImageView imageView3 = view.findViewById(R.id.image3_fragment9);
        String imageview3_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment9%2Fsmeshannay_sylka.png?alt=media&token=025ea70d-1f26-43bc-a24c-7de75bd048b0";
        Glide.with(getActivity().getApplicationContext()).load(imageview3_url).into(imageView3);

        //абсолютная ссылка
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment9);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));
        ImageView imageView4 = view.findViewById(R.id.image4_fragment9);
        String imageview4_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment9%2Fabsolytnaya_sylka.png?alt=media&token=4681cedd-08fc-4bc5-b6c8-0ae16aa36eac";
        Glide.with(getActivity().getApplicationContext()).load(imageview4_url).into(imageView4);

        //условие задачи
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment9);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));

        //максмальное занчение
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment9);
        paragraph6.setText(Html.fromHtml(array_of_paragraphs[5]));
        ImageView imageView6 = view.findViewById(R.id.image6_fragment9);
        String imageview6_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment9%2Ftask1_max_fragment9.png?alt=media&token=5fe01aef-84f4-4a68-962e-db0d1f322654";
        Glide.with(getActivity().getApplicationContext()).load(imageview6_url).into(imageView6);

        // среднее значение
        TextView paragraph7 = (TextView)view.findViewById(R.id.paragraph7_fragment9);
        paragraph7.setText(Html.fromHtml(array_of_paragraphs[6]));
        ImageView imageView7 = view.findViewById(R.id.image7_fragment9);
        String imageview7_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment9%2Ftask1_srznach_fragment9.png?alt=media&token=e14c2a8b-97dd-437a-a199-80fd178941be";
        Glide.with(getActivity().getApplicationContext()).load(imageview7_url).into(imageView7);

        // ответ
        TextView paragraph8 = (TextView)view.findViewById(R.id.paragraph8_fragment9);
        paragraph8.setText(Html.fromHtml(array_of_paragraphs[7]));
        ImageView imageView8 = view.findViewById(R.id.image8_fragment9);
        String imageview8_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment9%2Ftask1_otv_fragment9.png?alt=media&token=d5e5fd85-7c22-4c36-a9e4-10a9f7535dc9";
        Glide.with(getActivity().getApplicationContext()).load(imageview8_url).into(imageView8);



        return view;
    }
}