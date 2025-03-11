package com.juliomesquita.kotlinlearning.apitest.infra

import com.juliomesquita.kotlinlearning.apitest.domain.Pessoa
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "tb_pessoas")
open class PessoaEntity(
    @Id
    @Column(name = "id", nullable = false)
    var id: UUID,

    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "cpf", nullable = false)
    var cpf: String,

    @Column(name = "age")
    var age: Int
) {
    companion object {
        fun from(pessoa: Pessoa): PessoaEntity {
            return PessoaEntity(
                pessoa.id,
                pessoa.name,
                pessoa.cpf,
                pessoa.age
            );
        }
    }

    fun toAggregate(): Pessoa {
        return Pessoa.getInstance(
            this.id,
            this.name,
            this.cpf,
            this.age
        )
    }
}
