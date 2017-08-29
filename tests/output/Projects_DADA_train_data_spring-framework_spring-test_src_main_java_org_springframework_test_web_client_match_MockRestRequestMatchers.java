<METHOD_START> public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.lang.AssertionError {			} } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.lang.AssertionError {			}  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final HttpMethod org.springframework.test.web.client.match.HttpMethod ) { Assert . notNull ( org.springframework.test.web.client.match.HttpMethod , STRING ) ; return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.lang.AssertionError { AssertionErrors . assertEquals ( STRING , org.springframework.test.web.client.match.HttpMethod , org.springframework.test.web.client.match.ClientHttpRequest . getMethod ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.lang.AssertionError { AssertionErrors . assertEquals ( STRING , org.springframework.test.web.client.match.HttpMethod , org.springframework.test.web.client.match.ClientHttpRequest . getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final Matcher < java.lang.String > org.springframework.test.web.client.match.Matcher<java.lang.String> ) { Assert . notNull ( org.springframework.test.web.client.match.Matcher<java.lang.String> , STRING ) ; return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { assertThat ( STRING , org.springframework.test.web.client.match.ClientHttpRequest . getURI ( ) . toString ( ) , org.springframework.test.web.client.match.Matcher<java.lang.String> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { assertThat ( STRING , org.springframework.test.web.client.match.ClientHttpRequest . getURI ( ) . toString ( ) , org.springframework.test.web.client.match.Matcher<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { assertEquals ( STRING , java.lang.String , org.springframework.test.web.client.match.ClientHttpRequest . getURI ( ) . toString ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { assertEquals ( STRING , java.lang.String , org.springframework.test.web.client.match.ClientHttpRequest . getURI ( ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final java.net.URI java.net.URI ) { Assert . notNull ( java.net.URI , STRING ) ; return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { AssertionErrors . assertEquals ( STRING , java.net.URI , org.springframework.test.web.client.match.ClientHttpRequest . getURI ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { AssertionErrors . assertEquals ( STRING , java.net.URI , org.springframework.test.web.client.match.ClientHttpRequest . getURI ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SafeVarargs public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final java.lang.String java.lang.String , final org.springframework.test.web.client.match.Matcher<? super java.lang.String> < ? super java.lang.String > ... org.springframework.test.web.client.match.Matcher<? super java.lang.String>[] ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> = org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> ( org.springframework.test.web.client.match.ClientHttpRequest ) ; void ( STRING , java.lang.String , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> , matchers . length ) ; for ( int int = NUMBER ; int < matchers . length ; int ++ ) { assertThat ( STRING , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> . get ( java.lang.String ) . get ( int ) , org.springframework.test.web.client.match.Matcher<? super java.lang.String>[] [ int ] ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> = org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> ( org.springframework.test.web.client.match.ClientHttpRequest ) ; void ( STRING , java.lang.String , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> , matchers . length ) ; for ( int int = NUMBER ; int < matchers . length ; int ++ ) { assertThat ( STRING , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> . get ( java.lang.String ) . get ( int ) , org.springframework.test.web.client.match.Matcher<? super java.lang.String>[] [ int ] ) ; } }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final java.lang.String java.lang.String , final java.lang.String ... java.lang.String[] ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> = org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> ( org.springframework.test.web.client.match.ClientHttpRequest ) ; void ( STRING , java.lang.String , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> , java.lang.String[] . int ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { assertEquals ( STRING + java.lang.String + STRING , java.lang.String[] [ int ] , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> . get ( java.lang.String ) . get ( int ) ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> = org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> ( org.springframework.test.web.client.match.ClientHttpRequest ) ; void ( STRING , java.lang.String , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> , java.lang.String[] . int ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { assertEquals ( STRING + java.lang.String + STRING , java.lang.String[] [ int ] , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> . get ( java.lang.String ) . get ( int ) ) ; } }  <METHOD_END>
<METHOD_START> private static org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { return UriComponentsBuilder . fromUri ( org.springframework.test.web.client.match.ClientHttpRequest . getURI ( ) ) . build ( ) . getQueryParams ( ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.String java.lang.String , final java.lang.String java.lang.String , MultiValueMap < java.lang.String , java.lang.String > org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> , int int ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> . get ( java.lang.String ) ; java.lang.String java.lang.String = STRING + java.lang.String + STRING + java.lang.String + STRING ; assertNotNull ( java.lang.String , java.util.List<java.lang.String> ) ; assertTrue ( java.lang.String + STRING + int + STRING + java.util.List<java.lang.String> , int <= java.util.List<java.lang.String> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SafeVarargs public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final java.lang.String java.lang.String , final org.springframework.test.web.client.match.Matcher<? super java.lang.String> < ? super java.lang.String > ... org.springframework.test.web.client.match.Matcher<? super java.lang.String>[] ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { void ( STRING , java.lang.String , org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) , matchers . length ) ; for ( int int = NUMBER ; int < matchers . length ; int ++ ) { assertThat ( STRING , org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) . get ( java.lang.String ) . get ( int ) , org.springframework.test.web.client.match.Matcher<? super java.lang.String>[] [ int ] ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { void ( STRING , java.lang.String , org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) , matchers . length ) ; for ( int int = NUMBER ; int < matchers . length ; int ++ ) { assertThat ( STRING , org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) . get ( java.lang.String ) . get ( int ) , org.springframework.test.web.client.match.Matcher<? super java.lang.String>[] [ int ] ) ; } }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final java.lang.String java.lang.String , final java.lang.String ... java.lang.String[] ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { void ( STRING , java.lang.String , org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) , java.lang.String[] . int ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { assertEquals ( STRING + java.lang.String + STRING , java.lang.String[] [ int ] , org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) . get ( java.lang.String ) . get ( int ) ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) { void ( STRING , java.lang.String , org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) , java.lang.String[] . int ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { assertEquals ( STRING + java.lang.String + STRING , java.lang.String[] [ int ] , org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) . get ( java.lang.String ) . get ( int ) ) ; } }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.ContentRequestMatchers org.springframework.test.web.client.match.ContentRequestMatchers ( ) { return new ContentRequestMatchers ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.JsonPathRequestMatchers org.springframework.test.web.client.match.JsonPathRequestMatchers ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { return new JsonPathRequestMatchers ( java.lang.String , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( java.lang.String java.lang.String , Matcher < T > org.springframework.test.web.client.match.Matcher<T> ) { return new JsonPathRequestMatchers ( java.lang.String ) . value ( org.springframework.test.web.client.match.Matcher<T> ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.XpathRequestMatchers org.springframework.test.web.client.match.XpathRequestMatchers ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) throws javax.xml.xpath.XPathExpressionException { return new XpathRequestMatchers ( java.lang.String , null , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.client.match.XpathRequestMatchers org.springframework.test.web.client.match.XpathRequestMatchers ( java.lang.String java.lang.String , java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> , java.lang.Object ... java.lang.Object[] )			throws javax.xml.xpath.XPathExpressionException { return new XpathRequestMatchers ( java.lang.String , java.util.Map<java.lang.String,java.lang.String> , java.lang.Object[] ) ; }  <METHOD_END>
