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
 * Use the {@link Task18Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task18Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task18Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task18Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task18Fragment newInstance(String param1, String param2) {
        Task18Fragment fragment = new Task18Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.TheoryFragment18);
        View view = inflater.inflate(R.layout.fragment_task18, container, false);


        // условие задача 1
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment18);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));
        ImageView imageView1 = view.findViewById(R.id.image1_fragment18);
        String imageview1_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment18%2Ftask1_fragment18.png?alt=media&token=9dfb26c0-123f-4d44-af4b-e77cb324d921";
        Glide.with(getActivity().getApplicationContext()).load(imageview1_url).into(imageView1);

        return view;
    }
}