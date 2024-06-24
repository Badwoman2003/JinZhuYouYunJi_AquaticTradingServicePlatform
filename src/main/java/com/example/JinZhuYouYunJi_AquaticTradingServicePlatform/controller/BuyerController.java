package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.controller;

import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model.Buyer;
import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.respository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/buyers")
public class BuyerController {

    @Autowired
    private BuyerRepository buyerRepository;

    @PostMapping
    public Buyer addBuyer(@RequestBody Buyer buyer){
        return buyerRepository.save(buyer);
    }

    @DeleteMapping("/{id}")
    public void deleteBuyer(@PathVariable Long id) {
        buyerRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Buyer updateBuyer(@PathVariable Long id, @RequestBody Buyer buyer) {
        Optional<Buyer> optionalBuyer = buyerRepository.findById(id);
        if (optionalBuyer.isPresent()) {
            Buyer existingBuyer = optionalBuyer.get();
            existingBuyer.setName(buyer.getName());
            existingBuyer.setAddress(buyer.getAddress());
            existingBuyer.setContactNumber(buyer.getContactNumber());
            existingBuyer.setEmail(buyer.getEmail());
            existingBuyer.setCompanyName(buyer.getCompanyName());
            existingBuyer.setRegistrationDate(buyer.getRegistrationDate());
            existingBuyer.setRemarks(buyer.getRemarks());
            return buyerRepository.save(existingBuyer);
        } else {
            throw new RuntimeException("Buyer not found");
        }
    }

    @GetMapping("/{id}")
    public Buyer getBuyer(@PathVariable Long id) {
        return buyerRepository.findById(id).orElseThrow(() -> new RuntimeException("Buyer not found"));
    }
}