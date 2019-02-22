package com.elastic.searchserviceone.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "search-service", type = "customer", shards = 2)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    @Id
    private  String id;
    private String firstName;
    private String lastName;
    private int age;
}
