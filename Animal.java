public class Animal {

    private String species;

    public Animal() {
        species = "";
    }

    public Animal(String newSpecies) {
        species = newSpecies;
    }

    // setSpecies
    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    // getSpecies
    public String getSpecies() {
        return species;
    }

    // toString 
    public String toString() {
        return "Species: " + species;
    }
}