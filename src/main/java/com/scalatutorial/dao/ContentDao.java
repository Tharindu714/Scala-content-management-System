package com.scalatutorial.dao;

import com.scalatutorial.model.Content;
import com.scalatutorial.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ContentDao {

    public void saveContent(Content content) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(content);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public List<Content> getAllContent() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Content", Content.class).list();
        }
    }

    public Content getContentById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Content.class, id);
        }
    }

    public void updateContent(Content content) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(content);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public void deleteContent(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Content content = session.get(Content.class, id);
            if (content != null) {
                transaction = session.beginTransaction();
                session.delete(content);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
