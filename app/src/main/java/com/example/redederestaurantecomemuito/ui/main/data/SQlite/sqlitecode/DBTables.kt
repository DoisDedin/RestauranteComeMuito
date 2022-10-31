package com.example.redederestaurantecomemuito.ui.main.data.SQlite.sqlitecode

object DBTables {

    const val TABLE_ANUNCIOS = "CREATE TABLE Anuncios (\n" +
            "    id_anuncio      INT     NOT NULL,\n" +
            "    meio_divulgação VARCHAR,\n" +
            "    valor           DOUBLE,\n" +
            "    data_inicio     DATE,\n" +
            "    data_final      DATE,\n" +
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
            "    data_termino   DATE,\n" +
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
            ");"

    const val TABLE_BEBIDAS = "CREATE TABLE Bebidas (\n" +
            "    id_empresa_alimenticia INT     NOT NULL,\n" +
            "    licenca_funcionamento  VARCHAR,\n" +
            "    CONSTRAINT PK_Alimentos PRIMARY KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Alimentos_Emp_Parc FOREIGN KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    )\n" +
            "    REFERENCES Empresas_Alimenticias (id_empresa_alimenticia) ON DELETE CASCADE\n" +
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
            ");"

    const val TABLE_EMPRESAS_ALIMENTICIAS = "CREATE TABLE Empresas_Alimenticias (\n" +
            "    id_empresa_alimenticia INT     NOT NULL,\n" +
            "    nome                   VARCHAR NOT NULL,\n" +
            "    localizacao            VARCHAR,\n" +
            "    CONSTRAINT PK_empresa_alimenticia PRIMARY KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    )\n" +
            ");"

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
            "    data_adm       DATE,\n" +
            "    data_saida     DATE,\n" +
            "    CONSTRAINT PK_Funcionarios PRIMARY KEY (\n" +
            "        id_funcionario\n" +
            "    ),\n" +
            "    CONSTRAINT FK_JFunc_Restaurante FOREIGN KEY (\n" +
            "        id_Restaurante\n" +
            "    )\n" +
            "    REFERENCES Restaurante (id_Restaurante) ON DELETE NO ACTION\n" +
            ");"

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
            ");"

    const val TABLE_POSSUI_RESERVA_MESA = "CREATE TABLE Possui_Reserv_Mesa (\n" +
            "    id_reserva       INT     NOT NULL,\n" +
            "    id_restaurante   INT     NOT NULL,\n" +
            "    num_mesa         INT     NOT NULL,\n" +
            "    valor_da_reserva DOUBLE,\n" +
            "    data_reserva     DATE,\n" +
            "    hora_reserva     TIME,\n" +
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
            ");"

    const val TABLE_RESTAURANTE = "CREATE TABLE Restaurante (\n" +
            "    id_restaurante      INT     NOT NULL,\n" +
            "    endereco            VARCHAR NOT NULL,\n" +
            "    qtd_mesa_total      INT,\n" +
            "    qtd_mesa_disponivel INT,\n" +
            "    CONSTRAINT PK_Restaurante PRIMARY KEY (\n" +
            "        id_restaurante\n" +
            "    )\n" +
            ");"

    const val TABLE_TEM_PARCERIA = "CREATE TABLE Tem_Parceria (\n" +
            "    id_restaurante         INT NOT NULL,\n" +
            "    id_empresa_alimenticia INT NOT NULL,\n" +
            "    CONSTRAINT PK_Tem_Parceria PRIMARY KEY (\n" +
            "        id_restaurante,\n" +
            "        id_empresa_alimenticia\n" +
            "    ),\n" +
            "    CONSTRAINT FK_Parc_Restaurante FOREIGN KEY (\n" +
            "        id_restaurante\n" +
            "    )\n" +
            "    REFERENCES Restaurante (id_restaurante) ON DELETE NO ACTION,\n" +
            "    CONSTRAINT FK_Parc_EmpAlimen FOREIGN KEY (\n" +
            "        id_empresa_alimenticia\n" +
            "    )\n" +
            "    REFERENCES Empresas_Alimenticias (id_empresa_alimenticia) ON DELETE NO ACTION\n" +
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
            "    REFERENCES Empresas_Alimenticias (id_empresa_alimenticia) ON DELETE CASCADE\n" +
            ");\n"

}