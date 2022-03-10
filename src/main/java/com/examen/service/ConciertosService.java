
package com.examen.service;

import com.examen.entity.Conciertos;
import com.examen.repository.ConciertosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConciertosService implements iConciertosService{
    
    @Autowired
    private ConciertosRepository conciertosRepository;

    @Override
    public List<Conciertos> getAllConciertos() {
        return (List<Conciertos>)conciertosRepository.findAll();
    }

    @Override
    public void saveConciertos(Conciertos conciertos) {
        conciertosRepository.save(conciertos);
    }

    @Override
    public Conciertos getConciertosById(long id) {
        Conciertos conciertos;
        Optional<Conciertos> conciertosEncontrado = conciertosRepository.findById(id);
        if (conciertosEncontrado.isPresent()){
            conciertos  = new Conciertos(conciertosEncontrado.get());
            return conciertos;
        }
        return null;
    }

    @Override
    public void deleteConciertos(long id) {
        conciertosRepository.deleteById(id);
    }
    
    
}