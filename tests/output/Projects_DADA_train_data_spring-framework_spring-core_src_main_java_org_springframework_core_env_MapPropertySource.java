<METHOD_START> public void ( java.lang.String java.lang.String , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { super( java.lang.String , java.util.Map<java.lang.String,java.lang.Object> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return this . source . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { return this . source . containsKey ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( ) { return StringUtils . toStringArray ( this . source . keySet ( ) ) ; }  <METHOD_END>