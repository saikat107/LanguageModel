<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.NativeMessageHeaderAccessor . toMap ( ) ; assertEquals ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.String ( ) , NUMBER , java.util.Map<java.lang.String,java.lang.Object> . int ( ) ) ; assertNotNull ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ) ; assertEquals ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ) ; assertNotSame ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS , org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> ) ; GenericMessage < java.lang.String > org.springframework.messaging.support.GenericMessage<java.lang.String> = new GenericMessage <> ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( org.springframework.messaging.support.GenericMessage<java.lang.String> ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.NativeMessageHeaderAccessor . toMap ( ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.lang.Object> . int ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertNotNull ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ) ; assertEquals ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ) ; assertNotSame ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( ( Message < ? > ) null ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.NativeMessageHeaderAccessor . toMap ( ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.lang.Object> . int ( ) ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = org.springframework.messaging.support.NativeMessageHeaderAccessor . toNativeHeaderMap ( ) ; assertEquals ( java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( ) , java.util.Map<java.lang.String,java.util.List<java.lang.String>> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS , org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> ) ; GenericMessage < java.lang.String > org.springframework.messaging.support.GenericMessage<java.lang.String> = new GenericMessage <> ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( org.springframework.messaging.support.GenericMessage<java.lang.String> ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setHeader ( STRING , STRING ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setNativeHeader ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.NativeMessageHeaderAccessor . toMap ( ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.lang.Object> . int ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ; assertNotNull ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setNativeHeader ( STRING , STRING ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , org.springframework.messaging.support.NativeMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setNativeHeader ( STRING , null ) ; assertNull ( org.springframework.messaging.support.NativeMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setNativeHeader ( STRING , STRING ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , org.springframework.messaging.support.NativeMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setNativeHeader ( STRING , null ) ; assertNull ( org.springframework.messaging.support.NativeMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; assertNull ( org.springframework.messaging.support.NativeMessageHeaderAccessor . getMessageHeaders ( ) . get ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setNativeHeader ( STRING , STRING ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setImmutable ( ) ; this . org.springframework.messaging.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.messaging.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setNativeHeader ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . addNativeHeader ( STRING , STRING ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , org.springframework.messaging.support.NativeMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( org.springframework.messaging.support.MultiValueMap<java.lang.String,java.lang.String> ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . addNativeHeader ( STRING , null ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , org.springframework.messaging.support.NativeMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . addNativeHeader ( STRING , STRING ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , org.springframework.messaging.support.NativeMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . addNativeHeader ( STRING , null ) ; assertNull ( org.springframework.messaging.support.NativeMessageHeaderAccessor . getNativeHeader ( STRING ) ) ; assertNull ( org.springframework.messaging.support.NativeMessageHeaderAccessor . getMessageHeaders ( ) . get ( NativeMessageHeaderAccessor . NATIVE_HEADERS ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . addNativeHeader ( STRING , STRING ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setImmutable ( ) ; this . org.springframework.messaging.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.messaging.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . addNativeHeader ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { NativeMessageHeaderAccessor org.springframework.messaging.support.NativeMessageHeaderAccessor = new NativeMessageHeaderAccessor ( ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . addNativeHeader ( STRING , STRING ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setImmutable ( ) ; org.springframework.messaging.support.NativeMessageHeaderAccessor . setImmutable ( ) ; }  <METHOD_END>