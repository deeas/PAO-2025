package exceptions;

/*
1.	Create and Use a Custom Checked Exception
Create a custom checked exception ‘InvalidGradeException’. Write a method that throws this exception when a grade is out of the 0–100 range.
*/

public class Exercise1 {

    public static void main(String[] args) {
        try {
            validateGrade(105);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Invalid grade: " + grade + ". Grade must be between 0 and 100.");
        }
    }
}
