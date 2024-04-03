# FitnesstrackerAPI

FitnesstrackerAPI is the backend of a Fitness Tracker application, built using Spring Boot, Spring Data JPA, Spring Security, and SQL.

## Technologies Used

- **Spring Boot**: Provides a robust framework for building Java-based applications.
- **Spring Data JPA**: Simplifies data access by leveraging the power of JPA (Java Persistence API) and Hibernate.
- **Spring Security**: Offers authentication and authorization capabilities to secure your application.
- **SQL**: Utilized for database management.

- ## Frontend

The frontend part of the Fitness Tracker application can be found [here](https://github.com/Kaarnis/FitnessTrackerFrontEnd). Please make sure to check it out for the complete experience.


## Getting Started

To get started with FitnesstrackerAPI, follow these steps:

1. **Clone the repository:**

   ```bash
   git clone <repository-url>

2. **Set up the Database:**

   Ensure you have a SQL database installed (e.g., MySQL, PostgreSQL) and update the `application.properties` file with your database configurations.

3. **Run the Application:**

   You can run the application using Maven or your preferred IDE. 

   - Using Maven:
     ```bash
     mvn spring-boot:run
     ```

4. **Testing:**

   You can test the API endpoints using tools like Postman or curl. The available endpoints should include routes for managing fitness activities, user profiles, authentication, etc.

## Configuration

The application configuration can be found in the `application.properties` file, where you can customize properties such as database connection details, server port, security configurations, etc.
