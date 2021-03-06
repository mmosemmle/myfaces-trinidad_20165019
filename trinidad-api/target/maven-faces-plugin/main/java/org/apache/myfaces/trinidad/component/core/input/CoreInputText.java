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
package org.apache.myfaces.trinidad.component.core.input;

import javax.faces.component.UIComponent;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXInput;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html><p>
 *             The inputText component creates a browser input text widget.
 *             Depending on the value of &quot;rows&quot;, this component either maps to
 *             a single-row text field or a multi-row text area.
 *             If the input should be hidden from the user while displayed,
 *             such as for passwords, the secret property should be set to
 *             &quot;true&quot;.  It also supports displaying a label, text, and messages.
 *           </p></html>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>javax.faces.event.ValueChangeEvent</code></td>
 * <td valign="top" nowrap>Process Validations<br>Apply Request Values</td>
 * <td valign="top">The valueChange event is delivered when the value
                       attribute is changed.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CoreInputText extends UIXInput
{
  static public final String WRAP_SOFT = "soft";
  static public final String WRAP_HARD = "hard";
  static public final String WRAP_OFF = "off";
  static public final String STYLE_CLASS_AFFIELD_TEXT_MARKER = "AFFieldTextMarker";
  static public final String STYLE_CLASS_AFFIELD_TEXT_LTRMARKER = "AFFieldTextLTRMarker";
  static public final String STYLE_CLASS_AFPHONE_FIELD_TEXT_MARKER = "AFPhoneFieldTextMarker";
  static public final String STYLE_CLASS_AFPOSTAL_CODE_FIELD_TEXT_MARKER = "AFPostalCodeFieldTextMarker";
  static public final String STYLE_CLASS_AFADDRESS_FIELD_TEXT_MARKER = "AFAddressFieldTextMarker";
  static public final String STYLE_CLASS_AFFIELD_NUMBER_MARKER = "AFFieldNumberMarker";
  static public final String AUTO_COMPLETE_ON = "on";
  static public final String AUTO_COMPLETE_OFF = "off";
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXInput.TYPE);
  static public final PropertyKey CONTENT_STYLE_KEY =
    TYPE.registerKey("contentStyle", String.class);
  static public final PropertyKey ROWS_KEY =
    TYPE.registerKey("rows", Integer.class, Integer.valueOf(1));
  static public final PropertyKey WRAP_KEY =
    TYPE.registerKey("wrap", String.class);
  static public final PropertyKey SECRET_KEY =
    TYPE.registerKey("secret", Boolean.class, Boolean.FALSE);
  static public final PropertyKey READ_ONLY_KEY =
    TYPE.registerKey("readOnly", Boolean.class, Boolean.FALSE);
  static public final PropertyKey DISABLED_KEY =
    TYPE.registerKey("disabled", Boolean.class, Boolean.FALSE);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey LABEL_KEY =
    TYPE.registerKey("label", String.class);
  static public final PropertyKey SIMPLE_KEY =
    TYPE.registerKey("simple", Boolean.class, Boolean.FALSE);
  static public final PropertyKey ONCHANGE_KEY =
    TYPE.registerKey("onchange", String.class);
  static public final PropertyKey ONCLICK_KEY =
    TYPE.registerKey("onclick", String.class);
  static public final PropertyKey ONDBLCLICK_KEY =
    TYPE.registerKey("ondblclick", String.class);
  static public final PropertyKey ONMOUSEDOWN_KEY =
    TYPE.registerKey("onmousedown", String.class);
  static public final PropertyKey ONMOUSEUP_KEY =
    TYPE.registerKey("onmouseup", String.class);
  static public final PropertyKey ONMOUSEOVER_KEY =
    TYPE.registerKey("onmouseover", String.class);
  static public final PropertyKey ONMOUSEMOVE_KEY =
    TYPE.registerKey("onmousemove", String.class);
  static public final PropertyKey ONMOUSEOUT_KEY =
    TYPE.registerKey("onmouseout", String.class);
  static public final PropertyKey ONKEYPRESS_KEY =
    TYPE.registerKey("onkeypress", String.class);
  static public final PropertyKey ONKEYDOWN_KEY =
    TYPE.registerKey("onkeydown", String.class);
  static public final PropertyKey ONKEYUP_KEY =
    TYPE.registerKey("onkeyup", String.class);
  static public final PropertyKey ONBLUR_KEY =
    TYPE.registerKey("onblur", String.class);
  static public final PropertyKey ONFOCUS_KEY =
    TYPE.registerKey("onfocus", String.class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);
  static public final PropertyKey SHOW_REQUIRED_KEY =
    TYPE.registerKey("showRequired", Boolean.class, Boolean.FALSE);
  static public final PropertyKey COLUMNS_KEY =
    TYPE.registerKey("columns", Integer.class);
  static public final PropertyKey MAXIMUM_LENGTH_KEY =
    TYPE.registerKey("maximumLength", Integer.class);
  static public final PropertyKey AUTO_COMPLETE_KEY =
    TYPE.registerKey("autoComplete", String.class, "on");
  static public final PropertyKey ONSELECT_KEY =
    TYPE.registerKey("onselect", String.class);
  static public final PropertyKey ACCESS_KEY_KEY =
    TYPE.registerKey("accessKey", Character.class);
  static public final PropertyKey AUTO_SUBMIT_KEY =
    TYPE.registerKey("autoSubmit", Boolean.class, Boolean.FALSE);
  static public final String HELP_FACET = "help";

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Input";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreInputText";

  /**
   * Construct an instance of the CoreInputText.
   */
  public CoreInputText()
  {
    super("org.apache.myfaces.trinidad.Text");
  }

  /**
   * This facet should contain field level help.
   */
  final public UIComponent getHelp()
  {
    return getFacet(HELP_FACET);
  }

  /**
   * This facet should contain field level help.
   */
  @SuppressWarnings("unchecked")
  final public void setHelp(UIComponent helpFacet)
  {
    getFacets().put(HELP_FACET, helpFacet);
  }

  /**
   * Gets the CSS styles to attach to the content of the component.  For example, you can set the width of that portion to 100 pixels by setting this attribute to "width: 100px".
   *
   * @return  the new contentStyle value
   */
  final public String getContentStyle()
  {
    return ComponentUtils.resolveString(getProperty(CONTENT_STYLE_KEY));
  }

  /**
   * Sets the CSS styles to attach to the content of the component.  For example, you can set the width of that portion to 100 pixels by setting this attribute to "width: 100px".
   * 
   * @param contentStyle  the new contentStyle value
   */
  final public void setContentStyle(String contentStyle)
  {
    setProperty(CONTENT_STYLE_KEY, (contentStyle));
  }

  /**
   * Gets the number of rows to display in the text control.
   *               The default is one. Setting to more than one row
   *               precludes the use of some attributes, such as
   *               "secret".
   *
   * @return  the new rows value
   */
  final public int getRows()
  {
    return ComponentUtils.resolveInteger(getProperty(ROWS_KEY), 1);
  }

  /**
   * Sets the number of rows to display in the text control.
   *               The default is one. Setting to more than one row
   *               precludes the use of some attributes, such as
   *               "secret".
   * 
   * @param rows  the new rows value
   */
  final public void setRows(int rows)
  {
    setProperty(ROWS_KEY, Integer.valueOf(rows));
  }

  /**
   * Gets the type of text wrapping to be used in a multi-row
   *               text control. This attribute is ignored for single
   *               row inputText. By default (or "soft"), multirow text
   *         wraps visually, but does not include carriage returns in the
   *               submitted value.  Setting this to "off" will disable wrapping;
   *               the multirow text will scroll horizontally.  Setting it to "hard"
   *               specifies that the value of the text should include any
   *               carriage returns needed to wrap the lines.
   *
   * @return  the new wrap value
   */
  final public String getWrap()
  {
    return ComponentUtils.resolveString(getProperty(WRAP_KEY));
  }

  /**
   * Sets the type of text wrapping to be used in a multi-row
   *               text control. This attribute is ignored for single
   *               row inputText. By default (or "soft"), multirow text
   *         wraps visually, but does not include carriage returns in the
   *               submitted value.  Setting this to "off" will disable wrapping;
   *               the multirow text will scroll horizontally.  Setting it to "hard"
   *               specifies that the value of the text should include any
   *               carriage returns needed to wrap the lines.
   * 
   * @param wrap  the new wrap value
   */
  final public void setWrap(String wrap)
  {
    setProperty(WRAP_KEY, (wrap));
  }

  /**
   * Gets a boolean value that only applies to single line text
   *               controls. When set to "true", it hides the actual
   *               value of the text from the user, and will
   *               prevent the actual "value" from being shown to the user.
   *
   * @return  the new secret value
   */
  final public boolean isSecret()
  {
    return ComponentUtils.resolveBoolean(getProperty(SECRET_KEY), false);
  }

  /**
   * Sets a boolean value that only applies to single line text
   *               controls. When set to "true", it hides the actual
   *               value of the text from the user, and will
   *               prevent the actual "value" from being shown to the user.
   * 
   * @param secret  the new secret value
   */
  final public void setSecret(boolean secret)
  {
    setProperty(SECRET_KEY, secret ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether the element is read-only.
   *
   * @return  the new readOnly value
   */
  final public boolean isReadOnly()
  {
    return ComponentUtils.resolveBoolean(getProperty(READ_ONLY_KEY), false);
  }

  /**
   * Sets whether the element is read-only.
   * 
   * @param readOnly  the new readOnly value
   */
  final public void setReadOnly(boolean readOnly)
  {
    setProperty(READ_ONLY_KEY, readOnly ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets whether the element is disabled.
   *
   * @return  the new disabled value
   */
  final public boolean isDisabled()
  {
    return ComponentUtils.resolveBoolean(getProperty(DISABLED_KEY), false);
  }

  /**
   * Sets whether the element is disabled.
   * 
   * @param disabled  the new disabled value
   */
  final public void setDisabled(boolean disabled)
  {
    setProperty(DISABLED_KEY, disabled ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the short description of the bean.  This text
   *          is commonly used by user agents to display tooltip help text.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets the short description of the bean.  This text
   *          is commonly used by user agents to display tooltip help text.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
  }

  /**
   * Gets the IDs of the components that should trigger a partial update.
   *          This component will listen on the trigger components. If one of the
   *          trigger components receives an event that will cause it to update
   *          in some way, this component will request to be updated too.
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the IDs of the components that should trigger a partial update.
   *          This component will listen on the trigger components. If one of the
   *          trigger components receives an event that will cause it to update
   *          in some way, this component will request to be updated too.
   * 
   * @param partialTriggers  the new partialTriggers value
   */
  final public void setPartialTriggers(String[] partialTriggers)
  {
    setProperty(PARTIAL_TRIGGERS_KEY, (partialTriggers));
  }

  /**
   * Gets the label of the bean.
   *
   * @return  the new label value
   */
  final public String getLabel()
  {
    return ComponentUtils.resolveString(getProperty(LABEL_KEY));
  }

  /**
   * Sets the label of the bean.
   * 
   * @param label  the new label value
   */
  final public void setLabel(String label)
  {
    setProperty(LABEL_KEY, (label));
  }

  /**
   * Gets a boolean value that controls whether the component
   * provides label and message support;  when set to "true", the component will
   * not display messaging support or the label (these attributes may be ignored: label,
   * labelAndAccessKey, accessKey, showRequired,
   * tip), and may use simpler layout primitives
   *
   * @return  the new simple value
   */
  final public boolean isSimple()
  {
    return ComponentUtils.resolveBoolean(getProperty(SIMPLE_KEY), false);
  }

  /**
   * Sets a boolean value that controls whether the component
   * provides label and message support;  when set to "true", the component will
   * not display messaging support or the label (these attributes may be ignored: label,
   * labelAndAccessKey, accessKey, showRequired,
   * tip), and may use simpler layout primitives
   * 
   * @param simple  the new simple value
   */
  final public void setSimple(boolean simple)
  {
    setProperty(SIMPLE_KEY, simple ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets event handler for when the value is changed.
   *
   * @return  the new onchange value
   */
  final public String getOnchange()
  {
    return ComponentUtils.resolveString(getProperty(ONCHANGE_KEY));
  }

  /**
   * Sets event handler for when the value is changed.
   * 
   * @param onchange  the new onchange value
   */
  final public void setOnchange(String onchange)
  {
    setProperty(ONCHANGE_KEY, (onchange));
  }

  /**
   * Gets an onclick Javascript handler.
   *
   * @return  the new onclick value
   */
  final public String getOnclick()
  {
    return ComponentUtils.resolveString(getProperty(ONCLICK_KEY));
  }

  /**
   * Sets an onclick Javascript handler.
   * 
   * @param onclick  the new onclick value
   */
  final public void setOnclick(String onclick)
  {
    setProperty(ONCLICK_KEY, (onclick));
  }

  /**
   * Gets an ondblclick Javascript handler.
   *
   * @return  the new ondblclick value
   */
  final public String getOndblclick()
  {
    return ComponentUtils.resolveString(getProperty(ONDBLCLICK_KEY));
  }

  /**
   * Sets an ondblclick Javascript handler.
   * 
   * @param ondblclick  the new ondblclick value
   */
  final public void setOndblclick(String ondblclick)
  {
    setProperty(ONDBLCLICK_KEY, (ondblclick));
  }

  /**
   * Gets an onmousedown Javascript handler.
   *
   * @return  the new onmousedown value
   */
  final public String getOnmousedown()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEDOWN_KEY));
  }

  /**
   * Sets an onmousedown Javascript handler.
   * 
   * @param onmousedown  the new onmousedown value
   */
  final public void setOnmousedown(String onmousedown)
  {
    setProperty(ONMOUSEDOWN_KEY, (onmousedown));
  }

  /**
   * Gets an onmouseup Javascript handler.
   *
   * @return  the new onmouseup value
   */
  final public String getOnmouseup()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEUP_KEY));
  }

  /**
   * Sets an onmouseup Javascript handler.
   * 
   * @param onmouseup  the new onmouseup value
   */
  final public void setOnmouseup(String onmouseup)
  {
    setProperty(ONMOUSEUP_KEY, (onmouseup));
  }

  /**
   * Gets an onmouseover Javascript handler.
   *
   * @return  the new onmouseover value
   */
  final public String getOnmouseover()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOVER_KEY));
  }

  /**
   * Sets an onmouseover Javascript handler.
   * 
   * @param onmouseover  the new onmouseover value
   */
  final public void setOnmouseover(String onmouseover)
  {
    setProperty(ONMOUSEOVER_KEY, (onmouseover));
  }

  /**
   * Gets an onmousemove Javascript handler.
   *
   * @return  the new onmousemove value
   */
  final public String getOnmousemove()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEMOVE_KEY));
  }

  /**
   * Sets an onmousemove Javascript handler.
   * 
   * @param onmousemove  the new onmousemove value
   */
  final public void setOnmousemove(String onmousemove)
  {
    setProperty(ONMOUSEMOVE_KEY, (onmousemove));
  }

  /**
   * Gets an onmouseout Javascript handler.
   *
   * @return  the new onmouseout value
   */
  final public String getOnmouseout()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOUT_KEY));
  }

  /**
   * Sets an onmouseout Javascript handler.
   * 
   * @param onmouseout  the new onmouseout value
   */
  final public void setOnmouseout(String onmouseout)
  {
    setProperty(ONMOUSEOUT_KEY, (onmouseout));
  }

  /**
   * Gets an onkeypress Javascript handler.
   *
   * @return  the new onkeypress value
   */
  final public String getOnkeypress()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYPRESS_KEY));
  }

  /**
   * Sets an onkeypress Javascript handler.
   * 
   * @param onkeypress  the new onkeypress value
   */
  final public void setOnkeypress(String onkeypress)
  {
    setProperty(ONKEYPRESS_KEY, (onkeypress));
  }

  /**
   * Gets an onkeydown Javascript handler.
   *
   * @return  the new onkeydown value
   */
  final public String getOnkeydown()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYDOWN_KEY));
  }

  /**
   * Sets an onkeydown Javascript handler.
   * 
   * @param onkeydown  the new onkeydown value
   */
  final public void setOnkeydown(String onkeydown)
  {
    setProperty(ONKEYDOWN_KEY, (onkeydown));
  }

  /**
   * Gets an onkeyup Javascript handler.
   *
   * @return  the new onkeyup value
   */
  final public String getOnkeyup()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYUP_KEY));
  }

  /**
   * Sets an onkeyup Javascript handler.
   * 
   * @param onkeyup  the new onkeyup value
   */
  final public void setOnkeyup(String onkeyup)
  {
    setProperty(ONKEYUP_KEY, (onkeyup));
  }

  /**
   * Gets the event handler for the component losing the focus.
   *
   * @return  the new onblur value
   */
  final public String getOnblur()
  {
    return ComponentUtils.resolveString(getProperty(ONBLUR_KEY));
  }

  /**
   * Sets the event handler for the component losing the focus.
   * 
   * @param onblur  the new onblur value
   */
  final public void setOnblur(String onblur)
  {
    setProperty(ONBLUR_KEY, (onblur));
  }

  /**
   * Gets the event handler for the component gaining the focus.
   *
   * @return  the new onfocus value
   */
  final public String getOnfocus()
  {
    return ComponentUtils.resolveString(getProperty(ONFOCUS_KEY));
  }

  /**
   * Sets the event handler for the component gaining the focus.
   * 
   * @param onfocus  the new onfocus value
   */
  final public void setOnfocus(String onfocus)
  {
    setProperty(ONFOCUS_KEY, (onfocus));
  }

  /**
   * Gets <html>a CSS style class to use for this component.
   *       The styleClass attribute value is rendered on the root dom element.
   *       We provide some public style classes you can use that will affect only the 'content' piece of the component:
   *       AFFieldTextMarker, AFFieldTextLTRMarker, AFPhoneFieldTextMarker, AFPostalCodeFieldTextMarker,
   *       AFAddressFieldTextMarker, AFFieldNumberMarker.
   *       You can still modify the public style definitions for these marker style classes
   *       and it will be picked up by using these "Marker" style class
   *       because in our base skin implementation we map to the public style by doing this:
   *       af|inputText.AFFieldNumberMarker af|inputText::content {-tr-rule-ref:selector(".AFFieldNumber")}.
   *       We recommend that you do not add style properties to the "Marker" style classes.
   *       They are used solely in the css descendant selector to point to the content pseudo-element.</html>
   *
   * @return  the new styleClass value
   */
  final public String getStyleClass()
  {
    return ComponentUtils.resolveString(getProperty(STYLE_CLASS_KEY));
  }

  /**
   * Sets <html>a CSS style class to use for this component.
   *       The styleClass attribute value is rendered on the root dom element.
   *       We provide some public style classes you can use that will affect only the 'content' piece of the component:
   *       AFFieldTextMarker, AFFieldTextLTRMarker, AFPhoneFieldTextMarker, AFPostalCodeFieldTextMarker,
   *       AFAddressFieldTextMarker, AFFieldNumberMarker.
   *       You can still modify the public style definitions for these marker style classes
   *       and it will be picked up by using these "Marker" style class
   *       because in our base skin implementation we map to the public style by doing this:
   *       af|inputText.AFFieldNumberMarker af|inputText::content {-tr-rule-ref:selector(".AFFieldNumber")}.
   *       We recommend that you do not add style properties to the "Marker" style classes.
   *       They are used solely in the css descendant selector to point to the content pseudo-element.</html>
   * 
   * @param styleClass  the new styleClass value
   */
  final public void setStyleClass(String styleClass)
  {
    setProperty(STYLE_CLASS_KEY, (styleClass));
  }

  /**
   * Gets the inline CSS style for this element
   *
   * @return  the new inlineStyle value
   */
  final public String getInlineStyle()
  {
    return ComponentUtils.resolveString(getProperty(INLINE_STYLE_KEY));
  }

  /**
   * Sets the inline CSS style for this element
   * 
   * @param inlineStyle  the new inlineStyle value
   */
  final public void setInlineStyle(String inlineStyle)
  {
    setProperty(INLINE_STYLE_KEY, (inlineStyle));
  }

  /**
   * Gets whether the associated control displays a visual indication of required user input. If a "required" attribute is also present, both the "required" attribute and the
   *           "showRequired" attribute must be false for the visual indication not to be displayed.
   *
   * @return  the new showRequired value
   */
  final public boolean isShowRequired()
  {
    return ComponentUtils.resolveBoolean(getProperty(SHOW_REQUIRED_KEY), false);
  }

  /**
   * Sets whether the associated control displays a visual indication of required user input. If a "required" attribute is also present, both the "required" attribute and the
   *           "showRequired" attribute must be false for the visual indication not to be displayed.
   * 
   * @param showRequired  the new showRequired value
   */
  final public void setShowRequired(boolean showRequired)
  {
    setProperty(SHOW_REQUIRED_KEY, showRequired ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the number of columns to display in the text
   *           control. If no value is specified, a default
   *           of 30 columns is used. One column is approximately one character
   *           in the browser's current display font.
   *
   * @return  the new columns value
   */
  final public int getColumns()
  {
    return ComponentUtils.resolveInteger(getProperty(COLUMNS_KEY));
  }

  /**
   * Sets the number of columns to display in the text
   *           control. If no value is specified, a default
   *           of 30 columns is used. One column is approximately one character
   *           in the browser's current display font.
   * 
   * @param columns  the new columns value
   */
  final public void setColumns(int columns)
  {
    setProperty(COLUMNS_KEY, Integer.valueOf(columns));
  }

  /**
   * Gets the maximum number of characters that
   *           can be entered into the text control. Note that
   *           this value is independent of the "cols" displayed.
   *           If set to 0 or less, the maximumLength is ignored.
   *
   * @return  the new maximumLength value
   */
  final public int getMaximumLength()
  {
    return ComponentUtils.resolveInteger(getProperty(MAXIMUM_LENGTH_KEY));
  }

  /**
   * Sets the maximum number of characters that
   *           can be entered into the text control. Note that
   *           this value is independent of the "cols" displayed.
   *           If set to 0 or less, the maximumLength is ignored.
   * 
   * @param maximumLength  the new maximumLength value
   */
  final public void setMaximumLength(int maximumLength)
  {
    setProperty(MAXIMUM_LENGTH_KEY, Integer.valueOf(maximumLength));
  }

  /**
   * Gets whether previous values of text fields in the form
   *           should be remembered and offered for auto completion.
   *
   * @return  the new autoComplete value
   */
  final public String getAutoComplete()
  {
    return ComponentUtils.resolveString(getProperty(AUTO_COMPLETE_KEY), "on");
  }

  /**
   * Sets whether previous values of text fields in the form
   *           should be remembered and offered for auto completion.
   * 
   * @param autoComplete  the new autoComplete value
   */
  final public void setAutoComplete(String autoComplete)
  {
    setProperty(AUTO_COMPLETE_KEY, (autoComplete));
  }

  /**
   * Gets event handler for when text becomes selected.
   *
   * @return  the new onselect value
   */
  final public String getOnselect()
  {
    return ComponentUtils.resolveString(getProperty(ONSELECT_KEY));
  }

  /**
   * Sets event handler for when text becomes selected.
   * 
   * @param onselect  the new onselect value
   */
  final public void setOnselect(String onselect)
  {
    setProperty(ONSELECT_KEY, (onselect));
  }

  /**
   * Gets <html>
   *  Character used to gain quick access to
   *                the form element specified by the
   *          <code>for</code>, if set (or this component itself,
   *               if it is a "non-simple" form element).
   *               For accessibility reasons, this functionality is not supported
   *               in screen reader mode.
   *               If the same access key appears in multiple locations in the
   *               same page of output, the rendering user agent will cycle
   *               among the elements accessed by the similar keys.
   *               <p>
   *                 This attribute is sometimes referred to as the "mnemonic".
   *                 </p></html>
   *
   * @return  the new accessKey value
   */
  final public char getAccessKey()
  {
    return ComponentUtils.resolveCharacter((Character)getProperty(ACCESS_KEY_KEY));
  }

  /**
   * Sets <html>
   *  Character used to gain quick access to
   *                the form element specified by the
   *          <code>for</code>, if set (or this component itself,
   *               if it is a "non-simple" form element).
   *               For accessibility reasons, this functionality is not supported
   *               in screen reader mode.
   *               If the same access key appears in multiple locations in the
   *               same page of output, the rendering user agent will cycle
   *               among the elements accessed by the similar keys.
   *               <p>
   *                 This attribute is sometimes referred to as the "mnemonic".
   *                 </p></html>
   * 
   * @param accessKey  the new accessKey value
   */
  final public void setAccessKey(char accessKey)
  {
    setProperty(ACCESS_KEY_KEY, Character.valueOf(accessKey));
  }

  /**
   * Gets If set to TRUE on a form element, the component will automatically submit
   *      the enclosing form when an appropriate action takes place (a click, text
   *      change, etc.).
   *
   * @return  the new autoSubmit value
   */
  final public boolean isAutoSubmit()
  {
    return ComponentUtils.resolveBoolean(getProperty(AUTO_SUBMIT_KEY), false);
  }

  /**
   * Sets If set to TRUE on a form element, the component will automatically submit
   *      the enclosing form when an appropriate action takes place (a click, text
   *      change, etc.).
   * 
   * @param autoSubmit  the new autoSubmit value
   */
  final public void setAutoSubmit(boolean autoSubmit)
  {
    setProperty(AUTO_SUBMIT_KEY, autoSubmit ? Boolean.TRUE : Boolean.FALSE);
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the CoreInputText.
   */
  protected CoreInputText(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Input","org.apache.myfaces.trinidad.Text");
  }
}
