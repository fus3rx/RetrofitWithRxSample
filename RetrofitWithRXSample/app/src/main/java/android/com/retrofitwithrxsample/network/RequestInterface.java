package android.com.retrofitwithrxsample.network;

import android.com.retrofitwithrxsample.model.Country;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Create by: Mukesh Yadav
 * www.androiddevelopersolutions.com
 */
public interface RequestInterface {

    @GET("country/get/all")
    Observable<Country> getAllCountry();
}
