package iteractors.impl;

import java.util.List;

import iteractors.ItemIteractor;
import model.Github;
import repositories.ItemsRepository;
import rx.Observable;

/**
 * Created by david on 2/16/16.
 */
public class ItemIteractorImpl implements ItemIteractor {

    ItemsRepository mItemsRepository;

    public ItemIteractorImpl(ItemsRepository repository) {
        mItemsRepository = repository;
    }

    @Override
    public Observable<List<Github>> getItems() {

        return mItemsRepository.getItems();

    }
}
