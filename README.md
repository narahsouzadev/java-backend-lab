# ☕ Java Backend Lab

Welcome to my Java Backend Lab repository. This repository documents my practical journey in mastering Java and backend engineering from the ground up, starting from foundational syntax and core logic to building robust APIs, persistence layers, and microservices.

## 🎯 Repository Purpose

* Build clean, maintainable, and idiomatic Java applications.
* Master core programming concepts without relying prematurely on heavy abstractions or frameworks.
* Develop a structured, production-ready portfolio following industry standards and best practices:
  * **Naming conventions:** PascalCase for classes, camelCase for methods/variables, lowercase for packages, and kebab-case for repository/project folders.
  * **English-only code:** Variables, methods, documentation, commit messages, and CLI interfaces written in English.
  * **Conventional Commits:** Clear, semantic commit history (e.g., feat, fix, refactor, docs).

## 🗺️ Learning Roadmap

### Phase 1: Core Fundamentals & CLI Applications (Current)
* Primitives, relational/logical operators, control flow (if/else, switch), loops (while, for).
* Interactive CLI programs using Scanner, input validation, and clean console formatting.
* Resource management and proper stream closing.

### Phase 2: Object-Oriented Programming & Data Structures
* Encapsulation, inheritance, polymorphism, interfaces, and abstract classes.
* Java Collections Framework (List, Set, Map) and Exception Handling.

### Phase 3: Persistence, Clean Architecture & APIs
* Relational databases (PostgreSQL), JDBC, JPA/Hibernate.
* RESTful API design, HTTP protocols, and layered architecture.

### Phase 4: Enterprise Backend & Cloud Ecosystem
* Spring Boot, Spring Security, automated testing (JUnit, Mockito).
* Docker, CI/CD pipelines, and cloud deployment.

## 📂 Projects Catalog

| Project | Description | Core Concepts |
| :--- | :--- | :--- |
| [**Tally Counter**](src/main/java/io/github/narahsouzadev/tallycounter/) | Interactive terminal counter with increment, decrement, reset, and quit controls. | Primitive types (int), while loop, if/else branching, Scanner input handling |
| [**BMI Calculator**](src/main/java/io/github/narahsouzadev/bmicalculator/) | CLI tool that calculates Body Mass Index, validates user inputs, and displays WHO weight status categories. | Input validation (hasNextDouble/hasNextInt), Locale management (Locale.US), formatted output (printf), conditional logic (if/else), resource management (close) |
| [**Parity and Sign Checker**](src/main/java/io/github/narahsouzadev/parityandsignchecker/) | CLI tool that analyzes an integer to determine its parity (even/odd) and sign (positive, negative, or neutral zero). | Modulo operator (%), comparison operators, nested/chained conditional logic (if/else if/else), input validation (hasNextInt), resource management (close) |
| [**Coin Flip**](src/main/java/io/github/narahsouzadev/games/) | Interactive CLI coin toss simulator featuring binary outcome generation, interactive replay menu, and defensive input validation. | Pseudo-random generation (Random.nextBoolean), control flow (while loop, switch statement), exception prevention (hasNextInt), resource management (close) |


## 🛠️ Tech Stack & Environment

* **Language:** Java 17+ / 21 LTS
* **Build Tool:** Maven / Gradle
* **IDE:** IntelliJ IDEA
* **Version Control:** Git & GitHub (Conventional Commits)

## 👤 Author

Developed by **Narah Souza** ([GitHub Profile](https://github.com/narahsouzadev)).