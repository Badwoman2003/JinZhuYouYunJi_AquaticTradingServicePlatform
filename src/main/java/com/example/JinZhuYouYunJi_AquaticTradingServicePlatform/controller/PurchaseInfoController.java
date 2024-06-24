package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.controller;

import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model.PurchaseInfo;
import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.respository.PurchaseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/PurchaseInfos")
public class PurchaseInfoController {

    @Autowired
    private PurchaseInfoRepository purchaseInfoRepository;

    @PostMapping
    public PurchaseInfo addPurchaseInfo(@RequestBody PurchaseInfo purchaseInfo) {
        return purchaseInfoRepository.save(purchaseInfo);
    }

    @DeleteMapping("/{id}")
    public void deletePurchaseInfo(@PathVariable Long id) {
        purchaseInfoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public PurchaseInfo updatePurchaseInfo(@RequestBody PurchaseInfo purchaseInfo, @PathVariable Long id) {
        Optional<PurchaseInfo> optionalPurchaseInfo = purchaseInfoRepository.findById(id);
        if (optionalPurchaseInfo.isPresent()) {
            PurchaseInfo existingPurchaseInfo = optionalPurchaseInfo.get();
            existingPurchaseInfo.setTitle(purchaseInfo.getTitle());
            existingPurchaseInfo.setProductName(purchaseInfo.getProductName());
            existingPurchaseInfo.setQuantity(purchaseInfo.getQuantity());
            existingPurchaseInfo.setUnit(purchaseInfo.getUnit());
            existingPurchaseInfo.setDescription(purchaseInfo.getDescription());
            existingPurchaseInfo.setReleaseDate(purchaseInfo.getReleaseDate());
            existingPurchaseInfo.setDeadline(purchaseInfo.getDeadline());
            existingPurchaseInfo.setContactPerson(purchaseInfo.getContactPerson());
            existingPurchaseInfo.setContactNumber(purchaseInfo.getContactNumber());
            existingPurchaseInfo.setLink(purchaseInfo.getLink());
            existingPurchaseInfo.setRemarks(purchaseInfo.getRemarks());
            return purchaseInfoRepository.save(existingPurchaseInfo);
        } else {
            throw new RuntimeException("PurchaseInfo not found");
        }
    }

    @GetMapping("/{id}")
    public PurchaseInfo getPurchaseInfo(@PathVariable Long id) {
        return purchaseInfoRepository.findById(id).orElseThrow(() -> new RuntimeException("PurchaseInfo not found"));
    }
}
