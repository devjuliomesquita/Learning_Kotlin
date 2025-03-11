package com.juliomesquita.kotlinlearning.apitest.infra

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface PessoaRepository : JpaRepository<PessoaEntity, UUID>{
}