<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( PropertyPlaceholderAutoConfiguration .class , TraceRepositoryAutoConfiguration .class , TraceWebFilterAutoConfiguration .class ) ; assertThat ( org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( WebRequestTraceFilter .class ) ) . isNotNull ( ) ; org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfigurationTests.CustomTraceFilterConfig .class , PropertyPlaceholderAutoConfiguration .class , TraceRepositoryAutoConfiguration .class , TraceWebFilterAutoConfiguration .class ) ; WebRequestTraceFilter org.springframework.boot.actuate.autoconfigure.WebRequestTraceFilter = org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( WebRequestTraceFilter .class ) ; assertThat ( org.springframework.boot.actuate.autoconfigure.WebRequestTraceFilter ) . isInstanceOf ( org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfigurationTests.TestWebRequestTraceFilter .class ) ; org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfigurationTests.TestWebRequestTraceFilter org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfigurationTests.TestWebRequestTraceFilter ( TraceRepository org.springframework.boot.actuate.autoconfigure.TraceRepository , TraceProperties org.springframework.boot.actuate.autoconfigure.TraceProperties ) { return new org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfigurationTests.TestWebRequestTraceFilter ( org.springframework.boot.actuate.autoconfigure.TraceRepository , org.springframework.boot.actuate.autoconfigure.TraceProperties ) ; }  <METHOD_END>
<METHOD_START> void ( TraceRepository org.springframework.boot.actuate.autoconfigure.TraceRepository , TraceProperties org.springframework.boot.actuate.autoconfigure.TraceProperties ) { super( org.springframework.boot.actuate.autoconfigure.TraceRepository , org.springframework.boot.actuate.autoconfigure.TraceProperties ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.util.Map<java.lang.String,java.lang.Object> . void ( ) ; }  <METHOD_END>