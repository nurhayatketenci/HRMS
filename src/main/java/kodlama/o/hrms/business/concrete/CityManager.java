package kodlama.o.hrms.business.concrete;

import kodlama.o.hrms.business.abstracts.CityService;
import kodlama.o.hrms.core.utilities.Results.DataResult;
import kodlama.o.hrms.core.utilities.Results.SuccessDataResult;
import kodlama.o.hrms.dataAccess.abstracts.CityDao;
import kodlama.o.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {
    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(cityDao.findAll());

    }
}
