import java.lang.reflect.Array;
import java.util.Objects;

public class Employee {
    private int size;
    private String fullName;
    private int departament;
    private int sallary;
    private static int idCreator;
    private int id;

    public Employee(String fullName, int departament, int sallary) {
        this.fullName = fullName;
        this.departament = departament;
        this.sallary = sallary;
        this.id = idCreator++;
    }

    //ГЕТТЕРЫ
    public String getFullName() {
        return fullName;
    }

    public int getDepartament() { return departament;}

    public int getSallary() {
        return sallary;
    }

    public int getId() {
        return id;
    }

    //СЕТТЕРЫ
    public void setDepartament(int departament) {this.departament = departament;}

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && sallary == employee.sallary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departament, sallary, id);
    }

    @Override
    public String toString() {
        return "Имя : " + fullName +
                "\nОтдел: " + getDepartament() +
                "\nЗарплата: " + getSallary() +
                "\nID: " + getId();
    }
}
