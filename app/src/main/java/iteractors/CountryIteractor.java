package iteractors;

import java.util.ArrayList;
import java.util.List;

import model.Country;
import rx.Observable;

/**
 * Created by david on 2/16/16.
 */
public interface CountryIteractor {
    Observable<List<Country>> getCountries();

}
