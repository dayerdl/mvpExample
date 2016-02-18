package iteractors;

import java.util.ArrayList;
import java.util.List;

import model.Country;
import model.Item;
import rx.Observable;

/**
 * Created by david on 2/16/16.
 */
public interface ItemIteractor {
    Observable<List<Item>> getItems();

}
