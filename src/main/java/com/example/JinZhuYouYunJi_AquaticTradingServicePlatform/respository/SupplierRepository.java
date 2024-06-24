package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.respository;

import com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Optional<Supplier> findTopByOrderByIdDesc();
}
