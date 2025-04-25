package com.protifolio.portfolio.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Certificate {
    private String institutionName;
    private String certificateName;;
    private String certificateLink;
    private String date;
    private String description;
}
