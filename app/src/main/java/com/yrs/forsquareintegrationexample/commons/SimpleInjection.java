package com.yrs.forsquareintegrationexample.commons;

import com.yrs.forsquareintegrationexample.BuildConfig;
import com.yrs.forsquareintegrationexample.networking.connectors.ForsquareConnector;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yaros on 26/02/16.
 */
public class SimpleInjection {
    private HttpLoggingInterceptor httpLoggingInterceptor;
    private HttpLoggingInterceptor getHttpLoggingInterceptor(){
        if(httpLoggingInterceptor == null) {
            httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        }
        return httpLoggingInterceptor;
    }


    private OkHttpClient okHttpClient;
    private OkHttpClient getOkHttpClient() {
        if(okHttpClient == null) {
            okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(getHttpLoggingInterceptor())
                    .build();

//            okHttpClient.interceptors().add(new Interceptor() {
//                @Override
//                public Response intercept(Chain chain) throws IOException {
//                    Response response = chain.proceed(chain.request());
//                    return response;
//                }
//            });
        }

        return okHttpClient;
    }


    //@Singleton
    private Retrofit retrofit;
    public Retrofit getRetrofit() {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.FORSQUARE_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getOkHttpClient())
                    .build();
        }
        return retrofit;
    }

    //@Singleton
    private ForsquareConnector forsquareConnector;
    public ForsquareConnector getForsquareConnector() {


        if(forsquareConnector == null) {
            forsquareConnector = getRetrofit().create(ForsquareConnector.class);
        }

        return forsquareConnector;
    }
}

