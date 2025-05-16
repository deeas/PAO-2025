package imutabillity;

public final class ImmutableStudent {
    private final int id;
    private final String name;

    private final DateOfBirth dateOfBirth;

    public ImmutableStudent(int id, String name, DateOfBirth dateOfBirth) {
        this.id = id;
        this.name = name;
        DateOfBirth cloneDate = new DateOfBirth();
        cloneDate.setDate(dateOfBirth.getDate());
        cloneDate.setMonth(dateOfBirth.getMonth());
        cloneDate.setYear(dateOfBirth.getYear());
        this.dateOfBirth = cloneDate;
    }

    public DateOfBirth getDateOfBirth() {
        DateOfBirth cloneDateOfBirth = new DateOfBirth();
        cloneDateOfBirth.setDate(dateOfBirth.getDate());
        cloneDateOfBirth.setMonth(dateOfBirth.getMonth());
        cloneDateOfBirth.setYear(dateOfBirth.getYear());
        return cloneDateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
