package com.tnsif.college.placement.service;


import com.tnsif.college.placement.entity.Placement;
import com.tnsif.college.placement.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository repository;

    public Placement savePlacement(Placement placement) {
        return repository.save(placement);
    }

    public List<Placement> getAllPlacements() {
        return repository.findAll();
    }

    public Placement getPlacementById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Placement updatePlacement(Long id, Placement updatedPlacement) {
        Placement placement = repository.findById(id).orElse(null);
        if (placement != null) {
            placement.setStudentName(updatedPlacement.getStudentName());
            placement.setDepartment(updatedPlacement.getDepartment());
            placement.setCompany(updatedPlacement.getCompany());
            placement.setDate(updatedPlacement.getDate());
            placement.setSalary(updatedPlacement.getSalary());
            return repository.save(placement);
        }
        return null;
    }

    public void deletePlacement(Long id) {
        repository.deleteById(id);
    }
}
