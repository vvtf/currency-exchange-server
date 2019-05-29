package tk.vvtf.garage.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.vvtf.garage.entity.Status;

import java.util.Random;

/**
 * Basic REST controller for the exchange
 */
@RestController
public class GarageController {

    private final static Random rnd = new Random(System.currentTimeMillis());

    @RequestMapping("/status")
    public Status pong() {
        System.out.println("PONG");
        return new Status(rnd.nextBoolean());
    }

}
