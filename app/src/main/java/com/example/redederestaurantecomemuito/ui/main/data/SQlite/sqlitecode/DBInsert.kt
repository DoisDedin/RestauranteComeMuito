package com.example.redederestaurantecomemuito.ui.main.data.SQlite.sqlitecode

object DBInsert {

    const val INSERT_ALIMENTOS =
        "INSERT INTO Alimentos (id_empresa_alimenticia, certificado_qualificacao) VALUES (9001, 'Licenca 09631ioddtr');"

    const val INSERT_ANUNCIO_1 =
        "INSERT INTO Anuncios (id_anuncio, meio_divulgação, valor, data_inicio, data_final, id_restaurante) VALUES (500, 'Outdoor', 2000.0, '2018-02-20', '2018-04-02', 1000);"
    const val INSERT_ANUNCIO_2 =
        "INSERT INTO Anuncios (id_anuncio, meio_divulgação, valor, data_inicio, data_final, id_restaurante) VALUES (590, 'Cartaz', 1800.0, '2018-01-10', '2018-04-22', 1001);"
    const val INSERT_ANUNCIO_3 =
        "INSERT INTO Anuncios (id_anuncio, meio_divulgação, valor, data_inicio, data_final, id_restaurante) VALUES (600, 'Cartaz', 1800.0, '2019-01-10', '2019-04-22', 1002);"

    const val INSERT_AREA_CONSTRUCAO_1 =
        "INSERT INTO Areas_Construcao (id_restaurante, endereco, tamanho, custo, id_area, data_termino) VALUES (1000, 'Av Bandeira numero 40', '4000 metros quadrados', 10000.0, '2018-05-15', '2019-04-10');"
    const val INSERT_AREA_CONSTRUCAO_2 =
        "INSERT INTO Areas_Construcao (id_restaurante, endereco, tamanho, custo, id_area, data_termino) VALUES (1001, 'Av Borges 400', '5000 metros quadrados', 8000.0, '2019-05-15', '2020-04-10');"
    const val INSERT_AREA_CONSTRUCAO_3 =
        "INSERT INTO Areas_Construcao (id_restaurante, endereco, tamanho, custo, id_area, data_termino) VALUES (1002, 'Av Torres 55', '7500 metros quadrados', 1500.0, '2019-01-15', '2020-12-10');"

    const val INSERT_ATENDENTE_1 =
        "INSERT INTO Atendente (id_funcionario, credencial) VALUES (3006, 'Codigo FG550');"
    const val INSERT_ATENDENTE_2 =
        "INSERT INTO Atendente (id_funcionario, credencial) VALUES (3007, 'Codigo JM650');"

    const val INSERT_CLIENTE_1 =
        "INSERT INTO Cliente (id_cliente, nome, cpf) VALUES (300, 'Geraldo', '129213321-21');"
    const val INSERT_CLIENTE_2 =
        "INSERT INTO Cliente (id_cliente, nome, cpf) VALUES (308, 'Alex', '999993321-21');"
    const val INSERT_CLIENTE_3 =
        "INSERT INTO Cliente (id_cliente, nome, cpf) VALUES (309, 'Tiago', '187593321-21');"

    const val INSERT_DEPENDENTE_1 =
        "INSERT INTO Dependente (id_funcionario, nome, endereco) VALUES (3006, 'Enzo', 'Rua Dois, numero 94');"
    const val INSERT_DEPENDENTE_2 =
        "INSERT INTO Dependente (id_funcionario, nome, endereco) VALUES (3005, 'Pedro', 'Rua Quatro, numero 344');"


    const val INSERT_FUNCIONARIO_1 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3118, 'Jonathan', '(44)5554-2990', 'Rua 5 de abril, numero 25', 9500.0, 1002, '2019-02-20', '2021-10-09');"
    const val INSERT_FUNCIONARIO_2 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3007, 'Julia', '(44)5554-2803', 'Rua Dois, numero 125', 1600.0, 1001, '2019-02-20', '2021-10-09');"
    const val INSERT_FUNCIONARIO_3 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3006, 'Claudia', '(44)5554-2553', 'Rua Dois, numero 94', 1600.0, 1002, '2019-02-20', '2021-02-10');"
    const val INSERT_FUNCIONARIO_4 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3005, 'Dexter', '(44)5554-2233', 'Rua Quatro, numero 344', 1600.0, 1002, '2019-02-20', '2021-02-10');"
    const val INSERT_FUNCIONARIO_5 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3004, 'Celio', '(44)7774-2233', 'Rua Tenda, numero 348', 1500.0, 1001, '2019-02-20', '2021-04-10');"
    const val INSERT_FUNCIONARIO_6 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3003, 'Algusto', '(44)8884-2233', 'Rua Zem, numero 590', 1000.0, 1000, '2019-02-20', '2021-02-20');"
    const val INSERT_FUNCIONARIO_7 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3002, 'Alfi', '(44)5624-2233', 'Rua Quatro, numero 15', 1600.0, 1002, '2018-02-20', '2022-10-02');"
    const val INSERT_FUNCIONARIO_8 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3001, 'Abreu', '(44)8624-2233', 'Rua Tenda, numero 14', 1500.0, 1001, '2018-02-20', '2022-04-10');"
    const val INSERT_FUNCIONARIO_9 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3000, 'Bruno', '(44)9424-2233', 'Rua Zem, numero 12', 1000.0, 1000, '2018-02-20', '2022-02-20');"
    const val INSERT_FUNCIONARIO_10 =
        "INSERT INTO Funcionarios (id_funcionario, nome, telefone, endereco, salario, id_restaurante, data_adm, data_saida) VALUES (3117, 'Jose', '(44)5554-2990', 'Rua Delta, numero 35', 9500.0, 1001, '2019-02-20', '2021-10-09');"

    const val INSERT_MESA_1 =
        "INSERT INTO Mesa (id_restaurante, num_mesa, status, tipo_mesa, id_recepcionista) VALUES (1001, 7000, 'Disponivel', 'Comum', 3001);"
    const val INSERT_MESA_2 =
        "INSERT INTO Mesa (id_restaurante, num_mesa, status, tipo_mesa, id_recepcionista) VALUES (1000, 6000, 'Disponivel', 'Vip', 3000);"
    const val INSERT_MESA_3 =
        "INSERT INTO Mesa (id_restaurante, num_mesa, status, tipo_mesa, id_recepcionista) VALUES (1002, 8000, 'Disponivel', 'Vip', 3000);"
    const val INSERT_MESA_4 =
        "INSERT INTO Mesa (id_restaurante, num_mesa, status, tipo_mesa, id_recepcionista) VALUES (1002, 9000, 'Disponivel', 'Comum', 3000);"

    const val INSERT_RESERVA_1 =
        "INSERT INTO Reserva (id_reserva, id_cliente, id_atendente, valor_total_reserva) VALUES (29, 300, 3006, 150.0);"
    const val INSERT_RESERVA_2 =
        "INSERT INTO Reserva (id_reserva, id_cliente, id_atendente, valor_total_reserva) VALUES (34, 308, 3007, 200.0);"
    const val INSERT_RESERVA_3 =
        "INSERT INTO Reserva (id_reserva, id_cliente, id_atendente, valor_total_reserva) VALUES (40, 309, 3007, 90.0);"

    const val INSERT_RESTAURANTE_1 =
        "INSERT INTO Restaurante (id_restaurante, endereco, qtd_mesa_total, qtd_mesa_disponivel) VALUES (1000, 'Rua Alfa, numero 24', 80, 75);"
    const val INSERT_RESTAURANTE_2 =
        "INSERT INTO Restaurante (id_restaurante, endereco, qtd_mesa_total, qtd_mesa_disponivel) VALUES (1002, 'Rua Mendes, numero 10', 40, 37);"
    const val INSERT_RESTAURANTE_3 =
        "INSERT INTO Restaurante (id_restaurante, endereco, qtd_mesa_total, qtd_mesa_disponivel) VALUES (1001, 'Rua Vitorino, numero 40', 30, 27);"

    const val INSERT_BEBIDAS =
        "INSERT INTO Bebidas (id_empresa_alimenticia, licenca_funcionamento) VALUES (9002, 'Licenca 98177gtrrxv');"

    const val INSERT_CHEFE_DE_COZINHA_1 =
        "INSERT INTO Chefe_cozinha (id_funcionario, id_curso_gastro) VALUES (3117, 'Curso G4723');"
    const val INSERT_CHEFE_DE_COZINHA_2 =
        "INSERT INTO Chefe_cozinha (id_funcionario, id_curso_gastro) VALUES (3118, 'Curso G93827');"

    const val INSERT_EMPRESA_ALIMENTICIA_1 =
        "INSERT INTO Empresas_Alimenticias (id_empresa_alimenticia, nome, localizacao) VALUES (9001, 'Padoca', 'Rua Romeu, numero 27');"
    const val INSERT_EMPRESA_ALIMENTICIA_2 =
        "INSERT INTO Empresas_Alimenticias (id_empresa_alimenticia, nome, localizacao) VALUES (9002, 'Mineirinho', 'Rua Ximbinha, numero 54');"

    const val INSERT_FAZ_CONTATO_1 =
        "INSERT INTO Faz_Contato (id_atendente, id_cliente) VALUES (3006, 300);"
    const val INSERT_FAZ_CONTATO_2 =
        "INSERT INTO Faz_Contato (id_atendente, id_cliente) VALUES (3006, 308);"
    const val INSERT_FAZ_CONTATO_3 =
        "INSERT INTO Faz_Contato (id_atendente, id_cliente) VALUES (3007, 309);"

    const val INSERT_GARCON_1 =
        "INSERT INTO Garcom (id_funcionario, id_curso_garcom) VALUES (3004, 'Curso n44333');"
    const val INSERT_GARCON_2 =
        "INSERT INTO Garcom (id_funcionario, id_curso_garcom) VALUES (3005, 'Curso n99933');"

    const val INSERT_POSSUI_RESERVA_1 =
        "INSERT INTO Possui_Reserv_Mesa (id_reserva, id_restaurante, num_mesa, valor_da_reserva, data_reserva, hora_reserva, forma_pagamento) VALUES (29, 1000, 6000, 300.0, '2022-10-10', '13:18:00', 'Debito');"
    const val INSERT_POSSUI_RESERVA_2 =
        "INSERT INTO Possui_Reserv_Mesa (id_reserva, id_restaurante, num_mesa, valor_da_reserva, data_reserva, hora_reserva, forma_pagamento) VALUES (34, 1001, 7000, 550.0, '2022-11-13', '17:00:00', 'Pix');"
    const val INSERT_POSSUI_RESERVA_3 =
        "INSERT INTO Possui_Reserv_Mesa (id_reserva, id_restaurante, num_mesa, valor_da_reserva, data_reserva, hora_reserva, forma_pagamento) VALUES (40, 1002, 9000, 250.0, '2022-09-13', '18:00:00', 'Pix');"

    const val INSERT_RECEPCIONISTA_1 = "INSERT INTO Recepcionista (id_funcionario) VALUES (3000);"
    const val INSERT_RECEPCIONISTA_2 = "INSERT INTO Recepcionista (id_funcionario) VALUES (3001);"

    const val INSERT_TEM_PARCERIA_1 =
        "INSERT INTO Tem_Parceria (id_restaurante, id_empresa_alimenticia) VALUES (1000, 9002);"
    const val INSERT_TEM_PARCERIA_2 =
        "INSERT INTO Tem_Parceria (id_restaurante, id_empresa_alimenticia) VALUES (1001, 9001);"

    const val INSERT_ZELADOR_1 =
        "INSERT INTO Zelador (id_funcionario, id_licenca) VALUES (3002, 'Licença n32432');"
    const val INSERT_ZELADOR_2 =
        "INSERT INTO Zelador (id_funcionario, id_licenca) VALUES (3003, 'Licença j25432');\n"
}

