<METHOD_START> @ java.lang.Override public void void ( WebSecurity org.springframework.boot.web.security.WebSecurity ) { org.springframework.boot.web.security.WebSecurity . ignoring ( ) . antMatchers ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpSecurity org.springframework.boot.web.security.HttpSecurity ) throws java.lang.Exception { org.springframework.boot.web.security.HttpSecurity . antMatcher ( STRING ) . authorizeRequests ( ) . anyRequest ( ) . authenticated ( ) ; }  <METHOD_END>