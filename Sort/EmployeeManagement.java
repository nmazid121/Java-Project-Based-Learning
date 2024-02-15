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


 public static void main(String[] args) {
    EmployeeManagement john = new EmployeeManagement(1011, "Jeremy", 10000000);

    System.out.println(john.getIdNum());
    john.setIdNum(500);
    System.out.println(john.getIdNum());

 }   
}
