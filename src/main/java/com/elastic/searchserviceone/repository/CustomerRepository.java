package com.elastic.searchserviceone.repository;

import com.elastic.searchserviceone.models.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
    List<Customer> findByFirstName(String firstName);
}
