package com.example.egeinfnav.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.egeinfnav.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task7Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task7Fragment extends Fragment {
    private Toolbar toolbar;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task7Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task7Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task7Fragment newInstance(String param1, String param2) {
        Task7Fragment fragment = new Task7Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment7);
        View view = inflater.inflate(R.layout.fragment_task7, container, false);

        //условие задачи 1
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment7);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));

        //решение задачи 1
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment7);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));

        //условие задачи 2
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment7);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));

        //решение задачи 2
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment7);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[3]));
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment7);
        paragraph5.setText(Html.fromHtml(array_of_paragraphs[4]));
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment7);
        paragraph6.setText(Html.fromHtml(array_of_paragraphs[5]));
        TextView paragraph7 = (TextView)view.findViewById(R.id.paragraph7_fragment7);
        paragraph7.setText(Html.fromHtml(array_of_paragraphs[6]));

        //изображения для условий
        ImageView imageView1 = view.findViewById(R.id.image1_fragment7);
        String imageview1_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment7%2Ftext_info_fragment7.png?alt=media&token=d1d5d030-feae-44d0-a958-7e838946dd00";
        Glide.with(getActivity().getApplicationContext()).load(imageview1_url).into(imageView1);

        ImageView imageView2 = view.findViewById(R.id.image2_fragment7);
        String imageview2_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment7%2Fgraph_info_fragment7.png?alt=media&token=132aa57f-2d4b-4d57-8301-c766c7ffd39c";
        Glide.with(getActivity().getApplicationContext()).load(imageview2_url).into(imageView2);
        ImageView imageView3 = view.findViewById(R.id.image3_fragment7);
        String imageview3_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment7%2Fsound_info_fragment7.png?alt=media&token=be78afab-988d-431f-b4a5-e7dce92c8151";
        Glide.with(getActivity().getApplicationContext()).load(imageview3_url).into(imageView3);



        // условие задачи 1
        TextView paragraph8 = (TextView)view.findViewById(R.id.paragraph8_fragment7);
        paragraph8.setText(Html.fromHtml(array_of_paragraphs[7]));
        TextView paragraph9 = (TextView)view.findViewById(R.id.paragraph9_fragment7);
        paragraph9.setText(Html.fromHtml(array_of_paragraphs[8]));
        TextView paragraph10 = (TextView)view.findViewById(R.id.paragraph10_fragment7);
        paragraph10.setText(Html.fromHtml(array_of_paragraphs[9]));
        TextView paragraph11 = (TextView)view.findViewById(R.id.paragraph11_fragment7);
        paragraph11.setText(Html.fromHtml(array_of_paragraphs[10]));

        return view;
    }
}