
package db2_20191;


import entities.Department;
import entities.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author OFhec
 */
public class Emp_ActModel {
    public List<Object[]> query21()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT DISTINCT e.empno,p.projno FROM EmpAct as a JOIN a.empno as e "
                + "                      JOIN a.projno as p WHERE e.empno<='000100' ORDER BY e.empno");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
    
     public List<Object[]> query26()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT p.projno,a.actno,a.emstdate,a.emendate FROM EmpAct as a" +
"                                     JOIN a.projno as p WHERE (p.projno LIKE 'AD%' AND a.actno IN(10,80,180)) ORDER BY p.projno,a.actno");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
     
     public List<Object[]> query37()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT DISTINCT p.projno,p.projname,a.actno FROM EmpAct a JOIN a.projno as p WHERE p.projno LIKE 'AD%' ORDER BY p.projno,a.actno");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
     
     public List<Object[]> query38()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT DISTINCT e.empno,e.lastname,p.projno FROM EmpAct as a JOIN a.empno as e "
                + "                             JOIN a.projno as p WHERE a.projno=p.projno"
                + "                               AND p.projno='AD3113'");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
     
     public List<Object[]> query39()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT e.empno,p.projno,p.projname,a.actno,a.emstdate FROM EmpAct as a JOIN a.empno as e "
                + "                             JOIN a.projno as p WHERE a.projno=p.projno"
                + "                               AND emstdate='1982-10-01'");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
     
      public List<Object[]> query40()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT d.deptno,e.lastname,p.projname,a.actno FROM EmpAct as a "
                + "                             JOIN a.empno as e JOIN e.workdept as d"
                + "                             JOIN a.projno as p WHERE a.projno=p.projno"
                + "                             AND d.deptno='A00'");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
      
      public List<Object[]> query41()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT DISTINCT d.deptno,e.lastname,p.projname,a.actno FROM EmpAct as a "
                + "                             JOIN a.empno as e JOIN e.workdept as d"
                + "                             JOIN a.projno as p WHERE a.projno=p.projno"
                + "                             AND e.workdept=d.deptno AND d.deptno BETWEEN 'A00' AND 'C01' \n" +
"                                    ORDER BY d.deptno,e.lastname,a.actno");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
      
      public List<Object[]> query42()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT DISTINCT a.actno,d.mgrno,a.emstdate,p.projno,e.lastname FROM EmpAct as a "
                + "                             JOIN a.empno as e JOIN a.projno as p"
                + "                             JOIN e.workdept as d WHERE e.workdept=d.deptno AND a.emstdate>='1982-10-15' \n" +
"                                    ORDER BY a.actno,a.emstdate");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
      
      public List<Employee> query43()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        /*Query query= sesion.createQuery("SELECT d.deptno,m.lastname,e.lastname,m.hiredate,e.hiredate FROM Employee as e JOIN e.workdept as d"
                + "                     WHERE m.empno=d.mgrno AND d.deptno='A00' AND m.hiredate<e.hiredate" +
"                                    ORDER BY e.lastname");*/
        Query query=sesion.createQuery("FROM Employee");
        sesion.getTransaction().commit();
        
        List<Employee> listDept= query.list();
        return listDept;
    }
      
      
     
}
