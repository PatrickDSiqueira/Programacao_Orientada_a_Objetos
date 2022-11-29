/*
DROP TABLE editora CASCADE;
DROP TABLE cliente CASCADE;
DROP TABLE pedido CASCADE;
DROP TABLE funcionario CASCADE;
DROP TABLE pedido_livro CASCADE;
DROP TABLE autor CASCADE;
DROP TABLE palavra_chave CASCADE;
DROP TABLE categoria_livro CASCADE;
DROP TABLE encomenda CASCADE;
DROP TABLE livro CASCADE;
DROP TABLE encomenda_livro CASCADE;
DROP TABLE palavra_chave_livro CASCADE;
DROP TABLE autor_livro CASCADE;
*/
-- Tabelas da Livraria

CREATE TABLE cliente
(
  id_cliente   		SERIAL,
  nm_cliente          	VARCHAR(40),
  nu_telefone_cliente   VARCHAR(20),
  nu_rg_cliente    	VARCHAR(20),
  sg_sexo_cliente       CHAR(1),
  nm_logradouro_cliente VARCHAR(40),
  nu_residencia_cliente VARCHAR(10),
  nm_bairro_cliente     VARCHAR(40),
  nu_cep_cliente        VARCHAR(8),
  nm_cidade_cliente     VARCHAR(40),
  sg_uf_cliente         CHAR(2),
  PRIMARY KEY(id_cliente)
);

CREATE TABLE pedido
(
  id_pedido       SERIAL,
  id_funcionario  INTEGER,
  id_cliente      INTEGER,
  dt_pedido       DATE,
  vl_total_pago   NUMERIC(9,2),
  PRIMARY KEY(id_pedido)
);

CREATE TABLE funcionario
(
  id_funcionario 		SERIAL,
  nm_funcionario            	VARCHAR(40),
  dt_nascimento 		DATE,
  nu_rg_funcionario      	VARCHAR(20),
  nu_cpf_funcionario            VARCHAR(11),
  sg_sexo_funcionario           CHAR(1),
  nm_logradouro_funcionario     VARCHAR(40),
  nu_residencia_funcionario     VARCHAR(10),
  nm_bairro_funcionario         VARCHAR(40),
  nu_cep_funcionario            VARCHAR(8),
  nm_cidade_funcionario         VARCHAR(40),
  nu_telefone_funcionario       VARCHAR(15),
  dt_admissao  			DATE,
  dt_demissao   		DATE,
  vl_salario         		NUMERIC(9,2),
  PRIMARY KEY(id_funcionario)
);

CREATE TABLE pedido_livro
(
  id_isbn        VARCHAR(15),
  id_pedido  	 INTEGER,
  vl_quantidade  INTEGER,
  PRIMARY KEY(id_isbn, id_pedido)
);

CREATE TABLE autor
(
  id_autor 	SERIAL,
  nm_autor      VARCHAR(40),
  PRIMARY KEY(id_autor)
);


CREATE TABLE palavra_chave
(
  id_palavra_chave 	SERIAL,
  te_descricao  	VARCHAR(30),
  PRIMARY KEY(id_palavra_chave)
);


CREATE TABLE editora
(
  id_editora  		SERIAL,
  nm_editora         	VARCHAR(40),
  nu_telefone_editora   VARCHAR(15),
  PRIMARY KEY(id_editora)
);

CREATE TABLE categoria_livro
(
  id_categoria   SERIAL,
  te_descricao 	 VARCHAR(30),
  PRIMARY KEY(id_categoria)
);

CREATE TABLE encomenda
(
  id_encomenda    	SERIAL,
  id_funcionario  	INTEGER,
  id_cliente      	INTEGER,
  dt_encomenda   	DATE,
  nu_prazo_estimado   	INTEGER,
  PRIMARY KEY(id_encomenda)
);


CREATE TABLE livro
(
  id_isbn            	VARCHAR(15),
  id_categoria   	INTEGER,
  id_editora     	INTEGER,
  nm_titulo          	VARCHAR(40),
  dt_publicacao		DATE,
  nu_edicao          	INTEGER,
  nu_volume          	INTEGER,
  vl_preco           	NUMERIC(7,2),
  im_foto_capa       	OID,
  PRIMARY KEY(id_isbn)
);

CREATE TABLE encomenda_livro
(
  id_encomenda   	INTEGER,
  id_isbn            	VARCHAR(15),
  vl_quantidade      	INTEGER,
  PRIMARY KEY(id_encomenda, id_isbn)
);

CREATE TABLE palavra_chave_livro
(
  id_isbn         	VARCHAR(15),
  id_palavra_chave  	INTEGER,
  PRIMARY KEY(id_isbn, id_palavra_chave)
);

CREATE TABLE autor_livro
(
  id_isbn       VARCHAR(15),
  id_autor  	INTEGER,
  PRIMARY KEY(id_isbn, id_autor)
);


alter table "livro" add  foreign key ("id_categoria") references "categoria_livro" ("id_categoria") on update restrict on delete restrict;

alter table "livro" add  foreign key ("id_editora") references "editora" ("id_editora") on update restrict on delete restrict;

alter table "autor_livro" add  foreign key ("id_isbn") references "livro" ("id_isbn") on update restrict on delete restrict;

alter table "autor_livro" add  foreign key ("id_autor") references "autor" ("id_autor") on update restrict on delete restrict;

alter table "pedido" add  foreign key ("id_funcionario") references "funcionario" ("id_funcionario") on update restrict on delete restrict;

alter table "pedido" add  foreign key ("id_cliente") references "cliente" ("id_cliente") on update restrict on delete restrict;

alter table "pedido_livro" add  foreign key ("id_isbn") references "livro" ("id_isbn") on update restrict on delete restrict;

alter table "pedido_livro" add  foreign key ("id_pedido") references "pedido" ("id_pedido") on update restrict on delete restrict;

alter table "encomenda" add  foreign key ("id_cliente") references "cliente" ("id_cliente") on update restrict on delete restrict;

alter table "encomenda" add  foreign key ("id_funcionario") references "funcionario" ("id_funcionario") on update restrict on delete restrict;

alter table "encomenda_livro" add  foreign key ("id_encomenda") references "encomenda" ("id_encomenda") on update restrict on delete restrict;

alter table "encomenda_livro" add  foreign key ("id_isbn") references "livro" ("id_isbn") on update restrict on delete restrict;

alter table "palavra_chave_livro" add  foreign key ("id_isbn") references "livro" ("id_isbn") on update restrict on delete restrict;

alter table "palavra_chave_livro" add  foreign key ("id_palavra_chave") references "palavra_chave" ("id_palavra_chave") on update restrict on delete restrict;

--
-- INSERINDO DADOS NA TABELA autor
--

INSERT INTO autor (nm_autor)
           VALUES ('Roger S. Pressman');

INSERT INTO autor (nm_autor)
           VALUES ('Meilir Page-Jones');

INSERT INTO autor (nm_autor)
           VALUES ('José Ramalho');

INSERT INTO autor (nm_autor)
           VALUES ('C. J. Date');

INSERT INTO autor (nm_autor)
           VALUES ('João Antônio Lopes');

INSERT INTO autor (nm_autor)
           VALUES ('Hélio de Barros');

INSERT INTO autor (nm_autor)
           VALUES ('Othon Passos');

INSERT INTO autor (nm_autor)
           VALUES ('Louis Leithold');

INSERT INTO autor (nm_autor)
           VALUES ('Machado de Assis');

INSERT INTO autor (nm_autor)
           VALUES ('Tanenbaum');

INSERT INTO autor (nm_autor)
       VALUES ('Roger S. Pressman');

INSERT INTO autor (nm_autor)
       VALUES ('Worboys');

INSERT INTO autor (nm_autor)
       VALUES ('C. J. Date');

INSERT INTO autor (nm_autor)
     VALUES ('Joao da Silva');

--
-- INSERINDO DADOS NA TABELA categoria_livro
--

INSERT INTO categoria_livro (te_descricao) VALUES ('Informática');

INSERT INTO categoria_livro (te_descricao) VALUES ('Engenharia');

INSERT INTO categoria_livro (te_descricao) VALUES ('Turismo');

INSERT INTO categoria_livro (te_descricao) VALUES ('Direito');

INSERT INTO categoria_livro (te_descricao) VALUES ('Literatura');


--
-- INSERINDO DADOS NA TABELA PALVRASCHAVES
--

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('Métricas');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('Capitu');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('Direito Civil');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('Redes');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('Banco de Dados');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('TCP/IP');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('DNS');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('CASE');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('DER');

INSERT INTO palavra_chave (te_descricao)
                   VALUES ('DFD');

--
-- INSERINDO DADOS NA TABELA editora
--

INSERT INTO editora (nm_editora, nu_telefone_editora)
             VALUES ('Makron Books', '(11)3849-8604');

INSERT INTO editora (nm_editora, nu_telefone_editora)
             VALUES ('Campus', '(11)3849-8784');

INSERT INTO editora (nm_editora, nu_telefone_editora)
             VALUES ('Bookman', '(31)2227-7784');

INSERT INTO editora (nm_editora, nu_telefone_editora)
             VALUES ('Prentice-Hall', '(31)2228-7784');

INSERT INTO editora (nm_editora, nu_telefone_editora)
             VALUES ('Saraiva', '(31)2229-7784');

INSERT INTO editora (nm_editora, nu_telefone_editora)
             VALUES ('Globo', '(21)222-7784');


--
-- INSERINDO DADOS NA TABELA cliente
--

INSERT INTO cliente (nm_cliente, nm_logradouro_cliente, nu_residencia_cliente, nm_bairro_cliente,
                     nm_cidade_cliente, sg_uf_cliente, nu_cep_cliente, nu_telefone_cliente, nu_rg_cliente,
                     sg_sexo_cliente)
             VALUES ('Gilberto Ribeiro de Queiroz', 'Aquárius', '258',
                     'Vila São José', 'São José dos Campos', 'MG',
                     '12227320', '3911-7707', 'M-X.XXX.XXX', 'M');

INSERT INTO cliente (nm_cliente, nm_logradouro_cliente, nu_residencia_cliente, nm_bairro_cliente,
                     nm_cidade_cliente, sg_uf_cliente, nu_cep_cliente, nu_telefone_cliente, nu_rg_cliente,
                     sg_sexo_cliente)
             VALUES ('Eduardo Ribeiro de Queiroz', 'Albino Sartori',
                     '95', 'Vila São José', 'Ouro Preto', 'MG',
                     '35400000', '3551-4243', 'M-X.23X.0X4', 'M');

INSERT INTO cliente (nm_cliente, nm_logradouro_cliente, nu_residencia_cliente, nm_bairro_cliente,
                     nm_cidade_cliente, sg_uf_cliente, nu_cep_cliente, nu_telefone_cliente, nu_rg_cliente,
                     sg_sexo_cliente)
             VALUES ('Telma Ribeiro de Queiroz', '36', '1020',
                     'Centro', 'Ituiutaba', 'SP',
                     '36400000', '3921-1248', 'M-19.239.013', 'F');


INSERT INTO cliente (nm_cliente, nm_logradouro_cliente, nu_residencia_cliente, nm_bairro_cliente,
                     nm_cidade_cliente, sg_uf_cliente, nu_cep_cliente, nu_telefone_cliente, nu_rg_cliente,
                     sg_sexo_cliente)
             VALUES ('Ângela Tóffolo de Queiroz', 'Pandiá Calógeras',
                    '580', 'Cabeças', 'Ouro Preto', 'MT', '35400000',
                    '3551-1807', 'M-9.239.019', 'F');


INSERT INTO cliente (nm_cliente, nm_logradouro_cliente, nu_residencia_cliente, nm_bairro_cliente,
                     nm_cidade_cliente, sg_uf_cliente, nu_cep_cliente, nu_telefone_cliente, nu_rg_cliente,
                     sg_sexo_cliente)
             VALUES ('Gilberto Queiroz da Silva', 'Goiás', '58',
                     'Centro', 'Santa Vitória', 'GO',
                     '12327320', '4911-7707', 'M-9.239.000', 'M');


--
-- INSERINDO DADOS NA TABELA funcionario
--

INSERT INTO funcionario (nm_funcionario, dt_nascimento,
                         nu_rg_funcionario, nu_cpf_funcionario, nm_logradouro_funcionario, nu_residencia_funcionario, nm_bairro_funcionario, nm_cidade_funcionario,
                         nu_telefone_funcionario, dt_admissao, sg_sexo_funcionario)
                 VALUES ('Emanuel', '1976-12-30', 'M-999.999.999',
                        '12345678900', '13 de Maio', '13', 'Fundao',
                        'São João Nepomuceno', '333-3333', '1996-01-01',
                        'M');
INSERT INTO funcionario (nm_funcionario, dt_nascimento,
                         nu_rg_funcionario, nu_cpf_funcionario, nm_logradouro_funcionario, nu_residencia_funcionario, nm_bairro_funcionario, nm_cidade_funcionario,
                         nu_telefone_funcionario, dt_admissao, sg_sexo_funcionario)
                 VALUES ('Tomas', '1970-09-21', 'M-999.999.999',
                        '12345678900', '10 de Outubro', '10', 'Jardinopolis',
                        'Lavras', '333-3333', '1990-01-05',
                        'M');
INSERT INTO funcionario (nm_funcionario, dt_nascimento,
                         nu_rg_funcionario, nu_cpf_funcionario, nm_logradouro_funcionario, nu_residencia_funcionario, nm_bairro_funcionario, nm_cidade_funcionario,
                         nu_telefone_funcionario, dt_admissao, sg_sexo_funcionario)
                 VALUES ('Rosana', '1987-02-05', 'M-999.999.999',
                        '12345678900', '17 de Setembro', '15', 'Caetano Furquim',
                        'Tiradentes', '333-3333', '1999-11-10',
                        'M');
INSERT INTO funcionario (nm_funcionario, dt_nascimento,
                         nu_rg_funcionario, nu_cpf_funcionario, nm_logradouro_funcionario, nu_residencia_funcionario, nm_bairro_funcionario, nm_cidade_funcionario,
                         nu_telefone_funcionario, dt_admissao, sg_sexo_funcionario)
                 VALUES ('Lucia', '1963-07-06', 'M-999.999.999',
                        '12345678900', '08 de Julho', '13', 'São Lucas',
                        'São João del Rei', '333-3333', '1997-03-05',
                        'M');

--
-- INSERINDO DADOS NA TABELA livro
--

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Engenharia de Software', '8534602379',
                   '1995-01-01', 3, 0, 1, 1, '75.00');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Redes de Computadores', '0000000001',  '1993-01-01',
                   3, 0, 1, 2, '95.00');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Clipper 5.2   Iniciação e Referência', '0000000002',
                   '1998-01-01', 2, 1, 1, 1, '65.00');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Clipper 5.2   Avançado', '0000000003',
                   '1999-01-01', 1, 2, 1, 1, '45.00');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Sistemas Operacionais Modernos', '0000000004',
                   '1992-01-01', 2, 0, 1, 4, '125.00');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Cálculo com Geometria Analítica', '0000000005',
                   '1990-01-01', 6, 1, 2, 1, '99.99');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Organização Hoteleira', '0000000006',
                   '2001-01-01', 1, 0, 3, 3, '29.90');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Código Civil Comentado', '0000000007',
                   '2000-01-01', 1, 0, 4, 5, '129.90');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Helena', '0000000008', '1996-01-01', 1, 0, 5, 6,
                   '9.90');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Dom Casmurro', '0000000009', '1996-02-01', 1, 0, 5,
                   6, '9.90');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Iaiá Garcia', '0000000010', '1996-03-01', 1, 0, 5,
                   6, '9.90');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('A Mão e a Luva', '0000000011', '1996-04-01', 1, 0,
                   5, 6, '9.90');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Quincas Borba', '0000000012', '1996-05-01', 1, 0,
                   5, 6, '9.90');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Memórias Póstumas de Brás Cubas', '0000000013',
                   '1996-06-01', 1, 0, 5, 6, '9.90');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('SQL Server 7.0   Iniciação e Referência',
                   '0000000014', '1998-01-01', 1, 0, 1, 1, '165.00');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Introdução a Sistema de Bancos de Dados',
                   '0000000015', '1995-01-01', 4, 0, 1, 2,  '64.00');

INSERT INTO livro (nm_titulo, id_isbn, dt_publicacao, nu_edicao,
                   nu_volume, id_categoria, id_editora, vl_preco)
           VALUES ('Projeto Orientado a Objetos',
                   '0000000016', '2001-01-01', 1, 0, 1, 1,  '264.00');


--
-- INSERINDO DADOS NA TABELA pedido
--

INSERT INTO pedido (dt_pedido, vl_total_pago, id_cliente,
                    id_funcionario)
            VALUES ('1999-06-06', '74.90', 1, 1);

INSERT INTO pedido (dt_pedido, vl_total_pago, id_cliente,
                    id_funcionario)
            VALUES ('2000-06-06', '74.90', 1, 1);

INSERT INTO pedido (dt_pedido, vl_total_pago, id_cliente,
                    id_funcionario)
            VALUES ('2001-06-06', '198', 1, 1);

INSERT INTO pedido (dt_pedido, vl_total_pago, id_cliente,
                    id_funcionario)
            VALUES ('2001-06-06', '157.08', 2, 1);


--
-- INSERINDO DADOS NA TABELA pedido_livro
--

INSERT INTO pedido_livro (id_pedido, id_isbn, vl_quantidade)
                  VALUES (1, '0000000010', 1);

INSERT INTO pedido_livro (id_pedido, id_isbn, vl_quantidade)
                  VALUES (1, '0000000002', 1);

INSERT INTO pedido_livro (id_pedido, id_isbn, vl_quantidade)
                  VALUES (2, '0000000010', 1);

INSERT INTO pedido_livro (id_pedido, id_isbn, vl_quantidade)
                  VALUES (3, '0000000001', 1);

INSERT INTO pedido_livro (id_pedido, id_isbn, vl_quantidade)
                  VALUES (3, '0000000004', 2);

INSERT INTO pedido_livro (id_pedido, id_isbn, vl_quantidade)
                  VALUES (4, '0000000014', 1);

INSERT INTO pedido_livro (id_pedido, id_isbn, vl_quantidade)
                  VALUES (4, '0000000013', 1);

INSERT INTO pedido_livro (id_pedido, id_isbn, vl_quantidade)
                  VALUES (4, '0000000012', 2);


--
-- INSERINDO DADOS NA TABELA autor_livro
--

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('8534602379', 1);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000016', 2);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000002', 3);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000003', 3);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000014', 3);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000015', 4);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000006', 5);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000007', 6);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000007', 7);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000005', 8);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000008', 9);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000009', 9);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000010', 9);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000011', 9);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000012', 9);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000013', 9);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000001', 10);

INSERT INTO autor_livro (id_isbn, id_autor)
                 VALUES ('0000000004', 10);

--
-- INSERINDO DADOS NA TABELA encomenda
--


INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (1,4,'1998-03-03',5);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (1,5,'1998-03-04',15);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (2,3,'1999-03-04',5);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (2,2,'1998-05-03',6);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (4,2,'1996-06-02',7);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (4,5,'1997-07-09',20);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (4,1,'1999-09-05',10);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (3,1,'1999-02-04',3);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (3,3,'1999-01-03',5);
INSERT INTO encomenda (id_funcionario, id_cliente, dt_encomenda, nu_prazo_estimado)
                 VALUES (3,4,'1999-03-08',5);

--
-- INSERINDO DADOS NA TABELA encomenda_livro
--

INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (1,'0000000013',20);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (2,'0000000015',30);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (3,'0000000014',100);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (4,'0000000003',60);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (5,'0000000002',15);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (6,'0000000005',23);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (7,'0000000006',07);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (8,'0000000007',43);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (9,'0000000008',12);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (10,'0000000009',15);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (10,'0000000010',3);
INSERT INTO encomenda_livro(id_encomenda,id_isbn, vl_quantidade)
                 VALUES (10,'0000000012',65);


--
-- INSERINDO DADOS NA TABELA palavra_chave_livro
--


INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000012',1);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000010',10);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000009',3);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000007',2);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000003',4);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000008',6);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000005',7);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000004',2);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000002',5);

INSERT INTO palavra_chave_livro(id_isbn, id_palavra_chave)
                 VALUES ('0000000011',9);