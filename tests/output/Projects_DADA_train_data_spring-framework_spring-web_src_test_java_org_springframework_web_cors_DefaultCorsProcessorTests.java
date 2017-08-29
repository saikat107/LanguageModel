<METHOD_START> @ Before public void void ( ) { this . org.springframework.web.cors.MockHttpServletRequest = new MockHttpServletRequest ( ) ; this . org.springframework.web.cors.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . setRemoteHost ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration = new CorsConfiguration ( ) ; this . org.springframework.web.cors.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.cors.MockHttpServletResponse . setStatus ( HttpServletResponse . SC_OK ) ; this . org.springframework.web.cors.DefaultCorsProcessor = new DefaultCorsProcessor ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . GET . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( HttpServletResponse . SC_FORBIDDEN , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . GET . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( null , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . GET . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_MAX_AGE ) ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_EXPOSE_HEADERS ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . GET . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . setAllowCredentials ( true ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_CREDENTIALS ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_CREDENTIALS ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . GET . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . setAllowCredentials ( true ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_CREDENTIALS ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_CREDENTIALS ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . GET . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . GET . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addExposedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addExposedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_EXPOSE_HEADERS ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_EXPOSE_HEADERS ) . contains ( STRING ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_EXPOSE_HEADERS ) . contains ( STRING ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_FORBIDDEN , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_METHODS ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( HttpServletResponse . SC_FORBIDDEN , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( HttpServletResponse . SC_FORBIDDEN , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( HttpServletResponse . SC_FORBIDDEN , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedMethod ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedMethod ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_METHODS ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_METHODS ) ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_MAX_AGE ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . setAllowCredentials ( true ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_CREDENTIALS ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_CREDENTIALS ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . setAllowCredentials ( true ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( STRING , this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) . contains ( STRING ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) . contains ( STRING ) ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) . contains ( STRING ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) . contains ( STRING ) ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) . contains ( STRING ) ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . getHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) . contains ( STRING ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_HEADERS , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedHeader ( STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( this . org.springframework.web.cors.CorsConfiguration , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertTrue ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_HEADERS ) ) ; assertEquals ( HttpServletResponse . SC_OK , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.cors.MockHttpServletRequest . setMethod ( HttpMethod . OPTIONS . name ( ) ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ORIGIN , STRING ) ; this . org.springframework.web.cors.MockHttpServletRequest . addHeader ( HttpHeaders . ACCESS_CONTROL_REQUEST_METHOD , STRING ) ; this . org.springframework.web.cors.CorsConfiguration . addAllowedOrigin ( STRING ) ; this . org.springframework.web.cors.DefaultCorsProcessor . processRequest ( null , this . org.springframework.web.cors.MockHttpServletRequest , this . org.springframework.web.cors.MockHttpServletResponse ) ; assertFalse ( this . org.springframework.web.cors.MockHttpServletResponse . containsHeader ( HttpHeaders . ACCESS_CONTROL_ALLOW_ORIGIN ) ) ; assertEquals ( HttpServletResponse . SC_FORBIDDEN , this . org.springframework.web.cors.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>