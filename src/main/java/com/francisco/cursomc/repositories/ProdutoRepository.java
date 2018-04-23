package com.francisco.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.francisco.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer> {

}
