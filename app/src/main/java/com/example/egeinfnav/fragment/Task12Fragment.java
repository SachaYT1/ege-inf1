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

import com.bumptech.glide.Glide;
import com.example.egeinfnav.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task12Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task12Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task12Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task12Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task12Fragment newInstance(String param1, String param2) {
        Task12Fragment fragment = new Task12Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.TheoryFragment12);
        View view = inflater.inflate(R.layout.fragment_task12, container, false);


        //задача 1
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment12);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment12);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));
        ImageView imageView2 = view.findViewById(R.id.image2_fragment12);
        String imageview2_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment12%2Ftask1_fragment12.png?alt=media&token=a4422bc8-7280-4f3f-b75a-99da71fce27f";
        Glide.with(getActivity().getApplicationContext()).load(imageview2_url).into(imageView2);

        return view;
    }
}