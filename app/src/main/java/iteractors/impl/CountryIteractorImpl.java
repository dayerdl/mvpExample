package iteractors.impl;

import java.util.ArrayList;
import java.util.List;

import iteractors.CountryIteractor;
import model.Country;
import repositories.CountryRepository;
import rx.Observable;

/**
 * Created by david on 2/16/16.
 */
public class CountryIteractorImpl implements CountryIteractor {

    CountryRepository countryRepository;

    public CountryIteractorImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public Observable<List<Country>> getCountries() {
        return countryRepository.getCountries();

    }
}
