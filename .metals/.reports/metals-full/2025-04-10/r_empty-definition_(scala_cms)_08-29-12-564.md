error id: 
file:///E:/Scala/Scala_CMS/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 980
uri: file:///E:/Scala/Scala_CMS/src/main/scala/Main.scala
text:
```scala
import java.util.Date
import scala.collection.mutable.ListBuffer

// Model: Content
case class Content(id: Int, title: String, body: String, author: String, createdAt: Date)

// Simulating a Data Access Object (DAO) for Content
object ContentDao {
  private val contentList = ListBuffer[Content]()

  // Add content to the list (simulating saving to a DB)
  def save(content: Content): Unit = {
    contentList += content
    println(s"Content with ID ${content.id} saved successfully!")
  }

  // Retrieve all contents (simulating fetching from a DB)
  def getAll: List[Content] = contentList.toList
}

// Main application object
object Main extends App {

  // Function to create new content
  def createContent(title: String, body: String, author: String): Content = {
    val id = ContentDao.getAll.size + 1  // Simple ID generation
    val content = Content(id, title, body, author, new Date())
    ContentDao.save(content)
    content
  }

  // Function to display all conte@@nt
  def displayAllContent(): Unit = {
    val allContent = ContentDao.getAll
    if (allContent.isEmpty) {
      println("No content available.")
    } else {
      println("All content:")
      allContent.foreach(c => {
        println(s"ID: ${c.id}, Title: ${c.title}, Author: ${c.author}, Created: ${c.createdAt}")
      })
    }
  }

  // Let's simulate the application by creating some content and displaying it.
  println("Starting the Content Management System...")
  
  // Create some content
  createContent("Scala Tutorial", "This is a tutorial on Scala.", "John Doe")
  createContent("Learning Scala", "Scala is a powerful language.", "Jane Doe")
  
  // Display all the created content
  displayAllContent()
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 