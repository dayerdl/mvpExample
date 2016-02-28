package presenter.impl;

import android.util.Log;

import java.util.List;
import java.util.logging.Logger;

import iteractors.ItemIteractor;
import iteractors.impl.ItemIteractorImpl;
import model.Country;
import model.Github;
import model.Item;
import presenter.ItemsPresenter;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by david on 2/14/16.
 */
public class ItemsPresenterImpl implements ItemsPresenter {

    private ItemsPresenter.View mView;

    private Subscription countrySubscription;
    ItemIteractor mIteractor;

    public ItemsPresenterImpl(View mView, ItemIteractor interactor) {
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
    public void getItemsList() {
        mView.showProgress();

        if (countrySubscription != null) {
            countrySubscription.unsubscribe();
        }
        countrySubscription = mIteractor.getItems().observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread()).subscribe(new Subscriber<Github>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        //mView.showConnectionErrorView();
                        Log.d("TAG", e.toString());
                    }

                    @Override
                    public void onNext(Github github) {
                        mView.hideProgress();
//                        if (feeds.size() > 0) {
//                            mView.showItems(feeds);
//                        } else {
//                            mView.showNoEntriesView();
//                        }
                    }


                });
    }
}
