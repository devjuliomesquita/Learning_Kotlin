package com.juliomesquita.kotlinlearning.kotlin_core.collections

class ListLearning {
    //listOf = List imultável
    //mutableListOf = List multável
    fun test(){
        val readOnlyList:List<String> = listOf("Teste 1","Teste 2");
        val mutableList: MutableList<String> = mutableListOf("Teste 1","Teste 2");
        mutableList.add("");

        //Métodos funcionais de cada estrutura
        //.first() - > retorna o primeiro elemento
        //.last() - > retorna o ultimo elemento
        // in - > retorna um boolean de verificação uso : (elemento in List<elemento>)

        //parra o mutable list
        //.add(elemento) - > Adiciona um elemento a lista
        //.remove(elemento) - > remove um elemento da lista

    }
}