# Hibernate

Steps to Integrate Hibernate with Eclipse :

1) Install Jboss tools from Eclipse Marketplace

Help - Eclipse Marketplace - jboss tools 4.2.30 Final -> select hibernate and deselect others (Wait for it to install , it will take huge time)

2) Create Maven Project :

New Project - Maven - Maven Project - next - next - configure - catalog->Internal - maven_archetype_quickstart - Enter any Groupid and Artifact Id

3) Edit the pom.xml by entering the required Dependencies, save and restart Eclipse - You will have the Maven Dependencies folder filled.
4) Enter the required code in App.java and Create a student.java file where App.java is located and Enter the required code.

5) to get configuration.cfg.xml

In Eclipse IDE, Right click on the main folder - new - source folder - give the name as src/main/resources - finish

right click on the src/main/resources folder and click new - other - hibernate - configuration.cfg.xml - next - finish - source(at the bottom)

Edit the configuration.cfg.xml file as required.

6) Create Databases and tables as per Requirement
