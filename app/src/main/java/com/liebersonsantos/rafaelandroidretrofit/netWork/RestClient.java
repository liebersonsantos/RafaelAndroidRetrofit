package com.liebersonsantos.rafaelandroidretrofit.netWork;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.liebersonsantos.rafaelandroidretrofit.constantes.Constantes;

import java.util.concurrent.TimeUnit;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    private static Retrofit retrofit;

    public static Api getInstance() {

            OkHttpClient httpClient = new OkHttpClient.Builder()
                    .addNetworkInterceptor(new StethoInterceptor()) //vejo o que mando e recebo
                    .readTimeout(60, TimeUnit.SECONDS)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .addInterceptor(chain -> {
                        Request request = chain.request();

                        Request.Builder builder = request.newBuilder()
                                .addHeader("intCodigoEmpresa", String.valueOf(1))
                                .addHeader("Content-Type", "application/json");

                        return chain.proceed(builder.build());
                    })
                    .build();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(Constantes.URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(httpClient)
                    .build();

        return retrofit.create(Api.class);
    }

}
