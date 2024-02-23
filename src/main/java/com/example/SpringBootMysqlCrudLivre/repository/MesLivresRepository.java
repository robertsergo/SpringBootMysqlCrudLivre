package com.example.SpringBootMysqlCrudLivre.repository;

import com.example.SpringBootMysqlCrudLivre.entity.MesLivres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesLivresRepository extends JpaRepository<MesLivres, Long> {
}
