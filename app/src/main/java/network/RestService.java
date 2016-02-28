package network;

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

    @GET("/users/{login}")
    Observable<Github> getUser(@Path("login") String login);
}
