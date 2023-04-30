# HealthMonitoringSystem
The monitoring of a patient's general health is one of the many functions for which the health monitoring system is intended (that is, temperature, blood pressure, and heart rate), A disease forecast bot, a prescription bot, and a news feed enabling doctors and nurses to stay current on health news domestically and overseas. It is intended to be used by Health workers specifically Doctors and nurses.

The user interface (UI) of a health monitoring system was designed to be user-friendly and easy to navigate. The system was designed to display the user's health data in a clear and organized manner. The system also provides notifications and alerts for the users to take actions based on their health status. The UI has a dashboard that displays the patients' health data, such as name, heart rate, blood pressure, temperature, in real-time. The UI also includes a feature that allows users to input additional health data. This feature is designed to be intuitive and easy to use, allowing users to quickly and easily enter the information of patients. The UI also includes a disease forecast bot to assist doctors with diagnosis using only symptoms and a prescription bot to assist with drug prescriptions for specific illnesses.

The data design of the health monitoring system is designed to be secure and efficient. The system is able to collect and store large amounts of health data without compromising the user's privacy or security. The data design includes a database that stores the user's health data. The database is designed to be scalable and easily accessible, allowing the system to handle large amounts of data without slowing down. The data design also includes a system for data analysis. The system is able to analyses the user's health data to identify trends and patterns. The system is also able to generate reports based on the user's data, allowing them to share their health data with their healthcare provider. The data design also includes security features, such as encryption and authentication, to ensure  that the user's health data is protected from unauthorized access. The system is also complied with relevant data privacy regulations, such as HIPAA, to ensure that the user's health data is handled in accordance with established guidelines.

Description on how the app works

The user must login using a username and password (for example, username=Ps/csc/20/999 password=12345678).
After pressing the login button, the user is taken to the main page, where he or she sees a dashboard on the left side of the screen with the options "Patients," "AI_Diagnoser," "AI_Prescriber," and "Lougout."
The Patients button takes the user to the Patients page, which provides information about each patient admitted to the hospital. These details include the following: first name, middle name, last name, status, and temperature. The page also has an Add Patient button, which allows the user to add, update , or delete patient information.
The AI diagnoser button takes the user to the AI diagnoser page, which aids clinicians in making diagnoses based solely on symptoms.
The AI prescriber button takes the user to the AI prescriber page, which helps doctors prescribe medications based on the disease.
The Logout button logs out the user and returns the user to the Login page.

Prerequisites

Before you can use the Health Monitoring System, you'll need to have the following installed on your system:

Java Development Kit (JDK) version 8 or later
NetBeans IDE version 8.2 or later
MySQL database version 5.7 or later


Installation

To install the Health Monitoring System, follow these steps:

1. Clone the repository from GitHub to your local machine.
2. git clone https://github.com/tefy490/healthmonitoringsystem.git
3. Open NetBeans and select "Open Project" from the File menu.
4. Navigate to the directory where you cloned the repository and select the health-monitoring-system folder.
5. Wait for NetBeans to import the project and resolve any dependencies.
6. Open the database.sql file located in the sql folder and run the SQL commands to create the necessary database and tables in MySQL.
7. Open the src > database > DatabaseConnection.java file and modify the connection details to match your local MySQL setup.
8. private static final String URL = "jdbc:mysql://localhost:3306/HMS";
9. private static final String USER = "root";
10. private static final String PASSWORD = "F$48469star";
11. Build and run the project from NetBeans.


Troubleshooting
If you encounter any issues when trying to get the Health Monitoring System up and running, here are some troubleshooting tips:

1. Make sure you have the required prerequisites installed and configured correctly.
2. Check that the MySQL database is running and accessible from your local machine.
3. Verify that the connection details in the DatabaseConnection.java file are correct.
4. Check for any error messages or exceptions in the NetBeans console or log files.
