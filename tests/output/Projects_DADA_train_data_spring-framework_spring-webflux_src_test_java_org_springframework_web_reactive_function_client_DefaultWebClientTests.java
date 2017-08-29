<METHOD_START> @ Before public void void ( ) java.lang.Exception { MockitoAnnotations . initMocks ( this ) ; this . org.springframework.web.reactive.function.client.ExchangeFunction = mock ( ExchangeFunction .class ) ; when ( this . org.springframework.web.reactive.function.client.ExchangeFunction . exchange ( org.springframework.web.reactive.function.client.ArgumentCaptor<org.springframework.web.reactive.function.client.ClientRequest> . capture ( ) ) ) . thenReturn ( Mono . empty ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebClient org.springframework.web.reactive.function.client.WebClient = WebClient.Builder ( ) . build ( ) ; org.springframework.web.reactive.function.client.WebClient . get ( ) . uri ( STRING ) . exchange ( ) ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = org.springframework.web.reactive.function.client.ClientRequest ( ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . url ( ) . toString ( ) ) ; assertEquals ( new HttpHeaders ( ) , org.springframework.web.reactive.function.client.ClientRequest . headers ( ) ) ; assertEquals ( java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( ) , org.springframework.web.reactive.function.client.ClientRequest . cookies ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebClient org.springframework.web.reactive.function.client.WebClient = WebClient.Builder ( ) . build ( ) ; org.springframework.web.reactive.function.client.WebClient . get ( ) . uri ( builder -> builder . path ( STRING ) . queryParam ( STRING , STRING ) . build ( ) ) . exchange ( ) ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = org.springframework.web.reactive.function.client.ClientRequest ( ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . url ( ) . toString ( ) ) ; verifyNoMoreInteractions ( this . org.springframework.web.reactive.function.client.ExchangeFunction ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebClient org.springframework.web.reactive.function.client.WebClient = WebClient.Builder ( ) . build ( ) ; org.springframework.web.reactive.function.client.WebClient . get ( ) . uri ( builder -> builder . replacePath ( STRING ) . build ( ) ) . exchange ( ) ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = org.springframework.web.reactive.function.client.ClientRequest ( ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . url ( ) . toString ( ) ) ; verifyNoMoreInteractions ( this . org.springframework.web.reactive.function.client.ExchangeFunction ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebClient org.springframework.web.reactive.function.client.WebClient = WebClient.Builder ( ) . build ( ) ; org.springframework.web.reactive.function.client.WebClient . get ( ) . uri ( STRING ) . accept ( MediaType . APPLICATION_JSON ) . cookie ( STRING , STRING ) . exchange ( ) ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = org.springframework.web.reactive.function.client.ClientRequest ( ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . headers ( ) . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . cookies ( ) . getFirst ( STRING ) ) ; verifyNoMoreInteractions ( this . org.springframework.web.reactive.function.client.ExchangeFunction ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebClient org.springframework.web.reactive.function.client.WebClient = WebClient.Builder ( ) . defaultHeader ( STRING , STRING ) . defaultCookie ( STRING , STRING ) . build ( ) ; org.springframework.web.reactive.function.client.WebClient . get ( ) . uri ( STRING ) . exchange ( ) ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = org.springframework.web.reactive.function.client.ClientRequest ( ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . headers ( ) . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . cookies ( ) . getFirst ( STRING ) ) ; verifyNoMoreInteractions ( this . org.springframework.web.reactive.function.client.ExchangeFunction ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebClient org.springframework.web.reactive.function.client.WebClient = WebClient.Builder ( ) . defaultHeader ( STRING , STRING ) . defaultCookie ( STRING , STRING ) . build ( ) ; org.springframework.web.reactive.function.client.WebClient . get ( ) . uri ( STRING ) . header ( STRING , STRING ) . cookie ( STRING , STRING ) . exchange ( ) ; ClientRequest org.springframework.web.reactive.function.client.ClientRequest = org.springframework.web.reactive.function.client.ClientRequest ( ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . headers ( ) . getFirst ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.client.ClientRequest . cookies ( ) . getFirst ( STRING ) ) ; verifyNoMoreInteractions ( this . org.springframework.web.reactive.function.client.ExchangeFunction ) ; }  <METHOD_END>
<METHOD_START> private WebClient . WebClient.Builder WebClient.Builder ( ) { return WebClient . builder ( ) . baseUrl ( STRING ) . exchangeFunction ( this . org.springframework.web.reactive.function.client.ExchangeFunction ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.function.client.ClientRequest org.springframework.web.reactive.function.client.ClientRequest ( ) { ClientRequest org.springframework.web.reactive.function.client.ClientRequest = this . org.springframework.web.reactive.function.client.ArgumentCaptor<org.springframework.web.reactive.function.client.ClientRequest> . getValue ( ) ; Mockito . verify ( this . org.springframework.web.reactive.function.client.ExchangeFunction ) . exchange ( org.springframework.web.reactive.function.client.ClientRequest ) ; verifyNoMoreInteractions ( this . org.springframework.web.reactive.function.client.ExchangeFunction ) ; return org.springframework.web.reactive.function.client.ClientRequest ; }  <METHOD_END>
