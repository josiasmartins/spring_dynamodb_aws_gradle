//package com.josiasmartins.spring_dynamodb_aws_gradle.repository;
//
//
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
//import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedList;
//import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
//import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
//import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
//import com.josiasmartins.spring_dynamodb_aws_gradle.entity.Planet;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.InstanceOfAssertFactories.LIST;
//import static org.hamcrest.Matchers.is;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
////@RunWith(SpringJUnit4ClassRunner.class)
////@SpringBootTest(classes = Application.class)
////@WebAppConfiguration
//////@ActiveProfiles("local")
////@TestPropertySource(properties = {
////        "amazon.dynamodb.endpoint=http://localhost:8000/",
////        "amazon.aws.accesskey=test1",
////        "amazon.aws.secretkey=test231" })
//public class PlanetRepositoryTest {
//
//    @Mock
//    private DynamoDBMapper dynamoDBMapper;
//
////    @Autowired
////    private AmazonDynamoDB amazonDynamoDB;
//
//    @InjectMocks
//    private PlanetRepository planetRepository;
//
//    @BeforeEach
//    void setup() {
//
//        MockitoAnnotations.initMocks(this);
//
//    }
//
//    @Test
//    public void shouldGetPlanetById() {
//
//
////        when(dynamoDBMapper.scan(Product.class, new DynamoDBScanExpression())).thenReturn(products);
//        List<Planet> planets = new ArrayList<>();
//
//        Planet planet = new Planet();
//        planet.setId("1");
//        planet.setName("planet");
//        planet.setPlanetChildren("children");
//
//        planets.add(planet);
//
//
////        PaginatedScanList<Planet> planets = new PaginatedScanList();
//
//       // Mockito.when(dynamoDBMapper.scan(Planet.class, new DynamoDBScanExpression())).thenReturn(new PaginatedScanList<>(null, planets));
//
//
//        Mockito.when(dynamoDBMapper.scan(Mockito.any(), Mockito.any())).thenReturn(new PaginatedScanList<>(null, planets));
//
//        planetRepository.save(planet);
//
//        Planet result = planetRepository.findById("1").get();
//
//        assertEquals(result.getPlanetChildren(), "children");
//
//    }
//
//}
