public class Pet {
    // priv data
    private String name;

    //public constructor
    public Pet() {
        setName("Pet Name");
    }

    public void setName(String name) {
        this.name = name;
    }

    // public get/accessor
    public String getName() {
        return name;
    }

    // toString 
    public String toString() {
        String output = "Pet information:\n";
        output += "Name: " + name;
        return output;
    }

    //main 
    public static void main(String[] args)
    {
        Pet p1 = new Pet();
        p1.setName("Pet Name");
        System.out.println(p1.toString());

        Pet p2 = new Pet();
        p2.setName("Buster");
        System.out.println(p2.toString());
    }
    
}