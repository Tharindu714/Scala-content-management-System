package servlet;

import service.ContentService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {

    private ContentService contentService;

    @Override
    public void init() throws ServletException {
        contentService = new ContentService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set encoding to support UTF-8
        request.setCharacterEncoding("UTF-8");

        // Retrieve form data
        String title = request.getParameter("title");
        String body = request.getParameter("body");
        String author = request.getParameter("author");

        // Validate form fields
        if (title == null || title.isEmpty() || body == null || body.isEmpty() || author == null || author.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "All fields are required.");
            return;
        }

        // Create content using the service
        contentService.createContent(title, body, author);

        // Redirect to a success page or back to the form
        response.sendRedirect("index.html");
    }
}

