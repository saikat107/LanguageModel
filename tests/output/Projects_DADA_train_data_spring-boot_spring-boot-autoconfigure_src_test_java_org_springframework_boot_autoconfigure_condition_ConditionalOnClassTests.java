<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.condition.ConditionalOnClassTests.BasicConfiguration .class , org.springframework.boot.autoconfigure.condition.ConditionalOnClassTests.FooConfiguration .class ) ; this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . containsBean ( STRING ) ) . isTrue ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . getBean ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.condition.ConditionalOnClassTests.MissingConfiguration .class , org.springframework.boot.autoconfigure.condition.ConditionalOnClassTests.FooConfiguration .class ) ; this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . containsBean ( STRING ) ) . isFalse ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . getBean ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.condition.ConditionalOnClassTests.BasicConfiguration .class , org.springframework.boot.autoconfigure.condition.ConditionalOnClassTests.XmlConfiguration .class ) ; this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . containsBean ( STRING ) ) . isTrue ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . getBean ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.condition.ConditionalOnClassTests.CombinedXmlConfiguration .class ) ; this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . containsBean ( STRING ) ) . isTrue ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.condition.AnnotationConfigApplicationContext . getBean ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>