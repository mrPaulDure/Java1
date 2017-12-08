/**
 *Java 1. Homework 5.
 *
 *@author Ivan Iov
 *@version dated Dec 08, 2017
 *@link https://github.com/mrPaulDure/Java1
 */

public class Homework5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Dmitriy", "Finance Director", "dim@mailbox.com", "893214521", 80000, 40);
        persArray[2] = new Person("Vlodimir", "Programmer", "vlod@mailbox.com", "89293563", 65000, 25);
        persArray[3] = new Person("Anna", "HR", "ann@mailbox.com", "89547683", 45000, 27);
        persArray[4] = new Person("Irina", "CIO", "ivivan@mailbox.com", "892312312", 55000, 45);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40) {
                persArray[i].showPerson();
            }
        }
        
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

//Constructor
    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

//Getter & Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

//Method
    public void showPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
}