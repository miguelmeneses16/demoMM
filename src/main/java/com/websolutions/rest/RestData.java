package com.websolutions.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.websolutions.model.ModelData;

@RestController
@RequestMapping(path = "/rest/dataMM")
public class RestData {
	
	@GetMapping(path = "/obtenerDatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name = "msg") String messagge) {
		ModelData response = new ModelData();
		if(messagge.equals("MM")) {
			response.setCode(200);
			response.setStatus(true);
			response.setMensaje("Mensaje Success: "+messagge);
		}else {
			response.setCode(402);
			response.setStatus(false);
			response.setMensaje("Mensaje Fallido: "+messagge);
		}
		return response;
	}

}
