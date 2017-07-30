package br.com.api.lab04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.lab04.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Integer>{

}
