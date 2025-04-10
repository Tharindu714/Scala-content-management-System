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
```
## Getting Started 🔧
**Prerequisites**
<li>JDK 11+</li>
<li>Scala 2.13.13</li>
<li>SBT (Scala Build Tool)</li>
<li>GlassFish 7 (or any compatible Java EE server)</li>
<li>MySQL 8+</li>

## Setup Instructions
**Clone the Repository:**
```bash
git clone https://github.com/Tharindu714/Scala-content-management-System.git
cd Scala-content-management-System
```

## Configure the Database:
- Create a MySQL database (e.g., cms).
- Update the hibernate.cfg.xml file in src/main/resources/ with your database URL, username, and password.
<br>
<li>(Optional) Run the provided SQL Script to create necessary tables.</li>
<li>Link >> https://github.com/Tharindu714/Scala-content-management-System/blob/main/DB_backup.sql</li>

## Build the Project:
```bash
sbt clean package
```
- This will generate a WAR file in the target/scala-2.13/ directory.

## Deploy to GlassFish:
- Start GlassFish 7 and open the Admin Console at http://localhost:4848.
- Deploy the WAR file (ScalaTutorial.war) via the Admin Console under Applications → Deploy.
- Access your application at http://localhost:8080/ScalaTutorial/.

**Run the Command-Line Demo: To try out the Scala CLI demo, simply run:**

```bash
sbt run
```
This will execute the Main.scala application that simulates content creation and displays the created contents.

## Usage 💡
- Web Interface: Use your browser to visit the deployed URL. Fill in the form to create new content. The data will be persisted to your MySQL database.
- Command-Line App: Use the Scala CLI to simulate content creation and see the list of saved content right in your terminal.

## Contributing 🤝
Contributions are welcome! Feel free to fork the repository, create a feature branch, and submit a pull request. Please follow the code style and include tests for your features.

## License 📄
This project is licensed under the MIT License. See the [LICENSE](https://github.com/Tharindu714/Scala-content-management-System/blob/main/LICENSE) file for details.

**Enjoy coding in Scala and Java, and happy building!** 😄🚀
