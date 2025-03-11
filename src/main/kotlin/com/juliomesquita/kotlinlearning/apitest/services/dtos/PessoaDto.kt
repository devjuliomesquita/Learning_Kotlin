package com.juliomesquita.kotlinlearning.apitest.services.dtos

import com.juliomesquita.kotlinlearning.apitest.domain.Pessoa
import java.util.*

data class PessoaDto(val id: UUID, val name: String, val cpf: String, val age: Int) {
    companion object {
        fun create(pessoa: Pessoa): PessoaDto {
            return PessoaDto(
                pessoa.id,
                pessoa.name,
                pessoa.cpf,
                pessoa.age
            );
        }
    }
}
