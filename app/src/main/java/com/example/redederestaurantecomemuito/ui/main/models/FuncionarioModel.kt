package com.example.redederestaurantecomemuito.ui.main.models

import java.util.Date

data class FuncionarioModel(
    var nome :String,
    var telefone : String,
    var endereco : String,
    var salario : Double,
    var idRestaurante : Int,
    var dataAdm : String,
    var dataSaida : String
)