import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Resuscitator {
    public static void main(String[] args) {
        try {
            File dogFile = new File("SavedDogs.txt");
            FileInputStream fis = new FileInputStream(dogFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog[] dogArray = (Dog[])ois.readObject();
            for(Dog next : dogArray){
                System.out.println(next);
            }
        } catch (Exception e) {
            System.out.println("Something bad happened.");
            System.exit(0);
        }
    }
}
