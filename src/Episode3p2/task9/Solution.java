package Episode3p2.task9;

public class Solution {
    public static void main(String[] args) {
        Jedi aa = new Jedi ("diman", 22);
        System.out.println("light side force:\n" + aa.name + aa.sideforce);
        Jedi ab = new Jedi ("yoda", 22);
        System.out.println(ab.name);
        Jedi ac = new Jedi  ("Anakin", 26, "dark");
        System.out.println("\ndark side force:\n" + ac.name);
    }
    static class Jedi {
        String name;
        int age;
        int midichlorians;
        String homeworld;
        String species;
        String sideforce = "light";

        public Jedi(String name, int age) {
            this.name = name;
            this.age = age;
            this.sideforce = sideforce;
        }

        public Jedi(String name, int age, String sideforce) {
            this.name = name;
            this.age = age;
            this.sideforce = sideforce;
        }

        public Jedi(String name, int age, int midichlorians, String homeworld, String species){
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
            this.species = species;
        }
    }
}