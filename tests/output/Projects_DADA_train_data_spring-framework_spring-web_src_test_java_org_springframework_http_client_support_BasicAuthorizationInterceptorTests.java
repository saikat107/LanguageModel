<METHOD_START> @ Test public void void ( ) { this . org.springframework.http.client.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.http.client.support.ExpectedException . expectMessage ( STRING ) ; new BasicAuthorizationInterceptor ( null , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.http.client.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.http.client.support.ExpectedException . expectMessage ( STRING ) ; new BasicAuthorizationInterceptor ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BasicAuthorizationInterceptor org.springframework.http.client.support.BasicAuthorizationInterceptor = new BasicAuthorizationInterceptor ( STRING , null ) ; assertEquals ( STRING , new DirectFieldAccessor ( org.springframework.http.client.support.BasicAuthorizationInterceptor ) . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleClientHttpRequestFactory org.springframework.http.client.support.SimpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory ( ) ; ClientHttpRequest org.springframework.http.client.support.ClientHttpRequest = org.springframework.http.client.support.SimpleClientHttpRequestFactory . createRequest ( new java.net.URI ( STRING ) , HttpMethod . GET ) ; ClientHttpRequestExecution org.springframework.http.client.support.ClientHttpRequestExecution = mock ( ClientHttpRequestExecution .class ) ; byte [] byte[] = new byte [] {} ; new BasicAuthorizationInterceptor ( STRING , STRING ) . intercept ( org.springframework.http.client.support.ClientHttpRequest , byte[] , org.springframework.http.client.support.ClientHttpRequestExecution ) ; verify ( org.springframework.http.client.support.ClientHttpRequestExecution ) . execute ( org.springframework.http.client.support.ClientHttpRequest , byte[] ) ; assertEquals ( STRING , org.springframework.http.client.support.ClientHttpRequest . getHeaders ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
