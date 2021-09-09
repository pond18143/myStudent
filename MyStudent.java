package myStudent;

public class MyStudent implements java.io.Serializable {

    protected int ID;
    protected String Name;
    protected double GPA;

    public MyStudent() {
    }

    public void setMyId(int reqId) {
        ID = reqId;
    }

    public int getMyId() {
        return ID;
    }

    public void setMyName(String reqName) {
        Name = reqName;
    }

    public String getMyName() {
        return Name;
    }

    public void setMyGPA(double reqGpa) {
        GPA = reqGpa;
    }

    public double getMyGPA() {
        return GPA;
    }

}
