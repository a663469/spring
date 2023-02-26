package hibernateOneToManyUni;

import hibernateOneToManyUni.entity.Department;
import hibernateOneToManyUni.entity.Employee;
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
//            Department dep = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Oleg", "Ivanov", 800);
//            Employee emp2 = new Employee("Andrey", "Sidorov", 1000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//***********************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//***********************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//
//            session.getTransaction().commit();
//***********************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
            System.out.println("Done!");
        }
    }
}
