// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidadinternal.taglib;

import javax.faces.el.MethodBinding;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.component.UIXCommand;
import org.apache.myfaces.trinidad.webapp.UIXComponentTag;

/**
 * Auto-generated tag class.
 */
abstract public class UIXCommandTag extends UIXComponentTag
{

  /**
   * Construct an instance of the UIXCommandTag.
   */
  public UIXCommandTag()
  {
  }

  private String _action;
  final public void setAction(String action)
  {
    _action = action;
  }

  private String _actionListener;
  final public void setActionListener(String actionListener)
  {
    _actionListener = actionListener;
  }

  private String _returnListener;
  final public void setReturnListener(String returnListener)
  {
    _returnListener = returnListener;
  }

  private String _launchListener;
  final public void setLaunchListener(String launchListener)
  {
    _launchListener = launchListener;
  }

  private String _immediate;
  final public void setImmediate(String immediate)
  {
    _immediate = immediate;
  }

  @Override
  protected void setProperties(
    FacesBean bean)
  {
    super.setProperties(bean);
    if (_actionListener != null)
    {
      MethodBinding mb = createMethodBinding(_actionListener, new Class[]{javax.faces.event.ActionEvent.class,});
      bean.setProperty(UIXCommand.ACTION_LISTENER_KEY, mb);
    }
    setBooleanProperty(bean, UIXCommand.IMMEDIATE_KEY, _immediate);
    if (_action != null)
    {
      MethodBinding mb;
      if (isValueReference(_action))
        mb = createMethodBinding(_action, new Class[0]);
      else
        mb = new org.apache.myfaces.trinidadinternal.taglib.ConstantMethodBinding(_action);
      bean.setProperty(UIXCommand.ACTION_KEY, mb);
    }
    if (_returnListener != null)
    {
      MethodBinding mb = createMethodBinding(_returnListener, new Class[]{org.apache.myfaces.trinidad.event.ReturnEvent.class,});
      bean.setProperty(UIXCommand.RETURN_LISTENER_KEY, mb);
    }
    if (_launchListener != null)
    {
      MethodBinding mb = createMethodBinding(_launchListener, new Class[]{org.apache.myfaces.trinidad.event.LaunchEvent.class,});
      bean.setProperty(UIXCommand.LAUNCH_LISTENER_KEY, mb);
    }
  }

  @Override
  public void release()
  {
    super.release();
    _actionListener = null;
    _immediate = null;
    _action = null;
    _returnListener = null;
    _launchListener = null;
  }
}
