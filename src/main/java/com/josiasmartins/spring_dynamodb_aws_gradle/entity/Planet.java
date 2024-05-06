package com.josiasmartins.spring_dynamodb_aws_gradle.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.josiasmartins.spring_dynamodb_aws_gradle.models.DTO.PlanetRequest;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName = "tb_planet")
@Data
@NoArgsConstructor
//@Builder
public class Planet {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "planet_childreen")
    private String planetChildren;

    public Planet(PlanetRequest planetRequest) {
        this.name = planetRequest.name();
        this.planetChildren = planetRequest.planetChildren();
    }

}
