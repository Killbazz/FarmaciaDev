package com.generation.pharmadev.repository;

import java.util.List;

import com.generation.pharmadev.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByGenericoOriginalContainingIgnoreCase(
			@Param("genericoOriginal") String genericoOriginal);

	public List<Categoria> findAllByCategoriaProdutoContainingIgnoreCase(
			@Param("categoriaProduto") String categoriaProduto);
}