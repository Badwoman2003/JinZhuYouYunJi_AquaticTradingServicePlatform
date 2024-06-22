CREATE TABLE report_data_service (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    data_type VARCHAR(50),
    title VARCHAR(255) NOT NULL,
    content TEXT,
    submission_date DATE,
    submitted_by VARCHAR(255),
    contact_number VARCHAR(20),
    link VARCHAR(255),
    remarks TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
