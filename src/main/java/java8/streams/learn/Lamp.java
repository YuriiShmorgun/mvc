package java8.streams.learn;

public class Lamp implements ElectricityConsumer{

    public void lightOn(){
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object o) {
        lightOn();
    }
}
