<METHOD_START> @ java.lang.Override protected java.lang.Class java.lang.Class ( ) { return EnableRedisServer .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Properties java.util.Properties ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return new PropertiesBuilder ( ) . setProperty ( STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . setProperty ( STRING , resolvePort ( ( java.lang.Integer ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) , int ) ) . build ( ) ; }  <METHOD_END>