package com.protifolio.portfolio.model;

import lombok.*;

import java.sql.Blob;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentActivities {
    private String activityName;
    private String activityTitle;
    private String activityDescription;
    private String activityDate;
    private List<Blob> images;
}
