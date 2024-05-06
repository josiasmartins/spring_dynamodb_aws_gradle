package com.josiasmartins.spring_dynamodb_aws_gradle.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.josiasmartins.spring_dynamodb_aws_gradle.entity.Planet;
import com.josiasmartins.spring_dynamodb_aws_gradle.models.DTO.PlanetRequest;
import com.josiasmartins.spring_dynamodb_aws_gradle.models.DTO.PlanetResponse;
import com.josiasmartins.spring_dynamodb_aws_gradle.repository.PlanetRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

//@WebMvcTest(PlanetController.class)
@ExtendWith(MockitoExtension.class)
public class PlanetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Mock
    private PlanetRepository planetRepository;

    @InjectMocks
    private PlanetController planetController;

    private Planet planet;

    @BeforeEach
    void setup() {

        Planet planet = new Planet();
        planet.setPlanetChildren("planet children");
        planet.setId("1");

        this.planet = planet;

//        this.planet = Planet.builder()
//                .id("1")
//                .planetChildren("planet children")
//                .build();
    }

    @Test
    void shouldCreatePlanetReturnSuccess() {
        Mockito.when(planetRepository.save(Mockito.any())).thenReturn(planet);

        PlanetRequest planetRequest = new PlanetRequest("name_planet", "children");

        PlanetResponse result = this.planetController.createPlanet(planetRequest);

        Assertions.assertEquals(result.getPlanetChildren(), "planet children");
    }


}
