package pl.camp.it.strumienie.zadania;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Name1", "Surname1", 3100, Employee.Position.LOW));
        employees.add(new Employee(2, "Name2", "Surname2", 3300, Employee.Position.LOW));
        employees.add(new Employee(3, "Name3", "Surname3", 3500, Employee.Position.LOW));
        employees.add(new Employee(4, "Name4", "Surname4", 3700, Employee.Position.MID));
        employees.add(new Employee(5, "Name5", "Surname5", 3900, Employee.Position.LOW));
        employees.add(new Employee(6, "Name6", "Surname6", 4100, Employee.Position.LOW));
        employees.add(new Employee(7, "Name7", "Surname7", 4300, Employee.Position.MID));
        employees.add(new Employee(8, "Name8", "Surname8", 4500, Employee.Position.MID));
        employees.add(new Employee(9, "Name9", "Surname9", 4700, Employee.Position.MID));
        employees.add(new Employee(10, "Name10", "Surname10", 4900, Employee.Position.HIGH));
        employees.add(new Employee(11, "Name11", "Surname11", 5100, Employee.Position.HIGH));
        employees.add(new Employee(12, "Name12", "Surname12", 5300, Employee.Position.MID));
        employees.add(new Employee(13, "Name13", "Surname13", 5500, Employee.Position.HIGH));
        employees.add(new Employee(14, "Name14", "Surname14", 5700, Employee.Position.HIGH));
        employees.add(new Employee(15, "Name15", "Surname15", 5900, Employee.Position.HIGH));

        employees.stream()
                .filter(em -> em.getPosition() == Employee.Position.MID)
                .filter(em -> em.getSalary() > 4000)
                .filter(em -> em.getSalary() < 5000)
                .peek(em -> em.setSalary(4800))
                /*.map(em -> new Employee(
                        em.getId(),
                        em.getName(),
                        em.getSurname(),
                        4800,
                        em.getPosition())
                )
                .peek(System.out::println)*/
                .map(Employee::getId)
                .forEach(System.out::println);

        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
