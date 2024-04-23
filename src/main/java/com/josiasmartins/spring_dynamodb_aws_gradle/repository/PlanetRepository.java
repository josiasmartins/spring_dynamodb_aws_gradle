package com.josiasmartins.spring_dynamodb_aws_gradle.repository;

import com.josiasmartins.spring_dynamodb_aws_gradle.entity.Planet;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface PlanetRepository extends CrudRepository<Planet, String> {
}
