package kodlama.o.hrms.business.abstracts;

import kodlama.o.hrms.core.utilities.results.DataResult;
import kodlama.o.hrms.entities.concretes.City;

import java.util.List;

public interface CityService {
    DataResult<List<City>> getAll();
}
