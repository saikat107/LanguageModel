<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClientRequest org.springframework.web.reactive.function.client.ClientRequest = ClientRequest . method ( GET , java.net.URI . java.net.URI ( STRING ) ) . header ( STRING , STRING ) . cookie ( STRING , STRING ) . build ( ) ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = ClientRequest . from ( org.springframework.web.reactive.function.client.ClientRequest ) . build ( ) ; assertEquals ( new java.net.URI ( STRING ) , org.springframework.web.reactive.function.client.ClientRequest . url ( ) ) ; assertEquals ( GET , org.springframework.web.reactive.function.client.ClientRequest . method ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . headers ( ) . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . cookies ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = new java.net.URI ( STRING ) ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = ClientRequest . method ( DELETE , java.net.URI ) . build ( ) ; assertEquals ( java.net.URI , org.springframework.web.reactive.function.client.ClientRequest . url ( ) ) ; assertEquals ( DELETE , org.springframework.web.reactive.function.client.ClientRequest . method ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClientRequest org.springframework.web.reactive.function.client.ClientRequest = ClientRequest . method ( GET , java.net.URI . java.net.URI ( STRING ) ) . cookie ( STRING , STRING ) . build ( ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . cookies ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClientRequest org.springframework.web.reactive.function.client.ClientRequest = ClientRequest . method ( GET , java.net.URI . java.net.URI ( STRING ) ) . header ( STRING , STRING ) . cookie ( STRING , STRING ) . build ( ) ; MockClientHttpRequest org.springframework.web.reactive.function.client.MockClientHttpRequest = new MockClientHttpRequest ( GET , STRING ) ; ExchangeStrategies org.springframework.web.reactive.function.client.ExchangeStrategies = mock ( ExchangeStrategies .class ) ; org.springframework.web.reactive.function.client.ClientRequest . writeTo ( org.springframework.web.reactive.function.client.MockClientHttpRequest , org.springframework.web.reactive.function.client.ExchangeStrategies ) . block ( ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.MockClientHttpRequest . getHeaders ( ) . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.MockClientHttpRequest . getCookies ( ) . getFirst ( STRING ) . getValue ( ) ) ; StepVerifier . create ( org.springframework.web.reactive.function.client.MockClientHttpRequest . getBody ( ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; BodyInserter < java.lang.String , ClientHttpRequest > org.springframework.web.reactive.function.client.BodyInserter<java.lang.String,org.springframework.web.reactive.function.client.ClientHttpRequest> = ( response , strategies ) -> { byte [] bodyBytes = body . getBytes ( UTF_8 ) ; ByteBuffer byteBuffer = ByteBuffer . wrap ( bodyBytes ) ; DataBuffer buffer = new DefaultDataBufferFactory ( ) . wrap ( byteBuffer ) ; return response . writeWith ( Mono . just ( buffer ) ) ; } ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = ClientRequest . method ( POST , java.net.URI . java.net.URI ( STRING ) ) . body ( org.springframework.web.reactive.function.client.BodyInserter<java.lang.String,org.springframework.web.reactive.function.client.ClientHttpRequest> ) . build ( ) ; java.util.List<org.springframework.web.reactive.function.client.HttpMessageWriter<?>> < HttpMessageWriter < ? > > java.util.List<org.springframework.web.reactive.function.client.HttpMessageWriter<?>> = new java.util.ArrayList<org.springframework.web.reactive.function.client.HttpMessageWriter<?>> <> ( ) ; java.util.List<org.springframework.web.reactive.function.client.HttpMessageWriter<?>> . add ( new EncoderHttpMessageWriter <> ( CharSequenceEncoder . allMimeTypes ( ) ) ) ; ExchangeStrategies org.springframework.web.reactive.function.client.ExchangeStrategies = mock ( ExchangeStrategies .class ) ; when ( org.springframework.web.reactive.function.client.ExchangeStrategies . messageWriters ( ) ) . thenReturn ( java.util.List<org.springframework.web.reactive.function.client.HttpMessageWriter<?>> :: stream ) ; MockClientHttpRequest org.springframework.web.reactive.function.client.MockClientHttpRequest = new MockClientHttpRequest ( GET , STRING ) ; org.springframework.web.reactive.function.client.ClientRequest . writeTo ( org.springframework.web.reactive.function.client.MockClientHttpRequest , org.springframework.web.reactive.function.client.ExchangeStrategies ) . block ( ) ; assertNotNull ( org.springframework.web.reactive.function.client.MockClientHttpRequest . getBody ( ) ) ; }  <METHOD_END>