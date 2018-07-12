package com.liebersonsantos.rafaelandroidretrofit.netWork;

import com.liebersonsantos.rafaelandroidretrofit.model.ParametroBody;
import com.liebersonsantos.rafaelandroidretrofit.model.VendasR;
import com.liebersonsantos.rafaelandroidretrofit.model.VendasResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {

//    @Headers({
//            "intCodigoVendaTipo: 1",
//            "dtEmissao: 2018-07-10"
//    })
    @POST("listarResumoVendaAgrupado")
    Call<List<VendasR>> listarResumoVendas(@Body ParametroBody parametroBody);
}
