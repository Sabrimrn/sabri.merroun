Anderlechtse NGO Website
Een webapp voor een Anderlechtse NGO die zich inzet voor gemeenschapsbouwen en hulp aan mensen die het minder breed hebben.

Gebruikte Frameworks en Technologies:

Backend:
Spring Boot 3.x - Main framework voor de applicatie
Spring Web - Voor web controllers en REST endpoints
Spring Data JPA - Voor database operaties
Thymeleaf - Template engine voor server-side rendering
MySQL Driver - Database connectiviteit

Frontend:
Thymeleaf - Server-side template rendering
Tailwind CSS - CSS framework via CDN voor styling
HTML5 - Markup language

Database:
MySQL - Relationele database


Deployment Instructies:

Lokale Development:
Zorg dat MySQL draait in WSL
Run de Spring Boot applicatie via IntelliJ
Navigeer naar http://localhost:8080

Database Schema:
De applicatie maakt automatisch tabellen aan:

evenementen - Bevat alle evenement data
locaties - Bevat locatie informatie
Foreign key relatie tussen evenementen en locaties

Functionaliteiten:
Index pagina: Overzicht van laatste 10 evenementen
Nieuw evenement: Formulier om evenementen toe te voegen
Details pagina: Volledige informatie per evenement
About pagina: Informatie over de NGO


Gebruikte Resources:

Documentatie:
[Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
[Spring Data JPA Reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
[Thymeleaf Documentation](https://www.thymeleaf.org/documentation.html)
[Tailwind CSS Documentation](https://tailwindcss.com/docs)

Tutorials:
Spring Boot Getting Started Guide - Voor project setup
Thymeleaf + Spring Boot Tutorial - Voor template integration
Spring Data JPA Tutorial - Voor database operaties
MySQL met Spring Boot - Voor database configuratie

Online Resources:
Stack Overflow - Voor specifieke implementatie problemen
Baeldung Spring tutorials - Voor best practices
MDN Web Docs - Voor HTML/CSS referenties

AI Tool Usage:

ChatGPT/Claude - Gebruikt voor:

HTML template structuur en Tailwind CSS klassen
CSS styling advies en responsive design
Debugging van Thymeleaf syntax
Generatie van realistische test data voor evenementen
Code review en optimalisatie suggesties

Nota: De core Java Spring Boot logica, database design en controller implementatie heb ik zelf geschreven gebaseerd op les materiaal en documentatie.

Test Data:
De applicatie bevat automatisch 10 test evenementen en 5 locaties die worden geladen bij opstarten via de DataLoader klasse.
