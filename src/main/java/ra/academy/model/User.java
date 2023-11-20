package ra.academy.model;


import java.sql.Date;

public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private Date birthday;
    private String avatar;
    private String slogan;

    public User( String name, String email, int age, Date birthday, String avatar, String slogan) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.birthday = birthday;
        this.avatar = avatar;
        this.slogan = slogan;
    }

    public User() {
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
