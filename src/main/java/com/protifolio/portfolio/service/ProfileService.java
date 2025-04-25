package com.protifolio.portfolio.service;


import com.protifolio.portfolio.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProfileService implements IProfileService {
    @Override
    public Profile getProfile() {
        return Profile.builder()
                .name("Sherif Elglaly")
                .contactEmail("sherifelglaly@gmail.com")
                .phone("+201026386402")
                .address("Cairo, Egypt")
                .githubLink("")
                .linkedinLink("https://www.linkedin.com/in/sherif-elglaly/")
                .bio("Senior Software Engineering Student | USAID Scholar")
                .cvLink("https://drive.google.com/file/d/1fAYtBeMlPgOq1fGOxcNqI4VSxeVBwPjV/view?usp=sharing")
                .githubLink("https://github.com/ELglaly")
                .education(getEducation())
                .Experiences(getExperience())
                .Projects(getProjects())
                .about(getAbout())
                .Awards(getAwards())
                .id(1L)
                .skills(getSkills())
                .build();
    }

    private List<String> getSkills() {
        return List.of(
                "Programming Languages: C#, Python, C++, Java, R",
                "Version Control: Git",
                "Development Principles: Design Patterns, SOLID Principles, Data Structures & Algorithms, OOP, Agile",
                "Web Development: ASP.NET, HTML, CSS, Bootstrap, JSON, AJAX, Spring Boot, Spring Security, Spring Data",
                "Desktop Development: .NET, JavaFX",
                "Languages: Arabic, English",
                "Testing: JUnit 5, Mockito",
                "Database: MySQL, SQL Server"
        );
    }

    private String getAbout() {
        return "My name is Sherif Shawshen. preferred by Sherif Elglaly. I am a senior Software Engineering student at Assiut University, currently ranked fourth in my department, and a USAID Scholar as a recipient of a USAID scholarship for my bachelor's degree.\n" +
                "\n" +
                "When I first started studying Software Engineering, my goal was to improve my skills " +
                "in software development and its applications. While this focus helped me do well " +
                "academically, I’ve always wanted to learn more beyond what was required in my courses." +
                " My experiences during my studies, internships, and exchange program have shaped my skills, " +
                "aspirations, and desire to continue my education.\n";
    }

    @Override
    public List<Certificate> getCertifications() {
        return List.of();
    }

    @Override
    public List<Education> getEducation() {
                return Arrays.asList(
                        // University of Arizona
                        Education.builder()
                                .institutionName("University of Arizona")
                                .degree("Non-Degree Seeking, Computer Science")
                                .location("Tucson, Arizona, USA")
                                .startDate("Aug 2024")
                                .endDate("Present")
                                .grade("4.00")
                                .description("During my time as an exchange student at the University of Arizona, I've had the opportunity to dive into advanced coursework and develop a strong foundation in key areas of Computer Science. I'm proud to have earned a perfect GPA of 4.0.\n")
                                       .build(),

                        // AUC - School of Continuing Education
                        Education.builder()
                                .institutionName("AUC - School of Continuing Education")
                                .degree("Vocational Program, English Language")
                                .location("Cairo, Egypt")
                                .startDate("Nov 2021")
                                .endDate("April 2024")
                                .grade("Completed with 93%")
                                .description("I completed a Vocational Program in English Language at the American University in Cairo's School of Continuing Education. This program helped me improve my English communication skills, both in speaking and writing. It gave me the confidence to express my ideas clearly and work effectively in teams, which has been really helpful in both my studies and any professional settings.")
                                .build(),

                        // Assiut University
                        Education.builder()
                                .institutionName("Assiut University")
                                .degree("Bachelor's degree, Computer Software Engineering")
                                .location("Assiut, Egypt")
                                .startDate("Sep 2021")
                                .endDate("Expected Jun 2025")
                                .grade("3.59")
                                .description("𝘼𝙘𝙖𝙙𝙚𝙢𝙞𝙘 𝘼𝙘𝙝𝙞𝙚𝙫𝙚𝙢𝙚𝙣𝙩: securing fourth place in the Software Engineering department")
                                .build()
                );
    }

    @Override
    public List<Experience> getExperience() {
                return Arrays.asList(
                        // Wavemakers United experience
                        Experience.builder()
                                .companyName("Wavemakers United")
                                .position("Software Engineer (Part-time)")
                                .startDate("Mar 2024")
                                .endDate("Jul 2024")
                                .description("I was part of a three-member team developing the company's Educational Platform. My main responsibilities included:\n\n" +
                                        "1. 𝗥𝗲𝗾𝘂𝗶𝗿𝗲𝗺𝗲𝗻𝘁 𝗚𝗮𝘁𝗵𝗲𝗿𝗶𝗻𝗴: Collaborated with the team to collect, analyze, and document system requirements, ensuring they matched the platform's goals and user needs.\n" +
                                        "2. SRS Documentation: Created a detailed Software Requirements Specification (SRS), covering:\n" +
                                        "   • Functional Requirements: User authentication, course management, and reporting.\n" +
                                        "   • Non-Functional Requirements: Performance, scalability, and security.\n" +
                                        "3. System Design: Assisted in designing the system architecture, defining components, their interactions, and data flow.\n\n" +
                                        "Skills: Sustainable Development Goals (SDG), Software Development, Requirements Analysis, System Design, Documentation")
                                .build(),

                        // ALMOSTAKBAL TECHNOLOGY experience
                        Experience.builder()
                                .companyName("ALMOSTAKBAL TECHNOLOGY")
                                .position("Software Engineer Intern")
                                .startDate("Sep 2023")
                                .endDate("Oct 2023")
                                .description("I worked with senior developers to build and optimize key features of the platform, focusing on performance and scalability. " +
                                        "This included improving how the platform handled large amounts of data while keeping it fast and reliable.\n\n" +
                                        "I also talked directly with customers to understand their needs and challenges. By listening to their feedback, " +
                                        "I helped create solutions that worked for them. I followed up to make improvements, ensuring the final product " +
                                        "met their expectations and was easy to use.\n\n" +
                                        "Skills: Dart, Mobile Applications, Customer Engagement, Performance Optimization, Scalability")
                                .build()
                );
    }

    @Override
    public List<Project> getProjects() {
        Project project1 = Project.builder()
                .id(1L)
                .name("E-commerce Platform")
                .description("""
        A robust and scalable e-commerce platform built with Spring Boot. 
        This system enables users to browse products, manage their shopping cart, and complete secure purchases. 
        It includes an admin panel for managing products, orders, and users. 
        Designed with modern best practices, this project is ideal for businesses looking to establish or expand their online presence.
    """)
                .link("https://github.com/ELglaly/Ecommerce-SpringBoot")
                .image("/static/images/icons8-github.svg")
                .technologiesUsed(List.of(
        "Java", "Spring Boot", "Spring Security", "Spring Data JPA", "Hibernate", "JavaMailSender",
        "MySQL", "H2 Database (Testing)", "Stripe/PayPal APIs", "React", "HTML", "CSS", "JavaScript", "Redis", "🧪 Tested with JUnit 5 & Mockito", " 🔐 JWT-based")).build();

        Project project2 = Project.builder()
                .name("Lexical Analyzer & Arabic Language Parser")
                .id(2L)
                .image("")
                .description("""
        This project implements a Lexical Analyzer and Parser for a custom programming language that supports Arabic keywords.
        It features tokenization and syntactic analysis capabilities to build an Abstract Syntax Tree (AST) for source code interpretation      
    """)
                .link("https://github.com/ELglaly/Simple-Arabic-Compiler") // Replace with actual link
                .technologiesUsed(List.of("C#", ".NET Core", "ASP.NET", "Visual Studio Code", "HTML", "CSS"))
                .image("/static/images/icons8-github.svg")
                .build();


        Project roadmapProject = Project.builder()
                .id(3L)
                .name("🗺️ AI-Powered Learning Roadmap Generator")
                .description("An intelligent and modular Learning Roadmap Generator built with Spring Boot and integrated with AI services. The system creates personalized learning paths based on user preferences, experience levels, and target goals using AI-driven recommendations. It features real-time progress tracking via WebSocket, Redis caching for improved performance, and comprehensive resource management for each milestone.")
                .technologiesUsed(List.of (
                        "Java 23",
                        "Spring Boot 3.4.3",
                        "Spring Security with JWT",
                        "Spring WebSocket",
                        "Spring Data JPA",
                        "Spring AI OpenAI",
                        "Google Cloud AI Platform",
                        "MySQL",
                        "Redis 7.4.2",
                        "Maven 3.9.9",
                        "Lombok",
                        "MapStruct",
                        "JUnit 5"
                ))
                .link("https://github.com/ELglaly/Roadmap-Makerr") // Replace with actual project repo or demo link
                .image("/static/images/icons8-github.svg")
                .build();



        return List.of(project1,roadmapProject,project2);
    }

    @Override
    public List<StudentActivities> getStudentActivities() {
        return List.of();
    }

    @Override
    public List<Award> getAwards() {
        Award award2 = Award.builder()
                .id(2L)
                .organizationName("USAID Egypt")
                .title("USAID Scholarship")
                .description("Successfully awarded a scholarship for my bachelor Degree in computer Science with 140 students by the United States Agency for International Development \n" +
                        "(USAID) in collaboration with the American University in Cairo.")
                .images("/static/images/accomplishments/usaid2.jpg")
                .link("#")
                .date("2021-09-23")
                .build();

        Award award4 = Award.builder()
                .id(4L)
                .organizationName("Ministry of Planning and Economic Development & NIGSD")
                .title("Certified Sustainable Development Trainer")
                .description("Officially certified as a Sustainable Development Trainer" +
                        " for the next two years after intensive training in soft skills," +
                        " sustainable development, and governance, as part of a Train-the-Trainer program.")
                .images("/static/images/accomplishments/tottraining.jpeg") // Replace with actual image path
                .date("2023-10-25")
                .link("https://www.linkedin.com/posts/sherif-elglaly_tot-sustainabledevelopment-sdgs-activity-7227281904629121024-7-mI?utm_source=share&utm_medium=member_desktop&rcm=ACoAADsZRV8Bv4m4WZ1msQzpVXuMyTE8adz5KJA")
                .build();

        Award award5 = Award.builder()
                .id(5L)
                .organizationName("ICPC Mansoura")
                .title("Top 10 – Game of Coders Competition")
                .description("Awarded for achieving a top 10 position in the Game of Coders competitive programming competition, showcasing strong problem-solving skills and teamwork.")
                .images("/static/images/accomplishments/gameofcoder.jpeg") // Replace with actual image path
                .date("2023-07-26")
                .link("https://drive.google.com/drive/folders/1okDaaK--EBTT3rwpUUW2O22QlhdgsbZK") // Optional: Replace with competition/certificate link
                .build();

        Award award6 = Award.builder()
                .id(6L)
                .organizationName("Hult Prize – Assiut University")
                .title("1st Place – Hult Prize Assiut University")
                .description("Awarded 1st place for a project " +
                        "focused on biofuel production through bacterial fermentation and agricultural waste," +
                        " showcasing innovation, sustainability, and entrepreneurial spirit.")
                .images("/static/images//accomplishments/hult_prize.jpeg") // Replace with actual image path
                .date("2024-03-01")
                .link("https://www.linkedin.com/posts/pola-frans_hultprizewinner-biofuelinnovation-assiutuniversity-ugcPost-7171944912186294272-iwpL?utm_source=share&utm_medium=member_desktop&rcm=ACoAADsZRV8Bv4m4WZ1msQzpVXuMyTE8adz5KJA") // Optional: link to project, certificate, or post
                .build();

        return List.of( award2, award5, award4, award6);
    }
}
