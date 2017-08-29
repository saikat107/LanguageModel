<METHOD_START> public void ( ) { this( HttpClients . createSystem ( ) ); }  <METHOD_END>
<METHOD_START> public void ( HttpClient org.springframework.http.client.HttpClient ) { Assert . notNull ( org.springframework.http.client.HttpClient , STRING ) ; this . org.springframework.http.client.HttpClient = org.springframework.http.client.HttpClient ; }  <METHOD_END>
<METHOD_START> public void void ( HttpClient org.springframework.http.client.HttpClient ) { this . org.springframework.http.client.HttpClient = org.springframework.http.client.HttpClient ; }  <METHOD_END>
<METHOD_START> public org.springframework.http.client.HttpClient org.springframework.http.client.HttpClient ( ) { return this . org.springframework.http.client.HttpClient ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { Assert . isTrue ( int >= NUMBER , STRING ) ; this . org.springframework.http.client.RequestConfig = RequestConfig.Builder ( ) . setConnectTimeout ( int ) . build ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . org.springframework.http.client.RequestConfig = RequestConfig.Builder ( ) . setConnectionRequestTimeout ( int ) . build ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { Assert . isTrue ( int >= NUMBER , STRING ) ; this . org.springframework.http.client.RequestConfig = RequestConfig.Builder ( ) . setSocketTimeout ( int ) . build ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.ClientHttpRequest org.springframework.http.client.ClientHttpRequest ( java.net.URI java.net.URI , HttpMethod org.springframework.http.client.HttpMethod ) throws java.io.IOException { HttpClient org.springframework.http.client.HttpClient = org.springframework.http.client.HttpClient ( ) ; Assert . state ( org.springframework.http.client.HttpClient != null , STRING ) ; HttpUriRequest org.springframework.http.client.HttpUriRequest = org.springframework.http.client.HttpUriRequest ( org.springframework.http.client.HttpMethod , java.net.URI ) ; void ( org.springframework.http.client.HttpUriRequest ) ; HttpContext org.springframework.http.client.HttpContext = org.springframework.http.client.HttpContext ( org.springframework.http.client.HttpMethod , java.net.URI ) ; if ( org.springframework.http.client.HttpContext == null ) { org.springframework.http.client.HttpContext = HttpClientContext . create ( ) ; } if ( org.springframework.http.client.HttpContext . getAttribute ( HttpClientContext . REQUEST_CONFIG ) == null ) { RequestConfig org.springframework.http.client.RequestConfig = null ; if ( org.springframework.http.client.HttpUriRequest instanceof Configurable ) { org.springframework.http.client.RequestConfig = ( ( Configurable ) org.springframework.http.client.HttpUriRequest ) . getConfig ( ) ; } if ( org.springframework.http.client.RequestConfig == null ) { org.springframework.http.client.RequestConfig = org.springframework.http.client.RequestConfig ( org.springframework.http.client.HttpClient ) ; } if ( org.springframework.http.client.RequestConfig != null ) { org.springframework.http.client.HttpContext . setAttribute ( HttpClientContext . REQUEST_CONFIG , org.springframework.http.client.RequestConfig ) ; } } if ( this . boolean ) { return new HttpComponentsClientHttpRequest ( org.springframework.http.client.HttpClient , org.springframework.http.client.HttpUriRequest , org.springframework.http.client.HttpContext ) ; } else { return new HttpComponentsStreamingClientHttpRequest ( org.springframework.http.client.HttpClient , org.springframework.http.client.HttpUriRequest , org.springframework.http.client.HttpContext ) ; } }  <METHOD_END>
<METHOD_START> private RequestConfig . RequestConfig.Builder RequestConfig.Builder ( ) { return ( this . org.springframework.http.client.RequestConfig != null ? RequestConfig . copy ( this . org.springframework.http.client.RequestConfig ) : RequestConfig . custom ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.http.client.RequestConfig org.springframework.http.client.RequestConfig ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof Configurable ) { RequestConfig org.springframework.http.client.RequestConfig = ( ( Configurable ) java.lang.Object ) . getConfig ( ) ; return org.springframework.http.client.RequestConfig ( org.springframework.http.client.RequestConfig ) ; } return this . org.springframework.http.client.RequestConfig ; }  <METHOD_END>
<METHOD_START> protected org.springframework.http.client.RequestConfig org.springframework.http.client.RequestConfig ( RequestConfig org.springframework.http.client.RequestConfig ) { if ( this . org.springframework.http.client.RequestConfig == null ) { return org.springframework.http.client.RequestConfig ; } RequestConfig . RequestConfig RequestConfig.Builder = RequestConfig . copy ( org.springframework.http.client.RequestConfig ) ; int int = this . org.springframework.http.client.RequestConfig . getConnectTimeout ( ) ; if ( int >= NUMBER ) { RequestConfig.Builder . setConnectTimeout ( int ) ; } int int = this . org.springframework.http.client.RequestConfig . getConnectionRequestTimeout ( ) ; if ( int >= NUMBER ) { RequestConfig.Builder . setConnectionRequestTimeout ( int ) ; } int int = this . org.springframework.http.client.RequestConfig . getSocketTimeout ( ) ; if ( int >= NUMBER ) { RequestConfig.Builder . setSocketTimeout ( int ) ; } return RequestConfig.Builder . build ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.http.client.HttpUriRequest org.springframework.http.client.HttpUriRequest ( HttpMethod org.springframework.http.client.HttpMethod , java.net.URI java.net.URI ) { switch ( org.springframework.http.client.HttpMethod ) { case GET : return new HttpGet ( java.net.URI ) ; case HEAD : return new HttpHead ( java.net.URI ) ; case POST : return new HttpPost ( java.net.URI ) ; case PUT : return new HttpPut ( java.net.URI ) ; case PATCH : return new HttpPatch ( java.net.URI ) ; case DELETE : return new org.springframework.http.client.HttpComponentsClientHttpRequestFactory.HttpDelete ( java.net.URI ) ; case OPTIONS : return new HttpOptions ( java.net.URI ) ; case TRACE : return new HttpTrace ( java.net.URI ) ; default: throw new java.lang.IllegalArgumentException ( STRING + org.springframework.http.client.HttpMethod ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( HttpUriRequest org.springframework.http.client.HttpUriRequest ) {	}  <METHOD_END>
<METHOD_START> protected org.springframework.http.client.HttpContext org.springframework.http.client.HttpContext ( HttpMethod org.springframework.http.client.HttpMethod , java.net.URI java.net.URI ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( this . org.springframework.http.client.HttpClient instanceof java.io.Closeable ) { ( ( java.io.Closeable ) this . org.springframework.http.client.HttpClient ) . void ( ) ; } }  <METHOD_END>
<METHOD_START> public void ( java.net.URI java.net.URI ) { super(); setURI ( java.net.URI ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
