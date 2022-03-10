
package com.examen.repository;

import com.examen.entity.Conciertos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ConciertosRepository extends CrudRepository<Conciertos,Long> {
    
}
