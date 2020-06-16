package com.uca.capas.tareaLabo5.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.tareaLabo5.domain.Estudiante;

public interface EstudianteDAO {

	public List<Estudiante> findAll() throws DataAccessException;
	public Estudiante findOne(Integer codigo) throws DataAccessException;
	public void insert(Estudiante estudiante) throws DataAccessException;
	public void borrar(Integer codigo) throws DataAccessException;
}
