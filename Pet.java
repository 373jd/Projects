public class Pet {
    // Private data fields
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet() {
        setName("Pet Name");
        setType("dog");
        setAge(1);
    }

    // Custom constructor
    public Pet(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    //  mutator
    public void setName(String name) {
        this.name = name;
    }

    //  accessor
    public String getName() {
        return name;
    }

    // type mutator
    public void setType(String type) {
        this.type = type;
    }

    // type accessor
    public String getType() {
        return type;
    }

    // age mutator
    public void setAge(int age) {
        this.age = age;
    }

    // age accessor
    public int getAge() {
        return age;
    }

    // toString 
    public String toString() {
        String output = "Pet information:\n";
        output += "Name: " + name + "\n";
        output += "Type: " + type + "\n";
        output += "Age: " + age;
        return output;
    }

    // speak 
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Noise";
        }
    }
}