package com.protifolio.portfolio.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
    private Long id;
    private String name;
    private List<String> technologiesUsed;
    private String description;
    private String image;
    private String link;
}
