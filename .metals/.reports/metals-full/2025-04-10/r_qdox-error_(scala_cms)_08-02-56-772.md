error id: file:///E:/Scala/Scala_CMS/src/main/java/com/scalatutorial/dao/ContentDao.java
file:///E:/Scala/Scala_CMS/src/main/java/com/scalatutorial/dao/ContentDao.java
### com.thoughtworks.qdox.parser.ParseException: syntax error @[1,1]

error in qdox parser
file content:
```java
offset: 1
uri: file:///E:/Scala/Scala_CMS/src/main/java/com/scalatutorial/dao/ContentDao.java
text:
```scala
p@@ackage com.scalatutorial.dao

import com.scalatutorial.model.Content
import com.scalatutorial.util.HibernateUtil
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


```

```



#### Error stacktrace:

```
com.thoughtworks.qdox.parser.impl.Parser.yyerror(Parser.java:2025)
	com.thoughtworks.qdox.parser.impl.Parser.yyparse(Parser.java:2147)
	com.thoughtworks.qdox.parser.impl.Parser.parse(Parser.java:2006)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:232)
	com.thoughtworks.qdox.library.SourceLibrary.parse(SourceLibrary.java:190)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:94)
	com.thoughtworks.qdox.library.SourceLibrary.addSource(SourceLibrary.java:89)
	com.thoughtworks.qdox.library.SortedClassLibraryBuilder.addSource(SortedClassLibraryBuilder.java:162)
	com.thoughtworks.qdox.JavaProjectBuilder.addSource(JavaProjectBuilder.java:174)
	scala.meta.internal.mtags.JavaMtags.indexRoot(JavaMtags.scala:48)
	scala.meta.internal.metals.SemanticdbDefinition$.foreachWithReturnMtags(SemanticdbDefinition.scala:97)
	scala.meta.internal.metals.Indexer.indexSourceFile(Indexer.scala:489)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3(Indexer.scala:587)
	scala.meta.internal.metals.Indexer.$anonfun$reindexWorkspaceSources$3$adapted(Indexer.scala:584)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:619)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:617)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1306)
	scala.meta.internal.metals.Indexer.reindexWorkspaceSources(Indexer.scala:584)
	scala.meta.internal.metals.MetalsLspService.$anonfun$onChange$2(MetalsLspService.scala:914)
	scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.scala:18)
	scala.concurrent.Future$.$anonfun$apply$1(Future.scala:687)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:467)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:842)
```
#### Short summary: 

QDox parse error in file:///E:/Scala/Scala_CMS/src/main/java/com/scalatutorial/dao/ContentDao.java