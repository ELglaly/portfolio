package com.protifolio.portfolio.model;

import lombok.*;

import java.sql.Blob;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Award {
    private Long id;
    private String organizationName;
    private String title;
    private String description;
    private String date;
    private String images;
    private String link;

}
