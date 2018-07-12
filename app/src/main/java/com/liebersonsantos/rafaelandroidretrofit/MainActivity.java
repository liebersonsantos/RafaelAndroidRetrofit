package com.liebersonsantos.rafaelandroidretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;

import com.liebersonsantos.rafaelandroidretrofit.adapter.AdapterVendas;
import com.liebersonsantos.rafaelandroidretrofit.model.ParametroBody;
import com.liebersonsantos.rafaelandroidretrofit.model.VendasR;
import com.liebersonsantos.rafaelandroidretrofit.netWork.RestClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "RESULTADO_RETROFIT";
    private ParametroBody parametroBody;
    private VendasR vendasR;
    private AdapterVendas adapterVendas;

    @BindView(R.id.recyclerView_id)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        parametroBody = new ParametroBody();
        parametroBody.setDataEmissao("2018-07-10");
        parametroBody.setVendaTipo(1);

        settingsAdapter();


    }

    @OnClick(R.id.btnApi)
    void clickApi(){

        callingAPI();
    }

    private void settingsAdapter() {
        adapterVendas = new AdapterVendas();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapterVendas);
    }

    private void callingAPI() {
        RestClient.getInstance().listarResumoVendas(parametroBody).enqueue(new Callback<List<VendasR>>() {
            @Override
            public void onResponse(Call<List<VendasR>> call, Response<List<VendasR>> response) {

//                if (response.body() != null){
                if (response.isSuccessful()){

                    Log.i(TAG, "onResponse:raw " + response.raw());
                    Log.i(TAG, "onResponse:code " + response.code());
                    Log.i(TAG, "onResponse:headers " + response.headers());
                    Log.i(TAG, "onResponse:message " + response.message());
                    Log.i(TAG, "onResponse:body " + response.body());
                    Log.i(TAG, "onResponse:Size " + response.body());

                    adapterVendas.setVendasRList(response.body());


                }else {
                    Log.i(TAG, "onResponseERRO: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<List<VendasR>> call, Throwable t) {

                Log.i(TAG, "onFailure: ERRROOOOO" + t.getMessage());
            }
        });
    }
}
