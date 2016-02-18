package presenter.impl;

import iteractors.ItemIteractor;
import iteractors.impl.ItemIteractorImpl;

/**
 * Created by david on 2/16/16.
 */
public class MainPresenterImpl implements MainPresenter {

    MainPresenter.View mView;
    ItemIteractor iteractor;

    public MainPresenterImpl(View mView, ItemIteractor iteractor) {
        this.mView = mView;
    }

    @Override
    public void getCountryList() {
        iteractor = new ItemIteractorImpl(iteractor,mView);

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
