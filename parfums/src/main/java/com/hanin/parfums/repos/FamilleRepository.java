package com.hanin.parfums.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hanin.parfums.entities.Famille;

@RepositoryRestResource(path = "fam")
@CrossOrigin("http://localhost:4200/") 
public interface FamilleRepository extends JpaRepository<Famille, Long>{

}
