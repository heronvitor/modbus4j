package com.serotonin.modbus4j.messaging;

public class DefaultMessagingExceptionHandler implements MessagingExceptionHandler {
    public void receivedException(Exception e) {
        e.printStackTrace();
    }
}
