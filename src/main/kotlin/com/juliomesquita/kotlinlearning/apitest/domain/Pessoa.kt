package com.juliomesquita.kotlinlearning.apitest.domain

import java.util.*

data class Pessoa private constructor(val id: UUID, var name: String, val cpf: String, var age: Int) {
    companion object {
        fun create(name: String, cpf: String, age: Int): Pessoa {
            val anId: UUID = UUID.randomUUID();
            return Pessoa(anId, name, cpf, age);
        }

        fun getInstance(id: UUID, name: String, cpf: String, age: Int): Pessoa {
            return Pessoa(id, name, cpf, age);
        }
    }

    fun updateName(name: String): Pessoa {
        if (!name.isNullOrEmpty()) {
            this.name = name;
        }
        return this;
    }

    fun updateAge(age: Int): Pessoa {
        if (age >= 0) {
            this.age = age;
        }
        return this;
    }
}
