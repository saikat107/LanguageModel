<METHOD_START> @ Before public void void ( ) java.lang.Exception { RouterFunction < ? > org.springframework.test.web.reactive.server.samples.bind.RouterFunction<?> = route ( GET ( STRING ) , request -> ServerResponse . ok ( ) . body ( Mono . just ( STRING ) , String .class ) ) ; this . org.springframework.test.web.reactive.server.samples.bind.WebTestClient = WebTestClient . bindToRouterFunction ( org.springframework.test.web.reactive.server.samples.bind.RouterFunction<> ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.reactive.server.samples.bind.WebTestClient . get ( ) . uri ( STRING ) . exchange ( ) . expectStatus ( ) . isOk ( ) . expectBody ( java.lang.String .class ) . value ( ) . isEqualTo ( STRING ) ; }  <METHOD_END>
