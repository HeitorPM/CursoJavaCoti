package br.com.cotiinformatica.interfaces;

import java.util.List;

//<T> tipo generico que ir� representar uma entidade
//<ID> tipo generico que ir� representar a chave prim�ria da entidade
public interface ICrudRepository<T, ID> {

	
	//o tipo do T � uma incognita, pode ser variavel
	//o tipo do id ser� um int
	//m�todos abstratos
	void create(T obj) throws Exception;
	
	void update(T obj) throws Exception;
	
	void delete(T obj) throws Exception;
	
	List<T> getAll() throws Exception;
	
	T getById(ID id) throws Exception;
	
}
