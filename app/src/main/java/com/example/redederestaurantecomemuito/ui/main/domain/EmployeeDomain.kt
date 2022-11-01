package com.example.redederestaurantecomemuito.ui.main.domain

data class EmployeeDomain(
    var idFuncionario : Int,
    var nome :String,
    var telefone : String,
    var endereco : String,
    var salario : Double,
    var idRestaurante : Int,
    var dataAdm : String,
    var dataSaida : String
)