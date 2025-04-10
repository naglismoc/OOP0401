package org.example;

public class ForestElf extends Elf implements Christmas{
    private int tame;

    public int getTame() {
        return tame;
    }

    public void setTame(int tame) {
        this.tame = tame;
    }

    @Override
    public void throwSnowBall() {
        System.out.println("swoosh!");
    }

    @Override
    public void lookForPresents() {
        System.out.println("yey! Found another bugatti!");
    }
}
