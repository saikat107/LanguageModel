<METHOD_START> @ java.lang.Override protected org.springframework.boot.diagnostics.analyzer.FailureAnalysis org.springframework.boot.diagnostics.analyzer.FailureAnalysis ( java.lang.Throwable java.lang.Throwable , BindException org.springframework.boot.diagnostics.analyzer.BindException ) { if ( CollectionUtils . isEmpty ( org.springframework.boot.diagnostics.analyzer.BindException . getAllErrors ( ) ) ) { return null ; } java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , org.springframework.boot.diagnostics.analyzer.BindException . getTarget ( ) ) ) ; for ( ObjectError org.springframework.boot.diagnostics.analyzer.ObjectError : org.springframework.boot.diagnostics.analyzer.BindException . getAllErrors ( ) ) { if ( org.springframework.boot.diagnostics.analyzer.ObjectError instanceof FieldError ) { FieldError org.springframework.boot.diagnostics.analyzer.FieldError = ( FieldError ) org.springframework.boot.diagnostics.analyzer.ObjectError ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , org.springframework.boot.diagnostics.analyzer.BindException . getObjectName ( ) + STRING + org.springframework.boot.diagnostics.analyzer.FieldError . getField ( ) ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , org.springframework.boot.diagnostics.analyzer.FieldError . getRejectedValue ( ) ) ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String . java.lang.String ( STRING , org.springframework.boot.diagnostics.analyzer.ObjectError . getDefaultMessage ( ) ) ) ; } return new FailureAnalysis ( java.lang.StringBuilder . java.lang.String ( ) , STRING , org.springframework.boot.diagnostics.analyzer.BindException ) ; }  <METHOD_END>
