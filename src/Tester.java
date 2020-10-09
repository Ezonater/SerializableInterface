import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Tester {
    public static void main(String[] args) {
        Dog d = new Dog("Luna", 9, 38.5);
        Dog f = new Dog("Funa", 10, 302.6);
        Dog g = new Dog("Bruna", 15, 23.6);

        Dog[] dogArray = new Dog[]{d,f,g};
        try {
            File dogFile = new File("SavedDogs.txt");
            FileOutputStream fos = new FileOutputStream(dogFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dogArray);
            oos.close();
        } catch (Exception e) {
            System.out.println("Something bad happened.");
            System.exit(0);
        }
    }
}
