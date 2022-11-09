package myboot.app1.Service;

import myboot.app1.dao.CarRepository;
import myboot.app1.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    ArrayList<Car> carList;


    public ArrayList<Car> getAffordableCars(double price){
        ArrayList<Car> affordableCarsList = new ArrayList<>();
        for (Car car:carList)
        { if (car.getPrice() ==0) return null;

        }
        return null;
    }


}
