package com.example.diablo2buildplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.text.method.ScrollingMovementMethod;


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

    ColdSkillsCalculations coldSkillsCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorceress);

        rlSkillTree = findViewById(R.id.rlSkillTree);
        etSkillPoints = findViewById(R.id.tvSkillPoints);
        tvSkillDescription = findViewById(R.id.tvSkillDescription);
        tvSkillDescription.setMovementMethod(new ScrollingMovementMethod());


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
            ShowFireSkills();

            HideColdSkills();
            HideLightningSkills();
        });
    }

    void Initialize() {
        coldSkillsCalc = new ColdSkillsCalculations();
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

    void ShowFireSkills() {
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

                tvSkillDescription.setText("Shoots a bolt of ice that damages and slows your victim with a relatively low damage rate. \n\n" +
                        IceBoltValues(iceBoltPoints));
            }
        });
        btnIceBlast.setOnClickListener(v -> {
            if (iceBlastPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                iceBlastPoints += 1;
                String text = "" + iceBlastPoints;
                btnIceBlast.setText(text);
            }
        });
        btnFrostNova.setOnClickListener(v -> {
            if (frostNovaPoints != 20 && CheckTotalSkillPointsUsed() <= 110) {
                frostNovaPoints += 1;
                String text = "" + frostNovaPoints;
                btnFrostNova.setText(text);
            }
        });
        btnFrozenArmor.setOnClickListener(v -> {
            if (frozenArmorPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                frozenArmorPoints += 1;
                String text = "" + frozenArmorPoints;
                btnFrozenArmor.setText(text);
            }
        });
        btnShiverArmor.setOnClickListener(v -> {
            if (shiverArmorPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                shiverArmorPoints += 1;
                String text = "" + shiverArmorPoints;
                btnShiverArmor.setText(text);
            }
        });
        btnChillingArmor.setOnClickListener(v -> {
            if (chillingArmorPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                chillingArmorPoints += 1;
                String text = "" + chillingArmorPoints;
                btnChillingArmor.setText(text);
            }
        });
        btnGlacialSpike.setOnClickListener(v -> {
            if (glacialSpikePoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                glacialSpikePoints += 1;
                String text = "" + glacialSpikePoints;
                btnGlacialSpike.setText(text);
            }
        });
        btnBlizzard.setOnClickListener(v -> {
            if (blizzardPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                blizzardPoints += 1;
                String text = "" + blizzardPoints;
                btnBlizzard.setText(text);
            }
        });
        btnFrozenOrb.setOnClickListener(v -> {
            if (frozenOrbPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                frozenOrbPoints += 1;
                String text = "" + frozenOrbPoints;
                btnFrozenOrb.setText(text);
            }
        });
        btnColdMastery.setOnClickListener(v -> {
            if (coldMasteryPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                coldMasteryPoints += 1;
                String text = "" + coldMasteryPoints;
                btnColdMastery.setText(text);
            }
        });


        btnIceBolt.setOnLongClickListener(v -> {
            if (iceBoltPoints > 0) {
                iceBoltPoints -= 1;
                String text = "" + iceBoltPoints;
                btnIceBolt.setText(text);
                tvSkillDescription.setText("Shoots a bolt of ice that damages and slows your victim with a relatively low damage rate. \n\n" +
                        IceBoltValues(iceBoltPoints));
            }
            return true;
        });
        btnIceBlast.setOnLongClickListener(v -> {
            if (iceBlastPoints > 0) {
                iceBlastPoints -= 1;
                String text = "" + iceBlastPoints;
                btnIceBlast.setText(text);
                tvSkillDescription.setText("Creates a magical sphere of ice that damages and freezes your enemy. \n\n" +
                        IceBlastValues(iceBlastPoints));
            }
            return true;
        });
        btnFrostNova.setOnLongClickListener(v -> {
            if (frostNovaPoints > 0) {
                frostNovaPoints -= 1;
                String text = "" + iceBoltPoints;
                btnFrostNova.setText(text);
                tvSkillDescription.setText("Creates an expanding ring of ice that damages and slows all nearby enemies. \n\n" +
                        FrostNovaValues(frostNovaPoints));
            }
            return true;
        });
        btnFrozenArmor.setOnLongClickListener(v -> {
            if (frozenArmorPoints > 0) {
                frozenArmorPoints -= 1;
                String text = "" + frozenArmorPoints;
                btnFrozenArmor.setText(text);
                tvSkillDescription.setText("Increases your defense rating and freezes enemies that hit you. \n\n" +
                        FrozenArmorValues(frozenArmorPoints));
            }
            return true;
        });
        btnShiverArmor.setOnLongClickListener(v -> {
            if (shiverArmorPoints > 0) {
                shiverArmorPoints -= 1;
                String text = "" + shiverArmorPoints;
                btnShiverArmor.setText(text);
                tvSkillDescription.setText("Increases your defense rating. Freezes and damages enemies that hit you. \n\n" +
                        ShiverArmorValues(shiverArmorPoints));
            }
            return true;
        });
        btnChillingArmor.setOnLongClickListener(v -> {
            if (chillingArmorPoints > 0) {
                chillingArmorPoints -= 1;
                String text = "" + chillingArmorPoints;
                btnChillingArmor.setText(text);
                tvSkillDescription.setText("Increases defense and recharges an ice bolt in retaliation against ranged attackers. \n\n" +
                        ChillingArmorValues(chillingArmorPoints));
            }
            return true;
        });
        btnGlacialSpike.setOnLongClickListener(v -> {
            if (glacialSpikePoints > 0) {
                glacialSpikePoints -= 1;
                String text = "" + glacialSpikePoints;
                btnGlacialSpike.setText(text);
                tvSkillDescription.setText("Creates a magical ice comet that freezes or kills nearby enemies \n\n" +
                        GlacialSpikeValues(glacialSpikePoints));
            }
            return true;
        });
        btnBlizzard.setOnLongClickListener(v -> {
            if (blizzardPoints > 0) {
                blizzardPoints -= 1;
                String text = "" + blizzardPoints;
                btnBlizzard.setText(text);
                tvSkillDescription.setText("Summons massive shards of ice to destroy your enemies \n\n" +
                        BlizzardValues(blizzardPoints));
            }
            return true;
        });
        btnFrozenOrb.setOnLongClickListener(v -> {
            if (frozenOrbPoints > 0) {
                frozenOrbPoints -= 1;
                String text = "" + frozenOrbPoints;
                btnFrozenOrb.setText(text);
                tvSkillDescription.setText("Creates a magical glove that sprays a torrent of ice bolts to lay waste to your enemies. \n\n" +
                        FrozenOrbValues(frozenOrbPoints));
            }
            return true;
        });
        btnColdMastery.setOnLongClickListener(v -> {
            if (coldMasteryPoints > 0) {
                coldMasteryPoints -= 1;
                String text = "" + coldMasteryPoints;
                btnColdMastery.setText(text);
                tvSkillDescription.setText("Passive: Increases the damage of your cold attacks by piercing enemies resistances to cold. \n\n" +
                        ColdMasteryValues(coldMasteryPoints));
            }
            return true;
        });

    }

    void LightningSkillButtonsClickable() {
        btnChargedBolt.setOnClickListener(v -> {
            if (chargedBoltPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                chargedBoltPoints += 1;
                String text = "" + chargedBoltPoints;
                btnChargedBolt.setText(text);
            }
        });
        btnStaticField.setOnClickListener(v -> {
            if (staticFieldPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                staticFieldPoints += 1;
                String text = "" + staticFieldPoints;
                btnStaticField.setText(text);
            }
        });
        btnTelekinesis.setOnClickListener(v -> {
            if (telekinesisPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                telekinesisPoints += 1;
                String text = "" + telekinesisPoints;
                btnTelekinesis.setText(text);
            }
        });
        btnNova.setOnClickListener(v -> {
            if (novaPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                novaPoints += 1;
                String text = "" + novaPoints;
                btnNova.setText(text);
            }
        });
        btnLightning.setOnClickListener(v -> {
            if (lightningPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                lightningPoints += 1;
                String text = "" + lightningPoints;
                btnLightning.setText(text);
            }
        });
        btnChainLightning.setOnClickListener(v -> {
            if (chainLightningPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                chainLightningPoints += 1;
                String text = "" + chainLightningPoints;
                btnChainLightning.setText(text);
            }
        });
        btnTeleport.setOnClickListener(v -> {
            if (teleportPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                teleportPoints += 1;
                String text = "" + teleportPoints;
                btnTeleport.setText(text);
            }
        });
        btnThunderStorm.setOnClickListener(v -> {
            if (thunderStormPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                thunderStormPoints += 1;
                String text = "" + thunderStormPoints;
                btnThunderStorm.setText(text);
            }
        });
        btnEnergyShield.setOnClickListener(v -> {
            if (energyShieldPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                energyShieldPoints += 1;
                String text = "" + energyShieldPoints;
                btnEnergyShield.setText(text);
            }
        });
        btnLightningMastery.setOnClickListener(v -> {
            if (lightningMasterPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                lightningMasterPoints += 1;
                String text = "" + lightningMasterPoints;
                btnLightningMastery.setText(text);
            }
        });
    }

    void FireSkillButtonsClickable() {
        btnFireBolt.setOnClickListener(v -> {
            if (fireBoltPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                fireBoltPoints += 1;
                String text = "" + fireBoltPoints;
                btnFireBolt.setText(text);
            }
        });
        btnWarmth.setOnClickListener(v -> {
            if (warmthPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                warmthPoints += 1;
                String text = "" + warmthPoints;
                btnWarmth.setText(text);
            }
        });
        btnInferno.setOnClickListener(v -> {
            if (infernoPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                infernoPoints += 1;
                String text = "" + infernoPoints;
                btnInferno.setText(text);
            }
        });
        btnBlaze.setOnClickListener(v -> {
            if (blazePoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                blazePoints += 1;
                String text = "" + blazePoints;
                btnBlaze.setText(text);
            }
        });
        btnFireBall.setOnClickListener(v -> {
            if (fireBallPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                fireBallPoints += 1;
                String text = "" + fireBallPoints;
                btnFireBall.setText(text);
            }
        });
        btnFireWall.setOnClickListener(v -> {
            if (fireWallPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                fireWallPoints += 1;
                String text = "" + fireWallPoints;
                btnFireWall.setText(text);
            }
        });
        btnEnchant.setOnClickListener(v -> {
            if (enchantPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                enchantPoints += 1;
                String text = "" + enchantPoints;
                btnEnchant.setText(text);
            }
        });
        btnMeteor.setOnClickListener(v -> {
            if (meteorPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                meteorPoints += 1;
                String text = "" + meteorPoints;
                btnMeteor.setText(text);
            }
        });
        btnFireMastery.setOnClickListener(v -> {
            if (fireMasteryPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                fireMasteryPoints += 1;
                String text = "" + fireMasteryPoints;
                btnFireMastery.setText(text);
            }
        });
        btnHydra.setOnClickListener(v -> {
            if (hydraPoints != 20 && CheckTotalSkillPointsUsed() < 110) {
                hydraPoints += 1;
                String text = "" + hydraPoints;
                btnHydra.setText(text);
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


    String IceBoltValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(3, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(5, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 7.4 seconds \n" +
                        "Mana cost : 3 seconds \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 2:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(4, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(6, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 7.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 3:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(5, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(8, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 8.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 4:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(6, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(9, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 10.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 5:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(7, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(11, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 11.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 6:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(8, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(12, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 13 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 7:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(9, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(14, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 14.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 8:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(10, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(15, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 15.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 9:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(12, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(18, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 17.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 10:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(14, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(20, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 18.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 11:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(16, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(23, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 20 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 12:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(18, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(25, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 21.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 13:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(20, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(28, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 22.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 14:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(22, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(30, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 24.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 15:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(24, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(33, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 25.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 16:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(26, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(35, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 27 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 17:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(29, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(39, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 28.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 18:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(32, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(42, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 29.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 19:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(35, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(46, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 31.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 20:
                text = "Cold Damage : " + coldSkillsCalc.IceBoltMin(38, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) +
                        "-" + coldSkillsCalc.IceBoltMax(49, frostNovaPoints, iceBlastPoints, glacialSpikePoints, blizzardPoints, frozenOrbPoints) + "\n" +
                        "Cold length : 32.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
        }
        return text;
    }

    String IceBlastValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Cold Damage : 8-12 \n" +
                        "Freezes for 3 seconds \n" +
                        "Mana cost : 6 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 2:
                text = "Cold Damage : 15-19 \n" +
                        "Freezes for 3.2 seconds \n" +
                        "Mana cost : 6.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 3:
                text = "Cold Damage : 22-27 \n" +
                        "Freezes for 3.4 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 4:
                text = "Cold Damage : 29-34 \n" +
                        "Freezes for 3.6 seconds \n" +
                        "Mana cost : 7.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 5:
                text = "Cold Damage : 36-42 \n" +
                        "Freezes for 3.8 seconds \n" +
                        "Mana cost : 8 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 6:
                text = "Cold Damage : 43-49 \n" +
                        "Freezes for 4 seconds \n" +
                        "Mana cost : 8.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 7:
                text = "Cold Damage : 50-57 \n" +
                        "Freezes for 4.2 seconds \n" +
                        "Mana cost : 9 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 8:
                text = "Cold Damage : 57-64 \n" +
                        "Freezes for 4.4 seconds \n" +
                        "Mana cost : 9.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 9:
                text = "Cold Damage : 71-79 \n" +
                        "Freezes for 4.6 seconds \n" +
                        "Mana cost : 10 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 10:
                text = "Cold Damage : 85-93 \n" +
                        "Freezes for 4.8 seconds \n" +
                        "Mana cost : 10.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 11:
                text = "Cold Damage : 99-108 \n" +
                        "Freezes for 5 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 12:
                text = "Cold Damage : 113-122 \n" +
                        "Freezes for 5.2 seconds \n" +
                        "Mana cost : 11.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 13:
                text = "Cold Damage : 127-137 \n" +
                        "Freezes for 5.4 seconds \n" +
                        "Mana cost : 12 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 14:
                text = "Cold Damage : 141-151 \n" +
                        "Freezes for 5.6 seconds \n" +
                        "Mana cost : 12.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 15:
                text = "Cold Damage : 155-166 \n" +
                        "Freezes for 5.8 seconds \n" +
                        "Mana cost : 13 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 16:
                text = "Cold Damage : 169-180 \n" +
                        "Freezes for 6 seconds \n" +
                        "Mana cost : 13.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 17:
                text = "Cold Damage : 190-202 \n" +
                        "Freezes for 6.2 seconds \n" +
                        "Mana cost : 14 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 18:
                text = "Cold Damage : 211-223 \n" +
                        "Freezes for 6.4 seconds \n" +
                        "Mana cost : 14.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 19:
                text = "Cold Damage : 232-245 \n" +
                        "Freezes for 6.6 seconds \n" +
                        "Mana cost : 15 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
            case 20:
                text = "Cold Damage : 253-266 \n" +
                        "Freezes for 6.8 seconds \n" +
                        "Mana cost : 15.5 \n\n" +
                        "Ice Blast receives bonuses from: \n\n" +
                        "Ice Bolt: + 8% Cold damage per level \n\n" +
                        "Glacial Spike: + 10% Cold damage per level \n\n" +
                        "Blizzard: + 8% Cold damage per level \n\n" +
                        "Frozen Orb: + 8% Cold damage per level \n\n";
                break;
        }
        return text;
    }

    String FrostNovaValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Cold Damage : 2-4 \n" +
                        "Cold length : 8 seconds \n" +
                        "Mana cost : 9 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 2:
                text = "Cold Damage : 4-6 \n" +
                        "Cold length : 9 seconds \n" +
                        "Mana cost : 10 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 3:
                text = "Cold Damage : 6-9 \n" +
                        "Cold length : 10 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 4:
                text = "Cold Damage : 8-11 \n" +
                        "Cold length : 11 seconds \n" +
                        "Mana cost : 12 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 5:
                text = "Cold Damage : 10-14 \n" +
                        "Cold length : 12 seconds \n" +
                        "Mana cost : 13 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 6:
                text = "Cold Damage : 12-16 \n" +
                        "Cold length : 13 seconds \n" +
                        "Mana cost : 14 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 7:
                text = "Cold Damage : 14-19 \n" +
                        "Cold length : 14 seconds \n" +
                        "Mana cost : 15 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 8:
                text = "Cold Damage : 16-21 \n" +
                        "Cold length : 15 seconds \n" +
                        "Mana cost : 16 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 9:
                text = "Cold Damage : 19-25 \n" +
                        "Cold length : 16 seconds \n" +
                        "Mana cost : 17 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 10:
                text = "Cold Damage : 22-28 \n" +
                        "Cold length : 17 seconds \n" +
                        "Mana cost : 18 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 11:
                text = "Cold Damage : 25-32 \n" +
                        "Cold length : 18 seconds \n" +
                        "Mana cost : 19 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 12:
                text = "Cold Damage : 28-35 \n" +
                        "Cold length : 19 seconds \n" +
                        "Mana cost : 20 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 13:
                text = "Cold Damage : 31-39 \n" +
                        "Cold length : 20 seconds \n" +
                        "Mana cost : 21 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 14:
                text = "Cold Damage : 34-42 \n" +
                        "Cold length : 21 seconds \n" +
                        "Mana cost : 22 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 15:
                text = "Cold Damage : 37-46 \n" +
                        "Cold length : 22 seconds \n" +
                        "Mana cost : 23 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 16:
                text = "Cold Damage : 40-49 \n" +
                        "Cold length : 23 seconds \n" +
                        "Mana cost : 24 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 17:
                text = "Cold Damage : 44-54 \n" +
                        "Cold length : 24 seconds \n" +
                        "Mana cost : 25 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 18:
                text = "Cold Damage : 48-58 \n" +
                        "Cold length : 25 seconds \n" +
                        "Mana cost : 26 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 19:
                text = "Cold Damage : 52-63 \n" +
                        "Cold length : 26 seconds \n" +
                        "Mana cost : 27 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
            case 20:
                text = "Cold Damage : 56-67 \n" +
                        "Cold length : 27 seconds \n" +
                        "Mana cost : 28 \n\n" +
                        "Frost Nova receives bonuses from: \n\n" +
                        "Blizzard: + 10% Cold damage per level \n\n" +
                        "Frozen Orb: + 10% Cold damage per level \n\n";
                break;
        }
        return text;
    }

    String FrozenArmorValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Defense Bonus : 30 percent \n" +
                        "Duration : 120 seconds \n" +
                        "Freezes for 1.2 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 2:
                text = "Defense Bonus : 35 percent \n" +
                        "Duration : 132 seconds \n" +
                        "Freezes for 1.3 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 3:
                text = "Defense Bonus : 40 percent \n" +
                        "Duration : 144 seconds \n" +
                        "Freezes for 1.4 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 4:
                text = "Defense Bonus : 45 percent \n" +
                        "Duration : 156 seconds \n" +
                        "Freezes for 1.5 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 5:
                text = "Defense Bonus : 50 percent \n" +
                        "Duration : 168 seconds \n" +
                        "Freezes for 1.6 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 6:
                text = "Defense Bonus : 55 percent \n" +
                        "Duration : 180 seconds \n" +
                        "Freezes for 1.8 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 7:
                text = "Defense Bonus : 60 percent \n" +
                        "Duration : 192 seconds \n" +
                        "Freezes for 1.9 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 8:
                text = "Defense Bonus : 65 percent \n" +
                        "Duration : 204 seconds \n" +
                        "Freezes for 2 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 9:
                text = "Defense Bonus : 70 percent \n" +
                        "Duration : 216 seconds \n" +
                        "Freezes for 2.1 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 10:
                text = "Defense Bonus : 75 percent \n" +
                        "Duration : 228 seconds \n" +
                        "Freezes for 2.2 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 11:
                text = "Defense Bonus : 80 percent \n" +
                        "Duration : 240 seconds \n" +
                        "Freezes for 2.4 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 12:
                text = "Defense Bonus : 85 percent \n" +
                        "Duration : 252 seconds \n" +
                        "Freezes for 2.5 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 13:
                text = "Defense Bonus : 90 percent \n" +
                        "Duration : 264 seconds \n" +
                        "Freezes for 2.6 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 14:
                text = "Defense Bonus : 95 percent \n" +
                        "Duration : 276 seconds \n" +
                        "Freezes for 2.7 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 15:
                text = "Defense Bonus : 100 percent \n" +
                        "Duration : 288 seconds \n" +
                        "Freezes for 2.8 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 16:
                text = "Defense Bonus : 105 percent \n" +
                        "Duration : 300 seconds \n" +
                        "Freezes for 3 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 17:
                text = "Defense Bonus : 110 percent \n" +
                        "Duration : 312 seconds \n" +
                        "Freezes for 3.1 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 18:
                text = "Defense Bonus : 115 percent \n" +
                        "Duration : 324 seconds \n" +
                        "Freezes for 3.2 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 19:
                text = "Defense Bonus : 120 percent \n" +
                        "Duration : 336 seconds \n" +
                        "Freezes for 3.3 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 20:
                text = "Defense Bonus : 125 percent \n" +
                        "Duration : 348 seconds \n" +
                        "Freezes for 3.4 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
        }
        return text;
    }

    String ShiverArmorValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Duration : 320 seconds \n" +
                        "Defense bonus : 45 percent \n" +
                        "Cold damage : 16-22 \n" +
                        "Cold length : 4 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 2:
                text = "Duration : 332 seconds \n" +
                        "Defense bonus : 51 percent \n" +
                        "Cold damage : 22-29 \n" +
                        "Cold length : 4 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 3:
                text = "Duration : 344 seconds \n" +
                        "Defense bonus : 57 percent \n" +
                        "Cold damage : 28-36 \n" +
                        "Cold length : 4 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 4:
                text = "Duration : 356 seconds \n" +
                        "Defense bonus : 63 percent \n" +
                        "Cold damage : 33-43 \n" +
                        "Cold length : 4 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 5:
                text = "Duration : 368 seconds \n" +
                        "Defense bonus : 69 percent \n" +
                        "Cold damage : 39-50 \n" +
                        "Cold length : 4 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 6:
                text = "Duration : 380 seconds \n" +
                        "Defense bonus : 75 percent \n" +
                        "Cold damage : 44-57 \n" +
                        "Cold length : 4 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 7:
                text = "Duration : 392 seconds \n" +
                        "Defense bonus : 81 percent \n" +
                        "Cold damage : 50-56 \n" +
                        "Cold length : 4 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 8:
                text = "Duration : 404 seconds \n" +
                        "Defense bonus : 87 percent \n" +
                        "Cold damage : 56-71 \n" +
                        "Cold length : 4 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 9:
                text = "Duration : 416 seconds \n" +
                        "Defense bonus : 45 percent \n" +
                        "Cold damage : 64-81 \n" +
                        "Cold length : 5 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 10:
                text = "Duration : 428 seconds \n" +
                        "Defense bonus : 99 percent \n" +
                        "Cold damage : 72-91 \n" +
                        "Cold length : 6 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 11:
                text = "Duration : 440 seconds \n" +
                        "Defense bonus : 105 percent \n" +
                        "Cold damage : 81-100 \n" +
                        "Cold length : 7 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 12:
                text = "Duration : 452 seconds \n" +
                        "Defense bonus : 111 percent \n" +
                        "Cold damage : 89-110 \n" +
                        "Cold length : 8 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 13:
                text = "Duration : 464 seconds \n" +
                        "Defense bonus : 117 percent \n" +
                        "Cold damage : 98-120 \n" +
                        "Cold length : 9 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 14:
                text = "Duration : 476 seconds \n" +
                        "Defense bonus : 123 percent \n" +
                        "Cold damage : 106-130 \n" +
                        "Cold length : 10 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 15:
                text = "Duration : 488 seconds \n" +
                        "Defense bonus : 129 percent \n" +
                        "Cold damage : 114-140 \n" +
                        "Cold length : 11 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 16:
                text = "Duration : 500 seconds \n" +
                        "Defense bonus : 135 percent \n" +
                        "Cold damage : 123-149 \n" +
                        "Cold length : 12 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 17:
                text = "Duration : 512 seconds \n" +
                        "Defense bonus : 141 percent \n" +
                        "Cold damage : 134-162 \n" +
                        "Cold length : 14 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 18:
                text = "Duration : 524 seconds \n" +
                        "Defense bonus : 147 percent \n" +
                        "Cold damage : 147-175 \n" +
                        "Cold length : 16 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 19:
                text = "Duration : 536 seconds \n" +
                        "Defense bonus : 153 percent \n" +
                        "Cold damage : 156-187 \n" +
                        "Cold length : 18 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
            case 20:
                text = "Duration : 548 seconds \n" +
                        "Defense bonus : 159 percent \n" +
                        "Cold damage : 168-200 \n" +
                        "Cold length : 20 seconds \n" +
                        "Mana cost : 11 \n\n" +
                        "Shiver Armor receives bonuses from: \n\n" +
                        "Frozen Armor: + 10 seconds per level \n\n" +
                        "Frozen Armor: + 9% Cold damage per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 9% Cold damage per level \n\n";
                break;
        }
        return text;
    }

    String ChillingArmorValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Defense Bonus : 30 percent \n" +
                        "Duration : 120 seconds \n" +
                        "Freezes for 1.2 seconds \n" +
                        "Mana cost : 7 \n\n" +
                        "Frozen Armor receives bonuses from: \n\n" +
                        "Shiver Armor: + 10 seconds per level \n\n" +
                        "Shiver Armor: + 5% Freeze length per level \n\n" +
                        "Chilling Armor: + 10 seconds per level \n\n" +
                        "Chilling Armor: + 5% Freeze length per level \n\n";
                break;
            case 2:
                text = "Cold Damage : 4-6 \n" +
                        "Cold length : 7.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 3:
                text = "Cold Damage : 5-8 \n" +
                        "Cold length : 8.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 4:
                text = "Cold Damage : 6-9 \n" +
                        "Cold length : 10.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 5:
                text = "Cold Damage : 7-11 \n" +
                        "Cold length : 11.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 6:
                text = "Cold Damage : 8-12 \n" +
                        "Cold length : 13 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 7:
                text = "Cold Damage : 9-14 \n" +
                        "Cold length : 14.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 8:
                text = "Cold Damage : 10-15 \n" +
                        "Cold length : 15.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 9:
                text = "Cold Damage : 12-18 \n" +
                        "Cold length : 17.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 10:
                text = "Cold Damage : 14-20 \n" +
                        "Cold length : 18.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 11:
                text = "Cold Damage : 16-23 \n" +
                        "Cold length : 20 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 12:
                text = "Cold Damage : 18-25 \n" +
                        "Cold length : 21.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 13:
                text = "Cold Damage : 20-28 \n" +
                        "Cold length : 22.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 14:
                text = "Cold Damage : 22-30 \n" +
                        "Cold length : 24.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 15:
                text = "Cold Damage : 24-33 \n" +
                        "Cold length : 25.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 16:
                text = "Cold Damage : 26-35 \n" +
                        "Cold length : 27 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 17:
                text = "Cold Damage : 29-39 \n" +
                        "Cold length : 28.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 18:
                text = "Cold Damage : 32-42 \n" +
                        "Cold length : 29.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 19:
                text = "Cold Damage : 35-46 \n" +
                        "Cold length : 31.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 20:
                text = "Cold Damage : 38-49 \n" +
                        "Cold length : 32.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
        }
        return text;
    }

    String GlacialSpikeValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Cold Damage : 3-5 \n" +
                        "Cold length : 6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 2:
                text = "Cold Damage : 4-6 \n" +
                        "Cold length : 7.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 3:
                text = "Cold Damage : 5-8 \n" +
                        "Cold length : 8.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 4:
                text = "Cold Damage : 6-9 \n" +
                        "Cold length : 10.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 5:
                text = "Cold Damage : 7-11 \n" +
                        "Cold length : 11.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 6:
                text = "Cold Damage : 8-12 \n" +
                        "Cold length : 13 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 7:
                text = "Cold Damage : 9-14 \n" +
                        "Cold length : 14.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 8:
                text = "Cold Damage : 10-15 \n" +
                        "Cold length : 15.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 9:
                text = "Cold Damage : 12-18 \n" +
                        "Cold length : 17.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 10:
                text = "Cold Damage : 14-20 \n" +
                        "Cold length : 18.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 11:
                text = "Cold Damage : 16-23 \n" +
                        "Cold length : 20 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 12:
                text = "Cold Damage : 18-25 \n" +
                        "Cold length : 21.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 13:
                text = "Cold Damage : 20-28 \n" +
                        "Cold length : 22.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 14:
                text = "Cold Damage : 22-30 \n" +
                        "Cold length : 24.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 15:
                text = "Cold Damage : 24-33 \n" +
                        "Cold length : 25.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 16:
                text = "Cold Damage : 26-35 \n" +
                        "Cold length : 27 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 17:
                text = "Cold Damage : 29-39 \n" +
                        "Cold length : 28.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 18:
                text = "Cold Damage : 32-42 \n" +
                        "Cold length : 29.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 19:
                text = "Cold Damage : 35-46 \n" +
                        "Cold length : 31.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 20:
                text = "Cold Damage : 38-49 \n" +
                        "Cold length : 32.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
        }
        return text;
    }

    String BlizzardValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Cold Damage : 3-5 \n" +
                        "Cold length : 6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 2:
                text = "Cold Damage : 4-6 \n" +
                        "Cold length : 7.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 3:
                text = "Cold Damage : 5-8 \n" +
                        "Cold length : 8.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 4:
                text = "Cold Damage : 6-9 \n" +
                        "Cold length : 10.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 5:
                text = "Cold Damage : 7-11 \n" +
                        "Cold length : 11.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 6:
                text = "Cold Damage : 8-12 \n" +
                        "Cold length : 13 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 7:
                text = "Cold Damage : 9-14 \n" +
                        "Cold length : 14.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 8:
                text = "Cold Damage : 10-15 \n" +
                        "Cold length : 15.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 9:
                text = "Cold Damage : 12-18 \n" +
                        "Cold length : 17.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 10:
                text = "Cold Damage : 14-20 \n" +
                        "Cold length : 18.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 11:
                text = "Cold Damage : 16-23 \n" +
                        "Cold length : 20 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 12:
                text = "Cold Damage : 18-25 \n" +
                        "Cold length : 21.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 13:
                text = "Cold Damage : 20-28 \n" +
                        "Cold length : 22.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 14:
                text = "Cold Damage : 22-30 \n" +
                        "Cold length : 24.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 15:
                text = "Cold Damage : 24-33 \n" +
                        "Cold length : 25.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 16:
                text = "Cold Damage : 26-35 \n" +
                        "Cold length : 27 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 17:
                text = "Cold Damage : 29-39 \n" +
                        "Cold length : 28.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 18:
                text = "Cold Damage : 32-42 \n" +
                        "Cold length : 29.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 19:
                text = "Cold Damage : 35-46 \n" +
                        "Cold length : 31.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 20:
                text = "Cold Damage : 38-49 \n" +
                        "Cold length : 32.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
        }
        return text;
    }

    String FrozenOrbValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Cold Damage : 3-5 \n" +
                        "Cold length : 6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 2:
                text = "Cold Damage : 4-6 \n" +
                        "Cold length : 7.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 3:
                text = "Cold Damage : 5-8 \n" +
                        "Cold length : 8.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 4:
                text = "Cold Damage : 6-9 \n" +
                        "Cold length : 10.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 5:
                text = "Cold Damage : 7-11 \n" +
                        "Cold length : 11.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 6:
                text = "Cold Damage : 8-12 \n" +
                        "Cold length : 13 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 7:
                text = "Cold Damage : 9-14 \n" +
                        "Cold length : 14.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 8:
                text = "Cold Damage : 10-15 \n" +
                        "Cold length : 15.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 9:
                text = "Cold Damage : 12-18 \n" +
                        "Cold length : 17.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 10:
                text = "Cold Damage : 14-20 \n" +
                        "Cold length : 18.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 11:
                text = "Cold Damage : 16-23 \n" +
                        "Cold length : 20 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 12:
                text = "Cold Damage : 18-25 \n" +
                        "Cold length : 21.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 13:
                text = "Cold Damage : 20-28 \n" +
                        "Cold length : 22.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 14:
                text = "Cold Damage : 22-30 \n" +
                        "Cold length : 24.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 15:
                text = "Cold Damage : 24-33 \n" +
                        "Cold length : 25.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 16:
                text = "Cold Damage : 26-35 \n" +
                        "Cold length : 27 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 17:
                text = "Cold Damage : 29-39 \n" +
                        "Cold length : 28.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 18:
                text = "Cold Damage : 32-42 \n" +
                        "Cold length : 29.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 19:
                text = "Cold Damage : 35-46 \n" +
                        "Cold length : 31.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 20:
                text = "Cold Damage : 38-49 \n" +
                        "Cold length : 32.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
        }
        return text;
    }

    String ColdMasteryValues(int level) {
        String text = null;
        switch (level) {
            case 0:
                text = "";
                break;
            case 1:
                text = "Cold Damage : 3-5 \n" +
                        "Cold length : 6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 2:
                text = "Cold Damage : 4-6 \n" +
                        "Cold length : 7.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 3:
                text = "Cold Damage : 5-8 \n" +
                        "Cold length : 8.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 4:
                text = "Cold Damage : 6-9 \n" +
                        "Cold length : 10.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 5:
                text = "Cold Damage : 7-11 \n" +
                        "Cold length : 11.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 6:
                text = "Cold Damage : 8-12 \n" +
                        "Cold length : 13 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 7:
                text = "Cold Damage : 9-14 \n" +
                        "Cold length : 14.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 8:
                text = "Cold Damage : 10-15 \n" +
                        "Cold length : 15.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 9:
                text = "Cold Damage : 12-18 \n" +
                        "Cold length : 17.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 10:
                text = "Cold Damage : 14-20 \n" +
                        "Cold length : 18.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 11:
                text = "Cold Damage : 16-23 \n" +
                        "Cold length : 20 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 12:
                text = "Cold Damage : 18-25 \n" +
                        "Cold length : 21.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 13:
                text = "Cold Damage : 20-28 \n" +
                        "Cold length : 22.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 14:
                text = "Cold Damage : 22-30 \n" +
                        "Cold length : 24.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 15:
                text = "Cold Damage : 24-33 \n" +
                        "Cold length : 25.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 16:
                text = "Cold Damage : 26-35 \n" +
                        "Cold length : 27 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 17:
                text = "Cold Damage : 29-39 \n" +
                        "Cold length : 28.4 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 18:
                text = "Cold Damage : 32-42 \n" +
                        "Cold length : 29.8 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 19:
                text = "Cold Damage : 35-46 \n" +
                        "Cold length : 31.2 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
            case 20:
                text = "Cold Damage : 38-49 \n" +
                        "Cold length : 32.6 seconds \n" +
                        "Mana cost : 3 \n\n" +
                        "Ice Bolt receives bonuses from: \n\n" +
                        "Frost Nova: + 15% Cold damage per level \n\n" +
                        "Ice Blast: + 15% Cold damage per level \n\n" +
                        "Glacial Spike: + 15% Cold damage per level \n\n" +
                        "Blizzard: + 15% Cold damage per level \n\n" +
                        "Frozen Orb: + 15% Cold damage per level \n\n";
                break;
        }
        return text;
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
        Intent intent = new Intent(this, Sorceress.class);
        StartActivity(intent);
        Toast.makeText(this, "Sorceress", Toast.LENGTH_SHORT).show();
    }

    void StartActivity(Intent intent) {
        startActivity(intent);
    }
}