package task;

public class Task3 {

    int number = 100; //local variable

    Task3(int num) {
        System.out.println("Constructor called");
    }

    void printInstance() {
        int name = 8;        // Instance variable

        for (int i = 1; i <= 10; i++) {
            if (i == 5) { // skip only when i = 5
                continue;
            }
            System.out.println("Number: " + i);
        }
    }

    public static void main(String[] args) {
//        Write a code: continue, constructor, local variable, instance variable

        Task3 task3 = new Task3(9);
        task3.printInstance();
    }
}
