<METHOD_START> @ java.lang.Override protected org.springframework.boot.diagnostics.analyzer.FailureAnalysis org.springframework.boot.diagnostics.analyzer.FailureAnalysis ( java.lang.Throwable java.lang.Throwable , BeanNotOfRequiredTypeException org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeException ) { if ( ! java.lang.reflect.Proxy . boolean ( org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeException . getActualType ( ) ) ) { return null ; } return new FailureAnalysis ( java.lang.String ( org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeException ) , java.lang.String , org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeException ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( BeanNotOfRequiredTypeException org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeException ) { java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; java.io.PrintWriter java.io.PrintWriter = new java.io.PrintWriter ( java.io.StringWriter ) ; java.io.PrintWriter . java.io.PrintWriter ( STRING + STRING , org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeException . getBeanName ( ) , org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeException . getRequiredType ( ) . getName ( ) ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeException . getRequiredType ( ) . getInterfaces ( ) ) { java.io.PrintWriter . void ( STRING + java.lang.Class<> . java.lang.String ( ) ) ; } return java.io.StringWriter . java.lang.String ( ) ; }  <METHOD_END>