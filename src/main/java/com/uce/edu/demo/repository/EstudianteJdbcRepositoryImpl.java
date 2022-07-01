package com.uce.edu.demo.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.ProyectoU2PsApplication;
import com.uce.edu.demo.to.EstudianteTo;
@Repository
public class EstudianteJdbcRepositoryImpl implements IEstudianteJdbcRepository  {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);


	@Override
	public EstudianteTo buscarPorId(int id) {
		// TODO Auto-generated method stub
		logJava.info("Se ha buscado es estudiante de id: "+ id);
		 return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", 
				new Object[] { id}, new BeanPropertyRowMapper<EstudianteTo>(EstudianteTo.class));
	}

	@Override
	public void insertar(EstudianteTo estudianteTo) {
		// TODO Auto-generated method stub
		logJava.info("Se ha insertado el estudiante: "+estudianteTo);

		this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido, cedula, genero) values (?,?,?,?,?)",
				new Object[] { estudianteTo.getId(), estudianteTo.getNombre(), estudianteTo.getApellido(),estudianteTo.getCedula(),estudianteTo.getGenero() });

	}

	@Override
	public void actualizar(EstudianteTo estudianteTo) {
		// TODO Auto-generated method stub
		logJava.info("Se ha actualizado el estudiante: "+estudianteTo);

		this.jdbcTemplate.update("update estudiante set nombre=?, apellido=?, cedula=?, genero=?  where id=? ",
				new Object[] { estudianteTo.getNombre(), estudianteTo.getApellido(),estudianteTo.getCedula(),estudianteTo.getGenero(),estudianteTo.getId()  });
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		logJava.info("Se ha actualizado el estudiante de id: "+ id);
		this.jdbcTemplate.update("delete from estudiante where id =?", new Object[] {id});
	}
	
	

}
