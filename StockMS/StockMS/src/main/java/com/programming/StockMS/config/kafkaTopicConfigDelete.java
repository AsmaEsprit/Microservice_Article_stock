package com.programming.StockMS.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class kafkaTopicConfigDelete {

    private String topicnameDelete="TopicDeleStock";
    @Bean
    public NewTopic topicDelte(){
        return TopicBuilder.name(topicnameDelete).build();
    }
}