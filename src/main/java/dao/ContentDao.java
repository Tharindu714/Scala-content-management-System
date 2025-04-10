package dao;

import model.contentModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ContentDao {

    private SessionFactory factory;

    public ContentDao() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml") // Ensure Hibernate config file is present
                .addAnnotatedClass(contentModel.class)
                .buildSessionFactory();
    }

    public void saveContent(contentModel content) {
        Session session = factory.getCurrentSession();

        try {
            // Start a transaction
            session.beginTransaction();

            // Save the content object
            session.save(content);

            // Commit the transaction
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    // Add other CRUD operations (Update, Delete, Find by ID, etc.) as needed
}
