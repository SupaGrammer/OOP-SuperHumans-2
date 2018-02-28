package Superpowers;

public class Thor extends SuperHuman implements Weapons, Allegiance, Abilities, CatchPhrase{

    @Override
    public boolean canFly() {
        return true;
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
        return true;
    }

    @Override
    public boolean withIlluminati() {
        return false;
    }

    @Override
    public boolean withXmen() {
        return false;
    }

    @Override
    public boolean usesHammer() {
        return true;
    }

    @Override
    public boolean usesClaws() {
        return false;
    }

    @Override
    public String sayCatchPhrase() {
        return "Odins beard!";
    }
}
