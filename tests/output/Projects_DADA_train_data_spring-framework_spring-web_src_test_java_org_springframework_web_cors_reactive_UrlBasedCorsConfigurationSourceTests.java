<METHOD_START> @ Test public void void ( ) { ServerWebExchange org.springframework.web.cors.reactive.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; assertNull ( this . org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource . getCorsConfiguration ( org.springframework.web.cors.reactive.ServerWebExchange ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CorsConfiguration org.springframework.web.cors.reactive.CorsConfiguration = new CorsConfiguration ( ) ; this . org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource . registerCorsConfiguration ( STRING , org.springframework.web.cors.reactive.CorsConfiguration ) ; ServerWebExchange org.springframework.web.cors.reactive.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; assertNull ( this . org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource . getCorsConfiguration ( org.springframework.web.cors.reactive.ServerWebExchange ) ) ; org.springframework.web.cors.reactive.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; assertEquals ( org.springframework.web.cors.reactive.CorsConfiguration , this . org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource . getCorsConfiguration ( org.springframework.web.cors.reactive.ServerWebExchange ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.UnsupportedOperationException .class ) public void void ( ) { this . org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource . getCorsConfigurations ( ) . put ( STRING , new CorsConfiguration ( ) ) ; }  <METHOD_END>
