package Episode3p2.task8;

class Enemy {
    String name;
    int count;
    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        System.out.println("Enemy name: \"" + enemy.name + "\"\nCount of midichlorians: " + enemy.count);
    }
    Enemy(String n, int j) {
        name = n;
        count = j;
    }
    Enemy(int i) {
        this("Anakin Skywalker", i);
    }
    Enemy() {
        this(20000);
    }
}
