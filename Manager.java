import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<Employee> employees;

    // Constructor
    public Manager() {
        employees = new ArrayList<>();
    }

    // Ajout d'employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("L'employé(e) à été ajouté avec succès.");
    }

    //Suppression d'un employee par l'ID
    public void removeEmployee(int id) {
        Employee toRemove = null;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                toRemove = employee;
                break;
            }
        }
        if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("Employé(e) supprimé avec succès.");
        } else {
            System.out.println("L'employé(e) avec l'ID: " + id + "n'existe pas");
        }
        
    }

    //Afficher tous les employé(e)s
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Aucun employé(e) à afficher.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    //Afficher un employé(e) spécifique par l'id 
    public void displayEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("L'employé(e) avec l'ID: " + id + "n'existe pas");
    }

    //Affichage dans le main 🙂🙂🙂
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*************** Système de gestion des employé(e)s ***************");
            System.out.println("|1. Ajouter un employé(e) |");
            System.out.println("|2. Supprimer un employé(e) |");
            System.out.println("|3. Afficher tous les employé(e)s |");
            System.out.println("|4. Afficher un employé(e) par l'Id |");
            System.out.println("|5. Quitter |");
            System.out.println("**************** Entrer votre choix ***************");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Entrer l'ID de l'employé(e): ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Entrer le nom de l'employé(e): ");
                    String name = scanner.nextLine();
                    System.out.println("Entrer le poste de l'employé(e): ");
                    String position = scanner.nextLine();
                    System.out.println("Entrer le salaire de l'employé(e): ");
                    double salary = scanner.nextDouble();
                    manager.addEmployee(new Employee(id, name, position, salary));
                    break;
                case 2:
                    System.out.println("Entrer l'Id de l'employé à supprimer: ");
                    int removeId = scanner.nextInt();
                    manager.removeEmployee(removeId);
                    break;
                case 3:
                    manager.displayAllEmployees();
                    break;
                case 4:
                    System.out.println("Entrer l'Id de l'employé(e) à afficher: ");
                    int displayId = scanner.nextInt();
                    manager.displayEmployeeById(displayId);
                    break;
                case 5:
                    System.out.println("Quitter le gestionnaire d'employé(e)");
                    scanner.close();
                    return;            
                default:
                    System.out.println("Choix invalid. Veuillez réessayer...");
                   
            }
        }
    }
}
