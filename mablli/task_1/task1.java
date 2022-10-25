import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    }
    public static Scanner in = new Scanner(System.in);

    }



////

class Person implements IPrintable {
    private String name;
    private String lastName;
    private String patronymic;
    private String gender;
    private String birthday;


    Person (String name, String lastName, String patronymic, String gender, String birthday ){
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthday = birthday;

    }

    @Override
    public void getInfo() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }
}

interface IPrintable {
    void getInfo();
}

/////

class Student extends Person implements IPrintable {
    private int schoolNum;
    private String schoolName;
    private int schoolClass;
    private String favouriteSub;


    Student(String name, String lastName, String patronymic, String gender, String birthday, int schoolNum, String schoolName, int schoolClass, String favouriteSub) {
        super(name, lastName, patronymic, gender, birthday);
        this.schoolNum = schoolNum;
        this.schoolName = schoolName;
        this.schoolClass = schoolClass;
        this.favouriteSub = favouriteSub;
    }

    @Override
    public void getInfo(){
        System.out.println("Name: " + getName() + "; " + "Lastname: " + getLastName() + "; " +  "Patronymic: " + getPatronymic() + "; "
                + "Gender: " + getGender() + "; " + "Birthday: " + getBirthday() + "; "
                + "SchoolNum: " + schoolNum + "; " + "SchoolName: " + schoolName + "; "
                + "SchoolClass: " + schoolClass + "; " + "Favourite subject: " + favouriteSub);
    }
}


/////

class Employee extends Person implements IPrintable {
    private String companyName;
    private String post;
    private int salary;
    private String favouriteDay;

    Employee (String name, String lastName, String patronymic, String gender, String birthday, String companyName, String post, int salary, String favouriteDay){
        super(name, lastName, patronymic, gender, birthday);
        this.companyName = companyName;
        this.post = post;
        this.salary = salary;
        this.favouriteDay = favouriteDay;
    }

    @Override
    public void getInfo(){
        System.out.println("Name: " + getName() + "; " + "Lastname: " + getLastName() + "; " +  "Patronymic: " + getPatronymic() + "; "
                + "Gender: " + getGender() + "; " + "Birthday: " + getBirthday() + "; "
                + "Company name: " + companyName + "; " + "Post: " + post + "; "
                + "Salary: " + salary + "; " + "Favourite day: " + favouriteDay);
    }
}
