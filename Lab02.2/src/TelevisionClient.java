public class TelevisionClient {

    public static void main(String[] args) {

        Television tv1 = new Television();
        tv1.setBrand("Toshiba");
        tv1.setVolume(125);
        tv1.setDisplay(DisplayType.CRT);
        tv1.turnOn();
        tv1.turnOff();
        System.out.println(tv1);

        System.out.printf("%d television instances created%n", Television.getInstanceCount());

        Television tv2 = new Television("Sony", 50);
        tv2.turnOn();
        tv2.turnOff();
        System.out.println(tv2);

        System.out.printf("%d television instances created%n", Television.getInstanceCount());

        Television tv3 = new Television("LG");
        System.out.println(tv3);

        System.out.printf("%d television instances created%n", Television.getInstanceCount());

        Television tv4 = new Television("Samsung", 99, DisplayType.OLED);
        System.out.println(tv4);

        System.out.printf("%d television instances created%n", Television.getInstanceCount());

        DisplayType.CRT.equals(DisplayType.OLED);

    }

}
