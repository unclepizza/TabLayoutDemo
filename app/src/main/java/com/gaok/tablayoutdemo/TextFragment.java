package com.gaok.tablayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gaok on 2017/10/31 21:18.
 */
public class TextFragment extends Fragment {

    private View rootView;
    private TextView tvContent;
    private String textContent;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragement1, container, false);
        tvContent = (TextView) rootView.findViewById(R.id.tv_content);
        tvContent.setText(textContent);
        return rootView;
    }

    public void setText(String txt){
        this.textContent = txt;
    }
}