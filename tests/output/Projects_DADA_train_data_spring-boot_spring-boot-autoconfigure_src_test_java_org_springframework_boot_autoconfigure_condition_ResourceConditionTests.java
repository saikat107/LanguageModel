<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext != null ) { this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.condition.ResourceConditionTests.DefaultLocationConfiguration .class ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext . containsBean ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.condition.ResourceConditionTests.UnknownDefaultLocationConfiguration .class ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext . containsBean ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.condition.ResourceConditionTests.UnknownDefaultLocationConfiguration .class , STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext . containsBean ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String ... java.lang.String[] ) { AnnotationConfigApplicationContext org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext , java.lang.String[] ) ; org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . register ( java.lang.Class<> ) ; org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.condition.ConfigurableApplicationContext = org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> void ( ) { super( STRING , STRING , STRING , STRING ); }  <METHOD_END>
<METHOD_START> void ( ) { super( STRING , STRING , STRING , STRING ); }  <METHOD_END>
