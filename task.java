interface IPrintable{
    void getInfo();
}
class Human implements IPrintable{
    private String name;
    private String surname;
    private String gender;
    private String otchestvo;
    private int dateOfBirth;

    public void getInfo() {
        System.out.println("Object Human. Name: " + name);
        System.out.println("Object Human. Surname: " + surname);
        System.out.println("Object Human. otchestvo: " + otchestvo);
        System.out.println("Object Human. dateOfBirth: " + dateOfBirth);
        System.out.println("Object Human. gender: " + gender);

    }
    Human(String name, String surname, String gender, String otchestvo,int dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.otchestvo = otchestvo;
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public String getSurname() {
        return surname;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
class Student extends Human{
    private int numOfSchool;
    private String nameOfSchool;
    private int numOfClass;
    private String favLesson;


    Student(String name, String surname, String gender, String otchestvo, int dateOfBirth, int numOfSchool, String nameOfSchool, int numOfClass,String favLesson) {
        super(name, surname, gender, otchestvo, dateOfBirth);
        this.favLesson = favLesson;
        this.nameOfSchool = nameOfSchool;
        this.numOfClass = numOfClass;
        this.numOfSchool = numOfSchool;
    }

//    @Override
//    public void getInfo() {
//        super.getInfo();
//        System.out.println("Школа: " + nameOfSchool);
//        System.out.println("Номер школы: " + numOfSchool);
//        System.out.println("Класс: " + numOfClass);
//        System.out.println("Любимый урок: " + favLesson);
//    }
}
class Employee extends Human{
    private String company;
    private String post;
    private int salary;
    private String favWeekDay;


    Employee(String name, String surname, String gender, String otchestvo, int dateOfBirth, String company, String post, int salary,String favWeekDay) {
        super(name, surname, gender, otchestvo, dateOfBirth);
        this.favWeekDay = favWeekDay;
        this.post = post;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Должность: " + post);
        System.out.println("Компания: " + company);
        System.out.println("Зарплата: " + salary);
        System.out.println("Любимый день недели: " + favWeekDay);
    }
}

public class Main {
    public static void main(String[] args) {
        Human petya = new Human("Петя", "Иванов", "male", "Иванович", 2000);
        petya.getInfo();
        System.out.println("----------------------------------");
        Student ivan = new Student("Иван", "Иванов", "male", "Иванович", 2005, 4, "МБОУ", 11, "Math");
        ivan.getInfo();
        System.out.println("----------------------------------");
        Employee egor = new Employee("Егор", "Иванов", "male", "Иванович", 1990, "Google", "asdasdasd", 1000, "Saturday");
        egor.getInfo();
    }
}
