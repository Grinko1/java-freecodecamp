package base.files;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/nadagrinko/Desktop/java/freecodecmp/src/base/files/text");
        System.out.println(file.getPath());
        if(file.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File doesn't exist");
        }

    }
}
