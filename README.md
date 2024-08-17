# spring-cloud-retry
Exemplo de serviço consumindo tópico Kafka através do spring cloud com retry e dlt configurado

## Execução local

Para executar a aplicação basta subir localmente o kafka através do docker-compose:

```bash
docker-compose up --build
```

Após subir os containers basta executar o método `main` da classe [RetryApplication](/src/main/java/com/marcos/retry/RetryApplication.java).


Para simular mensagens basta acessar o `kafka-ui` no endereço [localhost:8090](http://localhost:8090/)