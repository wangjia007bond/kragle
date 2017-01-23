package com.orionhealth.kragle.services;

import com.orionhealth.kragle.domain.TourPackage;
import com.orionhealth.kragle.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by stevenw on 1/23/17.
 */

@Service
public class TourPackageService {

    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name) {
        if(!tourPackageRepository.exists(code)) {
            tourPackageRepository.save(new TourPackage(code, name));
        }
        return null;
    }

    public Iterable<TourPackage> lookup() {
        return tourPackageRepository.findAll();
    }

    public long total() {
        return tourPackageRepository.count();
    }
}
