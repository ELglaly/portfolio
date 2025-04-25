package com.protifolio.portfolio.model;

import lombok.*;

import java.sql.Blob;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Experience {
    private String companyName;
    private String position;
    private String startDate;
    private String endDate;
    private String description;
    private List<Blob> image;
}
