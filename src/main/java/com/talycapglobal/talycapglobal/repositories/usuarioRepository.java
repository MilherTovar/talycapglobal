package com.talycapglobal.talycapglobal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.talycapglobal.talycapglobal.models.usuario;

@Repository
public interface usuarioRepository extends JpaRepository<usuario,Long> {
    public String sql1="select u.* from usuario u, tipo_documento td where u.identificacion=:identificacion and td.tipo_documento=:tipo";

    @Query(value=sql1,nativeQuery = true)
    public usuario findByCedula(@Param("identificacion")Long identificacion,@Param("tipo") String tipo);    
}
