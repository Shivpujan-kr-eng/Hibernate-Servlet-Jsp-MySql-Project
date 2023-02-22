package com.spnk.HibernateDemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien alien=new Alien();
        alien.setAid(101);
        alien.setAname("shiv");
        alien.setColor("Red");
        
        
        Configuration configuration =new Configuration();
        
        SessionFactory sFactory=configuration.buildSessionFactory();
        
        Session session=sFactory.openSession();
        session.save(alien);
    }
}
