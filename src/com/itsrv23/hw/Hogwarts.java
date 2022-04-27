package com.itsrv23.hw;

import java.util.List;
import java.util.Objects;

public abstract class Hogwarts {
    private final MagicSchool school;
    private final String fullName;
    private final String sex;
    private final int yearOld;
    private Integer magicPower;
    private Integer transgressivPower;

    public Hogwarts(MagicSchool school, String fullName, String sex, int yearOld, Integer magicPower, Integer trancgressivPower) {
        this.school = school;
        this.fullName = fullName;
        this.sex = sex;
        this.yearOld = yearOld;
        this.magicPower = magicPower;
        this.transgressivPower = trancgressivPower;
        checkCheater(magicPower, trancgressivPower);
    }

    public static void checkCheater(int... i) {
        for (int e : i) {
            if (e < 0 || e > 100) {
                throw new IllegalArgumentException();
            }
        }
    }



    public String getFullName() {
        return fullName;
    }

    public Integer getMagicPower() {
        return magicPower;
    }


    public Integer getTransgressivPower() {
        checkCheater(transgressivPower);
        return transgressivPower;
    }


    public String getSex() {
        return sex;
    }



    public void doTransgressiv() {
        System.out.println(fullName + " трансгрессирует на: " + magicPower);
    }

    public void doMagic() {
        System.out.println(fullName + " колданул на: " + magicPower);
    }

    @Override
    public String toString() {
        return "Школа=" + school +
                ", величать='" + fullName + '\'' +
                ", годиков='" + yearOld + '\'' +
                ", пол='" + (sex.equals("f")?"мужской":"женский") + '\'' +
                ", сила магии=" + magicPower +
                ", сила трансгрессии=" + transgressivPower
                ;
    }

    public String getSkills() {
        return "сила магии=" + magicPower + ", сила трансгрессии=" + transgressivPower;
    }

    public int getSumSkills() {
        return magicPower + transgressivPower;
    }

    public static void printAllStudents(List<?> list) {
        list.forEach(System.out::println);
    }

    public static void compareToAllSkills(Hogwarts s1, Hogwarts s2) {
        System.out.println("Сравнение учеников по всем скилам");
        if (s1.getSumSkills() > s2.getSumSkills()) {
            System.out.println("Победил ученик: " + s1.getFullName() + " сумма: " + s1.getSumSkills());
        } else if (s1.getSumSkills() < s2.getSumSkills()) {
            System.out.println("Победил ученик: " + s2.getFullName() + " сумма: " + s2.getSumSkills());
        } else {
            System.out.println("Ученики равны");
        }
        System.out.println(s1 + " сумма: " + s1.getSumSkills() + "\n"
                + s2 + " сумма: " + s2.getSumSkills());

    }

    public static void compareToMagicPower(Hogwarts s1, Hogwarts s2) {
        System.out.println("Сравнение учеников по магии");
        if (s1.getMagicPower() > s2.getMagicPower()) {
            System.out.println("Победил ученик: " + s1.getFullName() + " сила магии: " + s1.getMagicPower());
        } else if (s1.getMagicPower() < s2.getMagicPower()) {
            System.out.println("Победил ученик: " + s2.getFullName() + " сила магии: " + s2.getMagicPower());
        } else {
            System.out.println("Ученики равны");
        }
        System.out.println(s1 + "\n"
                + s2);

    }

    public static void compareToTransgressiv(Hogwarts s1, Hogwarts s2) {
        System.out.println("Сравнение учеников по трансгрессии");
        if (s1.getTransgressivPower() > s2.getTransgressivPower()) {
            System.out.println("Победил ученик: " + s1.getFullName() + " сила трансгрессии: " + s1.getTransgressivPower());
        } else if (s1.getTransgressivPower() < s2.getTransgressivPower()) {
            System.out.println("Победил ученик: " + s2.getFullName() + " сила трансгрессии: " + s2.getTransgressivPower());
        } else {
            System.out.println("Ученики равны");
        }
        System.out.println(s1 + "\n"
                + s2);

    }

    public static void compareToSchools(List<Hogwarts> l1, List<Hogwarts> l2) {
        System.out.println("Сравнение школ");
        int sumList1 = l1.stream().mapToInt(Hogwarts::getSumSkills).sum();
        int sumList2 = l2.stream().mapToInt(Hogwarts::getSumSkills).sum();
        if (sumList1 > sumList2) {
            System.out.println("Победила школа: " + l1.get(0).school + ". Сила школы: " + sumList1);
        } else if (sumList1 < sumList2) {
            System.out.println("Победила школа: " + l2.get(0).school + ". Сила школы: " + sumList2);
        } else {
            System.out.println("Школы магии равны");
        }

    }


    public int getYearOld() {
        return yearOld;
    }

    public void setMagicPower(Integer magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressivPower(Integer transgressivPower) {
        this.transgressivPower = transgressivPower;
    }

    public MagicSchool getSchool() {
        return school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return yearOld == hogwarts.yearOld && school == hogwarts.school && fullName.equals(hogwarts.fullName) && sex.equals(hogwarts.sex) && magicPower.equals(hogwarts.magicPower) && transgressivPower.equals(hogwarts.transgressivPower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(school, fullName, sex, yearOld, magicPower, transgressivPower);
    }
}
