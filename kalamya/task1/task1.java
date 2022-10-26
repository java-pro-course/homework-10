package com.company;
import java.util.*;
class Person implements IPrintable{
    private String name;
    private String surname;
    private String patronymic;
    private  String gender;
    private  int born;
    private int older;
    public Person(String name, String surname, String patronymic,
                  String gender, int born, int older){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.born = born;
        this.older = 2022 - born;
    }
    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getGender(){
        return gender;
    }
    public int getBorn(){
        return  born;
    }
    public int getOlder(){
        return  older;
    }
    public void HappyBirthday(Person p){
        p.older += 1;
    }
    @Override// почему мы тут должны писать оверрайд?
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Patronymic: "  + getPatronymic());
        System.out.println("Gender: " + getGender());
        System.out.println("Born: " + getBorn());
        System.out.println("You are old: " + getOlder());
    }

}

interface IPrintable{
    void getInfo();
}
class Student extends Person implements  IPrintable{
    private int numSchool;
    private String nameSchool;
    private int numClass;
    private String favSub;
    public Student(String name, String surname, String patronymic, String gender, int born, int older, int numSchool, String nameSchool, int numClass, String favSub) {
        super(name, surname, patronymic, gender, born, older);
        this.numSchool = numSchool;
        this.nameSchool = nameSchool;
        this.numClass = numClass;
        this.favSub = favSub;
    }
    public int getNumSchool(){
        return numSchool;
    }
    public int getNumClass() {
        return numClass;
    }
    public String getFavSub() {
        return favSub;
    }
    public String getNameSchool() {
        return nameSchool;
    }
    public void  getInfoAboutStudent(){
        System.out.println("Name School: " + getNameSchool());
        System.out.println("Number School" + getNumSchool() );
        System.out.println("Class: " + getNumClass()        );
        System.out.println("Favorite subject: " + getFavSub());
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Name School: " + getNameSchool());
        System.out.println("Number School" + getNumSchool() );
        System.out.println("Class: " + getNumClass()        );
        System.out.println("Favorite subject: " + getFavSub());
    }
}
class Employee extends Person implements IPrintable {
    private  String nameComp;
    private String post;
    private int money;
    private int favDay;
    public Employee(String name, String surname, String patronymic, String gender, int born, int older, String nameComp,
                    String post, int money, int favDay) {
        super(name, surname, patronymic, gender, born, older);
        this.nameComp = nameComp;
        this.post= post;
        this.money = money;
        this.favDay = favDay;
    }
    public String getNameComp(){
        return nameComp;
    }
    public String getPost() {
        return post;
    }
    public int getMoney() {
        return money;
    }
    public int getFavDay() {
        return favDay;
    }
    public void getInfoAboutEmployee(){
        System.out.println("Company name: " + getNameComp());
        System.out.println("Post: " + getPost());
        System.out.println("Money: " + getMoney());
        System.out.println("Favorite day " + getFavDay());
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Company name: " + getNameComp());
        System.out.println("Post: " + getPost());
        System.out.println("Money: " + getMoney());
        System.out.println("Favorite day " + getFavDay());
    }
}
class schoolClass{
    private List<Student> studentList;
    private String fio;
    private int averageScore;
    public schoolClass(List<Student> studentList, String fio, int averageScore) {
        this.studentList = studentList;
        this.fio = fio;
        this.averageScore = averageScore;
    }
    public void getInfo(){
        for (int i = 0; i < studentList.size(); i++){
            studentList.get(i).getInfoAboutStudent();
        }
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public String getFio() {
        return fio;
    }
    public int getAverageScore() {
        return averageScore;
    }
}
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Roma", "Ivanov", "Petrovich", "man", 2001, 49,11, "gjkd", 9, "MAth");
        for (int i = 1; i <= 3; i++) {

        }
        student.getInfo();

        Employee employee = new Employee("Egor", "Romanov", "Pavlovich", "man", 1997, 22,
                "Devops", "freeman", 120000, 5);
        for (int i = 1; i <= 5; i++) {
            employee.HappyBirthday(employee);
        }
        employee.getInfo();


    }
    public static Scanner in = new Scanner(System.in);
}