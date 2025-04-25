package com.protifolio.portfolio.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
    private Long id;
    private String name;
    private String bio;
    private List<String> skills;
    private List<Project> Projects;
    private String contactEmail;
    private String phone;
    private String address;
    private String githubLink;
    private String linkedinLink;
    private String cvLink;
    private String profilePictureLink;
    private String about;
    private List<Certificate> certifications;
    private List<Education> education;
    private List<Award> Awards;
    private List<Experience> Experiences;

   // private Blob profilePicture;

}