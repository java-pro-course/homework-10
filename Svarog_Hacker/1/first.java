package com.company;

interface Printable{}

class Person implements Printable {
    private String name;
    private String surname;
    private String mName;
    private int bYear;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMdlName() {
        return mName;
    }

    public int getBirthYear() {
        return bYear;
    }

    public Person(String name, String surname, String mName, int bYear) {
        this.name = name;
        this.surname = surname;
        this.mName = mName;
        this.bYear = bYear;
    }
    public void getInfo(){
        System.out.println("The name is " + name);
        System.out.println("The surname is " + surname);
        System.out.println("The middle name is " + mName);
        System.out.println("The year of birth is " + bYear);
    }
}

class Student extends Person{
    private int nOfSchool;
    private String tOfSchool;
    private int form;
    private String fSubject;

    public Student(String name, String surname, String mName, int bYear, int nOfSchool, String tOfSchool, int form, String fSubject) {
        super(name, surname, mName, bYear);
        this.nOfSchool = nOfSchool;
        this.tOfSchool = tOfSchool;
        this.form = form;
        this.fSubject = fSubject;
    }

    public void getInfoAboutStudent(){
        super.getInfo();
        System.out.println("The number of school is " + nOfSchool);
        System.out.println("The title of school is " + tOfSchool);
        System.out.println("The form is " + form);
        System.out.println("The favorite subject is " + fSubject);
        System.out.println("");
    }
}

class Employee extends Person{
    private String tOfCompany;
    private String Pos;
    private int Salary;
    private String fWeekDay;

    public Employee(String name, String surname, String mName, int bYear, String tOfCompany, String Pos, int Salary, String fWeekDay) {
        super(name, surname, mName, bYear);
        this.tOfCompany = tOfCompany;
        this.Pos = Pos;
        this.Salary = Salary;
        this.fWeekDay = fWeekDay;
    }
    public void getInfoAboutE(){
        super.getInfo();
        System.out.println("The title of company is " + tOfCompany);
        System.out.println("The position is " + Pos);
        System.out.println("The salary is " + Salary + " victims a month");
        System.out.println("The favorite day of the week is " + fWeekDay);
        System.out.println("");
    }
}

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Svarog", "Hacker", "unknown",2008, 144, "Russ", 9, "IT");
        Employee employee = new Employee("Perun", "Hacker", "Svarozhich", -104779, "Prav", "Middle God", 100, "Четвергъ");
        student.getInfoAboutStudent();
        employee.getInfoAboutE();
    }
}
