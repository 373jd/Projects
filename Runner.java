public class Runner {
    public static void main(String[] args) {
        // default constructor
        Pet p1 = new Pet();
        System.out.println(p1.toString());
        System.out.println("Sound: " + p1.speak());
        System.out.println();

        // custom constructor
        Pet p2 = new Pet("Buster", "dog", 5);
        System.out.println(p2.toString());
        System.out.println("Sound: " + p2.speak());
        System.out.println();

        Pet p3 = new Pet("Oki", "cat", 3);
        System.out.println(p3.toString());
        System.out.println("Sound: " + p3.speak());
    }    
}
