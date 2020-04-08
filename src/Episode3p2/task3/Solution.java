package Episode3p2.task3;

public class Solution {
    public static void main(String[] args) {
        Jedi yoda = new Jedi("Yoda", 900, 66, "russian");
        Jedi qui = new Jedi("Qui-Gon", 60, 193, "human");
        Jedi obi = new Jedi("Obi-Wan", 57, 182, "human");

    }
    public static class Jedi {
        private String name;
        private int age;
        private String race;
        private int height;
        public Jedi(String name, int age, int height, String race) {
            this.name = name;
            this.age = age;
            this.race = race;
            this.height = height;
        }
    }
}
