package com.example.SpringBootMysqlCrudLivre.service;

import com.example.SpringBootMysqlCrudLivre.entity.MesLivres;
import com.example.SpringBootMysqlCrudLivre.repository.MesLivresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesLivresService {
    @Autowired
    private MesLivresRepository mesLivresRepository;

    public void ajouterMesLivres(MesLivres mesLivres){
        mesLivresRepository.save(mesLivres);
    }

    public List<MesLivres> listeDeMeslivres(){
       return mesLivresRepository.findAll();
    }

    public void mesLivresdeletedById(Long id){
        mesLivresRepository.deleteById(id);
    }
}
