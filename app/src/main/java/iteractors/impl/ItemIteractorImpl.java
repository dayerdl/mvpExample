package iteractors.impl;

import android.util.Log;

import java.util.List;

import iteractors.ItemIteractor;
import model.Country;
import model.Item;
import repositories.ItemsRepository;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by david on 2/16/16.
 */
public class ItemIteractorImpl implements ItemIteractor {

    ItemsRepository mItemsRepository;

    public ItemIteractorImpl(ItemsRepository repository) {
        mItemsRepository = repository;
    }

    @Override
    public Observable<List<Item>> getItems() {

        return mItemsRepository.getItems();

    }
}
