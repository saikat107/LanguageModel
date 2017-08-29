<METHOD_START> @ Before public void void ( ) { this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer = new ScriptTemplateConfigurer ( ) ; this . org.springframework.web.servlet.view.script.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; this . org.springframework.web.servlet.view.script.StaticWebApplicationContext . getBeanFactory ( ) . registerSingleton ( STRING , this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView = new ScriptTemplateView ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockServletContext org.springframework.web.servlet.view.script.MockServletContext = new MockServletContext ( ) ; this . org.springframework.web.servlet.view.script.StaticWebApplicationContext . setServletContext ( org.springframework.web.servlet.view.script.MockServletContext ) ; this . org.springframework.web.servlet.view.script.StaticWebApplicationContext . refresh ( ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setResourceLoaderPath ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setUrl ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngine ( mock ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine .class ) ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setRenderFunction ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; assertFalse ( this . org.springframework.web.servlet.view.script.ScriptTemplateView . checkResource ( java.util.Locale . java.util.Locale ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.view.script.ExpectedException . expect ( ApplicationContextException .class ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( new StaticApplicationContext ( ) ) ; this . org.springframework.web.servlet.view.script.ExpectedException . expectMessage ( contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine = mock ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine .class ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setEngine ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setRenderObject ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setRenderFunction ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setContentType ( MediaType . TEXT_PLAIN_VALUE ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setCharset ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setSharedEngine ( true ) ; DirectFieldAccessor org.springframework.web.servlet.view.script.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.web.servlet.view.script.ScriptTemplateView ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; assertEquals ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( MediaType . TEXT_PLAIN_VALUE , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( java.nio.charset.StandardCharsets . java.nio.charset.Charset , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( true , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setEngineName ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setRenderObject ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setRenderFunction ( STRING ) ; DirectFieldAccessor org.springframework.web.servlet.view.script.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.web.servlet.view.script.ScriptTemplateView ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertNotNull ( org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( MediaType . TEXT_HTML_VALUE , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( java.nio.charset.StandardCharsets . java.nio.charset.Charset , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.script.ScriptEngine javax.script.ScriptEngine = mock ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine .class ) ; given ( javax.script.ScriptEngine . java.lang.Object ( STRING ) ) . willReturn ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngine ( javax.script.ScriptEngine ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setRenderFunction ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; javax.script.ScriptEngine = this . org.springframework.web.servlet.view.script.ScriptTemplateView . getEngine ( ) ; assertNotNull ( javax.script.ScriptEngine ) ; assertEquals ( STRING , javax.script.ScriptEngine . java.lang.Object ( STRING ) ) ; DirectFieldAccessor org.springframework.web.servlet.view.script.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.web.servlet.view.script.ScriptTemplateView ) ; assertNull ( org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( java.nio.charset.StandardCharsets . java.nio.charset.Charset , org.springframework.web.servlet.view.script.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { int int = NUMBER ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngineName ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setRenderFunction ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setSharedEngine ( false ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( NUMBER ) ; java.util.List<java.util.concurrent.Future<java.lang.Boolean>> < java.util.concurrent.Future<java.lang.Boolean> < java.lang.Boolean > > java.util.List<java.util.concurrent.Future<java.lang.Boolean>> = new java.util.ArrayList<java.util.concurrent.Future<java.lang.Boolean>> <> ( ) ; for ( int int = NUMBER ; int < int ; int ++ ) { java.util.List<java.util.concurrent.Future<java.lang.Boolean>> . boolean ( java.util.concurrent.ExecutorService . java.util.concurrent.Future<T> ( ( ) org.springframework.web.servlet.view.script.ScriptTemplateView . getEngine ( ) != null ) ) ; } assertEquals ( int , java.util.List<java.util.concurrent.Future<java.lang.Boolean>> . int ( ) ) ; for ( int int = NUMBER ; int < int ; int ++ ) { assertTrue ( java.util.List<java.util.concurrent.Future<java.lang.Boolean>> . java.util.concurrent.Future<java.lang.Boolean> ( int ) . java.lang.Boolean ( ) ) ; } java.util.concurrent.ExecutorService . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.view.script.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngine ( mock ( javax.script.ScriptEngine .class ) ) ; this . org.springframework.web.servlet.view.script.ExpectedException . expectMessage ( contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngine ( mock ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine .class ) ) ; this . org.springframework.web.servlet.view.script.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; this . org.springframework.web.servlet.view.script.ExpectedException . expectMessage ( contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngine ( mock ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine .class ) ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngineName ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setRenderFunction ( STRING ) ; this . org.springframework.web.servlet.view.script.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; this . org.springframework.web.servlet.view.script.ExpectedException . expectMessage ( contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngine ( mock ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine .class ) ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setRenderFunction ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setSharedEngine ( false ) ; this . org.springframework.web.servlet.view.script.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; this . org.springframework.web.servlet.view.script.ExpectedException . expectMessage ( contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockServletContext org.springframework.web.servlet.view.script.MockServletContext = new MockServletContext ( ) ; this . org.springframework.web.servlet.view.script.StaticWebApplicationContext . setServletContext ( org.springframework.web.servlet.view.script.MockServletContext ) ; this . org.springframework.web.servlet.view.script.StaticWebApplicationContext . refresh ( ) ; MockHttpServletRequest org.springframework.web.servlet.view.script.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.servlet.view.script.MockHttpServletRequest . setAttribute ( DispatcherServlet . WEB_APPLICATION_CONTEXT_ATTRIBUTE , this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; MockHttpServletResponse org.springframework.web.servlet.view.script.MockHttpServletResponse = new MockHttpServletResponse ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine = mock ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine .class ) ; when ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine . java.lang.Object ( any ( ) , any ( ) , any ( ) , any ( ) ) ) . thenReturn ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngine ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setRenderFunction ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setUrl ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . render ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.script.MockHttpServletRequest , org.springframework.web.servlet.view.script.MockHttpServletResponse ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.MockHttpServletResponse . getContentAsString ( ) ) ; org.springframework.web.servlet.view.script.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setResourceLoaderPath ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setUrl ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . render ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.script.MockHttpServletRequest , org.springframework.web.servlet.view.script.MockHttpServletResponse ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.MockHttpServletResponse . getContentAsString ( ) ) ; org.springframework.web.servlet.view.script.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setResourceLoaderPath ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setUrl ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . render ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.script.MockHttpServletRequest , org.springframework.web.servlet.view.script.MockHttpServletResponse ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockServletContext org.springframework.web.servlet.view.script.MockServletContext = new MockServletContext ( ) ; this . org.springframework.web.servlet.view.script.StaticWebApplicationContext . setServletContext ( org.springframework.web.servlet.view.script.MockServletContext ) ; this . org.springframework.web.servlet.view.script.StaticWebApplicationContext . refresh ( ) ; MockHttpServletRequest org.springframework.web.servlet.view.script.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.servlet.view.script.MockHttpServletRequest . setAttribute ( DispatcherServlet . WEB_APPLICATION_CONTEXT_ATTRIBUTE , this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; MockHttpServletResponse org.springframework.web.servlet.view.script.MockHttpServletResponse = new MockHttpServletResponse ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setEngine ( mock ( org.springframework.web.servlet.view.script.ScriptTemplateViewTests.InvocableScriptEngine .class ) ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setRenderFunction ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setResourceLoaderPath ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setUrl ( STRING ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( this . org.springframework.web.servlet.view.script.StaticWebApplicationContext ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . render ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.script.MockHttpServletRequest , org.springframework.web.servlet.view.script.MockHttpServletResponse ) ; assertEquals ( MediaType . TEXT_HTML_VALUE + STRING + java.nio.charset.StandardCharsets . java.nio.charset.Charset , org.springframework.web.servlet.view.script.MockHttpServletResponse . getHeader ( HttpHeaders . CONTENT_TYPE ) ) ; org.springframework.web.servlet.view.script.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setContentType ( MediaType . TEXT_PLAIN_VALUE ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . render ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.script.MockHttpServletRequest , org.springframework.web.servlet.view.script.MockHttpServletResponse ) ; assertEquals ( MediaType . TEXT_PLAIN_VALUE + STRING + java.nio.charset.StandardCharsets . java.nio.charset.Charset , org.springframework.web.servlet.view.script.MockHttpServletResponse . getHeader ( HttpHeaders . CONTENT_TYPE ) ) ; org.springframework.web.servlet.view.script.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . setCharset ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; this . org.springframework.web.servlet.view.script.ScriptTemplateView . render ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.script.MockHttpServletRequest , org.springframework.web.servlet.view.script.MockHttpServletResponse ) ; assertEquals ( MediaType . TEXT_PLAIN_VALUE + STRING + java.nio.charset.StandardCharsets . java.nio.charset.Charset , org.springframework.web.servlet.view.script.MockHttpServletResponse . getHeader ( HttpHeaders . CONTENT_TYPE ) ) ; }  <METHOD_END>
