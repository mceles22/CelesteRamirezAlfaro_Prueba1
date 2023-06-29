
package com.prueba1.service;

import java.util.List;
import com.prueba1.entities.Prueba;

public interface IPruebaService {
    List<Prueba> getAllPruebas();
    void save (Prueba prueba);
    void delete (Prueba prueba);
    
}


