/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.quickstarts.bpm.service;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.quickstarts.bpm.service.ShippingBean;
import org.switchyard.quickstarts.bpm.service.data.Order;
import org.switchyard.quickstarts.bpm.service.data.OrderAck;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(mixins = CDIMixIn.class)
public class ShippingTest {

    @ServiceOperation("Shipping.ship")
    private Invoker service;

    @Test
    public void testShip() {
        Order order = new Order();
        order.setOrderId("SHIPIT");
        OrderAck ack = service.sendInOut(order).getContent(OrderAck.class);

        Assert.assertTrue(ack.isAccepted());
        Assert.assertEquals(ShippingBean.SHIPPED_STATUS, ack.getStatus());
    }
}