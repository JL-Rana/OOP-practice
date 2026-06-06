public class MedalAwarder {
    public static void main(String[] args) {
        double gpa=3.7;
        boolean completedSemester=true;
        if (completedSemester) {
            if (gpa >= 3.5) {
                System.out.println("Congratulations! You receive a medal.");
            } else {
                System.out.println("Semester completed, but GPA is below 3.5.");
            }
        } else {
            System.out.println("Semester not completed. Not eligible for a medal.");
        }
    }
}