package com.juliomesquita.kotlinlearning.apitest.services

import com.juliomesquita.kotlinlearning.apitest.services.dtos.CreatePessoaDto
import com.juliomesquita.kotlinlearning.apitest.services.dtos.UpdatePessoaDto
import com.juliomesquita.kotlinlearning.apitest.domain.Pessoa
import java.util.*

interface PessoaService {
    fun create(createPessoaDto: CreatePessoaDto): Pessoa;
    fun update(id: UUID, updatePessoaDto: UpdatePessoaDto): Pessoa;
    fun findById(id: UUID): Pessoa;
    fun delete(id: UUID);
}