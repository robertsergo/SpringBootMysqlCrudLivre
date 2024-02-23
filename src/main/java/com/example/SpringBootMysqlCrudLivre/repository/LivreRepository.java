package com.example.SpringBootMysqlCrudLivre.repository;

import com.example.SpringBootMysqlCrudLivre.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
}
