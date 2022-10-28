/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portafolio.demo.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author juanm
 */
public class dtoSkills {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
     @NotBlank
    private String imgE;
     
    
    //Constructores

    public dtoSkills() {
    }

    public dtoSkills(String nombreE, String descripcionE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
         this.imgE = imgE;
       
    } 

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }
}