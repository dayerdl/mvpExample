package repositories.impl;


import java.util.List;

import model.Github;
import network.RestService;
import network.ServiceFactory;
import repositories.ItemsRepository;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by David on 2/16/16.
 */
public class ItemsRepositoryImpl implements ItemsRepository {

    @Override
    public Observable<List<Github>> getItems() {
        // this one should get them from cache or request them
//        return Observable.create(new Observable.OnSubscribe<Github>() {
//            @Override
//            public void call(final Subscriber<? super Github> subscriber) {
//
//            }
//        });
        RestService service = ServiceFactory.createRetrofitService(RestService.class, RestService.SERVICE_ENDPOINT);
        return service.getUser();

    }
}
