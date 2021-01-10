package com.arsenbasha.healthypoint.entidades

class usuario constructor( nombre: String, Apellido: String, mail: String,userName:String,password:String)  {

    var nombre: String=nombre
    var Apellido: String=Apellido
    var mail: String=mail
    var userName: String=userName
    var password: String=password

    constructor (nombre: String, Apellido: String,mail: String) : this(nombre, Apellido,mail,"",",")


    override fun toString(): String {
        return super.toString()
    }

}