package com.protifolio.portfolio.service;

import com.protifolio.portfolio.model.*;

import java.util.List;

public interface IProfileService {

    public Profile getProfile();
    public List<Certificate> getCertifications();
    public List<Education> getEducation();
    public List<Experience> getExperience();
    public List<Project> getProjects();
    public List<StudentActivities> getStudentActivities();
    public List<Award> getAwards();
}
