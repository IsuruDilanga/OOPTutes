package JTableQuestion;

import java.util.Date;

public class Student extends Person{

    private String ID;

    public Student(String name, Date dob, String ID) {
        super(name, dob);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
