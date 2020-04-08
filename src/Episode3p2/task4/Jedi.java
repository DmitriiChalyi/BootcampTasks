package Episode3p2.task4;

public class Jedi {
    private String name;
    private int count;
    private String weapon;

    public void initialize (String name){
        this.name = name;
    }
    public void initialize (String name, int count){
        this.name = name;
        this.count = count;
    }
    public void initialize (String name, int count, String weapon){
        this.name = name;
        this.count = count;
        this.weapon = weapon;
    }


    public static void main(String[] args) {
    }
}

/*
    Программа не должна считывать данные с клавиатуры.
        У класса Jedi должна быть переменная name с типом String.
        У класса Jedi должна быть переменная count с типом int.
        У класса Jedi должна быть переменная weapon с типом String.
        У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
        У класса должен быть метод initialize, принимающий в качестве параметров имя, число ран и инициализирующий соответствующие переменные класса.
        У класса должен быть метод initialize, принимающий в качестве параметров имя, число ран, тип оружия и инициализирующий соответствующие переменные класса.*/