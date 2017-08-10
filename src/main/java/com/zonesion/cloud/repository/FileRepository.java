package com.zonesion.cloud.repository;

import com.zonesion.cloud.domain.File;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the File entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FileRepository extends JpaRepository<File,Long> {
    
}
