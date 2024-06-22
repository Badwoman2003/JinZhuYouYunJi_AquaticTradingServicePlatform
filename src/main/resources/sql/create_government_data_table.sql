CREATE TABLE government_data (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    data_type VARCHAR(50),
    title VARCHAR(255) NOT NULL,
    description TEXT,
    release_date DATE,
    source VARCHAR(255),
    link VARCHAR(255),
    remarks TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
