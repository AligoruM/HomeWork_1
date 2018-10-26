public class main {
    public static void main(String[] args) {
        /*Circle circle = new Circle(10, "blue");

        System.out.println(circle);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(10.2f,4.3f);

        System.out.println(rectangle);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());*/

        Employee emp = new Employee(1, "Sergey", "Lool", 2000);
        System.out.println(emp);
        System.out.println("Old salary = " + emp.getSalary() + " Annual salary = " + emp.getAnnualSalary());
        System.out.println("New salary = " + emp.raiseSalary(30) + " Annual salary = " + emp.getAnnualSalary());
    }
}
