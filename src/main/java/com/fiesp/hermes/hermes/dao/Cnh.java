package com.fiesp.hermes.hermes.dao;

public class Cnh {

    String _id;
    String cpf;
    String docIdentidade;
    String orgEmissor;
    String uf;
    String filiacaoPai;
    String filiacaoMae;
    String categoria;
    String validade;
    String numRegistro;
    String token;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDocIdentidade() {
        return docIdentidade;
    }

    public void setDocIdentidade(String docIdentidade) {
        this.docIdentidade = docIdentidade;
    }

    public String getOrgEmissor() {
        return orgEmissor;
    }

    public void setOrgEmissor(String orgEmissor) {
        this.orgEmissor = orgEmissor;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "cnh: \n" +
                "{" +
                "cpf='" + cpf + '\'' +
                ", docIdentidade='" + docIdentidade + '\'' +
                ", orgEmissor='" + orgEmissor + '\'' +
                ", uf='" + uf + '\'' +
                ", filiacaoPai='" + filiacaoPai + '\'' +
                ", filiacaoMae='" + filiacaoMae + '\'' +
                ", categoria='" + categoria + '\'' +
                ", validade='" + validade + '\'' +
                ", numRegistro='" + numRegistro + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
