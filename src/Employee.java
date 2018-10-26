public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return  firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary(){
        return 12*salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percent){
        float newSalary = getSalary() * (1.0f + (float)percent/100 );
        setSalary((int) newSalary);
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee " + "id=" + id + ", name= " + getName() + ", salary=" + salary;
    }
}
