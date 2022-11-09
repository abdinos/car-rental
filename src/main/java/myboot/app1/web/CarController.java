package myboot.app1.web;

import myboot.app1.model.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        return new ResponseEntity<>(cars, HttpStatus.OK);

    }



}
