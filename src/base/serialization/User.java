package base.serialization;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String Password;

    public User(String name, String password) {
        this.name = name;
        Password = password;
    }
    public void sayHello(){
        System.out.println("Username is " + name);
    }
}
