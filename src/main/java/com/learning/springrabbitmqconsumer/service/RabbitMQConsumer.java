package com.learning.springrabbitmqconsumer.service;

import com.learning.springrabbitmqconsumer.bean.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "${employee.rabbitmq.queue}")
    public void recievedMessage(Employee employee) throws InterruptedException {
        System.out.println("Recieved Message From RabbitMQ: " + employee);
    }
}
