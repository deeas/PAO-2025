package imutabillity;

public class TestImmutableStudent {
    public static void main(String[] args) {
        DateOfBirth dateOfBirth = new DateOfBirth();
        dateOfBirth.setDate(10);
        dateOfBirth.setMonth(10);
        dateOfBirth.setYear(2004);

        ImmutableStudent student = new ImmutableStudent(1, "Mihai", dateOfBirth);
        System.out.println("Mihai date of birth  before modification: " + student.getDateOfBirth());

        dateOfBirth.setYear(1993);
        student.getDateOfBirth().setYear(1993);

        System.out.println("Mihai date of birth after modification: " + student.getDateOfBirth());


    }

}
