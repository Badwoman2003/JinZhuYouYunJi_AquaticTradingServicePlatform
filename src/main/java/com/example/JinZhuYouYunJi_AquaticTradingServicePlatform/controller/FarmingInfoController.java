package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.controller;

import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model.FarmingInfo;
import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.respository.FarmingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/FarmingInfos")
public class FarmingInfoController {

    @Autowired
    private FarmingInfoRepository farmingInfoRepository;

    @PostMapping
    public FarmingInfo addFarmingInfo(@RequestBody FarmingInfo farmingInfo) {
        return farmingInfoRepository.save(farmingInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteFarmingInfo(@PathVariable Long id) {
        farmingInfoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public FarmingInfo updateFarmingInfo(@RequestBody FarmingInfo farmingInfo, @PathVariable Long id) {
        Optional<FarmingInfo> optionalFarmingInfo = farmingInfoRepository.findById(id);
        if (optionalFarmingInfo.isPresent()) {
            FarmingInfo existingFarmingInfo = optionalFarmingInfo.get();
            existingFarmingInfo.setFarmerName(farmingInfo.getFarmerName());
            existingFarmingInfo.setSpecies(farmingInfo.getSpecies());
            existingFarmingInfo.setScale(farmingInfo.getScale());
            existingFarmingInfo.setLocation(farmingInfo.getLocation());
            existingFarmingInfo.setContactNumber(farmingInfo.getContactNumber());
            existingFarmingInfo.setStartDate(farmingInfo.getStartDate());
            existingFarmingInfo.setRemarks(farmingInfo.getRemarks());
            return farmingInfoRepository.save(existingFarmingInfo);
        } else {
            throw new RuntimeException("FarmingInfo not found");
        }
    }

    @GetMapping("/{id}")
    public FarmingInfo getFarmingInfo(@PathVariable Long id) {
        return farmingInfoRepository.findById(id).orElseThrow(() -> new RuntimeException("FarmingInfo not found"));
    }
}
