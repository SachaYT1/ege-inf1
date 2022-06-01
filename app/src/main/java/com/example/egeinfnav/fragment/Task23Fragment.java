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
 * Use the {@link Task23Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task23Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task23Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task23Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task23Fragment newInstance(String param1, String param2) {
        Task23Fragment fragment = new Task23Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.TheoryFragment23);
        View view = inflater.inflate(R.layout.fragment_task23, container, false);

        //теория
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment23);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));

        //кнопка для перехода на фрагмент
        Button btn_to_fragment16 = (Button) view.findViewById(R.id.btn_fragment23_to_fragment16);
        btn_to_fragment16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_task23Fragment_to_task16Fragment);
            }
        });

        //условие задачи 1
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment23);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));


        // задача 2
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment23);
        paragraph3.setText(Html.fromHtml(array_of_paragraphs[2]));
        ImageView imageView3 = view.findViewById(R.id.image3_fragment23);
        String imageview3_url = "https://firebasestorage.googleapis.com/v0/b/inf-ege.appspot.com/o/fragment23%2Ftask1_fragment23.png?alt=media&token=220b262f-9934-49e0-9b5d-eabf28f53765";
        Glide.with(getActivity().getApplicationContext()).load(imageview3_url).into(imageView3);


        return view;
    }
}