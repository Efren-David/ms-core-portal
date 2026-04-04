package com.ed.ms_core_portal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ed.ms_core_portal.model.ValidacionUsuario;

public interface ValidacionRepository extends JpaRepository<ValidacionUsuario, Long>{
	
	
    Optional<ValidacionUsuario> findByNoEmpleadoAndIpAndNavegadorAndActivo(
            String noEmpleado,
            String ip,
            String navegador,
            boolean activo
        );
}
