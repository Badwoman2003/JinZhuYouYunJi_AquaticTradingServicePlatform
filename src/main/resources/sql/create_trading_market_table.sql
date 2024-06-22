CREATE TABLE trading_market (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    market_name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    opening_time TIME,
    closing_time TIME,
    contact_number VARCHAR(20),
    description TEXT,
    market_type VARCHAR(50),
    remarks TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
