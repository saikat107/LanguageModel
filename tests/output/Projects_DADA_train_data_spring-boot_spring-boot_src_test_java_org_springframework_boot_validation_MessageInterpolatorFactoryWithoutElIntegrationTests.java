<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.validation.ExpectedException . expect ( ValidationException .class ) ; this . org.springframework.boot.validation.ExpectedException . expectMessage ( STRING ) ; Validation . byDefaultProvider ( ) . configure ( ) . getDefaultMessageInterpolator ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageInterpolator org.springframework.boot.validation.MessageInterpolator = new MessageInterpolatorFactory ( ) . getObject ( ) ; assertThat ( org.springframework.boot.validation.MessageInterpolator ) . isInstanceOf ( ParameterMessageInterpolator .class ) ; }  <METHOD_END>
