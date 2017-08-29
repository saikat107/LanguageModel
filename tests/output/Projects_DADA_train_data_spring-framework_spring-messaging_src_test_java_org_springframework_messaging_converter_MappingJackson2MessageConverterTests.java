<METHOD_START> @ Test public void void ( ) { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; assertThat ( org.springframework.messaging.converter.MappingJackson2MessageConverter . getSupportedMimeTypes ( ) , contains ( new MimeType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) ; assertFalse ( org.springframework.messaging.converter.MappingJackson2MessageConverter . getObjectMapper ( ) . getDeserializationConfig ( ) . isEnabled ( DeserializationFeature . FAIL_ON_UNKNOWN_PROPERTIES ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MimeType org.springframework.messaging.converter.MimeType = new MimeType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( org.springframework.messaging.converter.MimeType ) ; assertThat ( org.springframework.messaging.converter.MappingJackson2MessageConverter . getSupportedMimeTypes ( ) , contains ( org.springframework.messaging.converter.MimeType ) ) ; assertFalse ( org.springframework.messaging.converter.MappingJackson2MessageConverter . getObjectMapper ( ) . getDeserializationConfig ( ) . isEnabled ( DeserializationFeature . FAIL_ON_UNKNOWN_PROPERTIES ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MimeType org.springframework.messaging.converter.MimeType = new MimeType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; MimeType org.springframework.messaging.converter.MimeType = new MimeType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( org.springframework.messaging.converter.MimeType , org.springframework.messaging.converter.MimeType ) ; assertThat ( org.springframework.messaging.converter.MappingJackson2MessageConverter . getSupportedMimeTypes ( ) , contains ( org.springframework.messaging.converter.MimeType , org.springframework.messaging.converter.MimeType ) ) ; assertFalse ( org.springframework.messaging.converter.MappingJackson2MessageConverter . getObjectMapper ( ) . getDeserializationConfig ( ) . isEnabled ( DeserializationFeature . FAIL_ON_UNKNOWN_PROPERTIES ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; java.lang.String java.lang.String = STRING ; Message < ? > org.springframework.messaging.converter.Message<?> = MessageBuilder . withPayload ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) . build ( ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean = ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean ) org.springframework.messaging.converter.MappingJackson2MessageConverter . fromMessage ( org.springframework.messaging.converter.Message<> , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean .class ) ; assertEquals ( STRING , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . java.lang.String ( ) ) ; assertEquals ( NUMBER , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . int ( ) ) ; assertEquals ( NUMBER , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . float ( ) , NUMBER ) ; assertArrayEquals ( new java.lang.String [] { STRING , STRING } , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . java.lang.String[] ( ) ) ; assertTrue ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . boolean ( ) ) ; assertArrayEquals ( new byte [] { NUMBER , NUMBER } , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; java.lang.String java.lang.String = STRING + STRING ; Message < ? > org.springframework.messaging.converter.Message<?> = MessageBuilder . withPayload ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) . build ( ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.HashMap<java.lang.String,java.lang.Object> = ( java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) org.springframework.messaging.converter.MappingJackson2MessageConverter . fromMessage ( org.springframework.messaging.converter.Message<> , java.util.HashMap .class ) ; assertEquals ( STRING , java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertEquals ( NUMBER , java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertEquals ( NUMBER , ( java.lang.Double ) java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) , NUMBER ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageConversionException .class ) public void void ( ) java.lang.Exception { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; java.lang.String java.lang.String = STRING ; Message < ? > org.springframework.messaging.converter.Message<?> = MessageBuilder . withPayload ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) . build ( ) ; org.springframework.messaging.converter.MappingJackson2MessageConverter . fromMessage ( org.springframework.messaging.converter.Message<> , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; java.lang.String java.lang.String = STRING ; Message < ? > org.springframework.messaging.converter.Message<?> = MessageBuilder . withPayload ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) . build ( ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean = ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean ) org.springframework.messaging.converter.MappingJackson2MessageConverter . fromMessage ( org.springframework.messaging.converter.Message<> , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean .class ) ; assertEquals ( STRING , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean = new org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean ( ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . void ( STRING ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . void ( NUMBER ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . void ( NUMBER ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . void ( new java.lang.String [] { STRING , STRING } ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . void ( true ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean . void ( new byte [] { NUMBER , NUMBER } ) ; Message < ? > org.springframework.messaging.converter.Message<?> = org.springframework.messaging.converter.MappingJackson2MessageConverter . toMessage ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyBean , null ) ; java.lang.String java.lang.String = new java.lang.String ( ( byte [] ) org.springframework.messaging.converter.Message<> . getPayload ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertEquals ( STRING , new MimeType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) , org.springframework.messaging.converter.Message<> . getHeaders ( ) . get ( MessageHeaders . CONTENT_TYPE , MimeType .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; MimeType org.springframework.messaging.converter.MimeType = new MimeType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( MessageHeaders . CONTENT_TYPE , org.springframework.messaging.converter.MimeType ) ; MessageHeaders org.springframework.messaging.converter.MessageHeaders = new MessageHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) ; java.lang.String java.lang.String = STRING ; Message < ? > org.springframework.messaging.converter.Message<?> = org.springframework.messaging.converter.MappingJackson2MessageConverter . toMessage ( java.lang.String , org.springframework.messaging.converter.MessageHeaders ) ; assertEquals ( STRING + java.lang.String + STRING , new java.lang.String ( ( byte [] ) org.springframework.messaging.converter.Message<> . getPayload ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( org.springframework.messaging.converter.MimeType , org.springframework.messaging.converter.Message<> . getHeaders ( ) . get ( MessageHeaders . CONTENT_TYPE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; org.springframework.messaging.converter.MappingJackson2MessageConverter . setSerializedPayloadClass ( java.lang.String .class ) ; MimeType org.springframework.messaging.converter.MimeType = new MimeType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( MessageHeaders . CONTENT_TYPE , org.springframework.messaging.converter.MimeType ) ; MessageHeaders org.springframework.messaging.converter.MessageHeaders = new MessageHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) ; java.lang.String java.lang.String = STRING ; Message < ? > org.springframework.messaging.converter.Message<?> = org.springframework.messaging.converter.MappingJackson2MessageConverter . toMessage ( java.lang.String , org.springframework.messaging.converter.MessageHeaders ) ; assertEquals ( STRING + java.lang.String + STRING , org.springframework.messaging.converter.Message<> . getPayload ( ) ) ; assertEquals ( org.springframework.messaging.converter.MimeType , org.springframework.messaging.converter.Message<> . getHeaders ( ) . get ( MessageHeaders . CONTENT_TYPE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MappingJackson2MessageConverter org.springframework.messaging.converter.MappingJackson2MessageConverter = new MappingJackson2MessageConverter ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<? extends org.springframework.messaging.converter.MappingJackson2MessageConverterTests> ( ) . java.lang.reflect.Method ( STRING ) ; MethodParameter org.springframework.messaging.converter.MethodParameter = new MethodParameter ( java.lang.reflect.Method , - NUMBER ) ; Message < ? > org.springframework.messaging.converter.Message<?> = org.springframework.messaging.converter.MappingJackson2MessageConverter . toMessage ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean ( ) , new MessageHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) , org.springframework.messaging.converter.MethodParameter ) ; java.lang.String java.lang.String = new java.lang.String ( ( byte [] ) org.springframework.messaging.converter.Message<> . getPayload ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; assertThat ( java.lang.String , containsString ( STRING ) ) ; assertThat ( java.lang.String , containsString ( STRING ) ) ; assertThat ( java.lang.String , not ( containsString ( STRING ) ) ) ; java.lang.reflect.Method = java.lang.Class<? extends org.springframework.messaging.converter.MappingJackson2MessageConverterTests> ( ) . java.lang.reflect.Method ( STRING , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean .class ) ; MethodParameter org.springframework.messaging.converter.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean = ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean ) org.springframework.messaging.converter.MappingJackson2MessageConverter . fromMessage ( org.springframework.messaging.converter.Message<> , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean .class , org.springframework.messaging.converter.MethodParameter ) ; assertNull ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean . java.lang.String ( ) ) ; assertEquals ( STRING , org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean . java.lang.String ( ) ) ; assertNull ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ JsonView ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyJacksonView1 .class ) public org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean ( ) { org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean = new org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean ( ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean . void ( STRING ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean . void ( STRING ) ; org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean . void ( STRING ) ; return org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean ; }  <METHOD_END>
<METHOD_START> public void void ( @ JsonView ( org.springframework.messaging.converter.MappingJackson2MessageConverterTests.MyJacksonView2 .class ) org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean org.springframework.messaging.converter.MappingJackson2MessageConverterTests.JacksonViewBean ) {	}  <METHOD_END>
<METHOD_START> public byte [] byte[] ( ) { return byte[] ; }  <METHOD_END>
<METHOD_START> public void void ( byte [] byte[] ) { this . byte[] = byte[] ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public float float ( ) { return float ; }  <METHOD_END>
<METHOD_START> public void void ( float float ) { this . float = float ; }  <METHOD_END>
<METHOD_START> public java.lang.String [] java.lang.String[] ( ) { return java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String [] java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>