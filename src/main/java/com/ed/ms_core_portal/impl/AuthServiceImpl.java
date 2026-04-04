package com.ed.ms_core_portal.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ed.ms_core_portal.dto.AuthResponse;
import com.ed.ms_core_portal.repository.ValidacionRepository;
import com.ed.ms_core_portal.request.AuthRequest;
import com.ed.ms_core_portal.service.IAuthService;
import com.ed.ms_core_portal.util.Constants;

@Service
public class AuthServiceImpl implements IAuthService {

	private static final Logger LOG = LoggerFactory.getLogger(AuthServiceImpl.class);

	private final ValidacionRepository repository;

	public AuthServiceImpl(ValidacionRepository repository) {
		this.repository = repository;
	}

	@Override
	public AuthResponse validarAcceso(AuthRequest request) {

		LOG.info("[1 de 3] Finaliza consulta a BD. {}. {} ", Constants.Endpoints.API_VALIDACION, request);

		boolean acceso = repository.findByNoEmpleadoAndIpAndNavegadorAndActivo(request.getNoEmpleadoSession(),
				request.getIpEmpleadoSession(), request.getNav(), true).isPresent();

		LOG.info("[2 de 3] Finaliza consulta a BD. {}. {} ", Constants.Endpoints.API_VALIDACION, acceso);

		if (acceso) {
			LOG.info("[3 de 3] Se valida con exito. {}. {} ", Constants.Endpoints.API_VALIDACION, acceso);
			return AuthResponse.success();
		}
		
		LOG.info("[1 de 1] Usuario no valido {}" , Constants.Messages.ERROR_INTERNO);

		return AuthResponse.error();
	}
}
