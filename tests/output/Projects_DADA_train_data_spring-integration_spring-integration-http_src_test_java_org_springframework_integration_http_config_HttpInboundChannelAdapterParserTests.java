<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { assertFalse ( TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING , java.lang.Boolean .class ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING ) ) ; MockHttpServletRequest org.springframework.integration.http.config.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.integration.http.config.MockHttpServletRequest . setMethod ( STRING ) ; org.springframework.integration.http.config.MockHttpServletRequest . setParameter ( STRING , STRING ) ; MockHttpServletResponse org.springframework.integration.http.config.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway . handleRequest ( org.springframework.integration.http.config.MockHttpServletRequest , org.springframework.integration.http.config.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_SERVICE_UNAVAILABLE , org.springframework.integration.http.config.MockHttpServletResponse . getStatus ( ) ) ; this . org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway . start ( ) ; org.springframework.integration.http.config.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway . handleRequest ( org.springframework.integration.http.config.MockHttpServletRequest , org.springframework.integration.http.config.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_SWITCHING_PROTOCOLS , org.springframework.integration.http.config.MockHttpServletResponse . getStatus ( ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = org.springframework.integration.http.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; java.lang.Object java.lang.Object = org.springframework.integration.http.config.Message<> . getPayload ( ) ; assertTrue ( java.lang.Object instanceof MultiValueMap ) ; MultiValueMap < java.lang.String , java.lang.String > org.springframework.integration.http.config.MultiValueMap<java.lang.String,java.lang.String> = ( MultiValueMap < java.lang.String , java.lang.String > ) java.lang.Object ; assertEquals ( NUMBER , org.springframework.integration.http.config.MultiValueMap<java.lang.String,java.lang.String> . size ( ) ) ; assertEquals ( STRING , org.springframework.integration.http.config.MultiValueMap<java.lang.String,java.lang.String> . keySet ( ) . iterator ( ) . next ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.http.config.MultiValueMap<java.lang.String,java.lang.String> . get ( STRING ) . size ( ) ) ; assertEquals ( STRING , org.springframework.integration.http.config.MultiValueMap<java.lang.String,java.lang.String> . getFirst ( STRING ) ) ; assertNotNull ( TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultHttpHeaderMapper org.springframework.integration.http.config.DefaultHttpHeaderMapper = ( DefaultHttpHeaderMapper ) TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING ) ; HttpHeaders org.springframework.integration.http.config.HttpHeaders = new HttpHeaders ( ) ; org.springframework.integration.http.config.HttpHeaders . set ( STRING , STRING ) ; org.springframework.integration.http.config.HttpHeaders . set ( STRING , STRING ) ; org.springframework.integration.http.config.HttpHeaders . set ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.integration.http.config.DefaultHttpHeaderMapper . toHeaders ( org.springframework.integration.http.config.HttpHeaders ) ; assertTrue ( java.util.Map<java.lang.String,java.lang.Object> . int ( ) == NUMBER ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.integration.http.config.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.integration.http.config.MockHttpServletRequest . setMethod ( STRING ) ; org.springframework.integration.http.config.MockHttpServletRequest . setContentType ( STRING ) ; org.springframework.integration.http.config.MockHttpServletRequest . setParameter ( STRING , STRING ) ; org.springframework.integration.http.config.MockHttpServletRequest . setContent ( STRING . byte[] ( ) ) ; java.lang.String java.lang.String = STRING ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new AntPathMatcher ( ) . extractUriTemplateVariables ( STRING , java.lang.String ) ; org.springframework.integration.http.config.MockHttpServletRequest . setAttribute ( HandlerMapping . URI_TEMPLATE_VARIABLES_ATTRIBUTE , java.util.Map<java.lang.String,java.lang.String> ) ; org.springframework.integration.http.config.MockHttpServletRequest . setRequestURI ( java.lang.String ) ; MockHttpServletResponse org.springframework.integration.http.config.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway . handleRequest ( org.springframework.integration.http.config.MockHttpServletRequest , org.springframework.integration.http.config.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_OK , org.springframework.integration.http.config.MockHttpServletResponse . getStatus ( ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = org.springframework.integration.http.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; java.lang.Object java.lang.Object = org.springframework.integration.http.config.Message<> . getPayload ( ) ; assertTrue ( java.lang.Object instanceof java.lang.String ) ; assertEquals ( STRING , java.lang.Object ) ; assertEquals ( STRING , org.springframework.integration.http.config.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.integration.http.config.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.integration.http.config.MockHttpServletRequest . setMethod ( STRING ) ; org.springframework.integration.http.config.MockHttpServletRequest . setParameter ( STRING , STRING ) ; org.springframework.integration.http.config.MockHttpServletRequest . setRequestURI ( STRING ) ; try { this . org.springframework.integration.http.config.HandlerMapping . getHandler ( org.springframework.integration.http.config.MockHttpServletRequest ) ; } catch ( HttpRequestMethodNotSupportedException org.springframework.integration.http.config.HttpRequestMethodNotSupportedException ) { assertEquals ( STRING , org.springframework.integration.http.config.HttpRequestMethodNotSupportedException . getMethod ( ) ) ; assertArrayEquals ( new java.lang.String [] { STRING } , org.springframework.integration.http.config.HttpRequestMethodNotSupportedException . getSupportedMethods ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.integration.http.config.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.integration.http.config.MockHttpServletRequest . setMethod ( STRING ) ; org.springframework.integration.http.config.MockHttpServletRequest . setContent ( STRING . byte[] ( ) ) ; org.springframework.integration.http.config.MockHttpServletRequest . setContentType ( STRING ) ; MockHttpServletResponse org.springframework.integration.http.config.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway . handleRequest ( org.springframework.integration.http.config.MockHttpServletRequest , org.springframework.integration.http.config.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_OK , org.springframework.integration.http.config.MockHttpServletResponse . getStatus ( ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = org.springframework.integration.http.config.PollableChannel . receive ( NUMBER ) ; MessageHistory org.springframework.integration.http.config.MessageHistory = MessageHistory . read ( org.springframework.integration.http.config.Message<> ) ; assertNotNull ( org.springframework.integration.http.config.MessageHistory ) ; java.util.Properties java.util.Properties = TestUtils . locateComponentInHistory ( org.springframework.integration.http.config.MessageHistory , STRING , NUMBER ) ; assertNotNull ( java.util.Properties ) ; assertEquals ( STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.http.config.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ DirtiesContext public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.integration.http.config.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.integration.http.config.MockHttpServletRequest . setMethod ( STRING ) ; java.lang.Object java.lang.Object = new org.springframework.integration.http.config.HttpInboundChannelAdapterParserTests.TestObject ( STRING ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; new java.io.ObjectOutputStream ( java.io.ByteArrayOutputStream ) . void ( java.lang.Object ) ; org.springframework.integration.http.config.MockHttpServletRequest . setContent ( java.io.ByteArrayOutputStream . byte[] ( ) ) ; org.springframework.integration.http.config.MockHttpServletRequest . setContentType ( STRING ) ; MockHttpServletResponse org.springframework.integration.http.config.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway . handleRequest ( org.springframework.integration.http.config.MockHttpServletRequest , org.springframework.integration.http.config.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_OK , org.springframework.integration.http.config.MockHttpServletResponse . getStatus ( ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = org.springframework.integration.http.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; assertTrue ( org.springframework.integration.http.config.Message<> . getPayload ( ) instanceof org.springframework.integration.http.config.HttpInboundChannelAdapterParserTests.TestObject ) ; assertEquals ( STRING , ( ( org.springframework.integration.http.config.HttpInboundChannelAdapterParserTests.TestObject ) org.springframework.integration.http.config.Message<> . getPayload ( ) ) . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpMethod [] org.springframework.integration.http.config.HttpMethod[] = TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING , HttpMethod [] .class ) ; assertEquals ( NUMBER , supportedMethods . length ) ; assertArrayEquals ( new HttpMethod [] { HttpMethod . PUT , HttpMethod . DELETE } , org.springframework.integration.http.config.HttpMethod[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingController , STRING , java.lang.String .class ) ; assertEquals ( STRING , java.lang.String ) ; Expression org.springframework.integration.http.config.Expression = TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingController , STRING , Expression .class ) ; assertEquals ( STRING , org.springframework.integration.http.config.Expression . getExpressionString ( ) ) ; MockHttpServletRequest org.springframework.integration.http.config.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.integration.http.config.MockHttpServletRequest . setMethod ( STRING ) ; org.springframework.integration.http.config.MockHttpServletRequest . setParameter ( STRING , STRING ) ; MockHttpServletResponse org.springframework.integration.http.config.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.integration.http.config.HttpRequestHandlingController . handleRequest ( org.springframework.integration.http.config.MockHttpServletRequest , org.springframework.integration.http.config.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_ACCEPTED , org.springframework.integration.http.config.MockHttpServletResponse . getStatus ( ) ) ; Message < ? > org.springframework.integration.http.config.Message<?> = org.springframework.integration.http.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.http.config.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Expression org.springframework.integration.http.config.Expression = TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingController , STRING , Expression .class ) ; assertEquals ( STRING , org.springframework.integration.http.config.Expression . getExpressionString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertSame ( org.springframework.integration.http.config.MessageChannel , TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { @ java.lang.SuppressWarnings ( STRING ) java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> = TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING , java.util.List .class ) ; assertTrue ( STRING , java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> . size ( ) > NUMBER ) ; assertThat ( java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> . get ( NUMBER ) , instanceOf ( SerializingHttpMessageConverter .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { @ java.lang.SuppressWarnings ( STRING ) java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> = TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING , java.util.List .class ) ; assertThat ( java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> . get ( NUMBER ) , instanceOf ( SerializingHttpMessageConverter .class ) ) ; assertTrue ( STRING , java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> . size ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { @ java.lang.SuppressWarnings ( STRING ) java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> = TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestHandlingMessagingGateway , STRING , java.util.List .class ) ; assertTrue ( STRING , java.util.List<org.springframework.integration.http.config.HttpMessageConverter<?>> . size ( ) > NUMBER ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>