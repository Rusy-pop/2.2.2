package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class CarServiceImp implements CarService {
    private List<Car> cars = Arrays.asList(new Car("Fiat", "lodf", 1202),
            new Car("Gaz", "2107", 1420), new Car("Tayota", "Chanisez", 2077),
            new Car("NoTayota", "1-y98", 2077), new Car("pi", "pi-1", 2023));

    @Override
    public List<Car> getCarCount(Optional<Integer> count) {
        if (count.isPresent() && count.get() < cars.size()) {
            return cars.subList(0, count.get());
        } else {
            return cars;
        }
    }
}
