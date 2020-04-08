package Episode3p2.task6;

public class Droid {
    String name;
    String model;

    public static class Constructor1 extends Droid {

        public Constructor1(String name) {
            this.name = name;
        }
    }
    public static class Constructor2 extends Droid {

        public Constructor2(String name, String model) {
            this.name = name;
            this.model = model;
        }
    }
    public static void main(String[] args) {
    }
}

/*
У класса Droid должна быть переменная name с типом String.
У класса Droid должна быть переменная model с типом String.
У класса должен быть конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
У класса должен быть конструктор, принимающий в качестве параметров имя, модель и инициализирующий соответствующие переменные класса.
 */