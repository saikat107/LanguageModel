<METHOD_START> @ Before public void void ( ) { ClassPathXmlApplicationContext org.springframework.aop.aspectj.autoproxy.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( java.lang.Class<? extends org.springframework.aop.aspectj.autoproxy.AnnotationBindingTests> ( ) . java.lang.String ( ) + STRING , java.lang.Class<? extends org.springframework.aop.aspectj.autoproxy.AnnotationBindingTests> ( ) ) ; org.springframework.aop.aspectj.autoproxy.AnnotatedTestBean = ( AnnotatedTestBean ) org.springframework.aop.aspectj.autoproxy.ClassPathXmlApplicationContext . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , org.springframework.aop.aspectj.autoproxy.AnnotatedTestBean . doThis ( ) ) ; assertEquals ( STRING , org.springframework.aop.aspectj.autoproxy.AnnotatedTestBean . doThat ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , org.springframework.aop.aspectj.autoproxy.AnnotatedTestBean . doTheOther ( ) ) ; }  <METHOD_END>
