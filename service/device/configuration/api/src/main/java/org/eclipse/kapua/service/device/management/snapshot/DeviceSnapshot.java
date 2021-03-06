/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.kapua.service.device.management.snapshot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "snapshot")
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder = { "id", 
                      "timestamp" },
        factoryClass = DeviceSnapshotXmlRegistry.class, 
        factoryMethod = "newDeviceSnapshot")
public interface DeviceSnapshot {
    
    @XmlElement(name = "id")
    public String getId();
    
    public void setId(String id);

    @XmlElement(name = "timestamp")
    public Long getTimestamp();
    
    public void setTimestamp(Long timestamp);
}
