package com.itsrv23.hw.schools;

import com.itsrv23.hw.Hogwarts;
import com.itsrv23.hw.MagicSchool;

import java.util.Objects;

public class Slizerin extends Hogwarts {
    private int hitrost;
    private int reshitelnost;
    private int ambicioznost;
    private int nahodchivost;
    private int jajdaVlasti;
    /* присущи хитрость, решительность, амбициозность, находчивость и жажда власти.*/


    public Slizerin(String fullName, String sex, int yearOld, Integer magicPower, Integer trancgressivPower, int hitrost, int reshitelnost, int ambicioznost, int nahodchivost, int jajdaVlasti) {
        super(MagicSchool.SLIZERIN, fullName, sex, yearOld, magicPower, trancgressivPower);
        this.hitrost = hitrost;
        this.reshitelnost = reshitelnost;
        this.ambicioznost = ambicioznost;
        this.nahodchivost = nahodchivost;
        this.jajdaVlasti = jajdaVlasti;
        checkCheater(hitrost, reshitelnost, ambicioznost, nahodchivost, jajdaVlasti);
    }

    public int getHitrost() {
        return hitrost;
    }

    public void setHitrost(int hitrost) {
        checkCheater(hitrost);
        this.hitrost = hitrost;
    }

    public int getReshitelnost() {
        return reshitelnost;
    }

    public void setReshitelnost(int reshitelnost) {
        checkCheater(reshitelnost);
        this.reshitelnost = reshitelnost;
    }

    public int getAmbicioznost() {
        return ambicioznost;
    }

    public void setAmbicioznost(int ambicioznost) {
        checkCheater(ambicioznost);
        this.ambicioznost = ambicioznost;
    }

    public void printSkills() {
        System.out.println(super.getSkills() + getSkills());
    }

    @Override
    public String getSkills() {
        return ", хитрость=" + hitrost + ", решительность=" + reshitelnost + ", амбициозность="
                + ambicioznost + ", находчивость=" + nahodchivost + ", жажда власти=" + jajdaVlasti;
    }

    @Override
    public String toString() {
        return super.toString() + ", хитрость=" + hitrost + ", решительность=" + reshitelnost + ", амбициозность="
                + ambicioznost + ", находчивость=" + nahodchivost + ", жажда власти=" + jajdaVlasti;
    }

    @Override
    public int getSumSkills() {
        return super.getSumSkills() + hitrost + reshitelnost + ambicioznost + nahodchivost + jajdaVlasti;
    }

    public int getNahodchivost() {
        return nahodchivost;
    }

    public void setNahodchivost(int nahodchivost) {
        checkCheater(nahodchivost);
        this.nahodchivost = nahodchivost;
    }

    public int getJajdaVlasti() {
        return jajdaVlasti;
    }

    public void setJajdaVlasti(int jajdaVlasti) {
        checkCheater(jajdaVlasti);
        this.jajdaVlasti = jajdaVlasti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slizerin slizerin = (Slizerin) o;
        return hitrost == slizerin.hitrost && reshitelnost == slizerin.reshitelnost && ambicioznost == slizerin.ambicioznost && nahodchivost == slizerin.nahodchivost && jajdaVlasti == slizerin.jajdaVlasti;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hitrost, reshitelnost, ambicioznost, nahodchivost, jajdaVlasti);
    }
}
