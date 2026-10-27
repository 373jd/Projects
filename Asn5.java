import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        // arraylist for string
        ArrayList<String> items = new ArrayList<String>();

        // arraylist for int 
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // string arraylist items
        items.add("pencil");
        items.add("eraser");
        items.add("paper");
        items.add("laptop");

        // int arraylist numbers
        numbers.add(1);
        numbers.add(5);
        numbers.add(10);
        numbers.add(100);

        System.out.println("Original items:");
        for (String item : items) {
            System.out.println(item);
        }

        System.out.println();

        System.out.println("Original Numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // remove
        items.remove("pencil");
        numbers.remove(Integer.valueOf(10));

        // add
        items.add("mouse");
        numbers.add(50);

        // display
        System.out.println();

        System.out.println("Updated items:");
        for (String item : items) {
            System.out.println(item);
        }

        System.out.println();

        System.out.println("Updated Numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
