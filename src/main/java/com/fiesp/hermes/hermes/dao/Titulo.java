package com.fiesp.hermes.hermes.dao;

public class Titulo {

    String cpf;
    String nomeEleitor;
    String dtNasc;
    String numInscricao;
    String dv;
    String zona;
    String sessao;
    String municipio;
    String uf;
    String dtEmissao;
    String token;
    String type;
    String _id;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeEleitor() {
        return nomeEleitor;
    }

    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getNumInscricao() {
        return numInscricao;
    }

    public void setNumInscricao(String numInscricao) {
        this.numInscricao = numInscricao;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(String dtEmissao) {
        this.dtEmissao = dtEmissao;
    }



    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "titulo: \n" +
                "{" +
                "cpf='" + cpf + '\'' +
                ", nomeEleitor='" + nomeEleitor + '\'' +
                ", dtNasc='" + dtNasc + '\'' +
                ", numInscricao='" + numInscricao + '\'' +
                ", dv='" + dv + '\'' +
                ", zona='" + zona + '\'' +
                ", sessao='" + sessao + '\'' +
                ", municipio='" + municipio + '\'' +
                ", uf='" + uf + '\'' +
                ", dtEmissao='" + dtEmissao + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
