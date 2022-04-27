package com.itsrv23.hw;

public enum MagicSchool {
    GRYFFINDOR("Гриффиндор",1),
    PUFFENDYI("Пуффендуй",2),
    KOGTEVRAN("Когтевран",3),
    SLIZERIN("Слизерин",4);

    private final String name;
    private final Integer id;

    MagicSchool(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
