CREATE TABLE consultation_and_event_service (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    service_name VARCHAR(255) NOT NULL,
    service_type VARCHAR(50),
    description TEXT,
    start_date DATE,
    end_date DATE,
    contact_person VARCHAR(255),
    contact_number VARCHAR(20),
    address VARCHAR(255),
    link VARCHAR(255),
    remarks TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
