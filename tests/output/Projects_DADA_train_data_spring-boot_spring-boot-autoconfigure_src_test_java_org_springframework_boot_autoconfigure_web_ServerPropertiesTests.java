<METHOD_START> @ Test public void void ( ) java.lang.Exception { RelaxedDataBinder org.springframework.boot.autoconfigure.web.RelaxedDataBinder = new RelaxedDataBinder ( this . org.springframework.boot.autoconfigure.web.ServerProperties , STRING ) ; org.springframework.boot.autoconfigure.web.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( org.springframework.boot.autoconfigure.web.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getAddress ( ) ) . isEqualTo ( java.net.InetAddress . java.net.InetAddress ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { new RelaxedDataBinder ( this . org.springframework.boot.autoconfigure.web.ServerProperties , STRING ) . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getPort ( ) . intValue ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getServerHeader ( ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RelaxedDataBinder org.springframework.boot.autoconfigure.web.RelaxedDataBinder = new RelaxedDataBinder ( this . org.springframework.boot.autoconfigure.web.ServerProperties , STRING ) ; org.springframework.boot.autoconfigure.web.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getServerHeader ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; void ( java.util.Map<java.lang.String,java.lang.String> ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getConnectionTimeout ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RelaxedDataBinder org.springframework.boot.autoconfigure.web.RelaxedDataBinder = new RelaxedDataBinder ( this . org.springframework.boot.autoconfigure.web.ServerProperties , STRING ) ; org.springframework.boot.autoconfigure.web.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( org.springframework.boot.autoconfigure.web.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getServlet ( ) . getServletMapping ( ) ) . isEqualTo ( STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getServlet ( ) . getServletPrefix ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RelaxedDataBinder org.springframework.boot.autoconfigure.web.RelaxedDataBinder = new RelaxedDataBinder ( this . org.springframework.boot.autoconfigure.web.ServerProperties , STRING ) ; org.springframework.boot.autoconfigure.web.RelaxedDataBinder . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( org.springframework.boot.autoconfigure.web.RelaxedDataBinder . getBindingResult ( ) . hasErrors ( ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getServlet ( ) . getServletMapping ( ) ) . isEqualTo ( STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getServlet ( ) . getServletPrefix ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; void ( java.util.Map<java.lang.String,java.lang.String> ) ; ServerProperties . ServerProperties ServerProperties.Tomcat = this . org.springframework.boot.autoconfigure.web.ServerProperties . getTomcat ( ) ; assertThat ( ServerProperties.Tomcat . getAccesslog ( ) . getPattern ( ) ) . isEqualTo ( STRING ) ; assertThat ( ServerProperties.Tomcat . getAccesslog ( ) . getPrefix ( ) ) . isEqualTo ( STRING ) ; assertThat ( ServerProperties.Tomcat . getAccesslog ( ) . isRotate ( ) ) . isFalse ( ) ; assertThat ( ServerProperties.Tomcat . getAccesslog ( ) . isRenameOnRotate ( ) ) . isTrue ( ) ; assertThat ( ServerProperties.Tomcat . getAccesslog ( ) . isRequestAttributesEnabled ( ) ) . isTrue ( ) ; assertThat ( ServerProperties.Tomcat . getAccesslog ( ) . getSuffix ( ) ) . isEqualTo ( STRING ) ; assertThat ( ServerProperties.Tomcat . getRemoteIpHeader ( ) ) . isEqualTo ( STRING ) ; assertThat ( ServerProperties.Tomcat . getProtocolHeader ( ) ) . isEqualTo ( STRING ) ; assertThat ( ServerProperties.Tomcat . getInternalProxies ( ) ) . isEqualTo ( STRING ) ; assertThat ( ServerProperties.Tomcat . getBackgroundProcessorDelay ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new java.util.HashMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ( ) ) ; ServerProperties . ServerProperties ServerProperties.Tomcat = this . org.springframework.boot.autoconfigure.web.ServerProperties . getTomcat ( ) ; assertThat ( ServerProperties.Tomcat . getRedirectContextRoot ( ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new RelaxedDataBinder ( this . org.springframework.boot.autoconfigure.web.ServerProperties , STRING ) . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getServlet ( ) . getContextPath ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new RelaxedDataBinder ( this . org.springframework.boot.autoconfigure.web.ServerProperties , STRING ) . bind ( new MutablePropertyValues ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getServlet ( ) . getContextPath ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; void ( java.util.Map<java.lang.String,java.lang.String> ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getTomcat ( ) . getUriEncoding ( ) ) . isEqualTo ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; void ( java.util.Map<java.lang.String,java.lang.String> ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getMaxHttpHeaderSize ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; void ( java.util.Map<java.lang.String,java.lang.String> ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getJetty ( ) . getAcceptors ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; void ( java.util.Map<java.lang.String,java.lang.String> ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.ServerProperties . getJetty ( ) . getSelectors ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { new RelaxedDataBinder ( this . org.springframework.boot.autoconfigure.web.ServerProperties , STRING ) . bind ( new MutablePropertyValues ( java.util.Map<java.lang.String,java.lang.String> ) ) ; }  <METHOD_END>
