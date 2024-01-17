package base.files.new_file;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("poem");
            file.write("Roses are red\nviolets are blue\nbla bla bla\nnew line");
            file.append("\npoem end");
            file.close();
        }catch(IOException e){
            System.out.println("Failed to create new file");
        }

    }
}
