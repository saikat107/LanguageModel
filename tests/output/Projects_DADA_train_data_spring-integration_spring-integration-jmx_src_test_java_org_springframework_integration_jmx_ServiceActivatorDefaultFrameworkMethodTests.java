<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.jmx.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.jmx.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.jmx.QueueChannel ) . build ( ) ; this . org.springframework.integration.jmx.MessageChannel . send ( org.springframework.integration.jmx.Message<> ) ; Message < ? > org.springframework.integration.jmx.Message<?> = org.springframework.integration.jmx.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.jmx.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.jmx.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.jmx.QueueChannel ) . build ( ) ; this . org.springframework.integration.jmx.MessageChannel . send ( org.springframework.integration.jmx.Message<> ) ; Message < ? > org.springframework.integration.jmx.Message<?> = org.springframework.integration.jmx.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = ( java.lang.StackTraceElement [] ) org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) ; assertTrue ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.jmx.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.jmx.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.jmx.QueueChannel ) . build ( ) ; this . org.springframework.integration.jmx.MessageChannel . send ( org.springframework.integration.jmx.Message<> ) ; Message < ? > org.springframework.integration.jmx.Message<?> = org.springframework.integration.jmx.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = ( java.lang.StackTraceElement [] ) org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) ; assertTrue ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.jmx.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.jmx.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.jmx.QueueChannel ) . build ( ) ; this . org.springframework.integration.jmx.MessageChannel . send ( org.springframework.integration.jmx.Message<> ) ; Message < ? > org.springframework.integration.jmx.Message<?> = org.springframework.integration.jmx.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = ( java.lang.StackTraceElement [] ) org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) ; assertTrue ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.jmx.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.jmx.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.jmx.QueueChannel ) . build ( ) ; this . org.springframework.integration.jmx.MessageChannel . send ( org.springframework.integration.jmx.Message<> ) ; Message < ? > org.springframework.integration.jmx.Message<?> = org.springframework.integration.jmx.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.jmx.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.jmx.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.jmx.QueueChannel ) . build ( ) ; this . org.springframework.integration.jmx.MessageChannel . send ( org.springframework.integration.jmx.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( org.springframework.integration.jmx.EventDrivenConsumer , STRING ) ; assertSame ( org.springframework.integration.jmx.MessageProcessor<> , java.lang.Object ) ; QueueChannel org.springframework.integration.jmx.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.jmx.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.jmx.QueueChannel ) . build ( ) ; this . org.springframework.integration.jmx.MessageChannel . send ( org.springframework.integration.jmx.Message<> ) ; Message < ? > org.springframework.integration.jmx.Message<?> = org.springframework.integration.jmx.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( STRING ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { new ClassPathXmlApplicationContext ( this . java.lang.Class<? extends org.springframework.integration.jmx.ServiceActivatorDefaultFrameworkMethodTests> ( ) . java.lang.String ( ) + STRING , this . java.lang.Class<? extends org.springframework.integration.jmx.ServiceActivatorDefaultFrameworkMethodTests> ( ) ) . close ( ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , Matchers . instanceOf ( BeanCreationException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) , Matchers . instanceOf ( BeanCreationException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) . java.lang.Throwable ( ) , Matchers . instanceOf ( java.lang.IllegalArgumentException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) . java.lang.Throwable ( ) . java.lang.String ( ) , Matchers . containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.jmx.Message<?> ) { java.lang.Exception java.lang.Exception = new java.lang.RuntimeException ( ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = java.lang.Exception . java.lang.StackTraceElement[] ( ) ; return MessageBuilder . withPayload ( org.springframework.integration.jmx.Message<> . getPayload ( ) . toString ( ) . toUpperCase ( ) ) . setHeader ( STRING , java.lang.StackTraceElement[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.Exception java.lang.Exception = new java.lang.RuntimeException ( ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = java.lang.Exception . java.lang.StackTraceElement[] ( ) ; assertFalse ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.jmx.Message<?> ) { java.lang.Exception java.lang.Exception = new java.lang.RuntimeException ( ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = java.lang.Exception . java.lang.StackTraceElement[] ( ) ; assertTrue ( StackTraceUtils . isFrameContainingXBeforeFrameContainingY ( STRING , STRING , java.lang.StackTraceElement[] ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( Message < ? > org.springframework.integration.jmx.Message<?> ) { return java.lang.String + STRING + org.springframework.integration.jmx.Message<> . getPayload ( ) ; }  <METHOD_END>
