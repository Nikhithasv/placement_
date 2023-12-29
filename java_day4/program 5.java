

public class company {
    public static void main(String[] args) {
        
        manager manager = new manager("abc", 101, 10.0);
        developer developer = new developer("efg", 201, "Java");

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getname());
        System.out.println("Employee ID: " + manager.getid());
        System.out.println("Bonus Percentage: " + manager.calculatesalary());

        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + developer.getname());
        System.out.println("Employee ID: " + developer.getid());
        System.out.println("Programming Language: " + developer.getProgramminglanguage());
        System.out.println("Salary with Allowance: " + developer.calculatesalary());
    }
}
 class employee {
    private String name;
    private int id;

    public employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double calculatesalary() {
        return 50000.0; 
    }

    public String getname() {
        return name;
    }

    public int getid() {
        return id;
    }
}

class manager extends employee {
    private double bonuspercentage;

    public manager(String name, int id, double bonuspercentage) {
        super(name, id);
        this.bonuspercentage = bonuspercentage;
    }

    @Override
    public double calculatesalary() {

        return super.calculatesalary() * (1 + bonuspercentage / 100);
    }
}

class developer extends employee {
    private String programminglanguage;

    public developer(String name, int id, String programminglanguage) {
        super(name, id);
        this.programminglanguage = programminglanguage;
    }

    @Override
    public double calculatesalary() {
  
        return super.calculatesalary() + 10000.0;
    }

    public String getProgramminglanguage() {
        return programminglanguage;
    }
}