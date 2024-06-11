package QAP3;

public class Demo {
    public static void main(String[] args) {
        Person Bob = new Person("Coach Bob", 27, "M");
        System.out.println(Bob);

        Student Lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(Lynne);

        Teacher MrJava = new Teacher("Duke Java", 34, "M", 50000, "Computer Science");
        System.out.println(MrJava);

        CollegeStudent Ima = new CollegeStudent("Ima Frost", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(Ima);
    }
    
}
