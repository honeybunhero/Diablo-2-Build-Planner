package com.example.diablo2buildplanner;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

interface AmazonSkillTrees{
    RelativeLayout GetJavalinAndSpearLayout(boolean active);
    RelativeLayout GetPassiveAndMagicLayout(boolean active);
    RelativeLayout GetBowAndCrossbowLayout(boolean active);
}
public class amazon extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_amazon, container, false);
        return view;
    }



}