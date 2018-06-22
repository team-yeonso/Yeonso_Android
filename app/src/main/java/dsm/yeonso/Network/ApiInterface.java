package dsm.yeonso.Network;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by dsm2016 on 2018-04-23.
 */

public interface ApiInterface {
    public static final String API_URL = "http://shrouded-eyrie-36691.herokuapp.com/";

    @Headers("Content-Type: application/json")
    @POST("/user/sign-up")
//    Call<Void> signUp(@Field("email") String email, @Field("name") String name, @Field("password") String password);
//    Call<Void> signUp(@QueryMap Map<String, String> map);
//    Call<Void> signUp(@Body Map<String, String> map);
//    Call<Void> signUp(@FieldMap Map<String, String> map);
    Call<Void> signUp(@Body SignUpRequest body);

//    @FormUrlEncoded
//    @POST("/user/auth")
//    Call<Void> signUp(@Field("code") String code);
//
//    @FormUrlEncoded
//    @POST("/user/sign-in")
//    Call<Void> signIn(@Field("email") String email, @Field("password") String password);
}
