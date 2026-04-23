package com.smartcampus.resource;

import com.smartcampus.model.Room;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * resource class for Room API
 */
@Path("/rooms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RoomResource {

    // simple in memory list no database
    private static List<Room> rooms = new ArrayList<>();
    static {
    rooms.add(new Room("R1", "Lab A", 30));
    rooms.add(new Room("R2", "Lecture Room 1", 50));
    }

    // get all rooms
    @GET
    public List<Room> getRooms() {
        return rooms;
    }

    // add a new room
    @POST
    public String addRoom(Room room) {
        rooms.add(room);
        return "Room added";
    }

    // get one room by id
    @GET
    @Path("/{id}")
    public Room getRoom(@PathParam("id") String id) {
        for (Room r : rooms) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }

    // delete room by id
    @DELETE
    @Path("/{id}")
    public String deleteRoom(@PathParam("id") String id) {
        rooms.removeIf(r -> r.getId().equals(id));
        return "Room deleted";
    }
}