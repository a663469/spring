package hibernateOneToManyBi;

import hibernateOneToManyBi.entity.Department;
import hibernateOneToManyBi.entity.Employee;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) throws HibernateException {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("Sales", 800, 1500);
//            Employee emp1 = new Employee("Zaur2", "Tregulov2", 800);
//            Employee emp2 = new Employee("Elena2", "Smirnov2", 1000);
//            Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//***********************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 2);
            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());

            session.getTransaction().commit();
//***********************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//***********************************************************************
//              session = factory.getCurrentSession();
//
//              session.beginTransaction();
//
//              Employee employee = session.get(Employee.class, 2);
//              session.delete(employee);
//
//              session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
            System.out.println("Done!");
        }
    }
}
