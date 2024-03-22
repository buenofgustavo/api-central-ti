package com.centralti.tdm.domain.usuarios.repositories;

import com.centralti.tdm.domain.usuarios.entidades.Chamados;
import com.centralti.tdm.domain.usuarios.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChamadosRepository extends JpaRepository<Chamados, String> {
    List<Chamados> findChamadosByStatus(Integer status);
    List<Chamados> findAllByExcluidoTrue();
    List<Chamados> findAllByExcluidoFalse();

}
