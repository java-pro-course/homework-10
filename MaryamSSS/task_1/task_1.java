package com.company;

import java.util.Scanner;


class Person implements Printable{
    private String name;
    private String surname;
    private String patronymic;
    private String gender;
    private int birthdate;
    private int age;

    Person(String name, String surname, String patronymic, String gender, int birthdate, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthdate = birthdate;
        this.age = age;
    }

    @Override
    public void getInfo(){
        System.out.println("Main information: ");
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("Name: " + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("Patronymic: " + this.getPatronymic());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Birthdate: " + this.getBirthdate());
        System.out.println("Age: " + this.getAge());
    }

    String getName(){
        return this.name;
    }
    String getSurname(){
        return this.surname;
    }
    String getPatronymic(){
        return this.patronymic;
    }
    String getGender(){
        return this.gender;
    }
    int getBirthdate(){
        return this.birthdate;
    }
    public int getAge() {
        return age;
    }

    public void happyBirthday(Person person){
        this.age+=1;
    }
}

    interface Printable {
        void getInfo();
    }

    class Student extends Person implements Printable {
    private int schoolNumber;
    private String schoolName;
    private int classNumber;
    private String favLesson;

    public Student(String name, String surname, String patronymic, String gender, int birthdate, int age, int schoolNumber, String schoolName, int classNumber, String favLesson) {
        super(name, surname, patronymic, gender, birthdate, age);
        this.schoolNumber = schoolNumber;
        this.schoolName = schoolName;
        this.classNumber = classNumber;
        this.favLesson = favLesson;
    }

    @Override
    public void getInfo(){
        System.out.println("Main information: ");
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("Name: " + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("Patronymic: " + this.getPatronymic());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Birthdate: " + this.getBirthdate());
        System.out.println("Age: " + this.getAge());
    }

    public void getInfoAboutStudent(Student student){
        getInfo();
        System.out.println("Student information: ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("School number: " + schoolNumber);
        System.out.println("School name: " + schoolName);
        System.out.println("Favourite lesson: " + favLesson);
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
    public void setFavLesson(String favLesson) {
        this.favLesson = favLesson;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public int getClassNumber() {
        return classNumber;
    }
    public String getFavLesson() {
        return favLesson;
    }
}

class SchoolClass{
    private Student[] schoolClass;
    private String homeTeacher;
    private int midMark;

    SchoolClass(Student[] schoolClassPeople, String homeTeacher, int midMark){
        this.schoolClass = schoolClassPeople;
        this.homeTeacher = homeTeacher;
        this.midMark = midMark;
    }

    public void setSchoolClass(Student[] schoolClass) {
        this.schoolClass = schoolClass;
    }
    public void setHomeTeacher(String homeTeacher) {
        this.homeTeacher = homeTeacher;
    }
    public void setMidMark(int midMark) {
        this.midMark = midMark;
    }

    public Student[] getSchoolClass() {
        return schoolClass;
    }
    public String getHomeTeacher() {
        return homeTeacher;
    }
    public int getMidMark() {
        return midMark;
    }
    public void getStudentFromClass(Student[] schoolClass, int i){
        System.out.println("");
        schoolClass[i].getInfoAboutStudent(schoolClass[i]);
        System.out.println("");
    }

    public void getInfoAboutClass(SchoolClass schoolClass){
        System.out.println("Class info: ");
        System.out.println("---------------------------");
        System.out.println("Hometeacher: " + homeTeacher);
        System.out.println("Middle mark: " + midMark);
        System.out.println("Students information: ");
        for (int i=0; i<schoolClass.getSchoolClass().length; i++){
            getStudentFromClass(schoolClass.getSchoolClass(), i);
        }
    }
}
class Employee extends Person implements Printable{
    private String companyName;
    private String jobPlace;
    private int salary;
    private String favouriteDayOfWeek;

    public Employee(String name, String surname, String patronymic, String gender, int birthdate, int age, String companyName, String jobPlace, int salary, String favouriteDayOfWeek){
        super(name, surname, patronymic, gender, birthdate, age);
        this.companyName = companyName;
        this.jobPlace = jobPlace;
        this.salary = salary;
        this.favouriteDayOfWeek = favouriteDayOfWeek;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setJobPlace(String jobPlace) {
        this.jobPlace = jobPlace;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setFavouriteDayOfWeek(String favouriteDayOfWeek) {
        this.favouriteDayOfWeek = favouriteDayOfWeek;
    }

    public String getFavouriteDayOfWeek() {
        return favouriteDayOfWeek;
    }
    public String getCompanyName() {
        return companyName;
    }
    public String getJobPlace() {
        return jobPlace;
    }
    public int getSalary() {
        return salary;
    }

    public void getEmployeeInfo(Employee employee){

        System.out.println("Employee information: ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Company Name: " + companyName);
        System.out.println("Job Place: " + jobPlace);
        System.out.println("Salary: " + salary);
        System.out.println("Favourite day of week: " + favouriteDayOfWeek);
    }
    @Override
    public void getInfo(){
        System.out.println("Main information: ");
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("Name: " + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("Patronymic: " + this.getPatronymic());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Birthdate: " + this.getBirthdate());
        System.out.println("Age: " + this.getAge());
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите общее кол-во учеников в классе: ");
        Student[] schoolClass = new Student[in.nextInt()];
        for (int i = 0; i<schoolClass.length; i++){
            System.out.println("Введите информацию об ученике №" + (i+1) + " в порядке ИМЯ, ФАМИЛИЯ, ОТЧЕСТВО, ПОЛ, ГОД РОЖДЕНИЯ, ВОЗРАСТ, НОМЕР ШКОЛЫ, ИМЯ ШКОЛЫ, НОМЕР КЛАССА, ЛЮБИМЫЙ ПРЕДМЕТ: ");
            schoolClass[i] = new Student(in.next(), in.next(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.next(), in.nextInt(), in.next());
        }
        System.out.println("Введите ФИО классного руководителя и средний балл класса: ");
        SchoolClass schoolClass1 = new SchoolClass(schoolClass, in.next(), in.nextInt());

        schoolClass1.getInfoAboutClass(schoolClass1);
    }
}
