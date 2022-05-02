package com.itsrv23.hw.schools;

import com.itsrv23.hw.Hogwarts;
import com.itsrv23.hw.MagicSchool;

import java.util.Objects;

public class Griffindor extends Hogwarts {
    private int blagorodstvo;
    private int chest;
    private int hrabrozt;

    public Griffindor(String fullName, String sex, int yearOld, Integer magicPower, Integer trancgressivPower, int blagorodstvo, int chest, int hrabrozt) {
        super(MagicSchool.GRYFFINDOR, fullName, sex, yearOld, magicPower, trancgressivPower);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrozt = hrabrozt;
        checkCheater(blagorodstvo, chest, hrabrozt);
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public void setBlagorodstvo(int blagorodstvo) {
        checkCheater(blagorodstvo);
        this.blagorodstvo = blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        checkCheater(chest);
        this.chest = chest;
    }

    public int getHrabrozt() {
        return hrabrozt;
    }

    public void setHrabrozt(int hrabrozt) {
        checkCheater(hrabrozt);
        this.hrabrozt = hrabrozt;
    }

    public void printSkills() {
        System.out.println(super.getSkills() + getSkills());
    }

    @Override
    public String getSkills() {
        return ", благородство=" + blagorodstvo + ", честь=" + chest + ", храбрость=" + hrabrozt;
    }

    @Override
    public String toString() {
        return super.toString() + ", благородство=" + blagorodstvo + ", честь=" + chest + ", храбрость=" + hrabrozt;
    }

    @Override
    public int getSumSkills() {
        return super.getSumSkills() + blagorodstvo + chest + hrabrozt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Griffindor that = (Griffindor) o;
        return blagorodstvo == that.blagorodstvo && chest == that.chest && hrabrozt == that.hrabrozt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), blagorodstvo, chest, hrabrozt);
    }
}
