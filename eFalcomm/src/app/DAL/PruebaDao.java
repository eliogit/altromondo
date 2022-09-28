package app.DAL;

import java.util.List;

import app.Model.Prueba;

public interface PruebaDao {
	void insertPrueba(Prueba object);

	void deletePrueba(int id);// throws SQLException;

	void updatePrueba(int id, Prueba object);
	
	List<Prueba> findAll ();

	Prueba findById (int id);

}
