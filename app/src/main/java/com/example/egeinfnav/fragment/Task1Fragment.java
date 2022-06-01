package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.egeinfnav.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task1Fragment extends Fragment {

    private Button task1Btn;
    private Toolbar toolbar;
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
            setHasOptionsMenu(true);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment1);

        View view = inflater.inflate(R.layout.fragment_task1, container, false);
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment1);


        //определение струкрты данных
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));


        // множество
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment1);
        paragraph2.setText(Html.fromHtml((String) array_of_paragraphs[1]));

        ImageView imageView1 = view.findViewById(R.id.image1_fragment1);
        String imageview1_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/set_img.png?alt=media&token=f21ff684-8b66-4410-ab69-d217dadd555b";
        Glide.with(getActivity().getApplicationContext()).load(imageview1_url).into(imageView1);


        // линейный список
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment1);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));

        ImageView imageView2 = view.findViewById(R.id.image2_fragment1);
        String imageview2_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment1%2Flinear_list.png?alt=media&token=f6a2dc44-2b7a-4b44-8441-5e8a79a2a170";
        Glide.with(getActivity().getApplicationContext()).load(imageview2_url).into(imageView2);

        // граф
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment1);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));

        ImageView imageView3 = view.findViewById(R.id.image3_fragment1);
        String imageview3_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment1%2Fgraph.png?alt=media&token=29dc7c22-b6be-49bd-855e-4a95c3a6ff05";
        Glide.with(getActivity().getApplicationContext()).load(imageview3_url).into(imageView3);

        // таблица
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment1);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));

        ImageView imageView4 = view.findViewById(R.id.image4_fragment1);
        String imageview4_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment1%2Ftable.png?alt=media&token=1d70925f-d736-4266-8432-11d921a65dce";
        Glide.with(getActivity().getApplicationContext()).load(imageview4_url).into(imageView4);

        // дерево
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment1);
        paragraph6.setText(Html.fromHtml(array_of_paragraphs[5]));


        //задача1
        TextView paragraph8 = (TextView)view.findViewById(R.id.paragraph8_fragment1);
        paragraph8.setText(Html.fromHtml(array_of_paragraphs[6]));

        ImageView imageView5 = view.findViewById(R.id.image5_fragment1);
        String imageview5_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment1%2Ftask1_fragment1.png?alt=media&token=3d102434-919e-4a80-8181-0acb758917e6";
        Glide.with(getActivity().getApplicationContext()).load(imageview5_url).into(imageView5);

        ImageView imageView6 = view.findViewById(R.id.image6_fragment1);
        String imageview6_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment1%2Ftask1_fragment1_table.png?alt=media&token=506fba4b-6251-4ae1-939b-68862179fd0f";
        Glide.with(getActivity().getApplicationContext()).load(imageview6_url).into(imageView6);

        TextView paragraph9 = (TextView)view.findViewById(R.id.paragraph9_fragment1);
        paragraph9.setText(Html.fromHtml(array_of_paragraphs[7]));


        // задача 2
        TextView paragraph10 = (TextView)view.findViewById(R.id.paragraph10_fragment1);
        paragraph10.setText(Html.fromHtml(array_of_paragraphs[8]));

        ImageView imageView7 = view.findViewById(R.id.image7_fragment1);
        String imageview7_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment1%2Ftask2_fragment1.png?alt=media&token=5e2a021e-86ab-431b-bd72-7dbb7bfeafd4";
        Glide.with(getActivity().getApplicationContext()).load(imageview7_url).into(imageView7);

        TextView paragraph11 = (TextView)view.findViewById(R.id.paragraph11_fragment1);
        paragraph11.setText(Html.fromHtml(array_of_paragraphs[9]));
//in your OnCreate() method
        return view;
    }
}