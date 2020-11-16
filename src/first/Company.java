package first;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee();
        employees[1] = new Employee();
        employees[2] = new Employee();
        employees[3] = new Employee("Jan", "Kowalski",45);
        employees[4] = new Employee("Janina", "Nowak");

        for(Employee employee : employees){
            System.out.println("**********");
            System.out.println("Name: " + employee.getName());
            System.out.println("Surname: " + employee.getSurname());
            System.out.println("Age: " + employee.getAge());
        }
    }
}
