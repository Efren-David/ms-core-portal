package com.ed.ms_core_portal.util;

import org.springframework.http.HttpStatus;

public class Utils {

	public static HttpStatus setStatus(Integer code) {
		HttpStatus estatus;
		switch (code) {
		case Constants.Numbers.NUM_1:
			estatus = HttpStatus.BAD_REQUEST;
			break;
		case Constants.Numbers.NUM_2:
			estatus = HttpStatus.NOT_FOUND;
			break;
		case Constants.Numbers.NUM_3:
			estatus = HttpStatus.INTERNAL_SERVER_ERROR;
			break;
		case Constants.Numbers.NUM_4:
			estatus = HttpStatus.UNAUTHORIZED;
			break;
		default:
			estatus = HttpStatus.OK;
			break;
		}
		return estatus;
	}

}
