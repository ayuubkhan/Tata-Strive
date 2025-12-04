package task;

public class Task2 {

    int number; // instance variable (belongs to the object)

    // 🔹 Constructor
    Task2(int num) {
        number = num;  // 'num' is a local variable here
        System.out.println("Constructor called. Number set to: " + number);
    }

    void showNumbers() {
        System.out.println("Numbers from 1 to 10 (stopping at your number):");
        for (int i = 1; i <= 10; i++) {  // 'i' is also a local variable
            try {
                Thread.sleep(1000);  // waits for 1 second before printing the next number
            } catch (InterruptedException e) {
                e.printStackTrace(); // handles interruption error
            }
            if (i == number) {
                System.out.println("Reached number " + number + ", breaking the loop!");
                break; // 🔹 break statement stops the loop
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        Write a code: break, constructor, local variable
        System.out.println("Ener the number between 1 and 10");
        Task2 task2 = new Task2(8);
        task2.showNumbers();


    }
}
