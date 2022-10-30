package com.prueba.simpleCRUD.repositories;

import com.prueba.simpleCRUD.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}
