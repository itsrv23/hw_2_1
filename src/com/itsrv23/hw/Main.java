package com.itsrv23.hw;

import com.itsrv23.hw.schools.*;
import com.itsrv23.hw.schools.Kogtevran;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static String DELEMITER= ("-").repeat(50);
    public static void main(String[] args) {
        /* Сорян за название переменных, не хотел тратить кучу времени на перевод */
        Griffindor g1 = new Griffindor("Гарри Поттер", "f",18,21,100,1, 2, 3 );
        Griffindor g2 = new Griffindor("Гермиона Грейнджер", "m",19,100,100,3, 2, 1 );
        Griffindor g3 = new Griffindor("Рон Уизли", "f",18,100,5,100, 5, 5 );
        Griffindor g4 = new Griffindor("Царь Иван Грозный", "f",50,100,100,100, 100, 100 );
        Griffindor g5 = new Griffindor("Василий Царевич", "f",15,50,5,100, 5, 5 );
        List<Griffindor> listGriffindor =  new ArrayList<>();
        listGriffindor.add(g1);
        listGriffindor.add(g2);
        listGriffindor.add(g3);
        listGriffindor.add(g4);
        listGriffindor.add(g5);
        //--------------------------------------------------------//
        Puffendyi p1 = new Puffendyi("Захария Смит","m" ,25,100,100,0, 0, 0 );
        Puffendyi p2 = new Puffendyi("Седрик Диггори","f",35, 50,100,0, 0, 0 );
        Puffendyi p3 = new Puffendyi("Джастин Финч-Флетчли","f",16, 100,100,0, 0, 0 );
        List<Puffendyi> listPuffendyi =  new ArrayList<>();
        listPuffendyi.add(p1);
        listPuffendyi.add(p2);
        listPuffendyi.add(p3);
        //--------------------------------------------------------//
        Kogtevran k1 = new Kogtevran("Чжоу Чанг","m" ,25, 100,100,50, 0, 0,0 );
        Kogtevran k2 = new Kogtevran("Падма Патил","f" ,25, 100,100,0, 0, 0,0 );
        Kogtevran k3 = new Kogtevran("Маркус Белби","m" ,25, 100,100,50, 0, 0,0 );

        List<Kogtevran> listKogtevran =  new ArrayList<>();
        listKogtevran.add(k1);
        listKogtevran.add(k2);
        listKogtevran.add(k3);
        //--------------------------------------------------------//
        Slizerin s1 = new Slizerin("Драко Малфой","m" ,25, 100,100,0, 0, 0,0,0);
        Slizerin s2 = new Slizerin("Грэхэм Монтегю","m" ,25, 100,100,0, 0, 0,0,0);
        Slizerin s3 = new Slizerin("Грегори Гойл","m" ,25, 100,100,0, 0, 0,0,0);
        List<Slizerin> listSlizerin =  new ArrayList<>();
        listSlizerin.add(s1);
        listSlizerin.add(s2);
        listSlizerin.add(s3);
        //--------------------------------------------------------//
        Hogwarts.printAllStudents(listGriffindor);
        System.out.println(DELEMITER);
        Hogwarts.printAllStudents(listPuffendyi);
        System.out.println(DELEMITER);
        Hogwarts.printAllStudents(listKogtevran);
        System.out.println(DELEMITER);
        Hogwarts.printAllStudents(listSlizerin);
        System.out.println(DELEMITER);

        System.out.println("Сделайте метод, который выводит на экран описание студента. В описание надо включать качества,\n" +
                "которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.");
        System.out.println(g1);
        System.out.println(p1);
        System.out.println(k1);
        System.out.println(s1);

        System.out.println(DELEMITER);
        System.out.println("Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам. " +
                "У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета. ");
        System.out.println("DNRY ))");
        Hogwarts.compareToAllSkills(g1,p1);
        System.out.println(DELEMITER);
        Hogwarts.compareToAllSkills(p1,s1);
        System.out.println(DELEMITER);
        Hogwarts.compareToMagicPower(g1,p2);
        System.out.println(DELEMITER);
        Hogwarts.compareToTransgressiv(g1,p2);
        System.out.println(DELEMITER);
        // раз уже сделал листы, не пропадать же им...
        Hogwarts.compareToSchools(new ArrayList<>(listGriffindor), new ArrayList<>(listGriffindor));
        System.out.println(DELEMITER);
        Hogwarts.compareToSchools(new ArrayList<>(listGriffindor), new ArrayList<>(listSlizerin));
        System.out.println(DELEMITER);
        Hogwarts.compareToSchools(new ArrayList<>(listKogtevran), new ArrayList<>(listPuffendyi));
        System.out.println(DELEMITER);
        System.out.println(DELEMITER);
        System.out.println(DELEMITER);

        //****************************************************************************************************//

        //map
        listGriffindor.stream().map( e -> e.getFullName().toUpperCase(Locale.ROOT)).forEach(System.out::println);
        List<Griffindor> listGoGoGo = listGriffindor.stream()
                .filter(e -> e.getSex().equals("m") && e.getYearOld() >= 18)
                .peek((e) -> {System.out.print("Совершеннолетние девушки идут на взлет ...");
                    e.doTransgressiv();
                }).collect(Collectors.toList());

        List<Griffindor> listGoGoGGo = listGriffindor.stream()
                .filter(e -> e.getSex().equals("f") && e.getYearOld() >= 18)
                .peek((e) -> {System.out.print("Совершеннолетние мальчики идут на взлет ... и гонятся за Гермионой...");
                    e.doTransgressiv();
                }).collect(Collectors.toList());
        System.out.println(DELEMITER);
        // сортировка
        listGoGoGGo.stream()
                .sorted(Comparator.comparing(Hogwarts::getFullName))
                .forEach(System.out::println);

        System.out.println(DELEMITER);
        listGoGoGGo.stream().sorted(Comparator.comparingInt(Hogwarts::getYearOld)).forEach(System.out::println);
        System.out.println(DELEMITER);
        System.out.println("Сортируем по общим скилам. Первым будет Царь)");
        listGriffindor.stream().sorted(Comparator.comparingInt(Hogwarts::getSumSkills).reversed()).forEach(System.out::println);

        System.out.println(DELEMITER);

        /* Группируем получаем Map*/
        Map<String, List<Griffindor>> collectBySex = listGriffindor.stream().collect(Collectors.groupingBy(Hogwarts::getSex));

        collectBySex.get("f").forEach(System.out::println);

        System.out.println(DELEMITER);
        // Mix / Max

        Griffindor griffindorMinYearsOld = listGriffindor.stream().min(Comparator.comparingInt(Hogwarts::getYearOld)).get();
        System.out.println("min: " + griffindorMinYearsOld);

        Griffindor griffindorMaxYearsOld = listGriffindor.stream().min(Comparator.comparingInt(Hogwarts::getYearOld).reversed()).get();
        System.out.println("max: " + griffindorMaxYearsOld);

        System.out.println("average getYearOld = " + listGriffindor.stream().mapToDouble(Hogwarts::getYearOld).average().getAsDouble());
        System.out.println("Sum getYearOld = " + listGriffindor.stream().mapToInt(Hogwarts::getYearOld).sum());
        System.out.println("Count getYearOld = " + listGriffindor.stream().mapToInt(Hogwarts::getYearOld).count());
    }
}
