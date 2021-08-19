package com.example.diablo2buildplanner;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SorceressSkillTrees, AmazonSkillTrees {

    Button amazon, assassin, barbarian, druid, necromancer, paladin, sorceress;
    Button topSkill, bottomSkill, middleSkill;
    boolean amazonActive, assassinActive, barbarianActive, druidActive, necromancerActive, paladinActive, sorceressActive;

    FragmentContainerView amazonSkillFrag, assassinSkillFrag, barbarianSkillFrag, druidSkillFrag, necromancerSkillFrag, paladinSkillFrag, sorceressFrag;
    LinearLayout skillButtonsLinearLayout;
//    String activeCharacterClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SetUp();

        sorceressFrag = findViewById(R.id.sorceressSkillsFragment);
//        amazonSkillFrag = findViewById(R.id.amazonSkillsFragment);
//        assassinSkillFrag = findViewById(R.id.assassinSkillsFragment);
//        barbarianSkillFrag = findViewById(R.id.barbarianSkillsFragment);
//        druidSkillFrag = findViewById(R.id.druidSkillsFragment);
//        necromancerSkillFrag = findViewById(R.id.necromancerSkillsFragment);
//        paladinSkillFrag = findViewById(R.id.paladinSkillsFragment);

        skillButtonsLinearLayout = findViewById(R.id.SkillsButtonsLinearLayout);

        amazon = findViewById(R.id.amazon);
        assassin = findViewById(R.id.assassin);
        barbarian = findViewById(R.id.barbarian);
        druid = findViewById(R.id.druid);
        necromancer = findViewById(R.id.necromancer);
        paladin = findViewById(R.id.paladin);
        sorceress = findViewById(R.id.sorceress);

        topSkill = findViewById(R.id.btnTop);
        bottomSkill = findViewById(R.id.btnBottom);
        middleSkill = findViewById(R.id.btnMiddle);

        SetUp();
        ClassButtons();

    }

    void SetUp() {
        MakeAllClassesFalse();

//        amazonSkillFrag.setVisibility(View.GONE);
//        assassinSkillFrag.setVisibility(View.GONE);
//        barbarianSkillFrag.setVisibility(View.GONE);
//        druidSkillFrag.setVisibility(View.GONE);
//        necromancerSkillFrag.setVisibility(View.GONE);
//        paladinSkillFrag.setVisibility(View.GONE);
        sorceressFrag.setVisibility(View.GONE);

        skillButtonsLinearLayout.setVisibility(View.GONE);
    }

    void MakeAllClassesFalse() {
        amazonActive = false;
        assassinActive = false;
        barbarianActive = false;
        druidActive = false;
        necromancerActive = false;
        paladinActive = false;
        sorceressActive = false;
    }

    void ActiveClass() {
        if (amazonActive) {

//            amazonSkillFrag.setVisibility(View.VISIBLE);
//            assassinSkillFrag.setVisibility(View.GONE);
//            barbarianSkillFrag.setVisibility(View.GONE);
//            druidSkillFrag.setVisibility(View.GONE);
//            necromancerSkillFrag.setVisibility(View.GONE);
//            paladinSkillFrag.setVisibility(View.GONE);
            sorceressFrag.setVisibility(View.GONE);

//            GetBowAndCrossbowLayout(amazonActive).setVisibility(View.VISIBLE);
        }
        if (assassinActive) {
//            amazonSkillFrag.setVisibility(View.GONE);
//            assassinSkillFrag.setVisibility(View.VISIBLE);
//            barbarianSkillFrag.setVisibility(View.GONE);
//            druidSkillFrag.setVisibility(View.GONE);
//            necromancerSkillFrag.setVisibility(View.GONE);
//            paladinSkillFrag.setVisibility(View.GONE);
//            sorceressFrag.setVisibility(View.GONE);
        }
        if (barbarianActive) {
//            amazonSkillFrag.setVisibility(View.GONE);
//            assassinSkillFrag.setVisibility(View.GONE);
//            barbarianSkillFrag.setVisibility(View.VISIBLE);
//            druidSkillFrag.setVisibility(View.GONE);
//            necromancerSkillFrag.setVisibility(View.GONE);
//            paladinSkillFrag.setVisibility(View.GONE);
//            sorceressFrag.setVisibility(View.GONE);
        }
        if (druidActive) {
//            amazonSkillFrag.setVisibility(View.GONE);
//            assassinSkillFrag.setVisibility(View.GONE);
//            barbarianSkillFrag.setVisibility(View.GONE);
//            druidSkillFrag.setVisibility(View.VISIBLE);
//            necromancerSkillFrag.setVisibility(View.GONE);
//            paladinSkillFrag.setVisibility(View.GONE);
//            sorceressFrag.setVisibility(View.GONE);
        }
        if (necromancerActive) {
//            amazonSkillFrag.setVisibility(View.GONE);
//            assassinSkillFrag.setVisibility(View.GONE);
//            barbarianSkillFrag.setVisibility(View.GONE);
//            druidSkillFrag.setVisibility(View.GONE);
//            necromancerSkillFrag.setVisibility(View.VISIBLE);
//            paladinSkillFrag.setVisibility(View.GONE);
//            sorceressFrag.setVisibility(View.GONE);
        }
        if (paladinActive) {
//            amazonSkillFrag.setVisibility(View.GONE);
//            assassinSkillFrag.setVisibility(View.GONE);
//            barbarianSkillFrag.setVisibility(View.GONE);
//            druidSkillFrag.setVisibility(View.GONE);
//            necromancerSkillFrag.setVisibility(View.GONE);
//            paladinSkillFrag.setVisibility(View.VISIBLE);
//            sorceressFrag.setVisibility(View.GONE);
        }
        if (sorceressActive) {
//            amazonSkillFrag.setVisibility(View.GONE);
//            assassinSkillFrag.setVisibility(View.GONE);
//            barbarianSkillFrag.setVisibility(View.GONE);
//            druidSkillFrag.setVisibility(View.GONE);
//            necromancerSkillFrag.setVisibility(View.GONE);
//            paladinSkillFrag.setVisibility(View.GONE);
            sorceressFrag.setVisibility(View.VISIBLE);
            GetColdLayout().setVisibility(View.VISIBLE);
        }

        skillButtonsLinearLayout.setVisibility(View.VISIBLE);
    }

    void ClassButtons() {
        amazon.setOnClickListener(v -> {
            Toast.makeText(this, "amazon was clicked", Toast.LENGTH_SHORT).show();

            amazonActive = true;
            assassinActive = false;
            barbarianActive = false;
            druidActive = false;
            necromancerActive = false;
            paladinActive = false;
            sorceressActive = false;
            Toast.makeText(this, "amazon is set to " + amazonActive, Toast.LENGTH_SHORT).show();
            ActiveClass();
            AmazonTrees(amazonActive);

        });
        assassin.setOnClickListener(v -> Toast.makeText(this, "assassin was clicked", Toast.LENGTH_SHORT).show());
        barbarian.setOnClickListener(v -> Toast.makeText(this, "barbarian was clicked", Toast.LENGTH_SHORT).show());
        druid.setOnClickListener(v -> Toast.makeText(this, "druid was clicked", Toast.LENGTH_SHORT).show());
        necromancer.setOnClickListener(v -> Toast.makeText(this, "necromancer was clicked", Toast.LENGTH_SHORT).show());
        paladin.setOnClickListener(v -> Toast.makeText(this, "paladin was clicked", Toast.LENGTH_SHORT).show());

        sorceress.setOnClickListener(v -> {
            Toast.makeText(this, "sorceress was clicked", Toast.LENGTH_SHORT).show();
            amazonActive = false;
            assassinActive = false;
            barbarianActive = false;
            druidActive = false;
            necromancerActive = false;
            paladinActive = false;
            sorceressActive = true;
            Toast.makeText(this, "sorceress is set to " + sorceressActive, Toast.LENGTH_SHORT).show();
            ActiveClass();
            SorceressTrees();
        });
    }


//    void ActiveSkillTreeButtons() {
//        switch (activeCharacterClass) {
//            case "Sorceress":
//                topSkill = findViewById(R.id.btnTop);
//                bottomSkill = findViewById(R.id.btnBottom);
//                middleSkill = findViewById(R.id.btnMiddle);
//
//                topSkill.setOnClickListener(v -> {
//                    Toast.makeText(this, "Top was clicked", Toast.LENGTH_SHORT).show();
//                    try {
//                        GetColdLayout(sorceressActive).setVisibility(View.VISIBLE);
//                        GetLightningLayout(sorceressActive).setVisibility(View.GONE);
//                        GetFireLayout(sorceressActive).setVisibility(View.GONE);
//                    } catch (Exception e) {
//                        Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
//                    }
//
//                });
//                bottomSkill.setOnClickListener(v -> {
//                    Toast.makeText(this, "Bottom was clicked", Toast.LENGTH_SHORT).show();
//                    try {
//                        GetColdLayout(sorceressActive).setVisibility(View.GONE);
//                        GetLightningLayout(sorceressActive).setVisibility(View.GONE);
//                        GetFireLayout(sorceressActive).setVisibility(View.VISIBLE);
//                    } catch (Exception e) {
//                        Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                middleSkill.setOnClickListener(v -> {
//                    Toast.makeText(this, "Middle was clicked", Toast.LENGTH_SHORT).show();
//                    try {
//                        GetColdLayout(sorceressActive).setVisibility(View.GONE);
//                        GetLightningLayout(sorceressActive).setVisibility(View.VISIBLE);
//                        GetFireLayout(sorceressActive).setVisibility(View.GONE);
//                    } catch (Exception e) {
//                        Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                break;
//            case "Assassin":
//                break;
//        }
//    }
    // THIS IS ALL FOR SORCERESS ONLY!!


    void SorceressTrees() {

            topSkill.setOnClickListener(v -> {
                Toast.makeText(this, "Top was clicked", Toast.LENGTH_SHORT).show();
                try {
                    GetColdLayout().setVisibility(View.VISIBLE);
                    GetLightningLayout().setVisibility(View.GONE);
                    GetFireLayout().setVisibility(View.GONE);
                } catch (Exception e) {
                    Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
                }

            });
            bottomSkill.setOnClickListener(v -> {
                Toast.makeText(this, "Bottom was clicked", Toast.LENGTH_SHORT).show();
                try {
                    GetColdLayout().setVisibility(View.GONE);
                    GetLightningLayout().setVisibility(View.GONE);
                    GetFireLayout().setVisibility(View.VISIBLE);
                } catch (Exception e) {
                    Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
                }
            });
            middleSkill.setOnClickListener(v -> {
                Toast.makeText(this, "Middle was clicked", Toast.LENGTH_SHORT).show();
                try {
                    GetColdLayout().setVisibility(View.GONE);
                    GetLightningLayout().setVisibility(View.VISIBLE);
                    GetFireLayout().setVisibility(View.GONE);
                } catch (Exception e) {
                    Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
                }
            });
        }

    @Override
    public RelativeLayout GetColdLayout() {
        Toast.makeText(this, "Cold when clicked?", Toast.LENGTH_SHORT).show();
        RelativeLayout cold = findViewById(R.id.Cold);
        return cold;
    }

    @Override
    public RelativeLayout GetLightningLayout() {
        Toast.makeText(this, "Lightning when clicked?", Toast.LENGTH_SHORT).show();
        RelativeLayout lightning = findViewById(R.id.Lightning);
        return lightning;
    }

    @Override
    public RelativeLayout GetFireLayout() {
        Toast.makeText(this, "Fire when clicked?", Toast.LENGTH_SHORT).show();
        RelativeLayout fire = findViewById(R.id.Fire);
        return fire;
    }
    // THIS IS ALL FOR SORCERESS ONLY!!

    void AmazonTrees(boolean active) {

//        topSkill = findViewById(R.id.btnTop);
//        bottomSkill = findViewById(R.id.btnBottom);
//        middleSkill = findViewById(R.id.btnMiddle);
        if (active) {
            topSkill.setOnClickListener(v -> {
                Toast.makeText(this, "Top was clicked", Toast.LENGTH_SHORT).show();
                try {
                    GetJavalinAndSpearLayout(amazonActive).setVisibility(View.VISIBLE);
                    GetPassiveAndMagicLayout(amazonActive).setVisibility(View.GONE);
                    GetBowAndCrossbowLayout(amazonActive).setVisibility(View.GONE);
                } catch (Exception e) {
                    Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
                }

            });
            bottomSkill.setOnClickListener(v -> {
                Toast.makeText(this, "Bottom was clicked", Toast.LENGTH_SHORT).show();
                try {
                    GetJavalinAndSpearLayout(amazonActive).setVisibility(View.GONE);
                    GetPassiveAndMagicLayout(amazonActive).setVisibility(View.GONE);
                    GetBowAndCrossbowLayout(amazonActive).setVisibility(View.VISIBLE);
                } catch (Exception e) {
                    Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
                }
            });
            middleSkill.setOnClickListener(v -> {
                Toast.makeText(this, "Middle was clicked", Toast.LENGTH_SHORT).show();
                try {
                    GetJavalinAndSpearLayout(amazonActive).setVisibility(View.GONE);
                    GetPassiveAndMagicLayout(amazonActive).setVisibility(View.VISIBLE);
                    GetBowAndCrossbowLayout(amazonActive).setVisibility(View.GONE);
                } catch (Exception e) {
                    Toast.makeText(this, "Didn't work", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public RelativeLayout GetJavalinAndSpearLayout(boolean active) {
        return findViewById(R.id.javalin_and_spear_skills);
    }

    @Override
    public RelativeLayout GetPassiveAndMagicLayout(boolean active) {
        return findViewById(R.id.passive_and_magic_skills);
    }

    @Override
    public RelativeLayout GetBowAndCrossbowLayout(boolean active) {
        return findViewById(R.id.bow_and_crossbow_skills);
    }


}