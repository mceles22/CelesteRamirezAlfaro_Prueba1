
package com.prueba1.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.prueba1.db.IPruebaRepository;
import com.prueba1.entities.Prueba;
import com.prueba1.service.IPruebaService;


@Service
public class PruebaService implements IPruebaService{
    private final IPruebaRepository pruebaRepository;
    
    public PruebaService (IPruebaRepository pruebaRepository){
        this.pruebaRepository=pruebaRepository;
    }
    
    public List<Prueba> getAllPruebas(){
        return (List<Prueba>) this.pruebaRepository.findAll();
}

    public void save (Prueba prueba){
        prueba.setActivo(true);
        this.pruebaRepository.save(prueba);
    
}
    
    public void delete (Prueba prueba){
        this.pruebaRepository.delete(prueba);
    }


}