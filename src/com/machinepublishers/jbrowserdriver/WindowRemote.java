/* 
 * jBrowserDriver (TM)
 * Copyright (C) 2014-2016 jBrowserDriver committers
 * https://github.com/MachinePublishers/jBrowserDriver
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.machinepublishers.jbrowserdriver;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface WindowRemote extends Remote {
  void close() throws RemoteException;

  Point remoteGetPosition() throws RemoteException;

  Dimension remoteGetSize() throws RemoteException;

  void maximize() throws RemoteException;

  void fullscreen() throws RemoteException;

  void remoteSetPosition(final Point point) throws RemoteException;

  void remoteSetSize(final Dimension dimension) throws RemoteException;
}
