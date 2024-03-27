    package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Jedis jedis = new Jedis("redis://default:MgCcUeFbO79gAtqx9xw1R43vC3r8xRbK@redis-18116.c308.sa-east-1-1.ec2.cloud.redislabs.com:18116");
        
        jedis.hset("tarefa", "1", "Fazer Comida");
        jedis.hset("tarefa", "2", "Arrumar a cama");
        jedis.hset("tarefa", "3", "Lavar a louça");

        System.out.println("Tarefas adicionadas.");

        System.out.println("\nLista de Tarefas:");
        System.out.println();
        jedis.hgetAll("tarefa").forEach((id, value) -> System.out.println(id + ": " + value));

        jedis.hset("tarefas_concluidas", "2", jedis.hget("tarefa", "2"));
        jedis.hdel("tarefa", "2");
        System.out.println("\nTarefa 2 concluída.");

        jedis.hdel("tarefa", "3");
        System.out.println("\nTarefa 3 removida.");

        jedis.close();
    }
}