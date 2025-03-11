package com.juliomesquita.kotlinlearning.kotlin_core.collections

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ListLearningTest {

    //Primeiros casos testando uma lista imultável
    @Test
    fun given_when_then() {
        //givem
        val readOnlyList: List<String> = listOf("Teste 1", "Teste 2", "Teste 3", "Teste 2", "Teste 3");

        println("Analisando os os atributos de uma lista: $readOnlyList");
        println("Verificando quantos atributos contém em uma lista: ${readOnlyList.size}");
        println("Verificando se uma lista contém atributos: ${readOnlyList.isEmpty()}");
        println("Verificando se uma lista contém um determinado atributo: ${readOnlyList.contains("Teste 1")}");
        println(
            "Verificando se uma lista contém uma lista de atributos: ${
                readOnlyList.containsAll(
                    listOf(
                        "Teste 1",
                        "Teste 3"
                    )
                )
            }"
        );
        println("Verificando qual o index de um determinado atributo: ${readOnlyList.indexOf("Teste 3")}");
        println("Verificando qual o index da ultima vez que um atributo foi encontrado: ${readOnlyList.lastIndexOf("Teste 3")}");
        println("Verificando qual o index de um determinado atributo: ${readOnlyList.indexOf("Teste")}");
        println("Verifica qual o elemento que está no index informado: ${readOnlyList[1]}");
        println("Verifica qual o elemento que está no index informado: ${readOnlyList.get(1)}");
        println("Retorna uma nova lista baseada na original: ${readOnlyList.subList(1, 3)}");
    }
}

// ODiaEstaLindo
// o_dia_esta_lindo