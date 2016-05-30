package Interfaces;

import Model.Data;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by krrish on 13/04/2016.
 */
public interface RetrofitPodcatsApi {

    @GET("api/podcasts/list")
    Call<Data> getdata();

}
