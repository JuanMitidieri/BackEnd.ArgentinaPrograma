/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.demo.Repository;

import com.portafolio.demo.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RSkills extends JpaRepository<Skills, Integer>{
    public Optional<Skills> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
