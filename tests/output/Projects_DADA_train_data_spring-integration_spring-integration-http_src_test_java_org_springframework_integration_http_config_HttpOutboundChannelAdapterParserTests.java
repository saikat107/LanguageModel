<METHOD_START> @ Test public void void ( ) { DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.http.config.AbstractEndpoint ) ; RestTemplate org.springframework.integration.http.config.RestTemplate = TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.AbstractEndpoint , STRING , RestTemplate .class ) ; assertNotSame ( org.springframework.integration.http.config.RestTemplate , org.springframework.integration.http.config.RestTemplate ) ; HttpRequestExecutingMessageHandler org.springframework.integration.http.config.HttpRequestExecutingMessageHandler = ( HttpRequestExecutingMessageHandler ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler ) ; assertEquals ( false , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertNull ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; ClientHttpRequestFactory org.springframework.integration.http.config.ClientHttpRequestFactory = ( ClientHttpRequestFactory ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertTrue ( org.springframework.integration.http.config.ClientHttpRequestFactory instanceof SimpleClientHttpRequestFactory ) ; Expression org.springframework.integration.http.config.Expression = ( Expression ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.http.config.Expression . getValue ( ) ) ; assertEquals ( HttpMethod . POST . name ( ) , TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler , STRING , Expression .class ) . getExpressionString ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( true , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.http.config.AbstractEndpoint ) ; HttpRequestExecutingMessageHandler org.springframework.integration.http.config.HttpRequestExecutingMessageHandler = ( HttpRequestExecutingMessageHandler ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler ) ; assertEquals ( false , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertNull ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( NUMBER , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; ClientHttpRequestFactory org.springframework.integration.http.config.ClientHttpRequestFactory = ( ClientHttpRequestFactory ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( java.lang.Boolean .class . java.lang.String ( ) , TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler , STRING , Expression .class ) . getValue ( ) ) ; assertTrue ( org.springframework.integration.http.config.ClientHttpRequestFactory instanceof SimpleClientHttpRequestFactory ) ; java.lang.Object java.lang.Object = this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) ; assertEquals ( java.lang.Object , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; java.lang.Object java.lang.Object = this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) ; assertEquals ( java.lang.Object , org.springframework.integration.http.config.ClientHttpRequestFactory ) ; java.lang.Object java.lang.Object = this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) ; assertEquals ( java.lang.Object , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; Expression org.springframework.integration.http.config.Expression = ( Expression ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.http.config.Expression . getValue ( ) ) ; assertEquals ( HttpMethod . GET . name ( ) , TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler , STRING , Expression .class ) . getExpressionString ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( false , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; java.util.Map<java.lang.String,org.springframework.integration.http.config.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.http.config.Expression> = ( java.util.Map<java.lang.String,org.springframework.integration.http.config.Expression> < java.lang.String , Expression > ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,org.springframework.integration.http.config.Expression> . size ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,org.springframework.integration.http.config.Expression> . get ( STRING ) . getExpressionString ( ) ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; java.lang.String [] java.lang.String[] = ( java.lang.String [] ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; java.lang.String [] java.lang.String[] = ( java.lang.String [] ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( NUMBER , java.lang.String[] . int ) ; assertEquals ( NUMBER , java.lang.String[] . int ) ; assertTrue ( ObjectUtils . containsElement ( java.lang.String[] , STRING ) ) ; assertTrue ( ObjectUtils . containsElement ( java.lang.String[] , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.http.config.AbstractEndpoint ) ; WebClient org.springframework.integration.http.config.WebClient = TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.AbstractEndpoint , STRING , WebClient .class ) ; assertNotSame ( this . org.springframework.integration.http.config.WebClient , org.springframework.integration.http.config.WebClient ) ; java.lang.Object java.lang.Object = org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; assertEquals ( false , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertNull ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; Expression org.springframework.integration.http.config.Expression = ( Expression ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.http.config.Expression . getValue ( ) ) ; assertEquals ( HttpMethod . POST . name ( ) , TestUtils . getPropertyValue ( java.lang.Object , STRING , Expression .class ) . getExpressionString ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( true , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RestTemplate org.springframework.integration.http.config.RestTemplate = TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.AbstractEndpoint , STRING , RestTemplate .class ) ; assertEquals ( org.springframework.integration.http.config.RestTemplate , org.springframework.integration.http.config.RestTemplate ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertSame ( this . org.springframework.integration.http.config.WebClient , TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.AbstractEndpoint , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BeanDefinitionParsingException .class ) public void void ( ) { new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.http.config.HttpOutboundChannelAdapterParserTests> ( ) ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.http.config.AbstractEndpoint ) ; RestTemplate org.springframework.integration.http.config.RestTemplate = TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.AbstractEndpoint , STRING , RestTemplate .class ) ; assertSame ( org.springframework.integration.http.config.RestTemplate , org.springframework.integration.http.config.RestTemplate ) ; HttpRequestExecutingMessageHandler org.springframework.integration.http.config.HttpRequestExecutingMessageHandler = ( HttpRequestExecutingMessageHandler ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler ) ; assertEquals ( false , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertNull ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; ClientHttpRequestFactory org.springframework.integration.http.config.ClientHttpRequestFactory = ( ClientHttpRequestFactory ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertTrue ( org.springframework.integration.http.config.ClientHttpRequestFactory instanceof SimpleClientHttpRequestFactory ) ; Expression org.springframework.integration.http.config.Expression = ( Expression ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.http.config.Expression . getValue ( ) ) ; assertEquals ( HttpMethod . POST . name ( ) , TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler , STRING , Expression .class ) . getExpressionString ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( true , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( STRING , ( ( Expression ) java.lang.Object ) . getExpressionString ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( java.lang.Object ) ; assertTrue ( ( ( java.util.Map<?,?> < ? , ? > ) java.lang.Object ) . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.http.config.AbstractEndpoint ) ; RestTemplate org.springframework.integration.http.config.RestTemplate = TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.AbstractEndpoint , STRING , RestTemplate .class ) ; assertNotSame ( org.springframework.integration.http.config.RestTemplate , org.springframework.integration.http.config.RestTemplate ) ; HttpRequestExecutingMessageHandler org.springframework.integration.http.config.HttpRequestExecutingMessageHandler = ( HttpRequestExecutingMessageHandler ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler ) ; assertEquals ( false , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertNull ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; ClientHttpRequestFactory org.springframework.integration.http.config.ClientHttpRequestFactory = ( ClientHttpRequestFactory ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertTrue ( org.springframework.integration.http.config.ClientHttpRequestFactory instanceof SimpleClientHttpRequestFactory ) ; SpelExpression org.springframework.integration.http.config.SpelExpression = ( SpelExpression ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( org.springframework.integration.http.config.SpelExpression ) ; assertEquals ( STRING , org.springframework.integration.http.config.SpelExpression . getExpressionString ( ) ) ; assertEquals ( HttpMethod . POST . name ( ) , TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler , STRING , Expression .class ) . getExpressionString ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( true , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHandler org.springframework.integration.http.config.MessageHandler = TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.AbstractEndpoint , STRING , MessageHandler .class ) ; org.springframework.integration.http.config.MessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( this . org.springframework.integration.http.config.AbstractEndpoint ) ; RestTemplate org.springframework.integration.http.config.RestTemplate = TestUtils . getPropertyValue ( this . org.springframework.integration.http.config.AbstractEndpoint , STRING , RestTemplate .class ) ; assertSame ( org.springframework.integration.http.config.RestTemplate , org.springframework.integration.http.config.RestTemplate ) ; HttpRequestExecutingMessageHandler org.springframework.integration.http.config.HttpRequestExecutingMessageHandler = ( HttpRequestExecutingMessageHandler ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler ) ; assertEquals ( false , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( this . org.springframework.integration.http.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertNull ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; DirectFieldAccessor org.springframework.integration.http.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; ClientHttpRequestFactory org.springframework.integration.http.config.ClientHttpRequestFactory = ( ClientHttpRequestFactory ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertTrue ( org.springframework.integration.http.config.ClientHttpRequestFactory instanceof SimpleClientHttpRequestFactory ) ; SpelExpression org.springframework.integration.http.config.SpelExpression = ( SpelExpression ) org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( org.springframework.integration.http.config.SpelExpression ) ; assertEquals ( STRING , org.springframework.integration.http.config.SpelExpression . getExpressionString ( ) ) ; assertEquals ( HttpMethod . POST . name ( ) , TestUtils . getPropertyValue ( org.springframework.integration.http.config.HttpRequestExecutingMessageHandler , STRING , Expression .class ) . getExpressionString ( ) ) ; assertEquals ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( true , org.springframework.integration.http.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( this . org.springframework.integration.http.config.AbstractEndpoint , Matchers . instanceOf ( PollingConsumer .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BeanDefinitionParsingException .class ) public void void ( ) { new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.http.config.HttpOutboundChannelAdapterParserTests> ( ) ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ClientHttpResponse org.springframework.integration.http.config.ClientHttpResponse ) throws java.io.IOException { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpResponse org.springframework.integration.http.config.ClientHttpResponse ) throws java.io.IOException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ExecutionCallback org.springframework.integration.http.config.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.http.config.Message<?> ) throws java.lang.Exception { int ++ ; return null ; }  <METHOD_END>