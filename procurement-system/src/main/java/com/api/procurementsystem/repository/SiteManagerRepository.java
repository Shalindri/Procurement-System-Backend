package com.api.procurementsystem.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.procurementsystem.entity.SiteManager;

@Repository
public interface SiteManagerRepository extends CrudRepository<SiteManager , Long> {

}
