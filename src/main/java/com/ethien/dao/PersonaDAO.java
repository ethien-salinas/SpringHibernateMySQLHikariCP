package com.ethien.dao;
 
import java.util.List;

import com.ethien.model.Persona;
 
public interface PersonaDAO {
 
    public void save(Persona p);
     
    public List<Persona> list();

    public Persona getPersonaByNombre(String nombre);
     
}