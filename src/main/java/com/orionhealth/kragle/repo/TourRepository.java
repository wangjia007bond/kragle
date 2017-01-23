package com.orionhealth.kragle.repo;

import com.orionhealth.kragle.domain.Tour;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by stevenw on 1/23/17.
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {
    List<Tour> findByTourPackageCode(String code);
}
