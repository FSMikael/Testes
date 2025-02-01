CREATE TABLE pessoas(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    idade INT
);

CREATE TABLE enderecos(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    rua VARCHAR(100),
    numero VARCHAR(10),
    pessoa_id INT NOT NULL,
    FOREIGN KEY (pessoa_id) REFERENCES pessoas(id)     
);
