
package com.examen.service;

import com.examen.entity.Conciertos;
import java.util.List;

public interface iConciertosService {
    public List<Conciertos> getAllConciertos();
    public void saveConciertos(Conciertos conciertos);
    public Conciertos getConciertosById(long id);
    public void deleteConciertos(long id);   
}
