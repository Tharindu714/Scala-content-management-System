package service;

import com.scalatutorial.dao.ContentDao
import com.scalatutorial.model.Content
import java.util.Date

class contentService(contentDao: ContentDao) {

  // Method to create content
  def createContent(title: String, body: String, author: String): Content = {
    val content = new Content(title = title, body = body, author = author, createdAt = new Date())
    contentDao.saveContent(content)
    content
  }
}
