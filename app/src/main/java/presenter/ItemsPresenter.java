package presenter;

import java.util.ArrayList;
import java.util.List;

import model.Country;
import model.Github;
import model.Item;
import views.BaseView;

/**
 * Created by david on 2/14/16.
 */
public interface ItemsPresenter extends BasePresenter {

    interface View extends BaseView {
        void showItems(List<Github> list);

        void showNoEntriesView();
    }

    void getItemsList();

}
