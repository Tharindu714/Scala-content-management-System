package com.scalatutorial.servlet;

import com.scalatutorial.dao.ContentDao;
import com.scalatutorial.model.Content;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {

    private ContentDao contentDao;

    @Override
    public void init() {
        contentDao = new ContentDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set encoding
        request.setCharacterEncoding("UTF-8");

        // Get form data
        String title = request.getParameter("title");
        String body = request.getParameter("body");
        String author = request.getParameter("author");

        // Create new Content object
        Content content = new Content();
        content.setTitle(title);
        content.setBody(body);
        content.setAuthor(author);

        // Save content
        contentDao.saveContent(content);

        // Redirect back to index or show success
        response.sendRedirect("index.html");
    }
}
