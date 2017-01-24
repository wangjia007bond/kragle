package com.orionhealth.kragle.repo;

import com.orionhealth.kragle.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by stevenw on 1/23/17.
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    TourPackage findByName(@Param("name") String name);
}
