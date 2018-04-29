package com.example.kakaotalk3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;

public class FragmentOne extends Fragment {
    ImageView imageView;
    ListView listView;
    ScrollView scrollView;
    public FragmentOne(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container,false);
        scrollView = view.findViewById(R.id.scrollView);
        imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.person);
        listView = view.findViewById(R.id.listView);

        ListAdapter listAdapter = new ListAdapter();
        for(int i=0; i<10; i++) {
            listAdapter.addItem(R.drawable.search, "강동민");
            listAdapter.addItem(R.drawable.person, "강진주");
        }

        listView.setAdapter(listAdapter);

//        listView.setOnScrollListener(new View.OnTouchListener(){
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                scrollView.requestDisallowInterceptTouchEvent(true);
//                return false;
//            }
//        });
        return view;
    }
}
