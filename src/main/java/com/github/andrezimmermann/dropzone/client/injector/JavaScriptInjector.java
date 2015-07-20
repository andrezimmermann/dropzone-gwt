package com.github.andrezimmermann.dropzone.client.injector;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.dom.client.ScriptElement;

class JavaScriptInjector extends AbstractInjector {

  private static ScriptElement createScriptElement() {
    ScriptElement script = Document.get().createScriptElement();
    script.setAttribute("type", "text/javascript");
    script.setAttribute("charset", "UTF-8");
    return script;
  }

  /**
   * Injects the JavaScript code into a
   * {@code <script type="text/javascript">...</script>} element in the
   * document header.
   *
   * @param javascript the JavaScript code
   */
  public static void inject(String javascript) {
    HeadElement head = getHead();
    ScriptElement element = createScriptElement();
    element.setText(javascript);
    head.appendChild(element);
  }

}
