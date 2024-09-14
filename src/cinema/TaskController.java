package cinema;

import cinema.room.Theatre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping(path = "/seats", produces = "application/json")
    public Theatre getSeats() {
        Theatre myTheatre = new Theatre();
        return myTheatre;
    }


}
