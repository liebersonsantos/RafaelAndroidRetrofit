package com.liebersonsantos.rafaelandroidretrofit.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VendasR implements Parcelable{

    @SerializedName("vendaTipo")
    private VendaTipo vendaTipo;
    @SerializedName("clienteVenda")
    private ClienteVenda clienteVenda;
    @SerializedName("statusVenda")
    private StatusVenda statusVenda;
    @SerializedName("lVendaItem")
    private List<LVendaItem> vendaItems;
    @SerializedName("dtEmissaoVenda")
    private String dtEmissaoVenda;
    @SerializedName("intQntVenda")
    private int intQuantidadeVenda;
    @SerializedName("intNumeroPedido")
    private int intNumeroPedido;
    @SerializedName("dcValorTotal")
    private int dcValorTotal;
    @SerializedName("dcValorDiario")
    private String dcValorDiario;
    @SerializedName("dcValorMensal")
    private String dcValorMensal;
    @SerializedName("dcRepresentatividade")
    private String dcRepresentatividade;

    public VendasR() {
    }

    public VendasR(VendaTipo vendaTipo, ClienteVenda clienteVenda, StatusVenda statusVenda, List<LVendaItem> vendaItems, String dtEmissaoVenda, int intQuantidadeVenda, int intNumeroPedido, int dcValorTotal, String dcValorDiario, String dcValorMensal, String dcRepresentatividade) {
        this.vendaTipo = vendaTipo;
        this.clienteVenda = clienteVenda;
        this.statusVenda = statusVenda;
        this.vendaItems = vendaItems;
        this.dtEmissaoVenda = dtEmissaoVenda;
        this.intQuantidadeVenda = intQuantidadeVenda;
        this.intNumeroPedido = intNumeroPedido;
        this.dcValorTotal = dcValorTotal;
        this.dcValorDiario = dcValorDiario;
        this.dcValorMensal = dcValorMensal;
        this.dcRepresentatividade = dcRepresentatividade;
    }

    protected VendasR(Parcel in) {
        vendaTipo = in.readParcelable(VendaTipo.class.getClassLoader());
        clienteVenda = in.readParcelable(ClienteVenda.class.getClassLoader());
        statusVenda = in.readParcelable(StatusVenda.class.getClassLoader());
        vendaItems = in.createTypedArrayList(LVendaItem.CREATOR);
        dtEmissaoVenda = in.readString();
        intQuantidadeVenda = in.readInt();
        intNumeroPedido = in.readInt();
        dcValorTotal = in.readInt();
        dcValorDiario = in.readString();
        dcValorMensal = in.readString();
        dcRepresentatividade = in.readString();
    }

    public static final Creator<VendasR> CREATOR = new Creator<VendasR>() {
        @Override
        public VendasR createFromParcel(Parcel in) {
            return new VendasR(in);
        }

        @Override
        public VendasR[] newArray(int size) {
            return new VendasR[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(vendaTipo, flags);
        dest.writeParcelable(clienteVenda, flags);
        dest.writeParcelable(statusVenda, flags);
        dest.writeTypedList(vendaItems);
        dest.writeString(dtEmissaoVenda);
        dest.writeInt(intQuantidadeVenda);
        dest.writeInt(intNumeroPedido);
        dest.writeInt(dcValorTotal);
        dest.writeString(dcValorDiario);
        dest.writeString(dcValorMensal);
        dest.writeString(dcRepresentatividade);
    }

    public VendaTipo getVendaTipo() {
        return vendaTipo;
    }

    public void setVendaTipo(VendaTipo vendaTipo) {
        this.vendaTipo = vendaTipo;
    }

    public ClienteVenda getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(ClienteVenda clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public StatusVenda getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(StatusVenda statusVenda) {
        this.statusVenda = statusVenda;
    }

    public List<LVendaItem> getVendaItems() {
        return vendaItems;
    }

    public void setVendaItems(List<LVendaItem> vendaItems) {
        this.vendaItems = vendaItems;
    }

    public String getDtEmissaoVenda() {
        return dtEmissaoVenda;
    }

    public void setDtEmissaoVenda(String dtEmissaoVenda) {
        this.dtEmissaoVenda = dtEmissaoVenda;
    }

    public int getIntQuantidadeVenda() {
        return intQuantidadeVenda;
    }

    public void setIntQuantidadeVenda(int intQuantidadeVenda) {
        this.intQuantidadeVenda = intQuantidadeVenda;
    }

    public int getIntNumeroPedido() {
        return intNumeroPedido;
    }

    public void setIntNumeroPedido(int intNumeroPedido) {
        this.intNumeroPedido = intNumeroPedido;
    }

    public int getDcValorTotal() {
        return dcValorTotal;
    }

    public void setDcValorTotal(int dcValorTotal) {
        this.dcValorTotal = dcValorTotal;
    }

    public String getDcValorDiario() {
        return dcValorDiario;
    }

    public void setDcValorDiario(String dcValorDiario) {
        this.dcValorDiario = dcValorDiario;
    }

    public String getDcValorMensal() {
        return dcValorMensal;
    }

    public void setDcValorMensal(String dcValorMensal) {
        this.dcValorMensal = dcValorMensal;
    }

    public String getDcRepresentatividade() {
        return dcRepresentatividade;
    }

    public void setDcRepresentatividade(String dcRepresentatividade) {
        this.dcRepresentatividade = dcRepresentatividade;
    }
}
