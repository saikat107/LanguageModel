<METHOD_START> @ Test public void void ( ) java.net.URISyntaxException { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.net.URI java.net.URI = new java.net.URI ( STRING ) ; java.lang.Integer java.lang.Integer = NUMBER ; RequestEntity < java.lang.Object > org.springframework.http.RequestEntity<java.lang.Object> = RequestEntity . method ( HttpMethod . GET , java.net.URI ) . header ( java.lang.String , java.lang.String ) . body ( java.lang.Integer ) ; assertNotNull ( org.springframework.http.RequestEntity<java.lang.Object> ) ; assertEquals ( HttpMethod . GET , org.springframework.http.RequestEntity<java.lang.Object> . getMethod ( ) ) ; assertTrue ( org.springframework.http.RequestEntity<java.lang.Object> . getHeaders ( ) . containsKey ( java.lang.String ) ) ; assertEquals ( java.lang.String , org.springframework.http.RequestEntity<java.lang.Object> . getHeaders ( ) . getFirst ( java.lang.String ) ) ; assertEquals ( java.lang.Integer , org.springframework.http.RequestEntity<java.lang.Object> . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.net.URISyntaxException { java.net.URI java.net.URI = new UriTemplate ( STRING ) . expand ( STRING ) ; RequestEntity . get ( java.net.URI ) . accept ( MediaType . TEXT_PLAIN ) . build ( ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.net.URI java.net.URI = new java.net.URI ( STRING ) ; java.net.URI = new UriTemplate ( java.lang.String ) . expand ( java.lang.String , java.lang.String ) ; RequestEntity < ? > org.springframework.http.RequestEntity<?> = RequestEntity . get ( java.net.URI ) . build ( ) ; assertEquals ( java.net.URI , org.springframework.http.RequestEntity<> . getUrl ( ) ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( NUMBER ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , java.lang.String ) ; java.net.URI = new UriTemplate ( java.lang.String ) . expand ( java.util.Map<java.lang.String,java.lang.String> ) ; org.springframework.http.RequestEntity<?> = RequestEntity . get ( java.net.URI ) . build ( ) ; assertEquals ( java.net.URI , org.springframework.http.RequestEntity<> . getUrl ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RequestEntity < java.lang.Void > org.springframework.http.RequestEntity<java.lang.Void> = RequestEntity . get ( java.net.URI . java.net.URI ( STRING ) ) . accept ( MediaType . IMAGE_GIF , MediaType . IMAGE_JPEG , MediaType . IMAGE_PNG ) . build ( ) ; assertNotNull ( org.springframework.http.RequestEntity<java.lang.Void> ) ; assertEquals ( HttpMethod . GET , org.springframework.http.RequestEntity<java.lang.Void> . getMethod ( ) ) ; assertTrue ( org.springframework.http.RequestEntity<java.lang.Void> . getHeaders ( ) . containsKey ( STRING ) ) ; assertEquals ( STRING , org.springframework.http.RequestEntity<java.lang.Void> . getHeaders ( ) . getFirst ( STRING ) ) ; assertNull ( org.springframework.http.RequestEntity<java.lang.Void> . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.net.URISyntaxException { MediaType org.springframework.http.MediaType = MediaType . TEXT_PLAIN ; long long = NUMBER ; java.lang.String java.lang.String = STRING ; long long = NUMBER ; MediaType org.springframework.http.MediaType = MediaType . TEXT_PLAIN ; RequestEntity < java.lang.Void > org.springframework.http.RequestEntity<java.lang.Void> = RequestEntity . post ( new java.net.URI ( STRING ) ) . accept ( org.springframework.http.MediaType ) . acceptCharset ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) . ifModifiedSince ( long ) . ifNoneMatch ( java.lang.String ) . contentLength ( long ) . contentType ( org.springframework.http.MediaType ) . build ( ) ; assertNotNull ( org.springframework.http.RequestEntity<java.lang.Void> ) ; assertEquals ( HttpMethod . POST , org.springframework.http.RequestEntity<java.lang.Void> . getMethod ( ) ) ; assertEquals ( new java.net.URI ( STRING ) , org.springframework.http.RequestEntity<java.lang.Void> . getUrl ( ) ) ; HttpHeaders org.springframework.http.HttpHeaders = org.springframework.http.RequestEntity<java.lang.Void> . getHeaders ( ) ; assertEquals ( STRING , org.springframework.http.HttpHeaders . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.http.HttpHeaders . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.http.HttpHeaders . getFirst ( STRING ) ) ; assertEquals ( java.lang.String , org.springframework.http.HttpHeaders . getFirst ( STRING ) ) ; assertEquals ( java.lang.String . java.lang.String ( long ) , org.springframework.http.HttpHeaders . getFirst ( STRING ) ) ; assertEquals ( org.springframework.http.MediaType . toString ( ) , org.springframework.http.HttpHeaders . getFirst ( STRING ) ) ; assertNull ( org.springframework.http.RequestEntity<java.lang.Void> . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.net.URISyntaxException { java.net.URI java.net.URI = new java.net.URI ( STRING ) ; RequestEntity < ? > org.springframework.http.RequestEntity<?> = RequestEntity . get ( java.net.URI ) . build ( ) ; assertEquals ( HttpMethod . GET , org.springframework.http.RequestEntity<> . getMethod ( ) ) ; org.springframework.http.RequestEntity<?> = RequestEntity . post ( java.net.URI ) . build ( ) ; assertEquals ( HttpMethod . POST , org.springframework.http.RequestEntity<> . getMethod ( ) ) ; org.springframework.http.RequestEntity<?> = RequestEntity . head ( java.net.URI ) . build ( ) ; assertEquals ( HttpMethod . HEAD , org.springframework.http.RequestEntity<> . getMethod ( ) ) ; org.springframework.http.RequestEntity<?> = RequestEntity . options ( java.net.URI ) . build ( ) ; assertEquals ( HttpMethod . OPTIONS , org.springframework.http.RequestEntity<> . getMethod ( ) ) ; org.springframework.http.RequestEntity<?> = RequestEntity . put ( java.net.URI ) . build ( ) ; assertEquals ( HttpMethod . PUT , org.springframework.http.RequestEntity<> . getMethod ( ) ) ; org.springframework.http.RequestEntity<?> = RequestEntity . patch ( java.net.URI ) . build ( ) ; assertEquals ( HttpMethod . PATCH , org.springframework.http.RequestEntity<> . getMethod ( ) ) ; org.springframework.http.RequestEntity<?> = RequestEntity . delete ( java.net.URI ) . build ( ) ; assertEquals ( HttpMethod . DELETE , org.springframework.http.RequestEntity<> . getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.net.URISyntaxException { java.net.URI java.net.URI = new java.net.URI ( STRING ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ; ParameterizedTypeReference < ? > org.springframework.http.ParameterizedTypeReference<?> = new ParameterizedTypeReference < java.util.List<java.lang.String> < java.lang.String > > ( ) {} ; RequestEntity < ? > org.springframework.http.RequestEntity<?> = RequestEntity . post ( java.net.URI ) . body ( java.util.List<java.lang.String> , org.springframework.http.ParameterizedTypeReference<> . getType ( ) ) ; assertEquals ( org.springframework.http.ParameterizedTypeReference<> . getType ( ) , org.springframework.http.RequestEntity<> . getType ( ) ) ; }  <METHOD_END>