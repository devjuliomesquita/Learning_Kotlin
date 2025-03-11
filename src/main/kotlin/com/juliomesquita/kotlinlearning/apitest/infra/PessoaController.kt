package com.juliomesquita.kotlinlearning.apitest.infra

import com.juliomesquita.kotlinlearning.apitest.services.PessoaService
import com.juliomesquita.kotlinlearning.apitest.services.dtos.CreatePessoaDto
import com.juliomesquita.kotlinlearning.apitest.services.dtos.PessoaDto
import com.juliomesquita.kotlinlearning.apitest.services.dtos.UpdatePessoaDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/pessoa")
class PessoaController constructor(val pessoaService: PessoaService) {

    @PostMapping
    fun createPessoa(@RequestBody request: CreatePessoaDto): ResponseEntity<PessoaDto> {
        val pessoa = this.pessoaService.create(request);
        return ResponseEntity.ok(PessoaDto.create(pessoa));
    }

    @GetMapping("/{id}")
    fun findPessoa(@PathVariable(name = "id") id: UUID): ResponseEntity<PessoaDto> {
        val pessoa = this.pessoaService.findById(id);
        return ResponseEntity.ok(PessoaDto.create(pessoa));
    }

    @PutMapping("/{id}")
    fun updatePessoa(
        @PathVariable(name = "id") id: UUID,
        @RequestBody request: UpdatePessoaDto
    ): ResponseEntity<PessoaDto> {
        val pessoa = this.pessoaService.update(id, request);
        return ResponseEntity.ok(PessoaDto.create(pessoa));
    }

    @DeleteMapping("/{id}")
    fun deletePessoa(
        @PathVariable(name = "id") id: UUID
    ): ResponseEntity<PessoaDto> {
        this.pessoaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}