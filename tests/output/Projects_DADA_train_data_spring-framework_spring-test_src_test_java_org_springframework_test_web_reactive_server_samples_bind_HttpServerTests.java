<METHOD_START> @ Before public void void ( ) java.lang.Exception { HttpHandler org.springframework.test.web.reactive.server.samples.bind.HttpHandler = RouterFunctions . toHttpHandler ( route ( GET ( STRING ) , request -> ServerResponse . ok ( ) . body ( Mono . just ( STRING ) , String .class ) ) ) ; this . org.springframework.test.web.reactive.server.samples.bind.ReactorHttpServer = new ReactorHttpServer ( ) ; this . org.springframework.test.web.reactive.server.samples.bind.ReactorHttpServer . setHandler ( org.springframework.test.web.reactive.server.samples.bind.HttpHandler ) ; this . org.springframework.test.web.reactive.server.samples.bind.ReactorHttpServer . afterPropertiesSet ( ) ; this . org.springframework.test.web.reactive.server.samples.bind.ReactorHttpServer . start ( ) ; this . org.springframework.test.web.reactive.server.samples.bind.WebTestClient = WebTestClient . bindToServer ( ) . baseUrl ( STRING + this . org.springframework.test.web.reactive.server.samples.bind.ReactorHttpServer . getPort ( ) ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { this . org.springframework.test.web.reactive.server.samples.bind.ReactorHttpServer . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.reactive.server.samples.bind.WebTestClient . get ( ) . uri ( STRING ) . exchange ( ) . expectStatus ( ) . isOk ( ) . expectBody ( java.lang.String .class ) . value ( ) . isEqualTo ( STRING ) ; }  <METHOD_END>
