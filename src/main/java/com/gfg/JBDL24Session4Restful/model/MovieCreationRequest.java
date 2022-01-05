package com.gfg.JBDL24Session4Restful.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MovieCreationRequest {
    private String movieName;
    private Integer rating;
}
