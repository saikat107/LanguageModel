<METHOD_START> public void ( ClientHttpRequestFactory org.springframework.http.client.ClientHttpRequestFactory , java.util.List<org.springframework.http.client.ClientHttpRequestInterceptor> < ClientHttpRequestInterceptor > java.util.List<org.springframework.http.client.ClientHttpRequestInterceptor> ) { super( org.springframework.http.client.ClientHttpRequestFactory ); this . java.util.List<org.springframework.http.client.ClientHttpRequestInterceptor> = ( java.util.List<org.springframework.http.client.ClientHttpRequestInterceptor> != null ? java.util.List<org.springframework.http.client.ClientHttpRequestInterceptor> : java.util.Collections . java.util.List<java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.client.ClientHttpRequest org.springframework.http.client.ClientHttpRequest ( java.net.URI java.net.URI , HttpMethod org.springframework.http.client.HttpMethod , ClientHttpRequestFactory org.springframework.http.client.ClientHttpRequestFactory ) { return new InterceptingClientHttpRequest ( org.springframework.http.client.ClientHttpRequestFactory , this . java.util.List<org.springframework.http.client.ClientHttpRequestInterceptor> , java.net.URI , org.springframework.http.client.HttpMethod ) ; }  <METHOD_END>
