<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.test.autoconfigure.web.reactive.webclient.WebTestClient . get ( ) . uri ( STRING ) . exchange ( ) . expectStatus ( ) . isOk ( ) . expectBody ( java.lang.String .class ) . value ( ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.test.autoconfigure.web.reactive.webclient.WebTestClient . get ( ) . uri ( STRING ) . exchange ( ) . expectStatus ( ) . isNotFound ( ) ; }  <METHOD_END>
