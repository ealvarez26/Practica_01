
package com.Practica_01.Practica_01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idPais;
    private String nombreEstado;
    private String capital;
    private int poblacion;
    private String costas;
    
    public Estado(){
        
    }

    public Estado(String nombreEstado, String capital, int poblacion, String costas) {
        this.nombreEstado = nombreEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
    
}
