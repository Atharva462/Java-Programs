import java.util.ArrayList;
import java.util.Iterator;

public class StringListDemo {

    private ArrayList<String> stringList = new ArrayList<>();

    // Method to add a string to the list
    public void addString(String str) {
        stringList.add(str);
    }

    // Method to print all strings using an Iterator
    public void printAll() {
        Iterator<String> iterator = stringList.iterator();
        System.out.println("Elements in the list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Main method to test
    public static void main(String[] args) {
        StringListDemo demo = new StringListDemo();

        demo.addString("Apple");
        demo.addString("Banana");
        demo.addString("Cherry");

        demo.printAll();
    }
}
