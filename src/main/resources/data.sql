DROP TABLE IF EXISTS cuisines;

CREATE TABLE cuisines (
  id INT PRIMARY KEY,
  name VARCHAR(32) NOT NULL
);

INSERT INTO cuisines (id, name) VALUES
  (1000,'Tapas'),
  (1001,'Sushi'),
  (1002,'Barbecue'),
  (1003,'Seafood'),
  (1004,'Chinese');

DROP TABLE IF EXISTS restaurants;

CREATE TABLE restaurants (
  ranking INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  cuisine_id INT,
  FOREIGN KEY (cuisine_id) REFERENCES cuisines(id)
);

INSERT INTO restaurants (ranking, name, cuisine_id) VALUES
  (1,'Mallorca!',1000),
  (2,'Super Sushi',1001),
  (3,'Texas Best',1002),
  (4,'China Palace',1004),
  (5,'Oceanfront',1003),
  (6,'Sushi House',1001),
  (7,'Peking Duck House',1004),
  (8,'Oyama',1001),
  (9,'La Tosca',1000),
  (10,'Smoke',1002);
