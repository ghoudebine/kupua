/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.management.channel;

import javax.xml.bind.annotation.XmlRegistry;

import org.eclipse.kapua.locator.KapuaLocator;
import org.eclipse.kapua.service.device.management.channel.DeviceChannel;
import org.eclipse.kapua.service.device.management.channel.DeviceChannelFactory;
import org.eclipse.kapua.service.device.management.channel.DeviceChannels;

/**
 * Device asset xml factory class
 *
 * @since 1.0
 *
 */
@XmlRegistry
public class DeviceChannelXmlRegistry {

    private final KapuaLocator locator = KapuaLocator.getInstance();

    private final DeviceChannelFactory factory = locator.getFactory(DeviceChannelFactory.class);
    
    /**
     * Creates a new device channel list
     *
     * @return
     */
    public DeviceChannels newChannelListResult() {
        return  factory.newChannelListResult();
    } 
    
    /**
     * Creates a new device channel
     *
     * @return
     */
    public <T> DeviceChannel<T> newDeviceChannel() {
        return  factory.newDeviceChannel();
    }
}
