<METHOD_START> @ Autowired public void void ( AuthenticationManagerBuilder org.springframework.data.rest.tests.security.AuthenticationManagerBuilder ) throws java.lang.Exception { org.springframework.data.rest.tests.security.AuthenticationManagerBuilder . inMemoryAuthentication ( ) . withUser ( STRING ) . password ( STRING ) . roles ( STRING ) . and ( ) . withUser ( STRING ) . password ( STRING ) . roles ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpSecurity org.springframework.data.rest.tests.security.HttpSecurity ) throws java.lang.Exception { org.springframework.data.rest.tests.security.HttpSecurity . authorizeRequests ( ) . antMatchers ( HttpMethod . GET , STRING ) . permitAll ( ) . anyRequest ( ) . authenticated ( ) . and ( ) . httpBasic ( ) . and ( ) . csrf ( ) . disable ( ) ; }  <METHOD_END>
