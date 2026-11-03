public class Exam extends Assessment {

    private int questions;
    private int missed;
    private double pointsEach;

    // Constructor
    public Exam(int questions, int missed) {
        this.questions = questions;
        this.missed = missed;

        // points per question
        pointsEach = 100.0 / questions;

        // exam score
        int numericScore = (int) Math.round(
            100.0 - (missed * pointsEach)
        );

        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }
}