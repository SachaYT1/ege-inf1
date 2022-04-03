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
 * Use the {@link Task3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task3Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task3Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task3Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task3Fragment newInstance(String param1, String param2) {
        Task3Fragment fragment = new Task3Fragment();
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
        String[] array_of_paragraphs = getResources().getStringArray(R.array.theoryFragment3);
        View view = inflater.inflate(R.layout.fragment_task3, container, false);


        // база данных
        TextView paragraph1 = (TextView)view.findViewById(R.id.paragraph1_fragment3);
        paragraph1.setText(Html.fromHtml(array_of_paragraphs[0]));
        ImageView imageView1 = view.findViewById(R.id.image1_fragment3);
        imageView1.setImageResource(R.drawable.database);

        //реляционная база данных
        TextView paragraph2 = (TextView)view.findViewById(R.id.paragraph2_fragment3);
        paragraph2.setText(Html.fromHtml(array_of_paragraphs[1]));
        //условие
        TextView paragraph3 = (TextView)view.findViewById(R.id.paragraph3_fragment3);
        paragraph3.setText("В файле приведён фрагмент базы данных «Продукты» о поставках товаров в магазины районов города. База данных состоит из трёх таблиц.");
        // движение товаров
        TextView paragraph4 = (TextView)view.findViewById(R.id.paragraph4_fragment3);
        paragraph4.setText(Html.fromHtml(array_of_paragraphs[2]));
        //товар
        TextView paragraph5 = (TextView)view.findViewById(R.id.paragraph5_fragment3);
        paragraph5.setText("Таблица «Товар» содержит информацию об основных характеристиках каждого товара. Заголовок таблицы имеет следующий вид.");
        //магазин
        TextView paragraph6 = (TextView)view.findViewById(R.id.paragraph6_fragment3);
        paragraph6.setText("Таблица «Магазин» содержит информацию о местонахождении магазинов. Заголовок таблицы имеет следующий вид.");
        //что нужно найти в задаче
        TextView paragraph7 = (TextView)view.findViewById(R.id.paragraph7_fragment3);
        paragraph7.setText(Html.fromHtml(array_of_paragraphs[3]));

        //решение
        TextView paragraph8 = (TextView)view.findViewById(R.id.paragraph8_fragment3);
        paragraph8.setText(Html.fromHtml(array_of_paragraphs[4]));

        //изображения для условия
        ImageView imageView4 = view.findViewById(R.id.image4_fragment3);
        imageView4.setImageResource(R.drawable.task1_fragment3_movement);
        ImageView imageView5 = view.findViewById(R.id.image5_fragment3);
        imageView5.setImageResource(R.drawable.task1_fragment3_product);
        ImageView imageView6 = view.findViewById(R.id.image6_fragment3);
        imageView6.setImageResource(R.drawable.task1_fragment3_store);






        return view;
    }
}