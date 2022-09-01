public class TelevisionClient {

    public static void main(String[] args) {

        Television tv1 = new Television();
        tv1.brand = "Zenith";
        tv1.volume = 25;

        Television tv2 = new Television();
        tv2.brand = "RCA";
        tv2.volume = 10;

        tv1.turnOn();
        tv1.turnOff();

        tv2.turnOn();
        tv2.turnOff();

    }
}
