package QAP3;

class CollegeStudent extends Student {
    private int year; //current college level
    private String major; //student's major

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    //get
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    //set
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    //to string
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
