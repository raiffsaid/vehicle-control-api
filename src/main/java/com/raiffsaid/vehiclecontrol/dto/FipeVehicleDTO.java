package com.raiffsaid.vehiclecontrol.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FipeVehicleDTO {

    @JsonProperty(value = "Valor")
    private String Valor;
    @JsonProperty(value = "Marca")
    private String Marca;
    @JsonProperty(value = "Modelo")
    private String Modelo;
    @JsonProperty(value = "AnoModelo")
    private Integer AnoModelo;
    @JsonProperty(value = "Combustivel")
    private String Combustivel;
    @JsonProperty(value = "CodigoFipe")
    private String CodigoFipe;
    @JsonProperty(value = "MesReferencia")
    private String MesReferencia;
    @JsonProperty(value = "TipoVeiculo")
    private Integer TipoVeiculo;
    @JsonProperty(value = "SiglaCombustivel")
    private String SiglaCombustivel;

    public FipeVehicleDTO() {
    }

    public FipeVehicleDTO(String valor, String marca, String modelo, Integer anoModelo, String combustivel, String codigoFipe, String mesReferencia, Integer tipoVeiculo, String siglaCombustivel) {
        Valor = valor;
        Marca = marca;
        Modelo = modelo;
        AnoModelo = anoModelo;
        Combustivel = combustivel;
        CodigoFipe = codigoFipe;
        MesReferencia = mesReferencia;
        TipoVeiculo = tipoVeiculo;
        SiglaCombustivel = siglaCombustivel;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public Integer getAnoModelo() {
        return AnoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        AnoModelo = anoModelo;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String combustivel) {
        Combustivel = combustivel;
    }

    public String getCodigoFipe() {
        return CodigoFipe;
    }

    public void setCodigoFipe(String codigoFipe) {
        CodigoFipe = codigoFipe;
    }

    public String getMesReferencia() {
        return MesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        MesReferencia = mesReferencia;
    }

    public Integer getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(Integer tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }

    public String getSiglaCombustivel() {
        return SiglaCombustivel;
    }

    public void setSiglaCombustivel(String siglaCombustivel) {
        SiglaCombustivel = siglaCombustivel;
    }
}
