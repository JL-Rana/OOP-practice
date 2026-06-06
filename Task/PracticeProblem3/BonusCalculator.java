public class BonusCalculator {
    public static void main(String[] args) {
        double salesPercentage =95.0;
        int attendancePercentage=100;
        int bonus=5;
        if (salesPercentage >=95.0) {
            if (attendancePercentage >=100) {
                bonus=60;
            } else if (attendancePercentage >= 90) {
                bonus=40;
            }
        } else if (salesPercentage >= 80.0) {
            if (attendancePercentage >= 100) {
                bonus=40;
            } else if (attendancePercentage >= 90) {
                bonus=20;
            }
        }

        System.out.println("Calculated Bonus: " + bonus+"%");
    }
}