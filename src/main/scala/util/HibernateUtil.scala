package util

import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration

object HibernateUtil {

  private val sessionFactory: SessionFactory = buildSessionFactory()

  private def buildSessionFactory(): SessionFactory = {
    try {
      // Create the SessionFactory from hibernate.cfg.xml
      new Configuration().configure().buildSessionFactory()
    } catch {
      case ex: Throwable =>
        println(s"Initial SessionFactory creation failed. $ex")
        throw new ExceptionInInitializerError(ex)
    }
  }

  def getSessionFactory: SessionFactory = sessionFactory

  def shutdown(): Unit = {
    getSessionFactory.close()
  }
}

