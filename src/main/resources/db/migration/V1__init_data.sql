CREATE TABLE morador (
  id UUID NOT NULL,
  nome VARCHAR(50),
  contato_emergencia VARCHAR(20),
  cpf VARCHAR(15),
  data_entrada TIMESTAMP,
  data_nascimento TIMESTAMP,
  rg VARCHAR(20),
  PRIMARY KEY (id)
);

INSERT INTO morador (id, nome, contato_emergencia, cpf, data_entrada, data_nascimento, rg) VALUES
('76dc6fe3-e544-4a0f-b9c7-628c502fce72', 'teste', '1234567890', '00011122233', '2022-04-12', '1965-04-15', '15616515616516');


-------

CREATE TABLE medicamento (
     id UUID NOT NULL,
     nome_comercial VARCHAR(100),
     nome_quimico VARCHAR(100),
     data_cadastramento TIMESTAMP,
     quantidade_minima int,
     unidade_de_medida varchar(20),
     tipo_embalagem varchar(20),
     quantidade int,
     validade TIMESTAMP,
     resumo VARCHAR(120),
     PRIMARY KEY (id)
);

insert into medicamento
(id, nome_comercial, nome_quimico, data_cadastramento, quantidade_minima, unidade_de_medida, tipo_embalagem, quantidade, validade, resumo)
values
('405bc4c2-f91f-4583-9c3f-a90b00592155', 'Tilenol', 'Tilenol', '2022-04-12', 1, 'mg', 'Caixa', 10, '2025-04-12', 'Medicamento para dores musculares');