import java.io.*;

public class M8A1 {
    public static void main(String[] args) throws IOException {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        BufferedReader reader = new BufferedReader(
            new FileReader(inputFile));

        BufferedWriter writer = new BufferedWriter(
            new FileWriter(outputFile));

        String line = reader.readLine();

        writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
        writer.newLine();

        while ((line = reader.readLine()) != null) {

            String[] data = line.split(",");

            String empID = data[0];
            double payRate = Double.parseDouble(data[1]);
            double hoursWorked = Double.parseDouble(data[2]);

            double weeklyPay;

            if (hoursWorked > 40) {
                weeklyPay = (40 * payRate) +
                    ((hoursWorked - 40) * payRate * 1.5);
            } else {
                weeklyPay = hoursWorked * payRate;
            }

            String formattedPay = String.format("$%.2f", weeklyPay);

            String outputLine = empID + "," +
                payRate + "," +
                hoursWorked + "," +
                formattedPay;

            writer.write(outputLine);
            writer.newLine();
        }

        reader.close();
        writer.close();

        System.out.println("Output file created successfully!");
    }
}