/*
 * Copyright (c) 2015 Fraunhofer FOKUS
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openbaton.catalogue.mano.common.faultmanagement;

import org.openbaton.catalogue.mano.common.monitoring.AbstractVirtualizedResourceAlarm;
import org.openbaton.catalogue.mano.common.monitoring.Alarm;
import org.openbaton.catalogue.mano.common.monitoring.VRAlarm;

/**
 * Created by mob on 27.10.15.
 */
public class VirtualizedResourceAlarmNotification extends AbstractVirtualizedResourceAlarm {
  private VRAlarm vrAlarm;

  public VirtualizedResourceAlarmNotification() {}

  public VirtualizedResourceAlarmNotification(String triggerId, VRAlarm vrAlarm) {
    super(triggerId);
    this.vrAlarm = vrAlarm;
  }

  public Alarm getAlarm() {
    return vrAlarm;
  }

  public void setAlarm(VRAlarm vrAlarm) {
    this.vrAlarm = vrAlarm;
  }

  @Override
  public String toString() {
    return "VirtualizedResourceAlarmNotification{" + "vrAlarm=" + vrAlarm + "} " + super.toString();
  }
}
