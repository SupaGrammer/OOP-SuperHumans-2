package Superpowers;

public class Wolverine extends SuperHuman implements Weapons, Allegiance, Abilities{

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean hasInvulnerability() {
        return true;
    }

    @Override
    public boolean hasSuperStrength() {
        return true;
    }

    @Override
    public boolean hasOccularPowers() {
        return false;
    }

    @Override
    public boolean withAvengers() {
        return false;
    }

    @Override
    public boolean withIlluminati() {
        return false;
    }

    @Override
    public boolean withXmen() {
        return true;
    }

    @Override
    public boolean usesHammer() {
        return false;
    }

    @Override
    public boolean usesClaws() {
        return true;
    }
}
