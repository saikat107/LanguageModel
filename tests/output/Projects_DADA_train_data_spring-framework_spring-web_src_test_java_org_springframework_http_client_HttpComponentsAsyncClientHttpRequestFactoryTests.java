<METHOD_START> @ java.lang.Override protected org.springframework.http.client.AsyncClientHttpRequestFactory org.springframework.http.client.AsyncClientHttpRequestFactory ( ) { return new HttpComponentsAsyncClientHttpRequestFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Test public void void ( ) java.lang.Exception { super. httpMethods ( ) ; assertHttpMethod ( STRING , HttpMethod . PATCH ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpComponentsAsyncClientHttpRequestFactory org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory = new HttpComponentsAsyncClientHttpRequestFactory ( ) ; java.net.URI java.net.URI = new java.net.URI ( baseUrl + STRING ) ; HttpComponentsAsyncClientHttpRequest org.springframework.http.client.HttpComponentsAsyncClientHttpRequest = ( HttpComponentsAsyncClientHttpRequest ) org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory . createAsyncRequest ( java.net.URI , HttpMethod . GET ) ; assertNull ( STRING , org.springframework.http.client.HttpComponentsAsyncClientHttpRequest . getHttpContext ( ) . getAttribute ( HttpClientContext . REQUEST_CONFIG ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CloseableHttpAsyncClient org.springframework.http.client.CloseableHttpAsyncClient = HttpAsyncClientBuilder . create ( ) . setDefaultRequestConfig ( RequestConfig . custom ( ) . setConnectTimeout ( NUMBER ) . build ( ) ) . build ( ) ; HttpComponentsAsyncClientHttpRequestFactory org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory = new HttpComponentsAsyncClientHttpRequestFactory ( org.springframework.http.client.CloseableHttpAsyncClient ) ; java.net.URI java.net.URI = new java.net.URI ( baseUrl + STRING ) ; HttpComponentsAsyncClientHttpRequest org.springframework.http.client.HttpComponentsAsyncClientHttpRequest = ( HttpComponentsAsyncClientHttpRequest ) org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory . createAsyncRequest ( java.net.URI , HttpMethod . GET ) ; assertNull ( STRING , org.springframework.http.client.HttpComponentsAsyncClientHttpRequest . getHttpContext ( ) . getAttribute ( HttpClientContext . REQUEST_CONFIG ) ) ; org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory . setConnectionRequestTimeout ( NUMBER ) ; HttpComponentsAsyncClientHttpRequest org.springframework.http.client.HttpComponentsAsyncClientHttpRequest = ( HttpComponentsAsyncClientHttpRequest ) org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory . createAsyncRequest ( java.net.URI , HttpMethod . GET ) ; java.lang.Object java.lang.Object = org.springframework.http.client.HttpComponentsAsyncClientHttpRequest . getHttpContext ( ) . getAttribute ( HttpClientContext . REQUEST_CONFIG ) ; assertNotNull ( java.lang.Object ) ; RequestConfig org.springframework.http.client.RequestConfig = ( RequestConfig ) java.lang.Object ; assertEquals ( NUMBER , org.springframework.http.client.RequestConfig . getConnectionRequestTimeout ( ) ) ; assertEquals ( - NUMBER , org.springframework.http.client.RequestConfig . getConnectTimeout ( ) ) ; }  <METHOD_END>