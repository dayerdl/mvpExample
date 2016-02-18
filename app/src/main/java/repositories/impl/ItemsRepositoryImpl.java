package repositories.impl;


import android.util.Log;

import java.util.List;

import model.Country;
import model.Item;
import network.RestService;
import network.ServiceFactory;
import repositories.ItemsRepository;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by David on 2/16/16.
 */
public class ItemsRepositoryImpl implements ItemsRepository {

    @Override
    public Observable<List<Item>> getItems() {
        // this one should get them from cache or request them
        return Observable.create(new Observable.OnSubscribe<List<Item>>() {
            @Override
            public void call(final Subscriber<? super List<Item>> subscriber) {
                RestService service = ServiceFactory.createRetrofitService(RestService.class, RestService.SERVICE_ENDPOINT);
                service.getUser(login);
            }
        });
    }
}
