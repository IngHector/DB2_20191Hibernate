/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db2_20191;
import entities.Department;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author OFhec
 */
public class ProjectModel {
     public List<Object[]> query30()
    {
        Session sesion= HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        Query query= sesion.createQuery("SELECT projno,projname FROM Project WHERE projname LIKE '%SUPPORT%' ORDER BY projno");
        sesion.getTransaction().commit();
        
        List<Object[]> listDept= query.list();
       return listDept;
    }
    
}
