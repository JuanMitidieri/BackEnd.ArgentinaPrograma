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
public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
     @NotBlank
    private String ImgE;
     
    
    //Constructores

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String ImgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
         this.ImgE = ImgE;
       
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
        return ImgE;
    }

    public void setImgE(String imgE) {
        this.ImgE = imgE;
    }
}
