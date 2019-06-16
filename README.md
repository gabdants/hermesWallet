# Architecture Scheme

![alt text](https://raw.githubusercontent.com/gabdants/hermesWallet/master/diagram_2.png)

# Endpoints

## Authentication

URL: https://hermes-wallet.herokuapp.com/auth?cpf=xxx&pass=xxx

### Request

Params: Cpf and Password
Header: app-token

### Response

Example:

```
{
    "message": "SUCCEEDED",
    "token": "1560678354763"
}
```

## Documents

URL: https://hermes-wallet.herokuapp.com/wallet?dc=rg,cnh,titulo

### Request

Params: Documents that the service will need
Header: citizen-token(Authentication API)

### Response

Example:

```
[
    {
        "cpf": "46209635857",
        "registroGeral": "524890560",
        "filiacaoPai": "JOAO RODRIGUES DANTAS",
        "filiacaoMae": "FATIMA SIOMARA MARCHINI DANTAS",
        "naturalidade": "ATIBAIA-SP",
        "dtNasc": "16/07/1998",
        "dtExped": "12/12/2012",
        "token": "1560681348094",
        "type": "rg",
        "_id": "1"
    },
    {
        "_id": "1",
        "cpf": "46209635857",
        "docIdentidade": "524890560",
        "orgEmissor": "SSP",
        "uf": "SP",
        "filiacaoPai": "JOAO RODRIGUES DANTAS",
        "filiacaoMae": "FATIMA SIOMARA MARCHINI DANTAS",
        "categoria": "B",
        "validade": "01/08/2021",
        "numRegistro": "123456789",
        "token": "1560681348094",
        "type": "cnh"
    },
    {
        "cpf": "46209635857",
        "nomeEleitor": "GABRIEL MARCHINI DANTAS",
        "dtNasc": "16/07/1998",
        "numInscricao": "1234567890",
        "dv": "1",
        "zona": "18",
        "sessao": "67",
        "municipio": "MAIRIPORA",
        "uf": "SP",
        "dtEmissao": "01/08/2017",
        "token": "1560681348094",
        "type": "titulo",
        "_id": "1"
    }
]
```
