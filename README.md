# Scala-content-management-System 🎉

Welcome to **ScalaCMS**, a lightweight content management system built with Scala and Java! This project demonstrates a multi-language project structure combining both Scala and Java codebases. It features a simple content creation API, database integration with Hibernate and MySQL, and a web interface using Java Servlets on GlassFish 7.

---

## Features 🚀

- **Content Model:** Manage content with title, body, author, and created-at timestamp.
- **DAO Pattern:** Clean separation of data access logic using a Data Access Object (DAO).
- **Service Layer:** Encapsulate business logic separately for easy testing and maintenance.
- **Web Interface:** A simple servlet-based web UI for content management.
- **Command-Line Demo:** A Scala CLI app (`Main.scala`) to simulate content creation.
- **Database Integration:** Hibernate ORM backed by a MySQL database.
- **Logging & Error Handling:** Basic logging and validation to ensure robust operations.

---

## Project Structure 📁

```plaintext
ScalaCMS/
├── src/
│   ├── main/
│   │   ├── java/                 # Java code (Model, DAO, Service, Servlet)
│   │   ├── scala/                # Scala code (Main.scala, etc.)
│   │   ├── resources/            # Configuration files (hibernate.cfg.xml, etc.)
│   │   └── webapp/               # Web resources (HTML, WEB-INF, etc.)
├── build.sbt                   # SBT build file
├── project/
│   └── plugins.sbt             # SBT plugin configuration
└── README.md                   # Project overview (this file)
