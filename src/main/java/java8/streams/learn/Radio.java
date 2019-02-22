package java8.streams.learn;

public class Radio implements ElectricityConsumer{
    public void playMusic(){
        System.out.println("Радио играет");
    }

    @Override
    public void electricityOn(Object o) {
        playMusic();
    }
}
