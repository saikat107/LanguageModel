<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Before public void void ( ) { this . org.springframework.boot.autoconfigure.security.oauth2.resource.BaseOAuth2ProtectedResourceDetails . setClientId ( STRING ) ; given ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestOperations . getForEntity ( any ( java.lang.String .class ) , eq ( java.util.Map .class ) ) ) . willReturn ( new ResponseEntity < java.util.Map > ( this . java.util.Map<java.lang.String,java.lang.Object> , HttpStatus . OK ) ) ; given ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestOperations . getAccessToken ( ) ) . willReturn ( new DefaultOAuth2AccessToken ( STRING ) ) ; given ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestOperations . getResource ( ) ) . willReturn ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.BaseOAuth2ProtectedResourceDetails ) ; given ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestOperations . getOAuth2ClientContext ( ) ) . willReturn ( mock ( OAuth2ClientContext .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices . setRestTemplate ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestOperations ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices . loadAuthentication ( STRING ) . getName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices . setRestTemplate ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestOperations ) ; given ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestOperations . getForEntity ( any ( java.lang.String .class ) , eq ( java.util.Map .class ) ) ) . willThrow ( new UserRedirectRequiredException ( STRING , java.util.Collections .< java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) ) ) ; this . org.springframework.boot.autoconfigure.security.oauth2.resource.ExpectedException . expect ( InvalidTokenException .class ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices . loadAuthentication ( STRING ) . getName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; this . org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices . setRestTemplate ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2RestOperations ) ; assertThat ( this . org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices . loadAuthentication ( STRING ) . getName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>