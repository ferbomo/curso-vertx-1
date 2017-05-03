package com.vertx.example3.service.syncsensor.impl;

import com.vertx.example3.service.sensor.SensorService;
import com.vertx.example3.service.sensor.domain.SensorDTO;
import com.vertx.example3.service.sensor.impl.SensorServiceImpl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

/**
 * Simulación de evento síncrono
 * 
 * @author manuel
 *
 */
public class SensorSyncServiceImpl extends SensorServiceImpl {

	
	
	/**
	 * Builder para la creación de una instancia genérica del servicio
	 *
	 * @author manuel
	 *
	 */
	public static class Builder {
		public SensorService create(Vertx vertx, JsonObject config) {
			return new SensorSyncServiceImpl(vertx, config);
		}
	}

	public SensorSyncServiceImpl(Vertx vertx, JsonObject config) {
		super(vertx, config);
	}

	@Override
	public void getSensor(String id, Handler<AsyncResult<SensorDTO>> resultHandler) {

		/* Paramos 2 segundos simulando sincronía y realizamos la operación */
		vertx.setTimer(2000, h -> {
			/* Invocamos al método del padre */
			SensorSyncServiceImpl.super.getSensor(id, resultHandler);
		});
		
	}

}
