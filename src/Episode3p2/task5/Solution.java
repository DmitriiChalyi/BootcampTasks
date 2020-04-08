package Episode3p2.task5;

public class Solution {
    public static void main(String[] args) {
        Jedi jedi = new Jedi(); // создание объекта Jedi и занесение ссылки в переменную jedi.
        jedi.initialize("Obi-Wan Kenobi", 29, 50);
    }

    static class Jedi { // создание класса Jedi
        String name;
        int age;
        int midichlorians;

        public void initialize(String name, int age, int midichlorians) { // добавление и инициализация метода
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
        }
    }
}
/*
1. Создать class Jedi. У джедая должно быть имя String name, возраст int age, уровень мидихлориан int midichlorians. 

        2. Добавить метод initialize(String name, int age, int midichlorians), в котором необходимо
        проинициализировать переменные name, age, midichlorians.

         3. В методе main создать объект Jedi и занести его ссылку в переменную jedi.

         4. Чтобы убедиться, что все работает, необходимо вызовать метод initialize с любыми значениями.*/