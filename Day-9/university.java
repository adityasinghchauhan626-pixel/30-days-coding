public class university {

    public static void main(String[] args) {

        // Student marks
        int[] marks = {450, 0, -50, 380};

        // Total marks for each student
        int[] totalMarks = {500, 0, 500, 500};

        // Process one extra record to show "Student record not found"
        for (int i = 0; i < 5; i++) {

            try {

                System.out.println("\nProcessing Student " + (i + 1));

                // Outer Try -> Access Student Record
                int obtained = marks[i];
                int total = totalMarks[i];

                // Check for invalid marks
                if (obtained < 0) {
                    throw new IllegalArgumentException("Invalid Marks");
                }

                // Inner Try -> Percentage Calculation
                try {

                    double percentage = (obtained * 100.0) / total;

                    System.out.println("Percentage = " + percentage + "%");

                } catch (ArithmeticException e) {

                    System.out.println("Division by Zero");

                }

                // Manual check because double division by 0 gives Infinity
                if (total == 0) {
                    System.out.println("Division by Zero");
                }

            }

            catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Student Record Not Found");

            }

            catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }

            finally {

                System.out.println("Student record processed.");

            }

        }

    }
}