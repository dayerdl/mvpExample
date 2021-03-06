package network;

import java.util.List;

import model.Github;
import model.Item;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by David on 2/18/16.
 */
public interface RestService {
    String SERVICE_ENDPOINT = "https://api.github.com";

    @GET("/users")
    Observable<List<Github>> getUser();
}
