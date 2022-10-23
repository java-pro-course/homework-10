import java.util.List;

class Person {
    private String name;
    private String surname;
    private int yearOfBorn;
    private int age;


    public Person(String name, String surname, int yearOfBorn) {
        this.name = name;
        this.surname = surname;
        this.yearOfBorn = yearOfBorn;
        this.age = 2022 - yearOfBorn;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void happyBirthday(Person person) {
        person.age += 1;
    }
}

class Student extends Person {
    private int schoolNumber;
    private String schoolName;


    public Student(String name, String surname, int yearOfBorn, int schoolNumber, String schoolName) {
        super(name, surname, yearOfBorn);
        this.schoolNumber = schoolNumber;
        this.schoolName = schoolName;
    }

    public void getInfoAboutStudent() {
        System.out.println("Student!");
        System.out.println("school number: " + schoolNumber);
    }
}

class Employee extends Person {
    private String company;
    private int salary;

    public Employee(String name, String surname, int yearOfBorn, String company, int salary) {
        super(name, surname, yearOfBorn);
        this.company = company;
        this.salary = salary;
    }

    public void getInfoAboutEmployee() {
        System.out.println("Employee!");
        System.out.println("Company: " + company);
    }
}

class SchoolClass {
    private List<Student> students;
    private String fio;
    private int averageScore;


    public SchoolClass(List<Student> students, String fio, int averageScore) {
        this.students = students;
        this.fio = fio;
        this.averageScore = averageScore;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public void getInfo() {
        System.out.println("SchoolClass!");
        for (int i = 0; i < students.size(); i++) {
            students.get(i).getInfoAboutStudent();
//            students[i].get...
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 1
        Student student = new Student("Alexander", "Koritskiy", 2001, 1953, "Москва-98");
        Employee employee = new Employee("Vasya", "Pupkin", 2000, "Yandex", 123000);

        student.getInfoAboutStudent();
        employee.getInfoAboutEmployee();

        // Task 2
        student.happyBirthday(student);
        student.happyBirthday(student);
        student.happyBirthday(student);

        employee.happyBirthday(employee);
        employee.happyBirthday(employee);
        employee.happyBirthday(employee);
        employee.happyBirthday(employee);
        employee.happyBirthday(employee);

        // Task 3
        // Объявить сканнер, в котором прочитать количество студентов
        // запустить цикл от i до числа учеников, в котором просто принимать инфу о студентах (ФИО, номер школы и тд)
        // вывести информацию о классе
    }
}