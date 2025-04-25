package com.protifolio.portfolio.model;

import lombok.*;

import java.sql.Blob;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Education {
    private String institutionName;
    private String degree;
    private String location;
    private String startDate;
    private String endDate;
    private String grade;
    private List<String> image;
    private String description;
}
