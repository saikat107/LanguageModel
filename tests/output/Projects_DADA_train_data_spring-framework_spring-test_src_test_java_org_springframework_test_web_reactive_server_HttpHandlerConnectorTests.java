<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler = new org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler ( org.springframework.test.web.reactive.server.ServerHttpResponse -> { org.springframework.test.web.reactive.server.ServerHttpResponse . setStatusCode ( HttpStatus . OK ) ; return org.springframework.test.web.reactive.server.ServerHttpResponse . setComplete ( ) ; } ) ; new HttpHandlerConnector ( org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler ) . connect ( HttpMethod . POST , java.net.URI . java.net.URI ( STRING ) , request -> { request . getHeaders ( ) . put ( STRING , Arrays . asList ( STRING , STRING ) ) ; request . getCookies ( ) . add ( STRING , new HttpCookie ( STRING , STRING ) ) ; return request . writeWith ( Mono . just ( toDataBuffer ( STRING ) ) ) ; } ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; MockServerHttpRequest org.springframework.test.web.reactive.server.MockServerHttpRequest = ( MockServerHttpRequest ) org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler . org.springframework.test.web.reactive.server.ServerHttpRequest ( ) ; assertEquals ( HttpMethod . POST , org.springframework.test.web.reactive.server.MockServerHttpRequest . getMethod ( ) ) ; assertEquals ( STRING , org.springframework.test.web.reactive.server.MockServerHttpRequest . getURI ( ) . toString ( ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , org.springframework.test.web.reactive.server.MockServerHttpRequest . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( new HttpCookie ( STRING , STRING ) , org.springframework.test.web.reactive.server.MockServerHttpRequest . getCookies ( ) . getFirst ( STRING ) ) ; DataBuffer org.springframework.test.web.reactive.server.DataBuffer = org.springframework.test.web.reactive.server.MockServerHttpRequest . getBody ( ) . blockFirst ( java.time.Duration . java.time.Duration ) ; assertEquals ( STRING , DataBufferTestUtils . dumpString ( org.springframework.test.web.reactive.server.DataBuffer , java.nio.charset.Charset ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseCookie org.springframework.test.web.reactive.server.ResponseCookie = ResponseCookie . from ( STRING , STRING ) . build ( ) ; org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler = new org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler ( org.springframework.test.web.reactive.server.ServerHttpResponse -> { org.springframework.test.web.reactive.server.ServerHttpResponse . setStatusCode ( HttpStatus . OK ) ; org.springframework.test.web.reactive.server.ServerHttpResponse . getHeaders ( ) . put ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; org.springframework.test.web.reactive.server.ServerHttpResponse . getCookies ( ) . add ( org.springframework.test.web.reactive.server.ResponseCookie . getName ( ) , org.springframework.test.web.reactive.server.ResponseCookie ) ; return org.springframework.test.web.reactive.server.ServerHttpResponse . writeWith ( Mono . just ( org.springframework.test.web.reactive.server.DataBuffer ( STRING ) ) ) ; } ) ; ClientHttpResponse org.springframework.test.web.reactive.server.ClientHttpResponse = new HttpHandlerConnector ( org.springframework.test.web.reactive.server.HttpHandlerConnectorTests.TestHttpHandler ) . connect ( HttpMethod . GET , java.net.URI . java.net.URI ( STRING ) , ReactiveHttpOutputMessage :: setComplete ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( HttpStatus . OK , org.springframework.test.web.reactive.server.ClientHttpResponse . getStatusCode ( ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , org.springframework.test.web.reactive.server.ClientHttpResponse . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( org.springframework.test.web.reactive.server.ResponseCookie , org.springframework.test.web.reactive.server.ClientHttpResponse . getCookies ( ) . getFirst ( STRING ) ) ; DataBuffer org.springframework.test.web.reactive.server.DataBuffer = org.springframework.test.web.reactive.server.ClientHttpResponse . getBody ( ) . blockFirst ( java.time.Duration . java.time.Duration ) ; assertEquals ( STRING , DataBufferTestUtils . dumpString ( org.springframework.test.web.reactive.server.DataBuffer , java.nio.charset.Charset ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.reactive.server.DataBuffer org.springframework.test.web.reactive.server.DataBuffer ( java.lang.String java.lang.String ) { return new DefaultDataBufferFactory ( ) . wrap ( java.lang.String . byte[] ( java.nio.charset.Charset ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.function.Function<org.springframework.test.web.reactive.server.ServerHttpResponse,org.springframework.test.web.reactive.server.Mono<java.lang.Void>> < ServerHttpResponse , Mono < java.lang.Void > > java.util.function.Function<org.springframework.test.web.reactive.server.ServerHttpResponse,org.springframework.test.web.reactive.server.Mono<java.lang.Void>> ) { this . java.util.function.Function<org.springframework.test.web.reactive.server.ServerHttpResponse,org.springframework.test.web.reactive.server.Mono<java.lang.Void>> = java.util.function.Function<org.springframework.test.web.reactive.server.ServerHttpResponse,org.springframework.test.web.reactive.server.Mono<java.lang.Void>> ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.reactive.server.ServerHttpRequest org.springframework.test.web.reactive.server.ServerHttpRequest ( ) { return this . org.springframework.test.web.reactive.server.ServerHttpRequest ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.reactive.server.Mono<java.lang.Void> < java.lang.Void > org.springframework.test.web.reactive.server.Mono<java.lang.Void> ( ServerHttpRequest org.springframework.test.web.reactive.server.ServerHttpRequest , ServerHttpResponse org.springframework.test.web.reactive.server.ServerHttpResponse ) { this . org.springframework.test.web.reactive.server.ServerHttpRequest = org.springframework.test.web.reactive.server.ServerHttpRequest ; return this . java.util.function.Function<org.springframework.test.web.reactive.server.ServerHttpResponse,org.springframework.test.web.reactive.server.Mono<java.lang.Void>> . apply ( org.springframework.test.web.reactive.server.ServerHttpResponse ) ; }  <METHOD_END>