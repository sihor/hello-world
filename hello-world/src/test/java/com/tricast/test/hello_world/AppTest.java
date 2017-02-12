package com.tricast.test.hello_world;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tricast.test.hello_world.entity.Account;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Testing the connection and insert a simple record
     */
    public void testApp() {
        SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
 
		Account account = new Account();
		account.setUsername("test_acc");
		account.setCreatedDate(new Date());
		account.setCreatedBy("hibernate");
		session.save(account);
 
		session.getTransaction().commit();
		session.close();
	}
}
