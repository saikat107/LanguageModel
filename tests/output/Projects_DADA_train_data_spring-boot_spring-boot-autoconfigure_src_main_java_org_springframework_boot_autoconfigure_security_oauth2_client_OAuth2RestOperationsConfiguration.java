<METHOD_START> @ Bean @ ConfigurationProperties ( prefix = STRING ) @ Primary public org.springframework.boot.autoconfigure.security.oauth2.client.ClientCredentialsResourceDetails org.springframework.boot.autoconfigure.security.oauth2.client.ClientCredentialsResourceDetails ( ) { ClientCredentialsResourceDetails org.springframework.boot.autoconfigure.security.oauth2.client.ClientCredentialsResourceDetails = new ClientCredentialsResourceDetails ( ) ; return org.springframework.boot.autoconfigure.security.oauth2.client.ClientCredentialsResourceDetails ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext ( ) { return new DefaultOAuth2ClientContext ( new DefaultAccessTokenRequest ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.security.oauth2.client.FilterRegistrationBean<org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientContextFilter> < OAuth2ClientContextFilter > org.springframework.boot.autoconfigure.security.oauth2.client.FilterRegistrationBean<org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientContextFilter> ( OAuth2ClientContextFilter org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientContextFilter , SecurityProperties org.springframework.boot.autoconfigure.security.oauth2.client.SecurityProperties ) { FilterRegistrationBean < OAuth2ClientContextFilter > org.springframework.boot.autoconfigure.security.oauth2.client.FilterRegistrationBean<org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientContextFilter> = new FilterRegistrationBean <> ( ) ; org.springframework.boot.autoconfigure.security.oauth2.client.FilterRegistrationBean<org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientContextFilter> . setFilter ( org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientContextFilter ) ; org.springframework.boot.autoconfigure.security.oauth2.client.FilterRegistrationBean<org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientContextFilter> . setOrder ( org.springframework.boot.autoconfigure.security.oauth2.client.SecurityProperties . getFilterOrder ( ) - NUMBER ) ; return org.springframework.boot.autoconfigure.security.oauth2.client.FilterRegistrationBean<org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientContextFilter> ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( value = STRING , proxyMode = ScopedProxyMode . INTERFACES ) public org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext ( ) { return new DefaultOAuth2ClientContext ( this . org.springframework.boot.autoconfigure.security.oauth2.client.AccessTokenRequest ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( value = STRING , proxyMode = ScopedProxyMode . INTERFACES ) public org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext ( ) { DefaultOAuth2ClientContext org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext = new DefaultOAuth2ClientContext ( new DefaultAccessTokenRequest ( ) ) ; Authentication org.springframework.boot.autoconfigure.security.oauth2.client.Authentication = SecurityContextHolder . getContext ( ) . getAuthentication ( ) ; if ( org.springframework.boot.autoconfigure.security.oauth2.client.Authentication instanceof OAuth2Authentication ) { OAuth2Authentication org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2Authentication = ( OAuth2Authentication ) org.springframework.boot.autoconfigure.security.oauth2.client.Authentication ; java.lang.Object java.lang.Object = org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2Authentication . getDetails ( ) ; if ( java.lang.Object instanceof OAuth2AuthenticationDetails ) { OAuth2AuthenticationDetails org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2AuthenticationDetails = ( OAuth2AuthenticationDetails ) java.lang.Object ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2AuthenticationDetails . getTokenValue ( ) ; org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext . setAccessToken ( new DefaultOAuth2AccessToken ( java.lang.String ) ) ; } } return org.springframework.boot.autoconfigure.security.oauth2.client.DefaultOAuth2ClientContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.security.oauth2.client.ConditionOutcome org.springframework.boot.autoconfigure.security.oauth2.client.ConditionOutcome ( ConditionContext org.springframework.boot.autoconfigure.security.oauth2.client.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.autoconfigure.security.oauth2.client.AnnotatedTypeMetadata ) { PropertyResolver org.springframework.boot.autoconfigure.security.oauth2.client.PropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.autoconfigure.security.oauth2.client.ConditionContext . getEnvironment ( ) , STRING ) ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.security.oauth2.client.PropertyResolver . getProperty ( STRING ) ; ConditionMessage . ConditionMessage ConditionMessage.Builder = ConditionMessage . forCondition ( STRING ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { return ConditionOutcome . match ( ConditionMessage.Builder . foundExactly ( STRING ) ) ; } return ConditionOutcome . match ( ConditionMessage.Builder . didNotFind ( STRING ) . atAll ( ) ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super( ConfigurationPhase . PARSE_CONFIGURATION ); }  <METHOD_END>
<METHOD_START> void ( ) { super( ConfigurationPhase . PARSE_CONFIGURATION ); }  <METHOD_END>
