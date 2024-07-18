package com.programming.StockMS.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class KafkaTopicConfigUpdate {
    private String topicnameUpdate="TopicUpdateStock";
    @Bean
    public NewTopic topicUpdate(){
        return TopicBuilder.name(topicnameUpdate).build();
    }
}