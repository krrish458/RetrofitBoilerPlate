package au.com.appscore.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import Interfaces.RetrofitPodcatsApi;
import Model.Data;
import Model.Podcasts;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity  {
    static final String baseurl = "http://emcast.appscorehosting.com.au/";
    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //making object of RestAdapter
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
        RetrofitPodcatsApi service = retrofit.create(RetrofitPodcatsApi.class);

        Call<Data> call = service.getdata();
        Log.d(TAG,"afterCall");
        call.enqueue(new Callback<Data>() {


            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {

                for (Podcasts p:response.body().getData()){
                    Log.d(TAG,p.toString());
                }
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });
    }
}