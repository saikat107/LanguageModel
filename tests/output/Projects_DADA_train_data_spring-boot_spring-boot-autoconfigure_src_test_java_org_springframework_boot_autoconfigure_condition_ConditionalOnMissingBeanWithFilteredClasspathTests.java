<METHOD_START> @ After public void void ( ) { this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBeanWithFilteredClasspathTests.OnBeanTypeConfiguration .class ) ; this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . containsBean ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean ( type = STRING ) public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
