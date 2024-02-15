public class EmployeeManagement {

    private int idNum;
    private int salary;
    private String name;

    public int setIdNum (int newIdNum) {
        idNum = newIdNum;
        return newIdNum;
    }

    public int setSalary (int newSalary) {
        salary = newSalary;
        return salary;
    }

    public String setName (String newName) {
        name = newName;
        return name;
    }

    public int getIdNum() {
        return idNum;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public EmployeeManagement (int idNum, String name, int salary) {
        this.idNum = idNum;
        this.name = name;
        this.salary = salary;
    }

    // Bubble Sort Algorithm
    // sort by idNum

    public static void bubbleSortIdNum (EmployeeManagement[] employees) {
        // bubble sort for the id numbers
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getIdNum() > employees[j+1].getIdNum()) {
                    EmployeeManagement temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp; 
                }
            }
        }
    }

    public static void bubbleSortName (EmployeeManagement[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                String nameOne = employees[j].getName();
                String nameTwo = employees[j+1].getName();
                if (nameOne.compareTo(nameTwo) > 0) {
                    EmployeeManagement temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp; 
                }
            }
        }
    }

    public static void bubbleSortHiToLoSalary (EmployeeManagement[] employees) {
        // bubble sort for the id numbers
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j+1].getSalary()) {
                    EmployeeManagement temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp; 
                }
            }
        }
    }


 public static void main(String[] args) {
    EmployeeManagement[] employees = new EmployeeManagement[20];
    
    employees[10] = new EmployeeManagement(11, "Chloe", 27);
    employees[11] = new EmployeeManagement(12, "Daniel", 40);
    employees[12] = new EmployeeManagement(13, "Laura", 26);
    employees[13] = new EmployeeManagement(14, "Kevin", 38);
    employees[14] = new EmployeeManagement(15, "Nancy", 29);
    employees[15] = new EmployeeManagement(16, "Luke", 24);
    employees[16] = new EmployeeManagement(17, "Zoe", 33);
    employees[17] = new EmployeeManagement(18, "Ethan", 31);
    employees[18] = new EmployeeManagement(19, "Sophia", 21);
    employees[19] = new EmployeeManagement(20, "Michael", 37);
    employees[0] = new EmployeeManagement(100, "Mark", 25);
    employees[1] = new EmployeeManagement(200, "Matt", 15);
    employees[2] = new EmployeeManagement(300, "James", 14);
    employees[3] = new EmployeeManagement(400, "Sarah", 30);
    employees[4] = new EmployeeManagement(500, "Emily", 22);
    employees[5] = new EmployeeManagement(600, "John", 28);
    employees[6] = new EmployeeManagement(700, "Alice", 32);
    employees[7] = new EmployeeManagement(800, "David", 45);
    employees[8] = new EmployeeManagement(9, "Jessica", 23);
    employees[9] = new EmployeeManagement(10, "Tom", 3500);

    bubbleSortHiToLoSalary(employees);
    for (int i = 0; i < employees.length; i++) {
        System.out.println(employees[i].getName());
    }


 }   
}
