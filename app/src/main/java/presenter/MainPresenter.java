package presenter;

import java.util.List;

import views.BaseView;

/**
 * Created by david on 2/16/16.
 */
public interface MainPresenter extends BasePresenter {

    public interface View extends BaseView {

       void showCountryList();
    }

    void getCountryList();

}
