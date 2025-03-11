package com.juliomesquita.kotlinlearning.apitest.services

import com.juliomesquita.kotlinlearning.apitest.services.dtos.CreatePessoaDto
import com.juliomesquita.kotlinlearning.apitest.services.dtos.UpdatePessoaDto
import com.juliomesquita.kotlinlearning.apitest.domain.Pessoa
import com.juliomesquita.kotlinlearning.apitest.infra.PessoaEntity
import com.juliomesquita.kotlinlearning.apitest.infra.PessoaRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PessoaServiceImpl constructor(val repository: PessoaRepository) : PessoaService {

    override fun create(createPessoaDto: CreatePessoaDto): Pessoa {
        val pessoa = Pessoa.create(
            createPessoaDto.name,
            createPessoaDto.cpf,
            createPessoaDto.age
        )
        return this.repository.save(PessoaEntity.from(pessoa)).toAggregate()
    }

    override fun update(id: UUID, updatePessoaDto: UpdatePessoaDto): Pessoa {
        val pessoa = this.repository
            .findById(id)
            .orElseThrow { RuntimeException("Pessoa não encontrada.") }
            .toAggregate()
            .updateName(updatePessoaDto.name)
            .updateAge(updatePessoaDto.age);

        return this.repository.save(PessoaEntity.from(pessoa)).toAggregate()
    }

    override fun findById(id: UUID): Pessoa {
        return this.repository
            .findById(id)
            .orElseThrow { RuntimeException("Pessoa não encontrada.") }
            .toAggregate();
    }

    override fun delete(id: UUID) {
        this.repository.deleteById(id);
    }
}