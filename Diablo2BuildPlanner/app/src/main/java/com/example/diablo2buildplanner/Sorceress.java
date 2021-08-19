package com.example.diablo2buildplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Sorceress extends AppCompatActivity implements classButtons.ClassButtons {

    Button cold, lightning, fire;
    ImageView ivSkillTree;
    TextView etSkillPoints, tvSkillDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorceress);

        ivSkillTree = findViewById(R.id.ivSkillTree);
        etSkillPoints = findViewById(R.id.tvSkillPoints);
        tvSkillDescription = findViewById(R.id.tvSkillDescription);

        cold = findViewById(R.id.Cold);
        lightning = findViewById(R.id.Lightning);
        fire = findViewById(R.id.Fire);

        cold.setOnClickListener(v -> {
            ivSkillTree.setImageResource(R.drawable.sorceress_ice);
            ShowColdSkills();

            HideLightningSkills();
            HideFireSkills();
        });
        lightning.setOnClickListener(v -> {
            ivSkillTree.setImageResource(R.drawable.sorceress_thunder);
            ShowLightningSkills();

            HideColdSkills();
            HideFireSkills();
        });
        fire.setOnClickListener(v -> {
            ivSkillTree.setImageResource(R.drawable.sorceress_fire);
            ShowFirekills();

            HideColdSkills();
            HideLightningSkills();
        });
    }

    void ShowColdSkills(){

    }
    void ShowLightningSkills(){

    }
    void ShowFirekills(){

    }
    void HideColdSkills(){

    }
    void HideLightningSkills(){

    }
    void HideFireSkills(){

    }
    @Override
    public void OnAmazonClick(View v) {
        Toast.makeText(this, "Amazon", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnAssassinClick(View v) {
        Toast.makeText(this, "Assassin", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnBarbarianClick(View v) {
        Toast.makeText(this, "Barbarian", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnDruidClick(View v) {
        Toast.makeText(this, "Druid", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnNecromancerClick(View v) {
        Toast.makeText(this, "Necromancer", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnPaladinClick(View v) {
        Toast.makeText(this, "Paladin", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnSorceressClick(View v) {
        Toast.makeText(this, "Sorceress", Toast.LENGTH_SHORT).show();
    }
}