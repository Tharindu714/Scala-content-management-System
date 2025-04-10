package dao

import model.Content
import util.HibernateUtil
import org.hibernate.Session
import org.hibernate.Transaction

import scala.collection.JavaConverters._

class ContentDao {

  def saveContent(content: Content): Unit = {
    var transaction: Transaction = null
    try {
      val session: Session = HibernateUtil.getSessionFactory.openSession()
      transaction = session.beginTransaction()
      session.save(content)
      transaction.commit()
    } catch {
      case e: Exception =>
        if (transaction != null) transaction.rollback()
        e.printStackTrace()
    }
  }

  def getAllContent: List[Content] = {
    val session: Session = HibernateUtil.getSessionFactory.openSession()
    session.createQuery("from Content", classOf[Content]).list().asScala.toList
  }

  def getContentById(id: Int): Content = {
    val session: Session = HibernateUtil.getSessionFactory.openSession()
    session.get(classOf[Content], id)
  }

  def updateContent(content: Content): Unit = {
    var transaction: Transaction = null
    try {
      val session: Session = HibernateUtil.getSessionFactory.openSession()
      transaction = session.beginTransaction()
      session.update(content)
      transaction.commit()
    } catch {
      case e: Exception =>
        if (transaction != null) transaction.rollback()
        e.printStackTrace()
    }
  }

  def deleteContent(id: Int): Unit = {
    var transaction: Transaction = null
    try {
      val session: Session = HibernateUtil.getSessionFactory.openSession()
      val content = session.get(classOf[Content], id)
      if (content != null) {
        transaction = session.beginTransaction()
        session.delete(content)
        transaction.commit()
      }
    } catch {
      case e: Exception =>
        if (transaction != null) transaction.rollback()
        e.printStackTrace()
    }
  }
}

