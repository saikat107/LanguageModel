<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext != null ) { this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . register ( DeviceResolverAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . getBean ( DeviceResolverHandlerInterceptor .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . register ( DeviceResolverAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . getBean ( DeviceHandlerMethodArgumentResolver .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . register ( org.springframework.boot.autoconfigure.mobile.DeviceResolverAutoConfigurationTests.Config .class ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . refresh ( ) ; RequestMappingHandlerMapping org.springframework.boot.autoconfigure.mobile.RequestMappingHandlerMapping = this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . getBean ( RequestMappingHandlerMapping .class ) ; HandlerInterceptor [] org.springframework.boot.autoconfigure.mobile.HandlerInterceptor[] = org.springframework.boot.autoconfigure.mobile.RequestMappingHandlerMapping . getHandler ( new MockHttpServletRequest ( ) ) . getInterceptors ( ) ; assertThat ( org.springframework.boot.autoconfigure.mobile.HandlerInterceptor[] ) . hasAtLeastOneElementOfType ( DeviceResolverHandlerInterceptor .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . register ( org.springframework.boot.autoconfigure.mobile.DeviceResolverAutoConfigurationTests.Config .class ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext . refresh ( ) ; MockMvc org.springframework.boot.autoconfigure.mobile.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.boot.autoconfigure.mobile.AnnotationConfigWebApplicationContext ) . build ( ) ; org.springframework.boot.autoconfigure.mobile.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.mobile.DeviceResolverAutoConfigurationTests.MyController org.springframework.boot.autoconfigure.mobile.DeviceResolverAutoConfigurationTests.MyController ( ) { return new org.springframework.boot.autoconfigure.mobile.DeviceResolverAutoConfigurationTests.MyController ( ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public org.springframework.boot.autoconfigure.mobile.ResponseEntity<java.lang.Void> < java.lang.Void > org.springframework.boot.autoconfigure.mobile.ResponseEntity<java.lang.Void> ( Device org.springframework.boot.autoconfigure.mobile.Device ) { if ( org.springframework.boot.autoconfigure.mobile.Device . getDevicePlatform ( ) != null ) { return new ResponseEntity <> ( HttpStatus . OK ) ; } return new ResponseEntity <> ( HttpStatus . INTERNAL_SERVER_ERROR ) ; }  <METHOD_END>
