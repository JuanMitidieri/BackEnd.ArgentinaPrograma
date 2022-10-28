/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.demo.Interface;

import com.portafolio.demo.Entity.Persona;
import java.util.List;

public interface IpersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto del tipo persona
    public void savePersona (Persona persona);
    
    //eliminar un objeto pero lo buscamos por id
    
    public void deletePersona(Long id);
    
    //buscar una persona por ID
    
    public Persona findPersona(Long id);
    
}
