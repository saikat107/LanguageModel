<METHOD_START> public void ( HelloWorldService sample.integration.HelloWorldService ) { this . sample.integration.HelloWorldService = sample.integration.HelloWorldService ; }  <METHOD_END>
<METHOD_START> @ ServiceActivator public java.lang.String java.lang.String ( java.io.File java.io.File ) throws java.lang.Exception { java.io.FileInputStream java.io.FileInputStream = new java.io.FileInputStream ( java.io.File ) ; java.lang.String java.lang.String = new java.lang.String ( StreamUtils . copyToByteArray ( java.io.FileInputStream ) ) ; java.io.FileInputStream . void ( ) ; return this . sample.integration.HelloWorldService . getHelloMessage ( java.lang.String ) ; }  <METHOD_END>
