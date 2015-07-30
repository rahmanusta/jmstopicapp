/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.jmsfirstapp.topic;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Topic;

/**
 *
 * @author usta
 */
@Named("subcriber")
@RequestScoped
public class SubcriberBean {

    @Resource(mappedName = "jms/myTopic")
//    @Resource(mappedName = "java:jboss/jms/topic/myTopic")
    private Topic topic;

    @Inject
//    @JMSConnectionFactory("java:jboss/DefaultJMSConnectionFactory")
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;

    private String message;

    public void subcribe() {
        JMSConsumer consumer = context.createConsumer(topic);
        message = consumer.receiveBody(String.class);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
