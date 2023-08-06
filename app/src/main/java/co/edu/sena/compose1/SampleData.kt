package com.example.compose.tutorial

import co.edu.sena.compose.Message

object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        Message(
            "Andres",
            "Hola...Hola...Hola..."
        ),
        Message(
            "Sharick",
            "Hola Andres, cuales son los materiales de clase..."
        ),
        Message(
            "Andres",
            "Lista de Materiales para clase:\n" +
                    "Actitud Positiva\n" +
                    "Memoria USB\n" +
                    "Cable de datos\n"
        ),
        Message(
            "Sharick",
            "Vale Andres gracias, Te parece si vamos por un cafe?..."
        ),
        Message(
            "Andres",
            "Si, fabuloso!\n" +
                    "Te parece si vamos a starbuks"
        ),
        Message(
            "Sharick",
            "Estaba pensando y iremos mejor a creps y waffles :)"
        ),
        Message(
            "Andres",
            "Oww exelente paso por ti?"
        ),
        Message(
            "Sharick",
            "Si nos vemos en una hora"
        ),
    )
}