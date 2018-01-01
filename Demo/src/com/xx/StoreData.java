package com.xx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //creating configuration object  
        query();
	}

	public void insert() {
		Configuration cfg=new Configuration();  
        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

        //creating seession factory object  
        SessionFactory factory=cfg.buildSessionFactory();  

        //creating session object  
        Session session=factory.openSession();  

        //creating transaction object  
        Transaction t=session.beginTransaction();  

        Employee e1=new Employee();
        
        e1.setFirstName("beelin");
        e1.setLastName("Su");
        e1.setId(101);

        session.persist(e1);//persisting the object  

        t.commit();//transaction is committed  
        
        session.close();  

        System.out.println("successfully saved"); 
	}
	
	private static void query() {
		Configuration cfg=new Configuration();  
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory=cfg.buildSessionFactory();  

        Session session=factory.openSession();  

        Transaction t=session.beginTransaction();  

        //增
        Employee e1=new Employee();
        e1.setFirstName("beelin");
        e1.setLastName("Su");
        e1.setId(101);
        session.persist(e1);
        
        //查
        Employee employee = session.get(Employee.class, 104);
        
//        修改
//        session.update(employee);
        
//        删除
//        session.delete(employee);
        System.out.println(employee); 
        t.commit(); 
        
        session.close();  
	}
}
