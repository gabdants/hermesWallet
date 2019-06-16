package com.fiesp.hermes.hermes.dao;

import java.security.SecureRandom;

public class Rg {
    String cpf;
    String registroGeral;
    String filiacaoPai;
    String filiacaoMae;
    String naturalidade;
    String dtNasc;
    String dtExped;
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

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getFiliacaoPai() {
        return filiacaoPai;
    }

    public void setFiliacaoPai(String filiacaoPai) {
        this.filiacaoPai = filiacaoPai;
    }

    public String getFiliacaoMae() {
        return filiacaoMae;
    }

    public void setFiliacaoMae(String filiacaoMae) {
        this.filiacaoMae = filiacaoMae;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getDtExped() {
        return dtExped;
    }

    public void setDtExped(String dtExped) {
        this.dtExped = dtExped;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "rg: \n" +
                "{" +
                "cpf='" + cpf + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", filiacaoPai='" + filiacaoPai + '\'' +
                ", filiacaoMae='" + filiacaoMae + '\'' +
                ", naturalidade='" + naturalidade + '\'' +
                ", dtNasc='" + dtNasc + '\'' +
                ", dtExped='" + dtExped + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
