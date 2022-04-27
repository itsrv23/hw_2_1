package com.itsrv23.hw.schools;

import com.itsrv23.hw.Hogwarts;
import com.itsrv23.hw.MagicSchool;

import java.util.Objects;

public class Puffendyi extends Hogwarts {

    private int trudolubie;
    private int vernost;
    private int chestnost;

    public Puffendyi(String fullName, String sex, int yearOld, Integer magicPower, Integer trancgressivPower, int trudolubie, int vernost, int chestnost) {
        super(MagicSchool.PUFFENDYI, fullName, sex, yearOld, magicPower, trancgressivPower);
        this.trudolubie = trudolubie;
        this.vernost = vernost;
        this.chestnost = chestnost;
        checkCheater(trudolubie, vernost, chestnost);
    }

    public int getTrudolubie() {
        return trudolubie;
    }

    public void setTrudolubie(int trudolubie) {
        checkCheater(trudolubie);
        this.trudolubie = trudolubie;
    }

    public int getVernost() {
        return vernost;
    }

    public void setVernost(int vernost) {
        checkCheater(vernost);
        this.vernost = vernost;
    }

    public int getChestnost() {
        return chestnost;
    }

    public void setChestnost(int chestnost) {
        checkCheater(chestnost);
        this.chestnost = chestnost;
    }

    public void printSkills() {
        System.out.println(super.getSkills() + getSkills());
    }

    @Override
    public String getSkills() {
        return ", трудолюбие=" + trudolubie + ", верность=" + vernost + ", честность=" + chestnost;
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие=" + trudolubie + ", верность=" + vernost + ", честность=" + chestnost;
    }

    @Override
    public int getSumSkills() {
        return super.getSumSkills() + trudolubie + vernost + chestnost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Puffendyi puffendyi = (Puffendyi) o;
        return trudolubie == puffendyi.trudolubie && vernost == puffendyi.vernost && chestnost == puffendyi.chestnost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trudolubie, vernost, chestnost);
    }
}
