package QAP3;

class Person {
    protected String myName; //person name
    protected int myAge; //person age
    protected String myGender; //"m" male, "f" female

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    //get methods
    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    //set
    public void setName(String name) {
        myName = name;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}