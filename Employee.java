import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;


    // Gestion employe = new Gestion();
    
    

    //Constructeurs
    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    //Getters
    public int getId() {
        return id;
    }
    public String getname() {
        return name;
    }
    public String getposition() {
        return position;
    }
    public double getsalary() {
        return salary;
    }


    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setposition(String position) {
        this.position = position;
    }
    public void setsalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee ID: " + id + ", name: " + name + ", Position: " + position + ", Salary: $ " + salary;
    }

    // public void Employes (String[] item) {
       
       
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.println("Entrer le nom de l'employé a enregistrer: ");
        
    // }

    
}
