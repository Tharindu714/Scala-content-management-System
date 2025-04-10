package service;

import dao.ContentDao;
import model.contentModel;

import java.util.Date;

public class ContentService {

    private ContentDao contentDao;

    public ContentService() {
        contentDao = new ContentDao();
    }

    // Method to create content
    public void createContent(String title, String body, String author) {
        contentModel content = new contentModel(title, body, author, new Date());
        contentDao.saveContent(content);
    }
}
