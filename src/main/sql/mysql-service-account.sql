CREATE USER 'springframework'@'localhost' IDENTIFIED BY 'guru';

GRANT SELECT ON springguru.* TO 'springframework'@'localhost';
GRANT INSERT ON springguru.* TO 'springframework'@'localhost';
GRANT DELETE ON springguru.* TO 'springframework'@'localhost';
GRANT UPDATE ON springguru.* TO 'springframework'@'localhost';


CREATE DATABASE qa2guru;

CREATE USER 'qa2user'@'localhost' IDENTIFIED BY 'guru';

GRANT SELECT ON qa2guru.* TO 'qa2user'@'localhost';
GRANT INSERT ON qa2guru.* TO 'qa2user'@'localhost';
GRANT DELETE ON qa2guru.* TO 'qa2user'@'localhost';
GRANT UPDATE ON qa2guru.* TO 'qa2user'@'localhost';
GRANT CREATE ON qa2guru.* TO 'qa2user'@'localhost';
GRANT ALTER ON qa2guru.* TO 'qa2user'@'localhost';
GRANT REFERENCES ON qa2guru.* TO 'qa2user'@'localhost';