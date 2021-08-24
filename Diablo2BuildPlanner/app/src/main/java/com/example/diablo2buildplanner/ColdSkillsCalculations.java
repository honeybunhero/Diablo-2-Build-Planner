package com.example.diablo2buildplanner;

public class ColdSkillsCalculations {

    public int IceBoltMin(int min, int frostNova, int iceBlast, int glacialSpike, int blizzard, int frozenOrb) {

        min = (int) (min + (min * (frostNova * .15))  + (min * (iceBlast * .15)) + (min * (glacialSpike * .15)) + (min * (blizzard * .15)) + (min * (frozenOrb * .15)));
        return min;
    }
    public int IceBoltMax(int max, int frostNova, int iceBlast, int glacialSpike, int blizzard, int frozenOrb) {

        max = (int) (max + (max * (frostNova * .15))  + (max * (iceBlast * .15)) + (max * (glacialSpike * .15)) + (max * (blizzard * .15)) + (max * (frozenOrb * .15)));
        return max;
    }
}
