package ra.academy.dto;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserDto {

    private String name;
    private  String email;
    private int age;
    private String birthday;
    private String slogan;

    public UserDto( String name, String email, int age, String birthday, String slogan) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.birthday = birthday;
        this.slogan = slogan;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
