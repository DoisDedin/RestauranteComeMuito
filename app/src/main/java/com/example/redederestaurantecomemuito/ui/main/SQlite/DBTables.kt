package com.example.redederestaurantecomemuito.ui.main.SQlite

object DBTables {

    const val TABLE_ANUNCIOS = "CREATE TABLE Anuncios (\n" +
            "    id_anuncio      INT     NOT NULL,\n" +
            "    meio_divulgação VARCHAR,\n" +
            "    valor           DOUBLE,\n" +
            "    data_inicio     VARCHAR,\n" +
            "    data_final      VARCHAR,\n" +
            "    id_restaurante  INT     NOT NULL,\n" +
            "    CONSTRAINT PK_Anuncios PRIMARY KEY (\n" +
            "        id_anuncio\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Anunc_Restaurante FOREIGN KEY (\n" +
            "        id_restaurante\n" +
            "    )\n" +
            "    REFERENCES Restaurante (id_restaurante) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_AREAS_CONSTRUCAO = "CREATE TABLE Areas_Construcao (\n" +
            "    id_restaurante INT     NOT NULL,\n" +
            "    endereco       VARCHAR NOT NULL,\n" +
            "    tamanho        VARCHAR,\n" +
            "    custo          DOUBLE,\n" +
            "    id_area        INT     NOT NULL,\n" +
            "    data_termino   VARCHAR,\n" +
            "    CONSTRAINT PK_Areas_Construcao PRIMARY KEY (\n" +
            "        id_restaurante,\n" +
            "        id_area\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Contrucao_Restaurante FOREIGN KEY (\n" +
            "        id_restaurante\n" +
            "    )\n" +
            "    REFERENCES Restaurante (id_restaurante) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_ATENDENTE = "CREATE TABLE Atendente (\n" +
            "    id_funcionario INT     NOT NULL,\n" +
            "    credencial     VARCHAR,\n" +
            "    CONSTRAINT PK_Atendente PRIMARY KEY (\n" +
            "        id_funcionario\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Atendente FOREIGN KEY (\n" +
            "        id_funcionario\n" +
            "    )\n" +
            "    REFERENCES Funcionarios (id_funcionario) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_BEBIDAS = "CREATE TABLE Bebidas (\n" +
            "    id_empresa_alimenticia INT     NOT NULL,\n" +
            "    licenca_funcionamento  VARCHAR,\n" +
            "    CONSTRAINT PK_Alimentos PRIMARY KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Alimentos_Emp_Parc FOREIGN KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    )\n" +
            "    REFERENCES Empresa_alimenticia (id_empresa_alimenticia) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_CHEFE_COZINHA = "CREATE TABLE Chefe_cozinha (\n" +
            "    id_funcionario  INT     NOT NULL,\n" +
            "    id_curso_gastro VARCHAR,\n" +
            "    CONSTRAINT PK_Chefe_cozinha PRIMARY KEY (\n" +
            "        id_funcionario\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Chefe_cozinha_Func FOREIGN KEY (\n" +
            "        id_funcionario\n" +
            "    )\n" +
            "    REFERENCES Funcionarios (id_funcionario) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_CLIENTE = "CREATE TABLE Cliente (\n" +
            "    id_cliente INT     NOT NULL,\n" +
            "    nome       VARCHAR,\n" +
            "    cpf        VARCHAR,\n" +
            "    CONSTRAINT PK_Cliente PRIMARY KEY (\n" +
            "        id_cliente\n" +
            "    )\n" +
            ");\n"

    const
    val TABLE_DEPENDENTE = "CREATE TABLE Dependente (\n" +
            "    id_funcionario INT     NOT NULL,\n" +
            "    nome           VARCHAR NOT NULL,\n" +
            "    endereco       VARCHAR,\n" +
            "    CONSTRAINT PK_Dependente PRIMARY KEY (\n" +
            "        id_funcionario,\n" +
            "        nome\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Dependente_Func FOREIGN KEY (\n" +
            "        id_funcionario\n" +
            "    )\n" +
            "    REFERENCES Funcionarios (id_funcionario) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_EMPRESAS_ALIMENTICIAS = "CREATE TABLE Empresas_Alimenticias (\n" +
            "    id_empresa_alimenticia INT     NOT NULL,\n" +
            "    nome                   VARCHAR NOT NULL,\n" +
            "    localizacao            VARCHAR,\n" +
            "    CONSTRAINT PK_empresa_alimenticia PRIMARY KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    )\n" +
            ");\n"


    const val TABLE_FAZ_CONTATO = "CREATE TABLE Faz_Contato (\n" +
            "    id_atendente INT NOT NULL,\n" +
            "    id_cliente   INT NOT NULL,\n" +
            "    CONSTRAINT PK_Faz_Contato PRIMARY KEY (\n" +
            "        id_atendente,\n" +
            "        id_cliente\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Cont_Atend FOREIGN KEY (\n" +
            "        id_atendente\n" +
            "    )\n" +
            "    REFERENCES Atendente (id_funcionario) ON DELETE NO ACTION,\n" +
            "    CONSTRAINT FK_Cont_Cliente FOREIGN KEY (\n" +
            "        id_cliente\n" +
            "    )\n" +
            "    REFERENCES Cliente (id_cliente) ON DELETE NO ACTION\n" +
            ");"

    const val TABLE_FUNCIONARIOS = "CREATE TABLE Funcionarios (\n" +
            "    id_funcionario INT     NOT NULL,\n" +
            "    nome           VARCHAR NOT NULL,\n" +
            "    telefone       VARCHAR NOT NULL,\n" +
            "    endereco       VARCHAR,\n" +
            "    salario        DOUBLE,\n" +
            "    id_restaurante INT     NOT NULL,\n" +
            "    data_adm       VARCHAR,\n" +
            "    data_saida     VARCHAR,\n" +
            "    CONSTRAINT PK_Funcionarios PRIMARY KEY (\n" +
            "        id_funcionario\n" +
            "    ),\n" +
            "    CONSTRAINT FK_JFunc_Restaurante FOREIGN KEY (\n" +
            "        id_Restaurante\n" +
            "    )\n" +
            "    REFERENCES Restaurante (id_Restaurante) ON DELETE NO ACTION\n" +
            ");\n"

    const val TABLE_GARCOM = "CREATE TABLE Garcom (\n" +
            "    id_funcionario  INT     NOT NULL,\n" +
            "    id_curso_garcom VARCHAR,\n" +
            "    CONSTRAINT PK_Garcom PRIMARY KEY (\n" +
            "        id_funcionario\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Garcom_Func FOREIGN KEY (\n" +
            "        id_funcionario\n" +
            "    )\n" +
            "    REFERENCES Funcionarios (id_funcionario) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_MESA = "CREATE TABLE Mesa (\n" +
            "    id_restaurante   INT     NOT NULL,\n" +
            "    num_mesa         INT     UNIQUE\n" +
            "                             NOT NULL,\n" +
            "    status           VARCHAR,\n" +
            "    tipo_mesa        VARCHAR,\n" +
            "    id_recepcionista INT     NOT NULL,\n" +
            "    CONSTRAINT PK_Mesa PRIMARY KEY (\n" +
            "        id_restaurante,\n" +
            "        num_mesa\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Mesa_Restau FOREIGN KEY (\n" +
            "        id_restaurante\n" +
            "    )\n" +
            "    REFERENCES Restaurante (id_restaurante) ON DELETE CASCADE,\n" +
            "    CONSTRAINT FK_Mesa_Recep FOREIGN KEY (\n" +
            "        id_recepcionista\n" +
            "    )\n" +
            "    REFERENCES Recepcionista (id_funcionario) ON DELETE NO ACTION\n" +
            ");\n"

    const val TABLE_POSSUI_RESERVA_MESA = "CREATE TABLE Possui_Reserv_Mesa (\n" +
            "    id_reserva       INT     NOT NULL,\n" +
            "    id_restaurante   INT     NOT NULL,\n" +
            "    num_mesa         INT     NOT NULL,\n" +
            "    valor_da_reserva DOUBLE,\n" +
            "    data_reserva     VARCHAR,\n" +
            "    hora_reserva     VARCHAR,\n" +
            "    forma_pagamento  VARCHAR,\n" +
            "    CONSTRAINT PK_Possui_Reserv_Mesa PRIMARY KEY (\n" +
            "        id_reserva,\n" +
            "        id_restaurante,\n" +
            "        num_mesa\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Possui_Reserv FOREIGN KEY (\n" +
            "        id_reserva\n" +
            "    )\n" +
            "    REFERENCES Reserva (id_reserva) ON DELETE NO ACTION,\n" +
            "    CONSTRAINT FK_Possui_Mesa FOREIGN KEY (\n" +
            "        id_restaurante,\n" +
            "        num_mesa\n" +
            "    )\n" +
            "    REFERENCES Mesa (id_restaurante,\n" +
            "    num_mesa) ON DELETE NO ACTION\n" +
            ");\n"

    const val TABLE_RECEPCIONISTA = "CREATE TABLE Recepcionista (\n" +
            "    id_funcionario INT NOT NULL,\n" +
            "    CONSTRAINT PK_Recepcionista PRIMARY KEY (\n" +
            "        id_funcionario\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Recepcionista_Func FOREIGN KEY (\n" +
            "        id_funcionario\n" +
            "    )\n" +
            "    REFERENCES Funcionarios (id_funcionario) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_RESERVA = "CREATE TABLE Reserva (\n" +
            "    id_reserva          INT    NOT NULL,\n" +
            "    id_cliente          INT    NOT NULL,\n" +
            "    id_atendente        INT    NOT NULL,\n" +
            "    valor_total_reserva DOUBLE,\n" +
            "    CONSTRAINT PK_Reserva PRIMARY KEY (\n" +
            "        id_reserva\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Cont_Atend FOREIGN KEY (\n" +
            "        id_atendente\n" +
            "    )\n" +
            "    REFERENCES Atendente (id_funcionario) ON DELETE NO ACTION,\n" +
            "    CONSTRAINT FK_Cont_Cliente FOREIGN KEY (\n" +
            "        id_cliente\n" +
            "    )\n" +
            "    REFERENCES Cliente (id_cliente) ON DELETE NO ACTION\n" +
            ");\n"

    const val TABLE_RESTAURANTE = "CREATE TABLE Restaurante (\n" +
            "    id_restaurante      INT     NOT NULL,\n" +
            "    endereco            VARCHAR NOT NULL,\n" +
            "    qtd_mesa_total      INT,\n" +
            "    qtd_mesa_disponivel INT,\n" +
            "    CONSTRAINT PK_Restaurante PRIMARY KEY (\n" +
            "        id_restaurante\n" +
            "    )\n" +
            ");\n"

    const val TABLE_TEM_PARCERIA = "CREATE TABLE Tem_Parceria (\n" +
            "    id_restaurante          INT NOT NULL,\n" +
            "    id_empresa_alimenticias INT NOT NULL,\n" +
            "    CONSTRAINT PK_Tem_Parceria PRIMARY KEY (\n" +
            "        id_restaurante,\n" +
            "        id_empresa_alimenticias\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Parc_Restaurante FOREIGN KEY (\n" +
            "        id_restaurante\n" +
            "    )\n" +
            "    REFERENCES Restaurante (id_restaurante) ON DELETE NO ACTION,\n" +
            "    CONSTRAINT FK_Parc_EmpAlimen FOREIGN KEY (\n" +
            "        id_empresa_alimenticias\n" +
            "    )\n" +
            "    REFERENCES Empresas_Alimenticias (id_empresa_alimenticias) ON DELETE NO ACTION\n" +
            ");\n"

    const val TABLE_ZELADOR = "CREATE TABLE Zelador (\n" +
            "    id_funcionario INT     NOT NULL,\n" +
            "    id_licenca     VARCHAR,\n" +
            "    CONSTRAINT PK_Zelador PRIMARY KEY (\n" +
            "        id_funcionario\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Zelador_Func FOREIGN KEY (\n" +
            "        id_funcionario\n" +
            "    )\n" +
            "    REFERENCES Funcionarios (id_funcionario) ON DELETE CASCADE\n" +
            ");\n"

    const val TABLE_ALIMENTOS = "CREATE TABLE Alimentos (\n" +
            "    id_empresa_alimenticia   INT     NOT NULL,\n" +
            "    certificado_qualificacao VARCHAR,\n" +
            "    CONSTRAINT PK_Alimentos PRIMARY KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Alimentos_Emp_Parc FOREIGN KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    )\n" +
            "    REFERENCES Empresa_alimenticia (id_empresa_alimenticia) ON DELETE CASCADE\n" +
            ");\n"


    const val INSERT_ANUNCIOS =
        "INSERT INTO Anuncios (id_anuncio, meio_divulgação, valor, data_inicio, data_final, id_restaurante) VALUES (500, 'Outdoor', 2000.0, '2018-02-20', '2018-04-02', 1000);\n" +
                "INSERT INTO Anuncios (id_anuncio, meio_divulgação, valor, data_inicio, data_final, id_restaurante) VALUES (590, 'Cartaz', 1800.0, '2018-01-10', '2018-04-22', 1001);\n" +
                "INSERT INTO Anuncios (id_anuncio, meio_divulgação, valor, data_inicio, data_final, id_restaurante) VALUES (600, 'Cartaz', 1800.0, '2019-01-10', '2019-04-22', 1002);"

    const val INSERT_AREA_CONSTRUCAO =
        "INSERT INTO Areas_Construcao (id_restaurante, endereco, tamanho, custo, id_area, data_termino) VALUES (1000, 'Av Bandeira numero 40', '4000 metros quadrados', 10000.0, '2018-05-15', '2019-04-10');\n" +
                "INSERT INTO Areas_Construcao (id_restaurante, endereco, tamanho, custo, id_area, data_termino) VALUES (1001, 'Av Borges 400', '5000 metros quadrados', 8000.0, '2019-05-15', '2020-04-10');\n" +
                "INSERT INTO Areas_Construcao (id_restaurante, endereco, tamanho, custo, id_area, data_termino) VALUES (1002, 'Av Torres 55', '7500 metros quadrados', 1500.0, '2019-01-15', '2020-12-10');\n"

    const val INSERT_ATENDENTE =
        "INSERT INTO Atendente (id_funcionario, credencial) VALUES (3006, 'Codigo FG550');\n" +
                "INSERT INTO Atendente (id_funcionario, credencial) VALUES (3007, 'Codigo JM650');\n"

    const val INSERT_CLIENTE =
        "INSERT INTO Cliente (id_cliente, nome, cpf) VALUES (300, 'Geraldo', '129213321-21');\n" +
                "INSERT INTO Cliente (id_cliente, nome, cpf) VALUES (308, 'Alex', '999993321-21');\n" +
                "INSERT INTO Cliente (id_cliente, nome, cpf) VALUES (309, 'Tiago', '187593321-21');"

    const val INSERT_FUNCIONARIO =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3117, 'Jose', '(44)5554-2990', 'Rua Delta, numero 35', 9500.0, 1001, '2019-02-20', '2021-\n" +
                "10-09');\n" +

                "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3001, 'Abreu', '(44)8624-2233', 'Rua Tenda, numero 14', 1500.0, 1001, '2018-02-\n" +
                "20', '2022-04-10');\n" +
                "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3002, 'Alfi', '(44)5624-2233', 'Rua Quatro, numero 15', 1600.0, 1002, '2018-02-20', '2022-\n" +
                "10-02');\n" +
                "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3003, 'Algusto', '(44)8884-2233', 'Rua Zem, numero 590', 1000.0, 1000, '2019-02-\n" +
                "20', '2021-02-20');\n" +
                "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3004, 'Celio', '(44)7774-2233', 'Rua Tenda, numero 348', 1500.0, 1001, '2019-02-\n" +
                "20', '2021-04-10');\n" +
                "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3005, 'Dexter', '(44)5554-2233', 'Rua Quatro, numero 344', 1600.0, 1002, '2019-02-\n" +
                "20', '2021-02-10');\n" +
                "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3006, 'Claudia', '(44)5554-2553', 'Rua Dois, numero 94', 1600.0, 1002, '2019-02-\n" +
                "20', '2021-02-10');\n" +
                "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3007, 'Julia', '(44)5554-2803', 'Rua Dois, numero 125', 1600.0, 1001, '2019-02-\n" +
                "20', '2021-10-09');\n" +
                "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3118, 'Jonathan', '(44)5554-2990', 'Rua 5 de abril, numero 25', 9500.0, 1002, '2019-02-\n" +
                "20', '2021-10-09');"

    const val INSERT_FUNCIONARIO_2 ="INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3000, 'Bruno', '(44)9424-2233', 'Rua Zem, numero 12', 1000.0, 1000, '2018-02-20', '2022-02-20');\n"

    const val INSERT_MESA =
        "INSERT INTO Mesa (id_restaurante, num_mesa, status, tipo_mesa, id_recepcionista) VALUES (1001, 7000, 'Disponivel', 'Comum', 3001);\n" +
                "INSERT INTO Mesa (id_restaurante, num_mesa, status, tipo_mesa, id_recepcionista) VALUES (1000, 6000, 'Disponivel', 'Vip', 3000);\n" +
                "INSERT INTO Mesa (id_restaurante, num_mesa, status, tipo_mesa, id_recepcionista) VALUES (1002, 8000, 'Disponivel', 'Vip', 3000);\n" +
                "INSERT INTO Mesa (id_restaurante, num_mesa, status, tipo_mesa, id_recepcionista) VALUES (1002, 9000, 'Disponivel', 'Comum', 3000);"

    const val INSERT_RESERVA =
        "INSERT INTO Reserva (id_reserva, id_cliente, id_atendente, valor_total_reserva) VALUES (29, 300, 3006, 150.0);\n" +
                "INSERT INTO Reserva (id_reserva, id_cliente, id_atendente, valor_total_reserva) VALUES (34, 308, 3007, 200.0);\n" +
                "INSERT INTO Reserva (id_reserva, id_cliente, id_atendente, valor_total_reserva) VALUES (40, 309, 3007, 90.0);"

    const val INSERT_RESTAURANTE =
        "INSERT INTO Restaurante (id_restaurante, endereco, qtd_mesa_total, qtd_mesa_disponivel) VALUES (1000, 'Rua Alfa, numero 24', 80, 75);\n" +
                "INSERT INTO Restaurante (id_restaurante, endereco, qtd_mesa_total, qtd_mesa_disponivel) VALUES (1002, 'Rua Mendes, numero 10', 40, 37);\n" +
                "INSERT INTO Restaurante (id_restaurante, endereco, qtd_mesa_total, qtd_mesa_disponivel) VALUES (1001, 'Rua Vitorino, numero 40', 30, 27);"
}