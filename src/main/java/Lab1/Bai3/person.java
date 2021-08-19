package Lab1.Bai3;

import java.util.Scanner;

public class person implements personExample {
    protected String id;
    protected String name;
    protected int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        setName(name = in.nextLine());
        System.out.println("Nhap ID: ");
        setId(id = in.nextLine());
        System.out.println("Nhap tuoi: ");
        setAge(age = in.nextInt());
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + "\tID: " + getId() + "\tAge: " + getAge());
    }
}
