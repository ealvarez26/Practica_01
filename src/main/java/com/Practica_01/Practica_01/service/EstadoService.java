package com.Practica_01.Practica_01.service;

import com.Practica_01.Practica_01.domain.Estado;
import java.util.List;

public interface EstadoService {

    public List<Estado> getEstados();

    public Estado getEstado(Estado estado);

    public void save(Estado estado); //Para insertar o modificar(Si tiene el idEstadoo no)

    public void delete(Estado estado);
}
