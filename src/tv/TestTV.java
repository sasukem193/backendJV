package tv;

public class TestTV {
    public static void main(String[] args) {

        TV tv1= new TV();
        tv1.turnOn();
        tv1.setChanel(20);
        tv1.chanelDown();
        tv1.setVolume(3);

        TV tv2= new TV();
        tv2.turnOn();
        tv2.chanelUp();
        tv2.volumeUp();
        System.out.println("Chanel TV1: "+tv1.chanel+" Volume: "+tv1.volume);
        System.out.println("Chanel TV2: "+tv2.chanel+" Volume: "+tv2.volume);
    }

}
