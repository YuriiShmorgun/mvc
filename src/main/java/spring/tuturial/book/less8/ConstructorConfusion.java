package spring.tuturial.book.less8;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Qualifier("QConstructorConfusion")
public class ConstructorConfusion implements MessageProvider {

    private String message;


    public ConstructorConfusion(String message) {
        System.out.println("ConstructorConfusion(String) called");
        this.message = message;
    }

    @Autowired
    public ConstructorConfusion(@Value("25") Integer integer) {
        System.out.println("ConstructorConfusion(int) called");
        this.message = integer.toString();
    }

    @Override
    public String getMessage() {
        return message;
    }
}
