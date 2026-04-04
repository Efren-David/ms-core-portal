package com.ed.ms_core_portal.service;

import com.ed.ms_core_portal.dto.AuthResponse;
import com.ed.ms_core_portal.request.AuthRequest;

public interface IAuthService {

    AuthResponse validarAcceso(AuthRequest request);

}
