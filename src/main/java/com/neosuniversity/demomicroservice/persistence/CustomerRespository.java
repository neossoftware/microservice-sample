package com.neosuniversity.demomicroservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRespository extends JpaRepository<Customer, Integer> {
}
