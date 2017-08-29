<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; RestTemplateCustomizer [] org.springframework.boot.web.client.RestTemplateCustomizer[] = null ; new RestTemplateBuilder ( org.springframework.boot.web.client.RestTemplateCustomizer[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplateCustomizer org.springframework.boot.web.client.RestTemplateCustomizer = mock ( RestTemplateCustomizer .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = new RestTemplateBuilder ( org.springframework.boot.web.client.RestTemplateCustomizer ) . build ( ) ; verify ( org.springframework.boot.web.client.RestTemplateCustomizer ) . customize ( org.springframework.boot.web.client.RestTemplate ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getRequestFactory ( ) ) . isInstanceOf ( HttpComponentsClientHttpRequestFactory .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . detectRequestFactory ( false ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getRequestFactory ( ) ) . isInstanceOf ( SimpleClientHttpRequestFactory .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . rootUri ( STRING ) . build ( ) ; MockRestServiceServer org.springframework.boot.web.client.MockRestServiceServer = MockRestServiceServer . bindTo ( org.springframework.boot.web.client.RestTemplate ) . build ( ) ; org.springframework.boot.web.client.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andRespond ( withSuccess ( ) ) ; org.springframework.boot.web.client.RestTemplate . getForEntity ( STRING , java.lang.String .class ) ; org.springframework.boot.web.client.MockRestServiceServer . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { UriTemplateHandler org.springframework.boot.web.client.UriTemplateHandler = mock ( UriTemplateHandler .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . uriTemplateHandler ( org.springframework.boot.web.client.UriTemplateHandler ) . rootUri ( STRING ) . build ( ) ; UriTemplateHandler org.springframework.boot.web.client.UriTemplateHandler = org.springframework.boot.web.client.RestTemplate . getUriTemplateHandler ( ) ; org.springframework.boot.web.client.UriTemplateHandler . expand ( STRING ) ; assertThat ( org.springframework.boot.web.client.UriTemplateHandler ) . isInstanceOf ( RootUriTemplateHandler .class ) ; verify ( org.springframework.boot.web.client.UriTemplateHandler ) . expand ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . messageConverters ( ( org.springframework.boot.web.client.HttpMessageConverter<?> < ? > [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . messageConverters ( ( java.util.Set<org.springframework.boot.web.client.HttpMessageConverter<?>> < HttpMessageConverter < ? > > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . messageConverters ( this . org.springframework.boot.web.client.HttpMessageConverter<java.lang.Object> ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getMessageConverters ( ) ) . containsOnly ( this . org.springframework.boot.web.client.HttpMessageConverter<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . messageConverters ( new ResourceHttpMessageConverter ( ) ) . messageConverters ( java.util.Collections . java.util.Set ( this . org.springframework.boot.web.client.HttpMessageConverter<java.lang.Object> ) ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getMessageConverters ( ) ) . containsOnly ( this . org.springframework.boot.web.client.HttpMessageConverter<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . additionalMessageConverters ( ( org.springframework.boot.web.client.HttpMessageConverter<?> < ? > [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . additionalMessageConverters ( ( java.util.Set<org.springframework.boot.web.client.HttpMessageConverter<?>> < HttpMessageConverter < ? > > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpMessageConverter < ? > org.springframework.boot.web.client.HttpMessageConverter<?> = new ResourceHttpMessageConverter ( ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . messageConverters ( org.springframework.boot.web.client.HttpMessageConverter<> ) . additionalMessageConverters ( this . org.springframework.boot.web.client.HttpMessageConverter<java.lang.Object> ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getMessageConverters ( ) ) . containsOnly ( org.springframework.boot.web.client.HttpMessageConverter<> , this . org.springframework.boot.web.client.HttpMessageConverter<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = new RestTemplate ( java.util.Collections .< HttpMessageConverter < ? > > java.util.List<org.springframework.boot.web.client.HttpMessageConverter<?>> ( new StringHttpMessageConverter ( ) ) ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . defaultMessageConverters ( ) . configure ( org.springframework.boot.web.client.RestTemplate ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getMessageConverters ( ) ) . hasSameSizeAs ( new RestTemplate ( ) . getMessageConverters ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = new RestTemplate ( java.util.Collections .< HttpMessageConverter < ? > > java.util.List<org.springframework.boot.web.client.HttpMessageConverter<?>> ( new StringHttpMessageConverter ( ) ) ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . additionalMessageConverters ( this . org.springframework.boot.web.client.HttpMessageConverter<java.lang.Object> ) . defaultMessageConverters ( ) . configure ( org.springframework.boot.web.client.RestTemplate ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getMessageConverters ( ) ) . hasSameSizeAs ( new RestTemplate ( ) . getMessageConverters ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . interceptors ( ( ClientHttpRequestInterceptor [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . interceptors ( ( java.util.Set<org.springframework.boot.web.client.ClientHttpRequestInterceptor> < ClientHttpRequestInterceptor > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . interceptors ( this . org.springframework.boot.web.client.ClientHttpRequestInterceptor ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getInterceptors ( ) ) . containsOnly ( this . org.springframework.boot.web.client.ClientHttpRequestInterceptor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . interceptors ( mock ( ClientHttpRequestInterceptor .class ) ) . interceptors ( java.util.Collections . java.util.Set ( this . org.springframework.boot.web.client.ClientHttpRequestInterceptor ) ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getInterceptors ( ) ) . containsOnly ( this . org.springframework.boot.web.client.ClientHttpRequestInterceptor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . additionalInterceptors ( ( ClientHttpRequestInterceptor [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . additionalInterceptors ( ( java.util.Set<org.springframework.boot.web.client.ClientHttpRequestInterceptor> < ClientHttpRequestInterceptor > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClientHttpRequestInterceptor org.springframework.boot.web.client.ClientHttpRequestInterceptor = mock ( ClientHttpRequestInterceptor .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . interceptors ( org.springframework.boot.web.client.ClientHttpRequestInterceptor ) . additionalInterceptors ( this . org.springframework.boot.web.client.ClientHttpRequestInterceptor ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getInterceptors ( ) ) . containsOnly ( org.springframework.boot.web.client.ClientHttpRequestInterceptor , this . org.springframework.boot.web.client.ClientHttpRequestInterceptor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( ( java.lang.Class<org.springframework.boot.web.client.ClientHttpRequestFactory> < ClientHttpRequestFactory > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( SimpleClientHttpRequestFactory .class ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getRequestFactory ( ) ) . isInstanceOf ( SimpleClientHttpRequestFactory .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( org.springframework.boot.web.client.RestTemplateBuilderTests.TestClientHttpRequestFactory .class ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getRequestFactory ( ) ) . isInstanceOf ( org.springframework.boot.web.client.RestTemplateBuilderTests.TestClientHttpRequestFactory .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( ( ClientHttpRequestFactory ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = mock ( ClientHttpRequestFactory .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( org.springframework.boot.web.client.ClientHttpRequestFactory ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getRequestFactory ( ) ) . isSameAs ( org.springframework.boot.web.client.ClientHttpRequestFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . uriTemplateHandler ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { UriTemplateHandler org.springframework.boot.web.client.UriTemplateHandler = mock ( UriTemplateHandler .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . uriTemplateHandler ( org.springframework.boot.web.client.UriTemplateHandler ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getUriTemplateHandler ( ) ) . isSameAs ( org.springframework.boot.web.client.UriTemplateHandler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . errorHandler ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseErrorHandler org.springframework.boot.web.client.ResponseErrorHandler = mock ( ResponseErrorHandler .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . errorHandler ( org.springframework.boot.web.client.ResponseErrorHandler ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getErrorHandler ( ) ) . isSameAs ( org.springframework.boot.web.client.ResponseErrorHandler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . basicAuthorization ( STRING , STRING ) . build ( ) ; ClientHttpRequestInterceptor org.springframework.boot.web.client.ClientHttpRequestInterceptor = org.springframework.boot.web.client.RestTemplate . getInterceptors ( ) . get ( NUMBER ) ; assertThat ( org.springframework.boot.web.client.ClientHttpRequestInterceptor ) . isInstanceOf ( BasicAuthorizationInterceptor .class ) ; assertThat ( org.springframework.boot.web.client.ClientHttpRequestInterceptor ) . extracting ( STRING ) . containsExactly ( STRING ) ; assertThat ( org.springframework.boot.web.client.ClientHttpRequestInterceptor ) . extracting ( STRING ) . containsExactly ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . customizers ( ( RestTemplateCustomizer [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . customizers ( ( java.util.Set<org.springframework.boot.web.client.RestTemplateCustomizer> < RestTemplateCustomizer > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplateCustomizer org.springframework.boot.web.client.RestTemplateCustomizer = mock ( RestTemplateCustomizer .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . customizers ( org.springframework.boot.web.client.RestTemplateCustomizer ) . build ( ) ; verify ( org.springframework.boot.web.client.RestTemplateCustomizer ) . customize ( org.springframework.boot.web.client.RestTemplate ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = spy ( new RestTemplate ( ) ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . additionalCustomizers ( new RestTemplateCustomizer ( ) { @ java.lang.Override public void void ( RestTemplate org.springframework.boot.web.client.RestTemplate ) { verify ( org.springframework.boot.web.client.RestTemplate ) . setRequestFactory ( ( ClientHttpRequestFactory ) any ( ) ) ; } } ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . configure ( org.springframework.boot.web.client.RestTemplate ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( RestTemplate org.springframework.boot.web.client.RestTemplate ) { verify ( org.springframework.boot.web.client.RestTemplate ) . setRequestFactory ( ( ClientHttpRequestFactory ) any ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplateCustomizer org.springframework.boot.web.client.RestTemplateCustomizer = mock ( RestTemplateCustomizer .class ) ; RestTemplateCustomizer org.springframework.boot.web.client.RestTemplateCustomizer = mock ( RestTemplateCustomizer .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . customizers ( org.springframework.boot.web.client.RestTemplateCustomizer ) . customizers ( java.util.Collections . java.util.Set ( org.springframework.boot.web.client.RestTemplateCustomizer ) ) . build ( ) ; verifyZeroInteractions ( org.springframework.boot.web.client.RestTemplateCustomizer ) ; verify ( org.springframework.boot.web.client.RestTemplateCustomizer ) . customize ( org.springframework.boot.web.client.RestTemplate ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . additionalCustomizers ( ( RestTemplateCustomizer [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . additionalCustomizers ( ( java.util.Set<org.springframework.boot.web.client.RestTemplateCustomizer> < RestTemplateCustomizer > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplateCustomizer org.springframework.boot.web.client.RestTemplateCustomizer = mock ( RestTemplateCustomizer .class ) ; RestTemplateCustomizer org.springframework.boot.web.client.RestTemplateCustomizer = mock ( RestTemplateCustomizer .class ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . customizers ( org.springframework.boot.web.client.RestTemplateCustomizer ) . additionalCustomizers ( org.springframework.boot.web.client.RestTemplateCustomizer ) . build ( ) ; verify ( org.springframework.boot.web.client.RestTemplateCustomizer ) . customize ( org.springframework.boot.web.client.RestTemplate ) ; verify ( org.springframework.boot.web.client.RestTemplateCustomizer ) . customize ( org.springframework.boot.web.client.RestTemplate ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getClass ( ) ) . isEqualTo ( RestTemplate .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.boot.web.client.RestTemplateBuilderTests.RestTemplateSubclass org.springframework.boot.web.client.RestTemplateBuilderTests.RestTemplateSubclass = this . org.springframework.boot.web.client.RestTemplateBuilder . build ( org.springframework.boot.web.client.RestTemplateBuilderTests.RestTemplateSubclass .class ) ; assertThat ( org.springframework.boot.web.client.RestTemplateBuilderTests.RestTemplateSubclass . java.lang.Class<? extends org.springframework.boot.web.client.RestTemplateBuilderTests.RestTemplateSubclass> ( ) ) . isEqualTo ( org.springframework.boot.web.client.RestTemplateBuilderTests.RestTemplateSubclass .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.boot.web.client.RestTemplate = new RestTemplate ( ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . configure ( org.springframework.boot.web.client.RestTemplate ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getRequestFactory ( ) ) . isInstanceOf ( HttpComponentsClientHttpRequestFactory .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( HttpComponentsClientHttpRequestFactory .class ) . setConnectTimeout ( NUMBER ) . build ( ) . getRequestFactory ( ) ; assertThat ( ( ( RequestConfig ) ReflectionTestUtils . getField ( org.springframework.boot.web.client.ClientHttpRequestFactory , STRING ) ) . getConnectTimeout ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( HttpComponentsClientHttpRequestFactory .class ) . setReadTimeout ( NUMBER ) . build ( ) . getRequestFactory ( ) ; assertThat ( ( ( RequestConfig ) ReflectionTestUtils . getField ( org.springframework.boot.web.client.ClientHttpRequestFactory , STRING ) ) . getSocketTimeout ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( SimpleClientHttpRequestFactory .class ) . setConnectTimeout ( NUMBER ) . build ( ) . getRequestFactory ( ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.boot.web.client.ClientHttpRequestFactory , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( SimpleClientHttpRequestFactory .class ) . setReadTimeout ( NUMBER ) . build ( ) . getRequestFactory ( ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.boot.web.client.ClientHttpRequestFactory , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( Netty4ClientHttpRequestFactory .class ) . setConnectTimeout ( NUMBER ) . build ( ) . getRequestFactory ( ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.boot.web.client.ClientHttpRequestFactory , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( Netty4ClientHttpRequestFactory .class ) . setReadTimeout ( NUMBER ) . build ( ) . getRequestFactory ( ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.boot.web.client.ClientHttpRequestFactory , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( OkHttp3ClientHttpRequestFactory .class ) . setConnectTimeout ( NUMBER ) . build ( ) . getRequestFactory ( ) ; assertThat ( ReflectionTestUtils . getField ( ReflectionTestUtils . getField ( org.springframework.boot.web.client.ClientHttpRequestFactory , STRING ) , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientHttpRequestFactory org.springframework.boot.web.client.ClientHttpRequestFactory = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( OkHttp3ClientHttpRequestFactory .class ) . setReadTimeout ( NUMBER ) . build ( ) . getRequestFactory ( ) ; assertThat ( ReflectionTestUtils . getField ( ReflectionTestUtils . getField ( org.springframework.boot.web.client.ClientHttpRequestFactory , STRING ) , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleClientHttpRequestFactory org.springframework.boot.web.client.SimpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory ( ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( new BufferingClientHttpRequestFactory ( org.springframework.boot.web.client.SimpleClientHttpRequestFactory ) ) . setConnectTimeout ( NUMBER ) . build ( ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.boot.web.client.SimpleClientHttpRequestFactory , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleClientHttpRequestFactory org.springframework.boot.web.client.SimpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory ( ) ; this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( new BufferingClientHttpRequestFactory ( org.springframework.boot.web.client.SimpleClientHttpRequestFactory ) ) . setReadTimeout ( NUMBER ) . build ( ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.boot.web.client.SimpleClientHttpRequestFactory , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleClientHttpRequestFactory org.springframework.boot.web.client.SimpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory ( ) ; RestTemplate org.springframework.boot.web.client.RestTemplate = this . org.springframework.boot.web.client.RestTemplateBuilder . requestFactory ( new BufferingClientHttpRequestFactory ( org.springframework.boot.web.client.SimpleClientHttpRequestFactory ) ) . build ( ) ; assertThat ( org.springframework.boot.web.client.RestTemplate . getRequestFactory ( ) ) . isInstanceOf ( BufferingClientHttpRequestFactory .class ) ; }  <METHOD_END>