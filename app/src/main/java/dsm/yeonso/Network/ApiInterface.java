package dsm.yeonso.Network;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by dsm2016 on 2018-04-23.
 */

public interface ApiInterface {
    String API_URL = "http://shrouded-eyrie-36691.herokuapp.com/";

    @Headers("Content-Type: application/json")
    @POST("/user/sign-up")
    Call<Void> signUp(@Body String body);
}
