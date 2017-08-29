<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext != null ) { this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigWebApplicationContext org.springframework.boot.autoconfigure.condition.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; org.springframework.boot.autoconfigure.condition.AnnotationConfigWebApplicationContext . register ( org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplicationTests.NotWebApplicationConfiguration .class ) ; org.springframework.boot.autoconfigure.condition.AnnotationConfigWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; org.springframework.boot.autoconfigure.condition.AnnotationConfigWebApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext = org.springframework.boot.autoconfigure.condition.AnnotationConfigWebApplicationContext ; assertThat ( this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext . getBeansOfType ( java.lang.String .class ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GenericReactiveWebApplicationContext org.springframework.boot.autoconfigure.condition.GenericReactiveWebApplicationContext = new GenericReactiveWebApplicationContext ( ) ; org.springframework.boot.autoconfigure.condition.GenericReactiveWebApplicationContext . register ( org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplicationTests.ReactiveApplicationConfig .class , org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplicationTests.NotWebApplicationConfiguration .class ) ; org.springframework.boot.autoconfigure.condition.GenericReactiveWebApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext = org.springframework.boot.autoconfigure.condition.GenericReactiveWebApplicationContext ; assertThat ( this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext . getBeansOfType ( java.lang.String .class ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplicationTests.NotWebApplicationConfiguration .class ) ; org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext = org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext ; assertThat ( this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext . getBeansOfType ( java.lang.String .class ) ) . containsExactly ( entry ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.condition.ReactiveWebServerFactory org.springframework.boot.autoconfigure.condition.ReactiveWebServerFactory ( ) { return new MockReactiveWebServerFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.condition.HttpHandler org.springframework.boot.autoconfigure.condition.HttpHandler ( ) { return ( request , response ) -> Mono . empty ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
