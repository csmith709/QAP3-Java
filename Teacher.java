package QAP3;

class Teacher extends Person {
    private double salary; //teacher salary
    private String subject; //teach subjects

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        //new to Teacher
        this.salary = salary;
        this.subject = subject;
    }

    //get
    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    //set
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //to string
    public String toString() {
        return super.toString() + ", salary: " + salary + ", subject: " + subject;
    }
}