<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.InterruptedException { QueueChannel org.springframework.integration.channel.reactive.QueueChannel = new QueueChannel ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { try { this . org.springframework.integration.channel.reactive.MessageChannel . send ( MessageBuilder . withPayload ( int ) . setReplyChannel ( org.springframework.integration.channel.reactive.QueueChannel ) . build ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageDeliveryException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) . java.lang.Throwable ( ) , instanceOf ( MessageHandlingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) . java.lang.Throwable ( ) . java.lang.Throwable ( ) , instanceOf ( java.lang.IllegalStateException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } } for ( int int = NUMBER ; int < NUMBER ; int ++ ) { Message < ? > org.springframework.integration.channel.reactive.Message<?> = org.springframework.integration.channel.reactive.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.channel.reactive.Message<> ) ; assertThat ( org.springframework.integration.channel.reactive.Message<> . getPayload ( ) , isOneOf ( STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; Flux . from ( MessageChannelReactiveUtils .< java.lang.String > toPublisher ( this . org.springframework.integration.channel.reactive.MessageChannel ) ) . map ( Message :: getPayload ) . map ( java.lang.String :: toUpperCase ) . doOnNext ( java.util.List<java.lang.String> :: add ) . subscribe ( v -> done . countDown ( ) ) ; this . org.springframework.integration.channel.reactive.MessageChannel . send ( new GenericMessage <> ( STRING ) ) ; this . org.springframework.integration.channel.reactive.MessageChannel . send ( new GenericMessage <> ( STRING ) ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertThat ( java.util.List<java.lang.String> , contains ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.channel.reactive.MessageChannel org.springframework.integration.channel.reactive.MessageChannel ( ) { return new ReactiveChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ ServiceActivator ( inputChannel = STRING ) public java.lang.String java.lang.String ( int int ) { if ( int == NUMBER ) { throw new java.lang.IllegalStateException ( STRING ) ; } return STRING + int ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.channel.reactive.MessageChannel org.springframework.integration.channel.reactive.MessageChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
