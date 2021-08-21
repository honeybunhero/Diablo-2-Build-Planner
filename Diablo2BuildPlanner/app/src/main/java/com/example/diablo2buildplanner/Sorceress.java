package com.example.diablo2buildplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Sorceress extends AppCompatActivity implements classButtons.ClassButtons {

    Button cold, lightning, fire;
    RelativeLayout rlSkillTree;
    TextView etSkillPoints, tvSkillDescription;
    Button btnIceBlast, btnFrostNova, btnIceBolt, btnFrozenArmor, btnShiverArmor, btnChillingArmor, btnGlacialSpike, btnBlizzard, btnFrozenOrb, btnColdMastery;
    Button btnChargedBolt, btnStaticField, btnTelekinesis, btnNova, btnLightning, btnChainLightning, btnTeleport, btnThunderStorm, btnEnergyShield, btnLightningMastery;
    Button btnFireBolt, btnWarmth, btnInferno, btnBlaze, btnFireBall, btnFireWall, btnEnchant, btnMeteor, btnFireMastery, btnHydra;

    int iceBlastPoints, frostNovaPoints, iceBoltPoints, frozenArmorPoints, shiverArmorPoints, chillingArmorPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints, coldMasteryPoints;
    int chargedBoltPoints, staticFieldPoints, telekinesisPoints, novaPoints, lightningPoints, chainLightningPoints, teleportPoints, thunderStormPoints, energyShieldPoints, lightningMasterPoints;
    int fireBoltPoints, warmthPoints, infernoPoints, blazePoints, fireBallPoints, fireWallPoints, enchantPoints, meteorPoints, fireMasteryPoints, hydraPoints;

    int totalSkillPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorceress);

        rlSkillTree = findViewById(R.id.rlSkillTree);
        etSkillPoints = findViewById(R.id.tvSkillPoints);
        tvSkillDescription = findViewById(R.id.tvSkillDescription);

        cold = findViewById(R.id.Cold);
        lightning = findViewById(R.id.Lightning);
        fire = findViewById(R.id.Fire);
        btnIceBlast = findViewById(R.id.btnIceBlast);
        btnFrostNova = findViewById(R.id.btnFrostNova);
        btnIceBolt = findViewById(R.id.btnIceBolt);
        btnFrozenArmor = findViewById(R.id.btnFrozenArmor);
        btnShiverArmor = findViewById(R.id.btnShiverArmor);
        btnChillingArmor = findViewById(R.id.btnChillingArmor);
        btnGlacialSpike = findViewById(R.id.btnGlacialSpike);
        btnBlizzard = findViewById(R.id.btnBlizzard);
        btnFrozenOrb = findViewById(R.id.btnFrozenOrb);
        btnColdMastery = findViewById(R.id.btnColdMastery);

        ColdSkillButtonsClickable();


        btnChargedBolt = findViewById(R.id.btnChargedBolt);
        btnStaticField = findViewById(R.id.btnStaticField);
        btnTelekinesis = findViewById(R.id.btnTelekinesis);
        btnNova = findViewById(R.id.btnNova);
        btnLightning = findViewById(R.id.btnLightning);
        btnChainLightning = findViewById(R.id.btnChainLightning);
        btnTeleport = findViewById(R.id.btnTeleport);
        btnThunderStorm = findViewById(R.id.btnThunderStorm);
        btnEnergyShield = findViewById(R.id.btnEnergyShield);
        btnLightningMastery = findViewById(R.id.btnLightningMastery);

        LightningSkillButtonsClickable();


        btnFireBolt = findViewById(R.id.btnFireBolt);
        btnWarmth = findViewById(R.id.btnWarmth);
        btnInferno = findViewById(R.id.btnInferno);
        btnBlaze = findViewById(R.id.btnBlaze);
        btnFireBall = findViewById(R.id.btnFireBall);
        btnFireWall = findViewById(R.id.btnFireWall);
        btnEnchant = findViewById(R.id.btnEnchant);
        btnMeteor = findViewById(R.id.btnMeteor);
        btnFireMastery = findViewById(R.id.btnFireMastery);
        btnHydra = findViewById(R.id.btnHydra);

        FireSkillButtonsClickable();


        Initialize();

        cold.setOnClickListener(v -> {
            rlSkillTree.setBackgroundResource(R.drawable.sorceress_ice);
            ShowColdSkills();

            HideLightningSkills();
            HideFireSkills();
        });
        lightning.setOnClickListener(v -> {
            rlSkillTree.setBackgroundResource(R.drawable.sorceress_thunder);
            ShowLightningSkills();

            HideColdSkills();
            HideFireSkills();
        });
        fire.setOnClickListener(v -> {
            rlSkillTree.setBackgroundResource(R.drawable.sorceress_fire);
            ShowFirekills();

            HideColdSkills();
            HideLightningSkills();
        });
    }

    void Initialize() {
        rlSkillTree.setBackgroundResource(R.drawable.sorceress_ice);
        ShowColdSkills();
        HideLightningSkills();
        HideFireSkills();

        ResetAllSkills();
    }

    void ResetAllSkills() {
        iceBlastPoints = 0;
        frostNovaPoints = 0;
        iceBoltPoints = 0;
        frozenArmorPoints = 0;
        shiverArmorPoints = 0;
        chillingArmorPoints = 0;
        glacialSpikePoints = 0;
        blizzardPoints = 0;
        frozenOrbPoints = 0;
        coldMasteryPoints = 0;

        chargedBoltPoints = 0;
        staticFieldPoints = 0;
        telekinesisPoints = 0;
        novaPoints = 0;
        lightningPoints = 0;
        chainLightningPoints = 0;
        teleportPoints = 0;
        thunderStormPoints = 0;
        energyShieldPoints = 0;
        lightningMasterPoints = 0;

        fireBoltPoints = 0;
        warmthPoints = 0;
        infernoPoints = 0;
        blazePoints = 0;
        fireBallPoints = 0;
        fireWallPoints = 0;
        enchantPoints = 0;
        meteorPoints = 0;
        fireMasteryPoints = 0;
        hydraPoints = 0;
    }

    void ShowColdSkills() {
        btnIceBlast.setVisibility(View.VISIBLE);
        btnFrostNova.setVisibility(View.VISIBLE);
        btnIceBolt.setVisibility(View.VISIBLE);
        btnFrozenArmor.setVisibility(View.VISIBLE);
        btnShiverArmor.setVisibility(View.VISIBLE);
        btnChillingArmor.setVisibility(View.VISIBLE);
        btnGlacialSpike.setVisibility(View.VISIBLE);
        btnBlizzard.setVisibility(View.VISIBLE);
        btnFrozenOrb.setVisibility(View.VISIBLE);
        btnColdMastery.setVisibility(View.VISIBLE);

        ColdSkillButtonsClickable();
    }

    void ShowLightningSkills() {
        btnChargedBolt.setVisibility(View.VISIBLE);
        btnStaticField.setVisibility(View.VISIBLE);
        btnTelekinesis.setVisibility(View.VISIBLE);
        btnNova.setVisibility(View.VISIBLE);
        btnLightning.setVisibility(View.VISIBLE);
        btnChainLightning.setVisibility(View.VISIBLE);
        btnTeleport.setVisibility(View.VISIBLE);
        btnThunderStorm.setVisibility(View.VISIBLE);
        btnEnergyShield.setVisibility(View.VISIBLE);
        btnLightningMastery.setVisibility(View.VISIBLE);
    }

    void ShowFirekills() {
        btnFireBolt.setVisibility(View.VISIBLE);
        btnWarmth.setVisibility(View.VISIBLE);
        btnInferno.setVisibility(View.VISIBLE);
        btnBlaze.setVisibility(View.VISIBLE);
        btnFireBall.setVisibility(View.VISIBLE);
        btnFireWall.setVisibility(View.VISIBLE);
        btnEnchant.setVisibility(View.VISIBLE);
        btnMeteor.setVisibility(View.VISIBLE);
        btnFireMastery.setVisibility(View.VISIBLE);
        btnHydra.setVisibility(View.VISIBLE);
    }


    void HideColdSkills() {
        btnIceBlast.setVisibility(View.GONE);
        btnFrostNova.setVisibility(View.GONE);
        btnIceBolt.setVisibility(View.GONE);
        btnFrozenArmor.setVisibility(View.GONE);
        btnShiverArmor.setVisibility(View.GONE);
        btnChillingArmor.setVisibility(View.GONE);
        btnGlacialSpike.setVisibility(View.GONE);
        btnBlizzard.setVisibility(View.GONE);
        btnFrozenOrb.setVisibility(View.GONE);
        btnColdMastery.setVisibility(View.GONE);
    }

    void HideLightningSkills() {
        btnChargedBolt.setVisibility(View.GONE);
        btnStaticField.setVisibility(View.GONE);
        btnTelekinesis.setVisibility(View.GONE);
        btnNova.setVisibility(View.GONE);
        btnLightning.setVisibility(View.GONE);
        btnChainLightning.setVisibility(View.GONE);
        btnTeleport.setVisibility(View.GONE);
        btnThunderStorm.setVisibility(View.GONE);
        btnEnergyShield.setVisibility(View.GONE);
        btnLightningMastery.setVisibility(View.GONE);
    }

    void HideFireSkills() {
        btnFireBolt.setVisibility(View.GONE);
        btnWarmth.setVisibility(View.GONE);
        btnInferno.setVisibility(View.GONE);
        btnBlaze.setVisibility(View.GONE);
        btnFireBall.setVisibility(View.GONE);
        btnFireWall.setVisibility(View.GONE);
        btnEnchant.setVisibility(View.GONE);
        btnMeteor.setVisibility(View.GONE);
        btnFireMastery.setVisibility(View.GONE);
        btnHydra.setVisibility(View.GONE);
    }


    void ColdSkillButtonsClickable() {
        btnIceBolt.setOnClickListener(v -> {
            if (iceBoltPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                iceBoltPoints += 1;
                String text = "" + iceBoltPoints;
                btnIceBolt.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnIceBlast.setOnClickListener(v -> {
            if (iceBlastPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                iceBlastPoints += 1;
                String text = "" + iceBlastPoints;
                btnIceBlast.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnFrostNova.setOnClickListener(v -> {
            if (frostNovaPoints != 20 && CheckTotalSkillPointsUsed() <=110) {
                frostNovaPoints += 1;
                String text = "" + frostNovaPoints;
                btnFrostNova.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnFrozenArmor.setOnClickListener(v -> {
            if (frozenArmorPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                frozenArmorPoints += 1;
                String text = "" + frozenArmorPoints;
                btnFrozenArmor.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnShiverArmor.setOnClickListener(v -> {
            if (shiverArmorPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                shiverArmorPoints += 1;
                String text = "" + shiverArmorPoints;
                btnShiverArmor.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnChillingArmor.setOnClickListener(v -> {
            if (chillingArmorPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                chillingArmorPoints += 1;
                String text = "" + chillingArmorPoints;
                btnChillingArmor.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnGlacialSpike.setOnClickListener(v -> {
            if (glacialSpikePoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                glacialSpikePoints += 1;
                String text = "" + glacialSpikePoints;
                btnGlacialSpike.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnBlizzard.setOnClickListener(v -> {
            if (blizzardPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                blizzardPoints += 1;
                String text = "" + blizzardPoints;
                btnBlizzard.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnFrozenOrb.setOnClickListener(v -> {
            if (frozenOrbPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                frozenOrbPoints += 1;
                String text = "" + frozenOrbPoints;
                btnFrozenOrb.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });
        btnColdMastery.setOnClickListener(v -> {
            if (coldMasteryPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                coldMasteryPoints += 1;
                String text = "" + coldMasteryPoints;
                btnColdMastery.setText(text);
                Toast.makeText(this, "" + CheckTotalSkillPointsUsed(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    void LightningSkillButtonsClickable() {
        btnChargedBolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Charged Bolt", Toast.LENGTH_SHORT).show();
            }
        });
        btnStaticField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Static Field", Toast.LENGTH_SHORT).show();
            }
        });
        btnTelekinesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Telekinesis", Toast.LENGTH_SHORT).show();
            }
        });
        btnNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Nova", Toast.LENGTH_SHORT).show();
            }
        });
        btnLightning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Lightning", Toast.LENGTH_SHORT).show();
            }
        });
        btnChainLightning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Chain Lightning", Toast.LENGTH_SHORT).show();
            }
        });
        btnTeleport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Teleport", Toast.LENGTH_SHORT).show();
            }
        });
        btnThunderStorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Thunder Storm", Toast.LENGTH_SHORT).show();
            }
        });
        btnEnergyShield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Energy Shield", Toast.LENGTH_SHORT).show();
            }
        });
        btnLightningMastery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Lightning Mastery", Toast.LENGTH_SHORT).show();
            }
        });
    }

    void FireSkillButtonsClickable() {
        btnFireBolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Fire Bolt", Toast.LENGTH_SHORT).show();
            }
        });
        btnWarmth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Warmth", Toast.LENGTH_SHORT).show();
            }
        });
        btnInferno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Inferno", Toast.LENGTH_SHORT).show();
            }
        });
        btnBlaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Blaze", Toast.LENGTH_SHORT).show();
            }
        });
        btnFireBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Fire Ball", Toast.LENGTH_SHORT).show();
            }
        });
        btnFireWall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Fire Wall", Toast.LENGTH_SHORT).show();
            }
        });
        btnEnchant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Enchant", Toast.LENGTH_SHORT).show();
            }
        });
        btnMeteor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Meteor", Toast.LENGTH_SHORT).show();
            }
        });
        btnFireMastery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Fire Mastery", Toast.LENGTH_SHORT).show();
            }
        });
        btnHydra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorceress.this, "You clicked on Hydra", Toast.LENGTH_SHORT).show();
            }
        });
    }

    int CheckTotalSkillPointsUsed() {


        int allIceSkills = iceBlastPoints + frostNovaPoints + iceBoltPoints + frozenArmorPoints + shiverArmorPoints + chillingArmorPoints + glacialSpikePoints + blizzardPoints + frozenOrbPoints + coldMasteryPoints;
        int allLightningSkills = chargedBoltPoints + staticFieldPoints + telekinesisPoints + novaPoints + lightningPoints + chainLightningPoints + teleportPoints + thunderStormPoints + energyShieldPoints + lightningMasterPoints;
        int allFireSkills = fireBoltPoints + warmthPoints + infernoPoints + blazePoints + fireBallPoints + fireWallPoints + enchantPoints + meteorPoints + fireMasteryPoints + hydraPoints;
        totalSkillPoints = allIceSkills + allLightningSkills + allFireSkills;
        return totalSkillPoints;
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