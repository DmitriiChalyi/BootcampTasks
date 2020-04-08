package Episode4p1.task5;

public class CloneTroopers {
    private static int cloneCount = 0;

    public CloneTroopers() {
        cloneCount++;
    }

    public static int getCloneCount() {
        return CloneTroopers.cloneCount;
    }

    public static void setCloneCount(int cloneCount) {
        CloneTroopers.cloneCount = cloneCount;
    }

    public static void main(String[] args) {

    }
}
 /*   Добавьте в класс метод getCloneCount.
        Метод getCloneCount должен возвращать int.
        Метод getCloneCount должен возвращать значение переменной cloneCount.
        Добавьте в класс метод setCloneCount, принимающий int.
        Метод setCloneCount ничего не должен возвращать.
        Метод setCloneCount должен присваивать переменной cloneCount переданное значение. */