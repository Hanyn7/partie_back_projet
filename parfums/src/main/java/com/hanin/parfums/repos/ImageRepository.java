package com.hanin.parfums.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hanin.parfums.entities.Image;
public interface ImageRepository extends JpaRepository<Image , Long> {
}
