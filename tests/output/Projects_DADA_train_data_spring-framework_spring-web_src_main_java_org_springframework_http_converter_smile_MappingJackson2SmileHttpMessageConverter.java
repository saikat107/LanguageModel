<METHOD_START> public void ( ) { this( Jackson2ObjectMapperBuilder . smile ( ) . build ( ) ); }  <METHOD_END>
<METHOD_START> public void ( ObjectMapper org.springframework.http.converter.smile.ObjectMapper ) { super( org.springframework.http.converter.smile.ObjectMapper , new MediaType ( STRING , STRING ) ); Assert . isInstanceOf ( SmileFactory .class , org.springframework.http.converter.smile.ObjectMapper . getFactory ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ObjectMapper org.springframework.http.converter.smile.ObjectMapper ) { Assert . isInstanceOf ( SmileFactory .class , org.springframework.http.converter.smile.ObjectMapper . getFactory ( ) , STRING ) ; super. setObjectMapper ( org.springframework.http.converter.smile.ObjectMapper ) ; }  <METHOD_END>