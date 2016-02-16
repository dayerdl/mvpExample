package presenter;

import java.util.ArrayList;
import java.util.List;

import model.Country;
import views.BaseView;

/**
 * Created by david on 2/14/16.
 */
public interface CountriesPresenter extends BasePresenter {

    interface View extends BaseView {
        void showCountries(List<Country> list);
    }

    void getCountryList();

}
