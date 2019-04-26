/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db2_20191;

import entities.Department;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author fernando
 */
public class DepartmentModel {
        public List<Department> query01()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("FROM Department");
        sesion.getTransaction().commit();
        
        List<Department> listDept= query.list();
        return listDept;
    }
        
        public List<Department> query02()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("FROM Department");
        query.setMaxResults(5);
        sesion.getTransaction().commit();
        
        List<Department> listDept= query.list();
        return listDept;
    }
        
        public List<Object[]> query03()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT deptno,deptname,admrdept FROM Department");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
         public List<Object[]> query04()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT deptno,deptname,admrdept FROM Department order by admrdept asc");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
         
         public List<Object[]> query05()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT deptno,deptname,admrdept FROM Department order by admrdept asc,deptname desc");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
          public List<Object[]> query08()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT deptno,admrdept FROM Department WHERE admrdept='A00'");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
          
          public List<Object[]> query16()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT deptno,deptname,mgrno FROM Department WHERE mgrno='X'");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
          public List<Object[]> query27()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT mgrno,deptno FROM Department WHERE mgrno!='X' ORDER BY mgrno");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
           public List<Object[]> query31()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT deptno,deptname FROM Department WHERE deptno LIKE '%11'");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
           
           
          
        
    
}
