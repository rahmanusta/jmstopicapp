/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.jmsfirstapp.topic;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.jms.JMSDestinationDefinition;

/**
 *
 * @author usta
 */
@Singleton
@Startup
@JMSDestinationDefinition(name = "jms/myTopic",
//@JMSDestinationDefinition(name = "java:jboss/jms/topic/myTopic",
destinationName="myTopic",
description="myTopic", interfaceName = "javax.jms.Topic")
public class ServiceStarter {
    
}
