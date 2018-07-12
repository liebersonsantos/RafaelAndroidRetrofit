package com.liebersonsantos.rafaelandroidretrofit.model;

public class ParametroBody {

    private int vendaTipo;
    private String dataEmissao;

    public ParametroBody() {
    }

    public ParametroBody(int vendaTipo, String dataEmissao) {
        this.vendaTipo = vendaTipo;
        this.dataEmissao = dataEmissao;
    }

    public int getVendaTipo() {
        return vendaTipo;
    }

    public void setVendaTipo(int vendaTipo) {
        this.vendaTipo = vendaTipo;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
}
