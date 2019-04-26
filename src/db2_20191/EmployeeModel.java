/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db2_20191;

import entities.Department;
import entities.Employee;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author fernando
 */
public class EmployeeModel {
    
    public List<Object[]> query06()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT d.deptno,e.job FROM Employee as e JOIN e.workdept as d order by d.deptno,job");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
    
    public List<Object[]> query07()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT DISTINCT d.deptno,e.job FROM Employee as e JOIN e.workdept as d order by d.deptno,job");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
    
    public List<Object[]> query09()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,edlevel FROM Employee WHERE edlevel>=19");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
    public List<Object[]> query10()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT empno,job,edlevel FROM Employee WHERE job='ANALYST' AND edlevel=16");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
    
     public List<Object[]> query11()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT empno,job,edlevel FROM Employee WHERE job='ANALYST' OR edlevel=16");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
     
     public List<Object[]> query12()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT empno,job,edlevel FROM Employee WHERE job='ANALYST' AND edlevel=16 OR edlevel=18");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
     
     public List<Object[]> query13()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT empno,job,edlevel FROM Employee WHERE job='ANALYST' AND (edlevel=16 OR edlevel=18)");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
     
      public List<Object[]> query14()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,edlevel FROM Employee WHERE edlevel IN (14,19,20)");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
      
       public List<Object[]> query15()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,edlevel FROM Employee WHERE edlevel BETWEEN 14 AND 20");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
       
        public List<Object> query17()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT e.lastname FROM Employee e WHERE lastname LIKE 'G%'");
        sesion.getTransaction().commit();
        
        List<Object> listDept= query.list();
        return listDept;
    }
        
         public List<Object[]> query18()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT e.empno,e.lastname,e.birthdate,e.salary FROM Employee e WHERE salary>30000 order by salary desc");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
         
         public List<Object[]> query19()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,firstnme,workdept FROM Employee ORDER BY workdept desc,lastname desc");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
         
          public List<Object> query20()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT DISTINCT edlevel FROM Employee ORDER BY edlevel desc");
        sesion.getTransaction().commit();
        
        List<Object> listDept= query.list();
        return listDept;
    }
          
          public List<Object[]> query22()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,salary,bonus FROM Employee WHERE sex='M'");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
          
          public List<Object[]> query23()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,salary,comm FROM Employee WHERE salary>20000 and hiredate>'1979-01-01'");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
          
          public List<Object[]> query24()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,salary,bonus,comm FROM Employee WHERE (salary>22000 AND bonus=400)OR(bonus=500 AND comm<1900) ORDER BY lastname ");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
          
           public List<Object[]> query25()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,salary,bonus,comm FROM Employee WHERE salary>22000 AND ((bonus=400 OR bonus=500) AND comm<1900) ORDER BY lastname ");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
           
           public List<Object[]> query28()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT empno,lastname,salary,bonus FROM Employee WHERE bonus BETWEEN 800 AND 1000 ORDER BY bonus,empno");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
           
            public List<Object[]> query29()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT empno,lastname,salary,workdept FROM Employee WHERE workdept BETWEEN 'A00' AND 'C01' ORDER BY lastname,empno");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
            
            public List<Object[]> query32()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT lastname,firstnme,midinit, salary FROM Employee WHERE job!='PRES' AND job!='MANAGER' ORDER BY salary desc");
        query.setMaxResults(5);
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
            
             public List<Employee> query33()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("FROM Employee");
        sesion.getTransaction().commit();
        
        List<Employee> listDept= query.list();
        return listDept;
    }
             
             public List<Object[]> query34()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT e.lastname,e.firstnme,d.deptno,e.job FROM Employee e JOIN e.workdept as d WHERE d.deptno BETWEEN 'A02' AND 'D22' AND e.job!='MANAGER' ORDER BY deptname,job,lastname,firstnme");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
             
             public List<Object[]> query35()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT d.deptname,e.lastname,e.firstnme FROM Employee e JOIN e.workdept as d WHERE e.empno=d.mgrno ORDER BY d.deptname");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
             
             public List<Object[]> query36()
    {
         Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT d.deptname,e.lastname,e.firstnme FROM Employee e JOIN e.workdept as d ORDER BY d.deptname");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
        return listDept;
    }
             
        
             
}
