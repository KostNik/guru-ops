CREATE USER 'springframework'@'localhost' IDENTIFIED BY 'guru';

GRANT  SELECT ON springguru.* TO 'springframework'@'localhost';
GRANT  INSERT ON springguru.* TO 'springframework'@'localhost';
GRANT  DELETE ON springguru.* TO 'springframework'@'localhost';
GRANT  UPDATE ON springguru.* TO 'springframework'@'localhost';