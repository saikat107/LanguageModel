<METHOD_START> public void ( OkHttpClient org.springframework.http.client.OkHttpClient , java.net.URI java.net.URI , HttpMethod org.springframework.http.client.HttpMethod ) { this . org.springframework.http.client.OkHttpClient = org.springframework.http.client.OkHttpClient ; this . java.net.URI = java.net.URI ; this . org.springframework.http.client.HttpMethod = org.springframework.http.client.HttpMethod ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.HttpMethod org.springframework.http.client.HttpMethod ( ) { return this . org.springframework.http.client.HttpMethod ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { return this . java.net.URI ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.client.ClientHttpResponse org.springframework.http.client.ClientHttpResponse ( HttpHeaders org.springframework.http.client.HttpHeaders , byte [] byte[] ) throws java.io.IOException { Request org.springframework.http.client.Request = OkHttp3ClientHttpRequestFactory . buildRequest ( org.springframework.http.client.HttpHeaders , byte[] , this . java.net.URI , this . org.springframework.http.client.HttpMethod ) ; return new OkHttp3ClientHttpResponse ( this . org.springframework.http.client.OkHttpClient . newCall ( org.springframework.http.client.Request ) . execute ( ) ) ; }  <METHOD_END>
