package dsm.yeonso.Network;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by dsm2016 on 2018-04-23.
 */

public interface ApiInterface {
    public static final String API_URL = "http://shrouded-eyrie-36691.herokuapp.com/";

    @FormUrlEncoded
    @POST("/user/sign-up")
    Call<Void> signUp(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("/user/sign-in")
    Call<Void> signIn(@Field("email") String email, @Field("password") String password);
}
