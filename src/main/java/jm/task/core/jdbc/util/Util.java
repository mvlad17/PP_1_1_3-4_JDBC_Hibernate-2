package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.*;
import java.util.ResourceBundle;

public class Util {

    private static SessionFactory sessionFactory;

    public static Connection getConnection() throws SQLException {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        String dbUrl = resourceBundle.getString("dbUrl");
        String dbName = resourceBundle.getString("dbName");
        String dbPassword = resourceBundle.getString("dbPassword");

        return DriverManager.getConnection(dbUrl, dbName, dbPassword);

    }

    public static Session getHibernateSession() throws HibernateException {

        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(User.class);
            sessionFactory = configuration.buildSessionFactory();
        }
        Session session = sessionFactory.getCurrentSession();

        return session;
    }

}

