package com.bumbeneciconstantinbogdan.service.discovery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlantDto {
    private String name;
    private String description;
    private String power;
    private String actualPower;
    private String link;
}

