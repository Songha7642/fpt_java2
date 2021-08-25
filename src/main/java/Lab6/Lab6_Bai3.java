
/*  Bai 3:
Tao file student.java, co cac thuoc tinh id, name, age; Viet cac phuong thuc setter, getter, constructors, toString.
 */

package Lab6;

public class Lab6_Bai3 {
      private int id;
      private String name;
      private int age;

    Lab6_Bai3 (int id, String name, int age) {
        this.id   = id;
        this.name = name;
        this.age  = age;
    }

    Lab6_Bai3() {

    }

    public void setId (int id) {
        this.id = id;
    }

    public int getId () {
        return id;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public int getAge () {
        return age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }

}
