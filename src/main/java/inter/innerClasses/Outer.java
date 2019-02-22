package inter.innerClasses;

public class Outer {
    class Inner {
        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
