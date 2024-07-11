
![estrutura.png](src%2Fmain%2Fresources%2Fimg%2Festrutura.png)

Exemplo da mensagem que deve ser consumida:

```
   {
       "codigoPedido": 1001,
       "codigoCliente":1,
       "itens": [
           {
               "produto": "lápis",
               "quantidade": 100,
               "preco": 1.10
           },
           {
               "produto": "caderno",
               "quantidade": 10,
               "preco": 1.00
           }
       ]
   }
```

End-point para listar os pedidos realizados por um cliente:
End-point para calcular o valor total de todos os pedidos de um cliente:

```curl --location 'localhost:8080/customers/1/orders'```

![result.png](src%2Fmain%2Fresources%2Fimg%2Fresult.png)