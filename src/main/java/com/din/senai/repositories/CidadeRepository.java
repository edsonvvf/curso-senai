package com.din.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.din.senai.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>  {

}
