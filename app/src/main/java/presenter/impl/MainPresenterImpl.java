package presenter.impl;

import iteractors.CountryIteractor;
import iteractors.impl.CountryIteractorImpl;
import presenter.MainPresenter;

/**
 * Created by david on 2/16/16.
 */
public class MainPresenterImpl implements MainPresenter {

    MainPresenter.View mView;

    CountryIteractor iteractor;

    public MainPresenterImpl(View mView) {
        this.mView = mView;
    }

    @Override
    public void getCountryList() {
        iteractor = new CountryIteractorImpl();

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }
}
