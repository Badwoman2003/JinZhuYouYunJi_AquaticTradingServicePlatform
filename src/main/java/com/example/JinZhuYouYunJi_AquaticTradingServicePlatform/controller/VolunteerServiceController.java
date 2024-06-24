package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.controller;

import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model.VolunteerService;
import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.respository.VolunteerServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/VolunteerServices")
public class VolunteerServiceController {

    @Autowired
    private VolunteerServiceRepository volunteerServiceRepository;

    @PostMapping
    public VolunteerService addVolunteerService(@RequestBody VolunteerService volunteerService){
        return volunteerServiceRepository.save(volunteerService);
    }

    @DeleteMapping("/{id}")
    public void deleteVolunteerService(@RequestBody VolunteerService volunteerService){
        volunteerServiceRepository.delete(volunteerService);
    }

    @PutMapping("/{id}")
    public VolunteerService updataVolunteerService(@RequestBody VolunteerService volunteerService, @PathVariable Long id){
        Optional<VolunteerService> optionalVolunteerService = volunteerServiceRepository.findById(id);
        if(optionalVolunteerService.isPresent()){
            VolunteerService existVolunteerService = optionalVolunteerService.get();
            existVolunteerService.setVolunteerName(volunteerService.getVolunteerName());
            existVolunteerService.setServiceName(volunteerService.getServiceName());
            existVolunteerService.setDescription(volunteerService.getDescription());
            existVolunteerService.setStartDate(volunteerService.getStartDate());
            existVolunteerService.setEndDate(volunteerService.getEndDate());
            existVolunteerService.setContactNumber(volunteerService.getContactNumber());
            existVolunteerService.setAddress(volunteerService.getAddress());
            existVolunteerService.setLink(volunteerService.getLink());
            existVolunteerService.setRemarks(volunteerService.getRemarks());
            return volunteerServiceRepository.save(existVolunteerService);
        }
        else {
            throw new RuntimeException("VolunteerService not found");
        }
    }

    @PutMapping("{/id}")
    public VolunteerService getVolunteerService(@PathVariable Long id) {
        return volunteerServiceRepository.findById(id).orElseThrow(() -> new RuntimeException("VolunteerService not found"));
    }
}
