<METHOD_START> public void ( RestTemplateBuilder org.springframework.boot.test.web.client.RestTemplateBuilder ) { this( org.springframework.boot.test.web.client.RestTemplate ( org.springframework.boot.test.web.client.RestTemplateBuilder ) ); }  <METHOD_END>
<METHOD_START> public void ( org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption ... org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ) { this( null , null , org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String , org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption ... org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ) { this( new RestTemplate ( ) , java.lang.String , java.lang.String , org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ); }  <METHOD_END>
<METHOD_START> public void ( RestTemplate org.springframework.boot.test.web.client.RestTemplate ) { this( org.springframework.boot.test.web.client.RestTemplate , null , null ); }  <METHOD_END>
<METHOD_START> public void ( RestTemplate org.springframework.boot.test.web.client.RestTemplate , java.lang.String java.lang.String , java.lang.String java.lang.String , org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption ... org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ) { Assert . notNull ( org.springframework.boot.test.web.client.RestTemplate , STRING ) ; this . org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] = org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ; if ( ClassUtils . isPresent ( STRING , null ) ) { org.springframework.boot.test.web.client.RestTemplate . setRequestFactory ( new org.springframework.boot.test.web.client.TestRestTemplate.CustomHttpComponentsClientHttpRequestFactory ( org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ) ) ; } void ( org.springframework.boot.test.web.client.RestTemplate , java.lang.String , java.lang.String ) ; org.springframework.boot.test.web.client.RestTemplate . setErrorHandler ( new org.springframework.boot.test.web.client.TestRestTemplate.NoOpResponseErrorHandler ( ) ) ; this . org.springframework.boot.test.web.client.RestTemplate = org.springframework.boot.test.web.client.RestTemplate ; }  <METHOD_END>
<METHOD_START> private static org.springframework.boot.test.web.client.RestTemplate org.springframework.boot.test.web.client.RestTemplate ( RestTemplateBuilder org.springframework.boot.test.web.client.RestTemplateBuilder ) { Assert . notNull ( org.springframework.boot.test.web.client.RestTemplateBuilder , STRING ) ; return org.springframework.boot.test.web.client.RestTemplateBuilder . build ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( RestTemplate org.springframework.boot.test.web.client.RestTemplate , java.lang.String java.lang.String , java.lang.String java.lang.String ) { if ( java.lang.String == null ) { return; } java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> < ClientHttpRequestInterceptor > java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> = org.springframework.boot.test.web.client.RestTemplate . getInterceptors ( ) ; if ( java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> == null ) { java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> = java.util.Collections . java.util.List<java.lang.Object> ( ) ; } java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> = new java.util.ArrayList <> ( java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> ) ; java.util.Iterator<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> < ClientHttpRequestInterceptor > java.util.Iterator<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> = java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> . iterator ( ) ; while ( java.util.Iterator<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> . hasNext ( ) ) { if ( java.util.Iterator<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> . next ( ) instanceof BasicAuthorizationInterceptor ) { java.util.Iterator<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> . remove ( ) ; } } java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> . add ( new BasicAuthorizationInterceptor ( java.lang.String , java.lang.String ) ) ; org.springframework.boot.test.web.client.RestTemplate . setInterceptors ( java.util.List<org.springframework.boot.test.web.client.ClientHttpRequestInterceptor> ) ; }  <METHOD_END>
<METHOD_START> public void void ( UriTemplateHandler org.springframework.boot.test.web.client.UriTemplateHandler ) { this . org.springframework.boot.test.web.client.RestTemplate . setUriTemplateHandler ( org.springframework.boot.test.web.client.UriTemplateHandler ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object ... java.lang.Object[] )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . getForObject ( java.lang.String , java.lang.Class<T> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . getForObject ( java.lang.String , java.lang.Class<T> , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.net.URI java.net.URI , java.lang.Class<T> < T > java.lang.Class<T> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . getForObject ( java.net.URI ( java.net.URI ) , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . getForEntity ( java.lang.String , java.lang.Class<T> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . getForEntity ( java.lang.String , java.lang.Class<T> , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.net.URI java.net.URI , java.lang.Class<T> < T > java.lang.Class<T> )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . getForEntity ( java.net.URI ( java.net.URI ) , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.web.client.HttpHeaders org.springframework.boot.test.web.client.HttpHeaders ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . headForHeaders ( java.lang.String , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.web.client.HttpHeaders org.springframework.boot.test.web.client.HttpHeaders ( java.lang.String java.lang.String , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . headForHeaders ( java.lang.String , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.web.client.HttpHeaders org.springframework.boot.test.web.client.HttpHeaders ( java.net.URI java.net.URI ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . headForHeaders ( java.net.URI ( java.net.URI ) ) ; }  <METHOD_END>
<METHOD_START> public java.net.URI java.net.URI ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Object ... java.lang.Object[] )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForLocation ( java.lang.String , java.lang.Object , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public java.net.URI java.net.URI ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForLocation ( java.lang.String , java.lang.Object , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public java.net.URI java.net.URI ( java.net.URI java.net.URI , java.lang.Object java.lang.Object ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForLocation ( java.net.URI ( java.net.URI ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForObject ( java.lang.String , java.lang.Object , java.lang.Class<T> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForObject ( java.lang.String , java.lang.Object , java.lang.Class<T> , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.net.URI java.net.URI , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForObject ( java.net.URI ( java.net.URI ) , java.lang.Object , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForEntity ( java.lang.String , java.lang.Object , java.lang.Class<T> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> )					throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForEntity ( java.lang.String , java.lang.Object , java.lang.Class<T> , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.net.URI java.net.URI , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . postForEntity ( java.net.URI ( java.net.URI ) , java.lang.Object , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Object ... java.lang.Object[] )			throws org.springframework.boot.test.web.client.RestClientException { this . org.springframework.boot.test.web.client.RestTemplate . put ( java.lang.String , java.lang.Object , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> )			throws org.springframework.boot.test.web.client.RestClientException { this . org.springframework.boot.test.web.client.RestTemplate . put ( java.lang.String , java.lang.Object , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.net.URI java.net.URI , java.lang.Object java.lang.Object ) throws org.springframework.boot.test.web.client.RestClientException { this . org.springframework.boot.test.web.client.RestTemplate . put ( java.net.URI ( java.net.URI ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . patchForObject ( java.lang.String , java.lang.Object , java.lang.Class<T> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . patchForObject ( java.lang.String , java.lang.Object , java.lang.Class<T> , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.net.URI java.net.URI , java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . patchForObject ( java.net.URI ( java.net.URI ) , java.lang.Object , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) throws org.springframework.boot.test.web.client.RestClientException { this . org.springframework.boot.test.web.client.RestTemplate . delete ( java.lang.String , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> )			throws org.springframework.boot.test.web.client.RestClientException { this . org.springframework.boot.test.web.client.RestTemplate . delete ( java.lang.String , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.net.URI java.net.URI ) throws org.springframework.boot.test.web.client.RestClientException { this . org.springframework.boot.test.web.client.RestTemplate . delete ( java.net.URI ( java.net.URI ) ) ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.boot.test.web.client.HttpMethod> < HttpMethod > java.util.Set<org.springframework.boot.test.web.client.HttpMethod> ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . optionsForAllow ( java.lang.String , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.boot.test.web.client.HttpMethod> < HttpMethod > java.util.Set<org.springframework.boot.test.web.client.HttpMethod> ( java.lang.String java.lang.String , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> )			throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . optionsForAllow ( java.lang.String , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.boot.test.web.client.HttpMethod> < HttpMethod > java.util.Set<org.springframework.boot.test.web.client.HttpMethod> ( java.net.URI java.net.URI ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . optionsForAllow ( java.net.URI ( java.net.URI ) ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.lang.String java.lang.String , HttpMethod org.springframework.boot.test.web.client.HttpMethod , HttpEntity < ? > org.springframework.boot.test.web.client.HttpEntity<?> , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object ... java.lang.Object[] )					throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . exchange ( java.lang.String , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.HttpEntity<> , java.lang.Class<T> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.lang.String java.lang.String , HttpMethod org.springframework.boot.test.web.client.HttpMethod , HttpEntity < ? > org.springframework.boot.test.web.client.HttpEntity<?> , java.lang.Class<T> < T > java.lang.Class<T> , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . exchange ( java.lang.String , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.HttpEntity<> , java.lang.Class<T> , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.net.URI java.net.URI , HttpMethod org.springframework.boot.test.web.client.HttpMethod , HttpEntity < ? > org.springframework.boot.test.web.client.HttpEntity<?> , java.lang.Class<T> < T > java.lang.Class<T> )					throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . exchange ( java.net.URI ( java.net.URI ) , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.HttpEntity<> , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.lang.String java.lang.String , HttpMethod org.springframework.boot.test.web.client.HttpMethod , HttpEntity < ? > org.springframework.boot.test.web.client.HttpEntity<?> , ParameterizedTypeReference < T > org.springframework.boot.test.web.client.ParameterizedTypeReference<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . exchange ( java.lang.String , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.HttpEntity<> , org.springframework.boot.test.web.client.ParameterizedTypeReference<T> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.lang.String java.lang.String , HttpMethod org.springframework.boot.test.web.client.HttpMethod , HttpEntity < ? > org.springframework.boot.test.web.client.HttpEntity<?> , ParameterizedTypeReference < T > org.springframework.boot.test.web.client.ParameterizedTypeReference<T> , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . exchange ( java.lang.String , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.HttpEntity<> , org.springframework.boot.test.web.client.ParameterizedTypeReference<T> , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( java.net.URI java.net.URI , HttpMethod org.springframework.boot.test.web.client.HttpMethod , HttpEntity < ? > org.springframework.boot.test.web.client.HttpEntity<?> , ParameterizedTypeReference < T > org.springframework.boot.test.web.client.ParameterizedTypeReference<T> )					throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . exchange ( java.net.URI ( java.net.URI ) , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.HttpEntity<> , org.springframework.boot.test.web.client.ParameterizedTypeReference<T> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( RequestEntity < ? > org.springframework.boot.test.web.client.RequestEntity<?> , java.lang.Class<T> < T > java.lang.Class<T> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . exchange ( org.springframework.boot.test.web.client.RequestEntity<?> ( org.springframework.boot.test.web.client.RequestEntity<> ) , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public < T > org.springframework.boot.test.web.client.ResponseEntity<T> < T > org.springframework.boot.test.web.client.ResponseEntity<T> ( RequestEntity < ? > org.springframework.boot.test.web.client.RequestEntity<?> , ParameterizedTypeReference < T > org.springframework.boot.test.web.client.ParameterizedTypeReference<T> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . exchange ( org.springframework.boot.test.web.client.RequestEntity<?> ( org.springframework.boot.test.web.client.RequestEntity<> ) , org.springframework.boot.test.web.client.ParameterizedTypeReference<T> ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , HttpMethod org.springframework.boot.test.web.client.HttpMethod , RequestCallback org.springframework.boot.test.web.client.RequestCallback , ResponseExtractor < T > org.springframework.boot.test.web.client.ResponseExtractor<T> , java.lang.Object ... java.lang.Object[] )					throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . execute ( java.lang.String , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.RequestCallback , org.springframework.boot.test.web.client.ResponseExtractor<T> , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.lang.String java.lang.String , HttpMethod org.springframework.boot.test.web.client.HttpMethod , RequestCallback org.springframework.boot.test.web.client.RequestCallback , ResponseExtractor < T > org.springframework.boot.test.web.client.ResponseExtractor<T> , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> )					throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . execute ( java.lang.String , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.RequestCallback , org.springframework.boot.test.web.client.ResponseExtractor<T> , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public < T > T T ( java.net.URI java.net.URI , HttpMethod org.springframework.boot.test.web.client.HttpMethod , RequestCallback org.springframework.boot.test.web.client.RequestCallback , ResponseExtractor < T > org.springframework.boot.test.web.client.ResponseExtractor<T> ) throws org.springframework.boot.test.web.client.RestClientException { return this . org.springframework.boot.test.web.client.RestTemplate . execute ( java.net.URI ( java.net.URI ) , org.springframework.boot.test.web.client.HttpMethod , org.springframework.boot.test.web.client.RequestCallback , org.springframework.boot.test.web.client.ResponseExtractor<T> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.web.client.RestTemplate org.springframework.boot.test.web.client.RestTemplate ( ) { return this . org.springframework.boot.test.web.client.RestTemplate ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.web.client.TestRestTemplate org.springframework.boot.test.web.client.TestRestTemplate ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { RestTemplate org.springframework.boot.test.web.client.RestTemplate = new RestTemplate ( ) ; org.springframework.boot.test.web.client.RestTemplate . setMessageConverters ( org.springframework.boot.test.web.client.RestTemplate ( ) . getMessageConverters ( ) ) ; org.springframework.boot.test.web.client.RestTemplate . setInterceptors ( org.springframework.boot.test.web.client.RestTemplate ( ) . getInterceptors ( ) ) ; org.springframework.boot.test.web.client.RestTemplate . setRequestFactory ( org.springframework.boot.test.web.client.RestTemplate ( ) . getRequestFactory ( ) ) ; org.springframework.boot.test.web.client.RestTemplate . setUriTemplateHandler ( org.springframework.boot.test.web.client.RestTemplate ( ) . getUriTemplateHandler ( ) ) ; org.springframework.boot.test.web.client.TestRestTemplate org.springframework.boot.test.web.client.TestRestTemplate = new org.springframework.boot.test.web.client.TestRestTemplate ( org.springframework.boot.test.web.client.RestTemplate , java.lang.String , java.lang.String , this . org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ) ; org.springframework.boot.test.web.client.TestRestTemplate . org.springframework.boot.test.web.client.RestTemplate ( ) . setErrorHandler ( org.springframework.boot.test.web.client.RestTemplate ( ) . getErrorHandler ( ) ) ; return org.springframework.boot.test.web.client.TestRestTemplate ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) private org.springframework.boot.test.web.client.RequestEntity<?> < ? > org.springframework.boot.test.web.client.RequestEntity<?> ( RequestEntity < ? > org.springframework.boot.test.web.client.RequestEntity<?> ) { return new RequestEntity ( org.springframework.boot.test.web.client.RequestEntity<> . getBody ( ) , org.springframework.boot.test.web.client.RequestEntity<> . getHeaders ( ) , org.springframework.boot.test.web.client.RequestEntity<> . getMethod ( ) , java.net.URI ( org.springframework.boot.test.web.client.RequestEntity<> . getUrl ( ) ) , org.springframework.boot.test.web.client.RequestEntity<> . getType ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.net.URI java.net.URI ( java.net.URI java.net.URI ) { UriTemplateHandler org.springframework.boot.test.web.client.UriTemplateHandler = this . org.springframework.boot.test.web.client.RestTemplate . getUriTemplateHandler ( ) ; if ( ( org.springframework.boot.test.web.client.UriTemplateHandler instanceof RootUriTemplateHandler ) && java.net.URI . java.lang.String ( ) . boolean ( STRING ) ) { return java.net.URI . java.net.URI ( ( ( RootUriTemplateHandler ) org.springframework.boot.test.web.client.UriTemplateHandler ) . getRootUri ( ) + java.net.URI . java.lang.String ( ) ) ; } return java.net.URI ; }  <METHOD_END>
<METHOD_START> public void ( org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption [] org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ) { java.util.Set<org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption> < org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption > java.util.Set<org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption> = new java.util.HashSet<org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption> <> ( java.util.Arrays . java.util.List<org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption> ( org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption[] ) ) ; this . java.lang.String = ( java.util.Set<org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption> . boolean ( org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption . org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption ) ? CookieSpecs . STANDARD : CookieSpecs . IGNORE_COOKIES ) ; this . boolean = java.util.Set<org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption> . boolean ( org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption . org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption ) ; if ( java.util.Set<org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption> . boolean ( org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption . org.springframework.boot.test.web.client.TestRestTemplate.HttpClientOption ) ) { setHttpClient ( org.springframework.boot.test.web.client.HttpClient ( ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.test.web.client.HttpClient org.springframework.boot.test.web.client.HttpClient ( ) { try { SSLConnectionSocketFactory org.springframework.boot.test.web.client.SSLConnectionSocketFactory = new SSLConnectionSocketFactory ( new SSLContextBuilder ( ) . loadTrustMaterial ( null , new TrustSelfSignedStrategy ( ) ) . build ( ) ) ; return HttpClients . custom ( ) . setSSLSocketFactory ( org.springframework.boot.test.web.client.SSLConnectionSocketFactory ) . build ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.test.web.client.HttpContext org.springframework.boot.test.web.client.HttpContext ( HttpMethod org.springframework.boot.test.web.client.HttpMethod , java.net.URI java.net.URI ) { HttpClientContext org.springframework.boot.test.web.client.HttpClientContext = HttpClientContext . create ( ) ; org.springframework.boot.test.web.client.HttpClientContext . setRequestConfig ( org.springframework.boot.test.web.client.RequestConfig ( ) ) ; return org.springframework.boot.test.web.client.HttpClientContext ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.test.web.client.RequestConfig org.springframework.boot.test.web.client.RequestConfig ( ) { Builder org.springframework.boot.test.web.client.Builder = RequestConfig . custom ( ) . setCookieSpec ( this . java.lang.String ) . setAuthenticationEnabled ( false ) . setRedirectsEnabled ( this . boolean ) ; return org.springframework.boot.test.web.client.Builder . build ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpResponse org.springframework.boot.test.web.client.ClientHttpResponse ) throws java.io.IOException {		}  <METHOD_END>