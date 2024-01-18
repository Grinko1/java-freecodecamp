package base.deserialization;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       User user = null;
       FileInputStream file = new FileInputStream("/Users/nadagrinko/Desktop/java/freecodecmp/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(file);
        user = (User) in.readObject();
        in.close();
        file.close();
        System.out.println(user.name);

    }
}
