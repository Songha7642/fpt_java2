
/*  Bai 4:
Tao file employee.java, co cac thuoc tinh id, name, salary; Viet cac phuong thuc setter, getter, constructors, toString.
 */

package Lab6;

public class Lab6_Bai4 {
    private int id;
    private String name;
    private float salary;

    Lab6_Bai4 (int id, String name, float salary) {
        this.id   = id;
        this.name = name;
        this.salary  = salary;
    }

    Lab6_Bai4() {

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

    public void setAge (float salary) {
        this.salary = salary;
    }
    public float getSalary () {
        return salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}
