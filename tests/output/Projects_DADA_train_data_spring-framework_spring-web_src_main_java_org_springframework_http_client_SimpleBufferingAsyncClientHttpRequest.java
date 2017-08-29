<METHOD_START> void ( java.net.HttpURLConnection java.net.HttpURLConnection , boolean boolean , AsyncListenableTaskExecutor org.springframework.http.client.AsyncListenableTaskExecutor ) { this . java.net.HttpURLConnection = java.net.HttpURLConnection ; this . boolean = boolean ; this . org.springframework.http.client.AsyncListenableTaskExecutor = org.springframework.http.client.AsyncListenableTaskExecutor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.HttpMethod org.springframework.http.client.HttpMethod ( ) { return HttpMethod . resolve ( this . java.net.HttpURLConnection . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { try { return this . java.net.HttpURLConnection . java.net.URL ( ) . java.net.URI ( ) ; } catch ( java.net.URISyntaxException java.net.URISyntaxException ) { throw new java.lang.IllegalStateException ( STRING + java.net.URISyntaxException . java.lang.String ( ) , java.net.URISyntaxException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.client.ListenableFuture<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > org.springframework.http.client.ListenableFuture<org.springframework.http.client.ClientHttpResponse> ( final HttpHeaders org.springframework.http.client.HttpHeaders , final byte [] byte[] ) throws java.io.IOException { return this . org.springframework.http.client.AsyncListenableTaskExecutor . submitListenable ( new java.util.concurrent.Callable<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > ( ) { @ java.lang.Override public org.springframework.http.client.ClientHttpResponse org.springframework.http.client.ClientHttpResponse ( ) java.lang.Exception { SimpleBufferingClientHttpRequest . addHeaders ( java.net.HttpURLConnection , org.springframework.http.client.HttpHeaders ) ; if ( HttpMethod . DELETE == org.springframework.http.client.HttpMethod ( ) && byte[] . int == NUMBER ) { java.net.HttpURLConnection . void ( false ) ; } if ( java.net.HttpURLConnection . boolean ( ) && boolean ) { java.net.HttpURLConnection . void ( byte[] . int ) ; } java.net.HttpURLConnection . void ( ) ; if ( java.net.HttpURLConnection . boolean ( ) ) { FileCopyUtils . copy ( byte[] , java.net.HttpURLConnection . java.io.OutputStream ( ) ) ; } else { java.net.HttpURLConnection . int ( ) ; } return new SimpleClientHttpResponse ( java.net.HttpURLConnection ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.ClientHttpResponse org.springframework.http.client.ClientHttpResponse ( ) java.lang.Exception { SimpleBufferingClientHttpRequest . addHeaders ( java.net.HttpURLConnection , org.springframework.http.client.HttpHeaders ) ; if ( HttpMethod . DELETE == org.springframework.http.client.HttpMethod ( ) && byte[] . int == NUMBER ) { java.net.HttpURLConnection . void ( false ) ; } if ( java.net.HttpURLConnection . boolean ( ) && boolean ) { java.net.HttpURLConnection . void ( byte[] . int ) ; } java.net.HttpURLConnection . void ( ) ; if ( java.net.HttpURLConnection . boolean ( ) ) { FileCopyUtils . copy ( byte[] , java.net.HttpURLConnection . java.io.OutputStream ( ) ) ; } else { java.net.HttpURLConnection . int ( ) ; } return new SimpleClientHttpResponse ( java.net.HttpURLConnection ) ; }  <METHOD_END>