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