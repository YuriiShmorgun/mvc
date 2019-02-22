package java8.streams.learn;

import java.util.LinkedList;
import java.util.List;

public class Switcher {

    private List <ElectricityConsumer> consumers = new LinkedList<>();

    public void addElectricityListener (ElectricityConsumer electricityConsumer) {
        consumers.add(electricityConsumer);
    }

    public void removeElectricityListener (ElectricityConsumer electricityConsumer) {
        consumers.remove(electricityConsumer);
    }

    public void switchon(){
        System.out.println("Выключатель включен");
        for (ElectricityConsumer consumer: consumers)
            if (consumer != null){
                consumer.electricityOn(this);
            }
    }
}
