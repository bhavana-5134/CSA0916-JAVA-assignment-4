CREATE DATABASE IF NOT EXISTS campus_events; USE campus_events;
CREATE TABLE IF NOT EXISTS event(event_id INT AUTO_INCREMENT PRIMARY KEY,event_name VARCHAR(120) NOT NULL UNIQUE);
CREATE TABLE IF NOT EXISTS registration(registration_id INT AUTO_INCREMENT PRIMARY KEY,student_id VARCHAR(30) NOT NULL,student_name VARCHAR(100) NOT NULL,email VARCHAR(120) NOT NULL,event_id INT NOT NULL,registered_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,FOREIGN KEY(event_id) REFERENCES event(event_id),UNIQUE(student_id,event_id));
INSERT IGNORE INTO event(event_id,event_name) VALUES(1,'Hackathon'),(2,'Tech Talk'),(3,'Cultural Fest');
