package QAP3;

class Student extends Person{
    protected String myIdNum; //student ID num
    protected double myGPA; //student grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) { //super class constructor
        super(name, age, gender);
        // add to Student
        myIdNum = idNum;
        this.myGPA = gpa;
    }

    //get
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    //set
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }
}
    
