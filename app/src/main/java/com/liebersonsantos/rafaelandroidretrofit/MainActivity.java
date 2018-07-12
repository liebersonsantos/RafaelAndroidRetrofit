package com.liebersonsantos.rafaelandroidretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.liebersonsantos.rafaelandroidretrofit.model.ParametroBody;
import com.liebersonsantos.rafaelandroidretrofit.model.VendasR;
import com.liebersonsantos.rafaelandroidretrofit.model.VendasResponse;
import com.liebersonsantos.rafaelandroidretrofit.netWork.RestClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "RESULTADO_RETROFIT";
    private ParametroBody parametroBody;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parametroBody = new ParametroBody();

        parametroBody.setDataEmissao("2018-07-10");
        parametroBody.setVendaTipo(1);

        RestClient.getInstance().listarResumoVendas(parametroBody).enqueue(new Callback<List<VendasResponse>>() {
            @Override
            public void onResponse(Call<List<VendasResponse>> call, Response<List<VendasResponse>> response) {

//                if (response.body() != null){
                if (response.isSuccessful()){

                    VendasR vendasR = new VendasR();
                    

                    Log.i(TAG, "onResponse:raw " + response.raw());
                    Log.i(TAG, "onResponse:code " + response.code());
                    Log.i(TAG, "onResponse:headers " + response.headers());
                    Log.i(TAG, "onResponse:message " + response.message());
                    Log.i(TAG, "onResponse:body " + response.body());
                    Log.i(TAG, "onResponse:bodyC " + response.body());

                }else {
                    Log.i(TAG, "onResponseERRO: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<List<VendasResponse>> call, Throwable t) {

                Log.i(TAG, "onFailure: ERRROOOOO" + t.getMessage());
            }
        });





    }
}
