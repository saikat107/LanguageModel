<METHOD_START> void ( HttpClient org.springframework.http.client.HttpClient , HttpUriRequest org.springframework.http.client.HttpUriRequest , HttpContext org.springframework.http.client.HttpContext ) { this . org.springframework.http.client.HttpClient = org.springframework.http.client.HttpClient ; this . org.springframework.http.client.HttpUriRequest = org.springframework.http.client.HttpUriRequest ; this . org.springframework.http.client.HttpContext = org.springframework.http.client.HttpContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.HttpMethod org.springframework.http.client.HttpMethod ( ) { return HttpMethod . resolve ( this . org.springframework.http.client.HttpUriRequest . getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { return this . org.springframework.http.client.HttpUriRequest . getURI ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Body org.springframework.http.client.Body ) { assertNotExecuted ( ) ; this . org.springframework.http.client.Body = org.springframework.http.client.Body ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.io.OutputStream java.io.OutputStream ( HttpHeaders org.springframework.http.client.HttpHeaders ) throws java.io.IOException { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.client.ClientHttpResponse org.springframework.http.client.ClientHttpResponse ( HttpHeaders org.springframework.http.client.HttpHeaders ) throws java.io.IOException { HttpComponentsClientHttpRequest . addHeaders ( this . org.springframework.http.client.HttpUriRequest , org.springframework.http.client.HttpHeaders ) ; if ( this . org.springframework.http.client.HttpUriRequest instanceof HttpEntityEnclosingRequest && org.springframework.http.client.Body != null ) { HttpEntityEnclosingRequest org.springframework.http.client.HttpEntityEnclosingRequest = ( HttpEntityEnclosingRequest ) this . org.springframework.http.client.HttpUriRequest ; HttpEntity org.springframework.http.client.HttpEntity = new org.springframework.http.client.HttpComponentsStreamingClientHttpRequest.StreamingHttpEntity ( getHeaders ( ) , org.springframework.http.client.Body ) ; org.springframework.http.client.HttpEntityEnclosingRequest . setEntity ( org.springframework.http.client.HttpEntity ) ; } HttpResponse org.springframework.http.client.HttpResponse = this . org.springframework.http.client.HttpClient . execute ( this . org.springframework.http.client.HttpUriRequest , this . org.springframework.http.client.HttpContext ) ; return new HttpComponentsClientHttpResponse ( org.springframework.http.client.HttpResponse ) ; }  <METHOD_END>
<METHOD_START> public void ( HttpHeaders org.springframework.http.client.HttpHeaders , StreamingHttpOutputMessage . StreamingHttpOutputMessage StreamingHttpOutputMessage.Body ) { this . org.springframework.http.client.HttpHeaders = org.springframework.http.client.HttpHeaders ; this . StreamingHttpOutputMessage.Body = StreamingHttpOutputMessage.Body ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return this . org.springframework.http.client.HttpHeaders . getContentLength ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.Header org.springframework.http.client.Header ( ) { MediaType org.springframework.http.client.MediaType = this . org.springframework.http.client.HttpHeaders . getContentType ( ) ; return ( org.springframework.http.client.MediaType != null ? new BasicHeader ( STRING , org.springframework.http.client.MediaType . toString ( ) ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.Header org.springframework.http.client.Header ( ) { java.lang.String java.lang.String = this . org.springframework.http.client.HttpHeaders . getFirst ( STRING ) ; return ( java.lang.String != null ? new BasicHeader ( STRING , java.lang.String ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException , java.lang.IllegalStateException { throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.OutputStream java.io.OutputStream ) throws java.io.IOException { this . StreamingHttpOutputMessage.Body . writeTo ( java.io.OutputStream ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.Deprecated public void void ( ) java.io.IOException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>