package com.uce.edu.demo.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.ProyectoU2PsApplication;
import com.uce.edu.demo.to.Estudiante;
@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository  {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);


	@Override
	public Estudiante buscarPorId(int id) {
		// TODO Auto-generated method stub
		logJava.info("Se ha buscado es estudiante de id: "+ id);
		 return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", 
				new Object[] { id}, new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		logJava.info("Se ha insertado el estudiante: "+estudiante);

		this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido, cedula, genero) values (?,?,?,?,?)",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),estudiante.getCedula(),estudiante.getGenero() });

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		logJava.info("Se ha actualizado el estudiante: "+estudiante);

		this.jdbcTemplate.update("update estudiante set nombre=?, apellido=?, cedula=?, genero=?  where id=? ",
				new Object[] { estudiante.getNombre(), estudiante.getApellido(),estudiante.getCedula(),estudiante.getGenero(),estudiante.getId()  });
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		logJava.info("Se ha actualizado el estudiante de id: "+ id);
		this.jdbcTemplate.update("delete from estudiante where id =?", new Object[] {id});
	}
	
	

}
