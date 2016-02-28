package ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.dayerdl.firstround.mvpcountrylist.R;

import java.util.ArrayList;
import java.util.List;

import adapters.CardAdapter;
import butterknife.Bind;

import butterknife.ButterKnife;
import iteractors.ItemIteractor;
import iteractors.impl.ItemIteractorImpl;
import model.Github;
import model.Item;
import presenter.ItemsPresenter;
import presenter.impl.ItemsPresenterImpl;
import repositories.ItemsRepository;
import repositories.impl.ItemsRepositoryImpl;

public class MainActivity extends AppCompatActivity implements ItemsPresenter.View {

    @Bind(R.id.button_fetch)
    Button mButtonLoad;

    @Bind(R.id.recycler_view)
    RecyclerView mRecyclerView;

    ItemsPresenter presenter;
    CardAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();
    }

    @Override
    protected void onStop() {
        presenter.stop();
        super.onStop();
    }

    private void init() {
        ItemsRepository repository = new ItemsRepositoryImpl();
        ItemIteractor interactor = new ItemIteractorImpl(repository);
        presenter = new ItemsPresenterImpl(this, interactor);

        mButtonLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getItemsList();
            }
        });
        adapter = new CardAdapter();
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showItems(List<Github> list) {
        adapter.addData((ArrayList<Github>) list);

    }

    @Override
    public void showNoEntriesView() {

    }
}
