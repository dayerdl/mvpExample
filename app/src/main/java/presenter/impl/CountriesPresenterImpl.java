package presenter.impl;

import java.util.ArrayList;
import java.util.List;

import iteractors.CountryIteractor;
import iteractors.impl.CountryIteractorImpl;
import model.Country;
import presenter.CountriesPresenter;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by david on 2/14/16.
 */
public class CountriesPresenterImpl implements CountriesPresenter {

    private CountriesPresenter.View mView;

    private Subscription countrySubscription;
    CountryIteractor mIteractor;

    public CountriesPresenterImpl(View mView, CountryIteractorImpl interactor) {
        this.mView = mView;
        this.mIteractor = interactor;
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


    @Override
    public void getCountryList() {
        mView.showProgress();

        if (countrySubscription != null) {
            countrySubscription.unsubscribe();
        }
        countrySubscription = mIteractor.getCountries().observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread()).subscribe(new Subscriber<List<Country>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        //mView.showConnectionErrorView();

                    }

                    @Override
                    public void onNext(List<Country> feeds) {
                        mView.hideProgress();
                        if (feeds.size() > 0) {
                            mView.showCountries(feeds);
                        } else {
                            // mView.showNoEntriesView();
                        }


                    }
                });

    }
}
