package com.itsrv23.hw.schools;

import com.itsrv23.hw.Hogwarts;
import com.itsrv23.hw.MagicSchool;

import java.util.Objects;

public class Kogtevran extends Hogwarts {
    private int um;
    private int mudrost;
    private int ostroumie;
    private int tvorchestro;

    public Kogtevran(String fullName, String sex, int yearOld, Integer magicPower, Integer trancgressivPower, int um, int mudrost, int ostroumie, int tvorchestro) {
        super(MagicSchool.KOGTEVRAN, fullName, sex, yearOld, magicPower, trancgressivPower);
        this.um = um;
        this.mudrost = mudrost;
        this.ostroumie = ostroumie;
        this.tvorchestro = tvorchestro;
        checkCheater(um, mudrost, ostroumie, tvorchestro);
    }

    public int getUm() {
        return um;
    }

    public void setUm(int um) {
        checkCheater(um);
        this.um = um;
    }

    public int getMudrost() {
        return mudrost;
    }

    public void setMudrost(int mudrost) {
        checkCheater(mudrost);
        this.mudrost = mudrost;
    }

    public int getOstroumie() {
        return ostroumie;
    }

    public void setOstroumie(int ostroumie) {
        checkCheater(ostroumie);
        this.ostroumie = ostroumie;
    }

    public void printSkills() {
        System.out.println(super.getSkills() + getSkills());
    }

    @Override
    public String getSkills() {
        return ", ум=" + um + ", мудрость=" + mudrost + ", остроумие=" + ostroumie + ", творчество=" + tvorchestro;
    }

    @Override
    public String toString() {
        return super.toString() + ", ум=" + um + ", мудрость=" + mudrost + ", остроумие=" + ostroumie + ", творчество=" + tvorchestro;
    }

    @Override
    public int getSumSkills() {
        return super.getSumSkills() + um + mudrost + ostroumie + tvorchestro;
    }

    public int getTvorchestro() {
        return tvorchestro;
    }

    public void setTvorchestro(int tvorchestro) {
        checkCheater(tvorchestro);
        this.tvorchestro = tvorchestro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kogtevran kogtevran = (Kogtevran) o;
        return um == kogtevran.um && mudrost == kogtevran.mudrost && ostroumie == kogtevran.ostroumie && tvorchestro == kogtevran.tvorchestro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), um, mudrost, ostroumie, tvorchestro);
    }
}
