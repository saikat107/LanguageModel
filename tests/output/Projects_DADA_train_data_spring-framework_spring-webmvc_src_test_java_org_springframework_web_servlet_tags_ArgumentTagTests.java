<METHOD_START> @ Before public void void ( ) java.lang.Exception { PageContext org.springframework.web.servlet.tags.PageContext = createPageContext ( ) ; org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag = new org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag ( ) ; org.springframework.web.servlet.tags.ArgumentTag = new ArgumentTag ( ) ; org.springframework.web.servlet.tags.ArgumentTag . setPageContext ( org.springframework.web.servlet.tags.PageContext ) ; org.springframework.web.servlet.tags.ArgumentTag . setParent ( org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.servlet.tags.JspException { org.springframework.web.servlet.tags.ArgumentTag . setValue ( STRING ) ; int int = org.springframework.web.servlet.tags.ArgumentTag . doEndTag ( ) ; assertEquals ( Tag . EVAL_PAGE , int ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag . java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.servlet.tags.JspException { int int = org.springframework.web.servlet.tags.ArgumentTag . doEndTag ( ) ; assertEquals ( Tag . EVAL_PAGE , int ) ; assertNull ( org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag . java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.servlet.tags.JspException { org.springframework.web.servlet.tags.ArgumentTag . setValue ( null ) ; int int = org.springframework.web.servlet.tags.ArgumentTag . doEndTag ( ) ; assertEquals ( Tag . EVAL_PAGE , int ) ; assertNull ( org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag . java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.servlet.tags.JspException { org.springframework.web.servlet.tags.ArgumentTag . setBodyContent ( new MockBodyContent ( STRING , new MockHttpServletResponse ( ) ) ) ; int int = org.springframework.web.servlet.tags.ArgumentTag . doEndTag ( ) ; assertEquals ( Tag . EVAL_PAGE , int ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag . java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.servlet.tags.JspException { org.springframework.web.servlet.tags.ArgumentTag . setValue ( STRING ) ; int int = org.springframework.web.servlet.tags.ArgumentTag . doEndTag ( ) ; assertEquals ( Tag . EVAL_PAGE , int ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag . java.lang.Object ( ) ) ; org.springframework.web.servlet.tags.ArgumentTag . release ( ) ; org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag = new org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag ( ) ; org.springframework.web.servlet.tags.ArgumentTag . setPageContext ( createPageContext ( ) ) ; org.springframework.web.servlet.tags.ArgumentTag . setParent ( org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag ) ; org.springframework.web.servlet.tags.ArgumentTag . setBodyContent ( new MockBodyContent ( STRING , new MockHttpServletResponse ( ) ) ) ; int = org.springframework.web.servlet.tags.ArgumentTag . doEndTag ( ) ; assertEquals ( Tag . EVAL_PAGE , int ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.ArgumentTagTests.MockArgumentSupportTag . java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( ) { return java.lang.Object ; }  <METHOD_END>
