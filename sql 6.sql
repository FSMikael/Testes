--
CREATE TABLE posts(
	id int PRIMARY KEY AUTO_INCREMENT, 
	titulo VARCHAR(100), 
	corpo_do_posts VARCHAR(100),
	tags VARCHAR(100)
); -- assim é feito uma criação de tabelas 

INSERT INTO posts(id, titulo, corpo_do_posts, tags) VALUES (1, "Homem Que Mete Ferro", "Onde todos são metidos ferros", "Comédia, ação e super hero"); -- Assim é feito a inserção das informações
