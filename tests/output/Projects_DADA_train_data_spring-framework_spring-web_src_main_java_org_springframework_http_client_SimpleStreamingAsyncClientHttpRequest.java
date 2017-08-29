<METHOD_START> void ( java.net.HttpURLConnection java.net.HttpURLConnection , int int , boolean boolean , AsyncListenableTaskExecutor org.springframework.http.client.AsyncListenableTaskExecutor ) { this . java.net.HttpURLConnection = java.net.HttpURLConnection ; this . int = int ; this . boolean = boolean ; this . org.springframework.http.client.AsyncListenableTaskExecutor = org.springframework.http.client.AsyncListenableTaskExecutor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.HttpMethod org.springframework.http.client.HttpMethod ( ) { return HttpMethod . resolve ( this . java.net.HttpURLConnection . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { try { return this . java.net.HttpURLConnection . java.net.URL ( ) . java.net.URI ( ) ; } catch ( java.net.URISyntaxException java.net.URISyntaxException ) { throw new java.lang.IllegalStateException ( STRING + java.net.URISyntaxException . java.lang.String ( ) , java.net.URISyntaxException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.io.OutputStream java.io.OutputStream ( HttpHeaders org.springframework.http.client.HttpHeaders ) throws java.io.IOException { if ( this . java.io.OutputStream == null ) { if ( this . boolean ) { int int = ( int ) org.springframework.http.client.HttpHeaders . getContentLength ( ) ; if ( int >= NUMBER ) { this . java.net.HttpURLConnection . void ( int ) ; } else { this . java.net.HttpURLConnection . void ( this . int ) ; } } SimpleBufferingClientHttpRequest . addHeaders ( this . java.net.HttpURLConnection , org.springframework.http.client.HttpHeaders ) ; this . java.net.HttpURLConnection . void ( ) ; this . java.io.OutputStream = this . java.net.HttpURLConnection . java.io.OutputStream ( ) ; } return StreamUtils . nonClosing ( this . java.io.OutputStream ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.client.ListenableFuture<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > org.springframework.http.client.ListenableFuture<org.springframework.http.client.ClientHttpResponse> ( final HttpHeaders org.springframework.http.client.HttpHeaders ) throws java.io.IOException { return this . org.springframework.http.client.AsyncListenableTaskExecutor . submitListenable ( new java.util.concurrent.Callable<org.springframework.http.client.ClientHttpResponse> < ClientHttpResponse > ( ) { @ java.lang.Override public org.springframework.http.client.ClientHttpResponse org.springframework.http.client.ClientHttpResponse ( ) java.lang.Exception { try { if ( java.io.OutputStream != null ) { java.io.OutputStream . void ( ) ; } else { SimpleBufferingClientHttpRequest . addHeaders ( java.net.HttpURLConnection , org.springframework.http.client.HttpHeaders ) ; java.net.HttpURLConnection . void ( ) ; java.net.HttpURLConnection . int ( ) ; } } catch ( java.io.IOException java.io.IOException ) { } return new SimpleClientHttpResponse ( java.net.HttpURLConnection ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.ClientHttpResponse org.springframework.http.client.ClientHttpResponse ( ) java.lang.Exception { try { if ( java.io.OutputStream != null ) { java.io.OutputStream . void ( ) ; } else { SimpleBufferingClientHttpRequest . addHeaders ( java.net.HttpURLConnection , org.springframework.http.client.HttpHeaders ) ; java.net.HttpURLConnection . void ( ) ; java.net.HttpURLConnection . int ( ) ; } } catch ( java.io.IOException java.io.IOException ) { } return new SimpleClientHttpResponse ( java.net.HttpURLConnection ) ; }  <METHOD_END>
