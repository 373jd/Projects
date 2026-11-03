public class Exam extends Assessment {

    private int questions;
    private int missed;
    private double pointsEach;

    // Constructor
    public Exam(int questions, int missed) {
        this.questions = questions;
        this.missed = missed;

        // Calculate points per question
        pointsEach = 100.0 / questions;

        // Calculate exam score
        int numericScore = (int) Math.round(
            100.0 - (missed * pointsEach)
        );

        // Set the inherited score field
        setScore(numericScore);
    }

    // Return points awarded for each question
    public double getPointsEach() {
        return pointsEach;
    }
}