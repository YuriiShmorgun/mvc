package java8.streams.learn;

public class Program {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();

        //event subscribe
        sw.addElectricityListener(lamp);

        sw.addElectricityListener(new Radio());

        sw.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn(Object o) {
                System.out.println("Новый потребитель");
            }
        });

        sw.addElectricityListener( (x)-> System.out.println("Лямбда потребитель"));

        sw.switchon();
    }
}
