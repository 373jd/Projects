public class Calc {
    private double num1;
    private double num2;

    // Setter num1
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    // Setter num2
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Getter num1
    public double getNum1() {
        return num1;
    }

    // Getter num2
    public double getNum2() {
        return num2;
    }

    // Add
    public double add() {
        return num1 + num2;
    }

    // Subtract
    public double subtract() {
        return num1 - num2;
    }

    // Multiply
    public double multiply() {
        return num1 * num2;
    }

    // Divide
    public double divide() {
        return num1 / num2;
    }

    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n"
                + "Num1: " + num1 + "\n"
                + "Num2: " + num2;
    }
}