<METHOD_START> public void ( ) { this( Jackson2ObjectMapperBuilder . cbor ( ) . build ( ) ); }  <METHOD_END>
<METHOD_START> public void ( ObjectMapper org.springframework.http.converter.cbor.ObjectMapper ) { super( org.springframework.http.converter.cbor.ObjectMapper , new MediaType ( STRING , STRING ) ); Assert . isInstanceOf ( CBORFactory .class , org.springframework.http.converter.cbor.ObjectMapper . getFactory ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ObjectMapper org.springframework.http.converter.cbor.ObjectMapper ) { Assert . isInstanceOf ( CBORFactory .class , org.springframework.http.converter.cbor.ObjectMapper . getFactory ( ) , STRING ) ; super. setObjectMapper ( org.springframework.http.converter.cbor.ObjectMapper ) ; }  <METHOD_END>