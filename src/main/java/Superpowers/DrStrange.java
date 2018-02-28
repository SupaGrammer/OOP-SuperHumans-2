package Superpowers;

public class DrStrange extends SuperHuman implements Weapons, Allegiance, Abilities{
    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean hasInvulnerability() {
        return false;
    }

    @Override
    public boolean hasSuperStrength() {
        return false;
    }

    @Override
    public boolean hasOccularPowers() {
        return true;
    }

    @Override
    public boolean withAvengers() {
        return false;
    }

    @Override
    public boolean withIlluminati() {
        return true;
    }

    @Override
    public boolean withXmen() {
        return false;
    }

    @Override
    public boolean usesHammer() {
        return false;
    }

    @Override
    public boolean usesClaws() {
        return false;
    }
}
