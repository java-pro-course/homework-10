class Person implements IPrintable{
    private String name;
    private String surname;
    private String secName;
    private String gender;
    private int year;

    Person(String name, String surname, String secName, String gender, int year){
        this.name = name;
        this.surname = surname;
        this.secName = secName;
        this.gender = gender;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecName() {
        return secName;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void getInfo(){
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getSecName());
        System.out.println("Gender: " + getGender());
        System.out.println("Year of b-day: " + getYear());
    }
}
class Student extends Person implements IPrintable{
    private int num;
    private String school;
    private String grade;
    private String fav;


    public int getNum() {
        return num;
    }

    public String getSchool() {
        return school;
    }

    public String getGrade() {
        return grade;
    }

    public String getFav() {
        return fav;
    }



    public Student(String name, String surname, String secName, String gender, int year, int num, String school, String grade, String fav) {
        super(name, surname, secName, gender, year);
        this.num = num;
        this.school = school;
        this.grade = grade;
        this.fav = fav;
    }

    @Override
    public void getInfo(){
        System.out.println("\t`Student`");


        super.getInfo();

        System.out.println(getSchool() + " # " + getNum());
        System.out.println("Grade: " + getGrade());
        System.out.println("Favourite subject: " + getFav());

        System.out.println();
    }
}

class Employee extends Person implements IPrintable{
    private String company;
    private String prof;
    private int salary;
    private String fav;

    public Employee(String name, String surname, String secName, String gender, int year, String company, String prof, int salary, String fav) {
        super(name, surname, secName, gender, year);
        this.company = company;
        this.prof = prof;
        this.salary = salary;
        this.fav = fav;
    }

    public String getCompany() {
        return company;
    }

    public String getProf() {
        return prof;
    }

    public int getSalary() {
        return salary;
    }

    public String getFav() {
        return fav;
    }

    @Override
    public void getInfo(){
        System.out.println("\t`Employee`");


        super.getInfo();

        System.out.println("Company: " + getCompany());
        System.out.println("Profession: " + getProf());
        System.out.println("Salary: " + getSalary());
        System.out.println("Favourite day: " + getFav());

        System.out.println();
    }
}

interface IPrintable{
    void getInfo();
}




public class task_1 {

    public static void main(String[] args) {
        Student student = new Student("Oleg", "Korsar", "Evgenievich", "male", 2009, 56, "College", "24A", "math");
        Employee employee = new Employee("Ivan", "Matrosov", "Sergeevich", "male", 1998, "Sberbank", "analytics manager", 10000, "Monday");
            student.getInfo();
            employee.getInfo();
    }
}