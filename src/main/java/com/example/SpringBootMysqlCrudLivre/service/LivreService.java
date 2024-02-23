package com.example.SpringBootMysqlCrudLivre.service;

import com.example.SpringBootMysqlCrudLivre.entity.Livre;
import com.example.SpringBootMysqlCrudLivre.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;
    public void save(Livre livre){
        livreRepository.save(livre);
    }
    public List<Livre> livresDisponibles(){
        return livreRepository.findAll();
    }
    public Livre obtenirParId(Long id){
        return livreRepository.findById(id).get();
    }

    public void livreEffacer(Livre livre){
        livreRepository.delete(livre);
    }
}
