<METHOD_START> @ Bean public org.springframework.boot.context.embedded.WebServerFactoryCustomizer<org.springframework.boot.context.embedded.TomcatServletWebServerFactory> < TomcatServletWebServerFactory > org.springframework.boot.context.embedded.WebServerFactoryCustomizer<org.springframework.boot.context.embedded.TomcatServletWebServerFactory> ( ) { return ( serverFactory ) -> serverFactory . addContextCustomizers ( ( context ) -> context . setCookieProcessor ( new LegacyCookieProcessor ( ) ) ) ; }  <METHOD_END>
