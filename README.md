# 🛒 ECommerce Automation Framework


This project is an **Automation Testing Framework** for the **ECommerce web application**, built using **Java, Selenium, TestNG, Maven, and Extent Reports**.  
It automates critical workflows like login, product search, add to cart to ensure high-quality software delivery.


## 🚀 Tech Stack
- **Java** – Programming Language  
- **Selenium WebDriver** – Browser automation  
- **TestNG** – Test framework  
- **Maven** – Build & dependency management  
- **Extent Reports** – Reporting  


## 📂 Project Structure
ECommerce-Automation/
│── src/test/java/ # Test scripts
│ ├── testcases/ # Test classes
│ ├── pages/ # Page Object classes
│ ├── utils/ # Utility/helper classes
│── src/main/resources/ # Config files (properties, test data)
│── reports/ # Extent HTML reports
│── testng.xml # TestNG suite file
│── pom.xml # Maven dependencies
│── README.md # Project documentation


---

## ⚙️ Prerequisites
- Java 24.0.2 
- Maven 3.6+  
- IDE Eclipse 
- Browser driver ChromeDriver  


## ▶️ How to Run Tests
### Run via Maven
```cmd
mvn clean test


📊 Test Reports
After execution, Extent Reports will be generated at:
/reports/ExtentReport.html
Open the file in a browser to view detailed results with screenshots.

🔄 CI/CD Integration
Can be integrated with Jenkins for scheduled test runs.
Configure Publish HTML Reports plugin in Jenkins with path:
reports/ExtentReport.html

🧑‍💻 Author
Mahesh Motkar
Automation Test Engineer



