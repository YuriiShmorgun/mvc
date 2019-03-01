package spring.tuturial.book.less9.annotation;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service("injectSimple123")
@Qualifier("QBean")
public class InjectSimple {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    @Value("Yurii")
    public void setName(String name) {
        this.name = name;
    }

    @Value("22")
    public void setAge(int age) {
        this.age = age;
    }

    @Value("180")
    public void setHeight(float height) {
        this.height = height;
    }

    @Value("true")
    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "InjectSimple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                '}';
    }
}
