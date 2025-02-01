CREATE TABLE contas(
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome VARCHAR(100),
    sobrenome VARCHAR(100),
    saldo int,
    data_nascimento DATE
);

CREATE INDEX index_saldo
ON contas(saldo);

INSERT INTO contas(nome, sobrenome, saldo, data_nascimento) VALUES("Antonio", "Mikael", 10000, "2004-06-16");
INSERT INTO contas(nome, sobrenome, saldo, data_nascimento) VALUES("Felipe", "Lopes", 50000, "1999-07-08");
INSERT INTO contas(nome, sobrenome, saldo, data_nascimento) VALUES("Maria", "Claudia", 600000, "1968-12-25");

SELECT * FROM contas;