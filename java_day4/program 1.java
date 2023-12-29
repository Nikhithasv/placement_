
public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employeeObj = new Employee("John Doe", 25, "123-456-7890", "123 Main St", 50000, "Software Development");

        // Creating a Manager object
        Manager managerObj = new Manager("Jane Smith", 30, "987-654-3210", "456 Oak St", 80000, "HR");

        // Printing details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employeeObj.name);
        System.out.println("Age: " + employeeObj.age);
        System.out.println("Phone Number: " + employeeObj.phoneNumber);
        System.out.println("Address: " + employeeObj.address);
        employeeObj.printSalary();
        System.out.println("Specialization: " + employeeObj.specialization + "\n");

        System.out.println("Manager Details:");
        System.out.println("Name: " + managerObj.name);
        System.out.println("Age: " + managerObj.age);
        System.out.println("Phone Number: " + managerObj.phoneNumber);
        System.out.println("Address: " + managerObj.address);
        managerObj.printSalary();
        System.out.println("Department: " + managerObj.department);
    }
}

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

