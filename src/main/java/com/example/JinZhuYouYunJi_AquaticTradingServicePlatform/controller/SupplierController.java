package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.controller;

import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model.Supplier;
import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.respository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @PostMapping
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable Long id) {
        supplierRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Supplier updateSupplier(@PathVariable Long id, @RequestBody Supplier supplier) {
        Optional<Supplier> optionalSupplier = supplierRepository.findById(id);
        if (optionalSupplier.isPresent()) {
            Supplier existingSupplier = optionalSupplier.get();
            existingSupplier.setName(supplier.getName());
            existingSupplier.setAddress(supplier.getAddress());
            existingSupplier.setContactNumber(supplier.getContactNumber());
            existingSupplier.setEmail(supplier.getEmail());
            existingSupplier.setCompanyName(supplier.getCompanyName());
            return supplierRepository.save(existingSupplier);
        } else {
            throw new RuntimeException("Supplier not found");
        }
    }

    @GetMapping("/{id}")
    public Supplier getSupplier(@PathVariable Long id) {
        return supplierRepository.findById(id).orElseThrow(() -> new RuntimeException("Supplier not found"));
    }

}