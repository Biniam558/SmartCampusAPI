package com.smartcampus.resource;

import com.smartcampus.model.Sensor;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * resource class for Sensor API
 */
@Path("/sensors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SensorResource {

    // simple in memory list
    private static List<Sensor> sensors = new ArrayList<>();
    static {
    sensors.add(new Sensor("S1", "temperature", 22.5));
    sensors.add(new Sensor("S2", "motion", 1.0));
    }

    // get all sensors
    @GET
    public List<Sensor> getSensors() {
        return sensors;
    }

    // add a new sensor
    @POST
    public String addSensor(Sensor sensor) {
        sensors.add(sensor);
        return "Sensor added";
    }

    // get one sensor by id
    @GET
    @Path("/{id}")
    public Sensor getSensor(@PathParam("id") String id) {
        for (Sensor s : sensors) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    // delete sensor by id
    @DELETE
    @Path("/{id}")
    public String deleteSensor(@PathParam("id") String id) {
        sensors.removeIf(s -> s.getId().equals(id));
        return "Sensor deleted";
    }
}