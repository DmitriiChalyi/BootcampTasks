package Episode3p2.task7;

public class Tunnel {
    private int centerX, centerY, radius, width;

    public void initialize(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }


    public static void main(String[] args) {

    }
}


/*

Создать класс Tunnel, с тремя инициализаторами:

- centerX, centerY
- centerX, centerY, radius
- centerX, centerY, radius, width

У класса Tunnel должны быть переменные centerX, centerY, radius, width с типом int.
У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY и инициализирующий соответствующие переменные класса.
У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius и инициализирующий соответствующие переменные класса.
У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
 */