package iteractors;

import java.util.ArrayList;
import java.util.List;

import model.Country;
import model.Github;
import model.Item;
import rx.Observable;

/**
 * Created by david on 2/16/16.
 */
public interface ItemIteractor {
    Observable<List<Github>> getItems();

}
