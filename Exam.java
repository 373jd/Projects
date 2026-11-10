public class Exam extends Assessment {

    private int questions;
    private int numMissed;
    private int pointsEach;

    // Constructor
    public Exam(int questions, int missed) {
        this.questions = questions;
        this.numMissed = missed;

        if (questions == 0) {
            System.out.println("Error: Number of questions cannot be zero.");
            pointsEach = 0;
            setScore(0);
        } else {
            pointsEach = 100 / questions;

            int numericScore = (int) Math.round(
                100.0 - (missed * (100.0 / questions))
            );

            setScore(numericScore);
        }
    }

    // getpointseach
    public int getPointsEach() {
        return pointsEach;
    }

    // getnumimssed
    public int getNumMissed() {
        return numMissed;
    }
}