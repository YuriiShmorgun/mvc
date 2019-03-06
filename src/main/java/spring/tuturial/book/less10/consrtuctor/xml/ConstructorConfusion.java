package spring.tuturial.book.less10.consrtuctor.xml;

public class ConstructorConfusion implements MessageProvider {

    private String someValue;

    @Override
    public String getMessage() {
        return someValue;
    }



    public ConstructorConfusion(String someStringValue) {
        System.out.println("String");
        this.someValue = someStringValue;
    }
    public ConstructorConfusion(Integer someIntValue) {
        System.out.println("Integer");
        this.someValue = someIntValue.toString();
    }



    
}
