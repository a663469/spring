package hibernateTest2;

import hibernateTest2.entity.Detail;
import hibernateTest2.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) throws HibernateException {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
//            Detail detail = new Detail("New-York", "4523452345", "nikolay@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);

//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 4);
            session.delete(detail);

            //Что бы разрушить связь между employee и detail
            detail.getEmployee().setEmpDetail(null);
            //Теперь можно удалять только detail
            session.delete(detail);

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
            System.out.println("Done!");
        }
    }
}
