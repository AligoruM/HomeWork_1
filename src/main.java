public class main {
    public static void main(String[] args) {
        /*Circle circle = new Circle(10, "blue");

        System.out.println(circle);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(10.2f,4.3f);

        System.out.println(rectangle);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());

        Employee emp = new Employee(1, "Sergey", "Lool", 2000);
        System.out.println(emp);
        System.out.println("Old salary = " + emp.getSalary() + " Annual salary = " + emp.getAnnualSalary());
        System.out.println("New salary = " + emp.raiseSalary(30) + " Annual salary = " + emp.getAnnualSalary());

        Author[] authors = new Author[3];
        authors[0]= new Author("first", "firstEmail", 'f');
        authors[1]= new Author("second", "secondEmail", 'm');
        authors[2]= new Author("third", "thirdEmail", 'f');
        Book book = new Book("Harry - you are wizard", authors, 100, 2);
        System.out.println(book);
        System.out.println(book.getAuthorsNames());*/

        MyPoint point1 = new MyPoint(-3,0);
        MyPoint point2 = new MyPoint(0,5);
        MyPoint point3 = new MyPoint(3,0);
        MyTriangle tri = new MyTriangle(point1,point2,point3);
        System.out.println(tri.getType());
    }
}
