package task;

public class Task4 {
    public static void main(String[] args) {
        // Write a Java program named (AttendanceMonitor.java) that:
        // - Uses a For Loop to represent 10 Learners (from 1 to 10)
        // - Skips Learner 3 using 'continue'
        // - Stops the Loop at Learner 5 using 'break'
        // - Displays an appropriate message for each Learner

        for (int i = 1; i <= 10; i++) {

            if (i == 3) {
                System.out.println("Skipping Learner " + i);
                continue;  // Skip Learner 3
            }

            if (i == 5) {
                System.out.println("Stopping at Learner " + i);
                break;      // Stop the loop when Learner 5 is reached
            }

            System.out.println("Present Learner " + i);
        }
    }
}
