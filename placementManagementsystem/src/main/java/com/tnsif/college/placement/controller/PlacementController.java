package com.tnsif.college.placement.controller;



import com.tnsif.college.placement.entity.Placement;
import com.tnsif.college.placement.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/placements")
public class PlacementController {

    @Autowired
    private PlacementService service;

    @PostMapping
    public Placement addPlacement(@RequestBody Placement placement) {
        return service.savePlacement(placement);
    }

    @GetMapping
    public List<Placement> getAllPlacements() {
        return service.getAllPlacements();
    }

    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable Long id) {
        return service.getPlacementById(id);
    }

    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        return service.updatePlacement(id, placement);
    }

    @DeleteMapping("/{id}")
    public void deletePlacement(@PathVariable Long id) {
        service.deletePlacement(id);
    }
}
