<METHOD_START> @ java.lang.Override public void void ( ConfigurableApplicationContext org.springframework.test.context.web.socket.ConfigurableApplicationContext , MergedContextConfiguration org.springframework.test.context.web.socket.MergedContextConfiguration ) { if ( org.springframework.test.context.web.socket.ConfigurableApplicationContext instanceof WebApplicationContext ) { WebApplicationContext org.springframework.test.context.web.socket.WebApplicationContext = ( WebApplicationContext ) org.springframework.test.context.web.socket.ConfigurableApplicationContext ; org.springframework.test.context.web.socket.WebApplicationContext . getServletContext ( ) . setAttribute ( STRING , new MockServerContainer ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( this == java.lang.Object || ( java.lang.Object != null && java.lang.Class<? extends org.springframework.test.context.web.socket.MockServerContainerContextCustomizer> ( ) == java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return java.lang.Class<? extends org.springframework.test.context.web.socket.MockServerContainerContextCustomizer> ( ) . int ( ) ; }  <METHOD_END>
