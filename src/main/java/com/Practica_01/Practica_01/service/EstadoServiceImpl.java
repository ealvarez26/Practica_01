/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica_01.Practica_01.service;

import com.Practica_01.Practica_01.dao.EstadoDao;
import com.Practica_01.Practica_01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    EstadoDao estadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstados() {
        return (List<Estado>) estadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdPais()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.deleteById(estado.getIdPais());
    }

}
