package com.example.diablo2buildplanner;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class classButtons extends Fragment {

    interface ClassButtons{
        public void OnAmazonClick(View v);
        public void OnAssassinClick(View v);
        public void OnBarbarianClick(View v);
        public void OnDruidClick(View v);
        public void OnNecromancerClick(View v);
        public void OnPaladinClick(View v);
        public void OnSorceressClick(View v);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_class_buttons, container, false);
    }


}