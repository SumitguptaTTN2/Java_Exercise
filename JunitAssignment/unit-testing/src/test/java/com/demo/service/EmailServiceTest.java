package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @Test(expected = RuntimeException.class)
    public void testSendEmail_withOneArguments() {
        EmailService emailServiceMock = mock(EmailService.class);
        doThrow(new RuntimeException("An Exception Occurred")).when(emailServiceMock).sendEmail(any(Order.class));
        emailServiceMock.sendEmail(new Order());
    }

    @Test
    public void testSendEmail_withTwoArguments() {
        EmailService emailServiceMock = mock(EmailService.class);
        when(emailServiceMock.sendEmail(any(Order.class), anyString())).thenReturn(true);
        assertTrue(emailServiceMock.sendEmail(new Order(), "Order Placed"));
    }
}