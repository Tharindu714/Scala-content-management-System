package servlet

import dao.ContentDao
import model.Content

import javax.servlet._
import javax.servlet.annotation._
import javax.servlet.http._
import java.io.IOException

@WebServlet(Array("/content"))
class ContentServlet extends HttpServlet {

  private var contentDao: ContentDao = _

  override def init(): Unit = {
    contentDao = new ContentDao()
  }

  @throws[ServletException]
  @throws[IOException]
  override def doPost(request: HttpServletRequest, response: HttpServletResponse): Unit = {

    // Set encoding
    request.setCharacterEncoding("UTF-8")

    // Get form data
    val title = request.getParameter("title")
    val body = request.getParameter("body")
    val author = request.getParameter("author")

    // Create new Content object
    val content = new Content(title = title, body = body, author = author, createdAt = new java.util.Date())

    // Save content
    contentDao.saveContent(content)

    // Redirect back to index or show success
    response.sendRedirect("index.html")
  }
}

