package com.ed.ms_core_portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ed.ms_core_portal.dto.AuthResponse;
import com.ed.ms_core_portal.request.AuthRequest;

import com.ed.ms_core_portal.service.IAuthService;
import com.ed.ms_core_portal.util.Constants;
import com.ed.ms_core_portal.util.Utils;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/mw/core/v1")
public class AuthController {

	private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

	private final IAuthService service;

	public AuthController(IAuthService service) {
		this.service = service;
	}

	@PostMapping("/session/valida")
	public ResponseEntity<AuthResponse> validarAcceso(@Valid @RequestBody AuthRequest request) {

		LOG.info("IN validarAcceso: {} {}", Constants.Messages.REQUEST, request);

		AuthResponse response = service.validarAcceso(request);

		LOG.info("OUT validarAcceso: {} {}", Constants.Messages.RESPONSE, response);

		HttpStatus https = Utils.setStatus(response.getCodigo());

		return ResponseEntity.status(https).body(response);
	}

}
