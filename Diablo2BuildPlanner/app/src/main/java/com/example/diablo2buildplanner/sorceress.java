package com.example.diablo2buildplanner;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

interface SorceressSkillTrees{
    RelativeLayout GetColdLayout();
    RelativeLayout GetLightningLayout();
    RelativeLayout GetFireLayout();
}
public class sorceress extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_sorceress, container, false);
        return view;
    }



}