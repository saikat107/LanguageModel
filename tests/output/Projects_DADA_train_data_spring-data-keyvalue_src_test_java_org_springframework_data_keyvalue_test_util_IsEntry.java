<METHOD_START> private void ( java.util.Map . java.util.Map.Entry<?,?> < ? , ? > java.util.Map.Entry<?,?> ) { super( java.lang.String . java.lang.String ( STRING , java.util.Map.Entry<,> != null ? java.util.Map.Entry<,> . getKey ( ) : STRING , java.util.Map.Entry<,> != null ? java.util.Map.Entry<,> . getValue ( ) : STRING ) ); this . java.util.Map.Entry<?,?> = java.util.Map.Entry<,> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null && java.util.Map.Entry<,> == null ) { return true ; } if ( ! ( java.lang.Object instanceof java.util.Map . java.util.Map.Entry ) ) { return false ; } java.util.Map . java.util.Map.Entry<?,?> < ? , ? > java.util.Map.Entry<?,?> = ( java.util.Map . java.util.Map.Entry<?,?> < ? , ? > ) java.lang.Object ; return new IsEqual < java.lang.Object > ( java.util.Map.Entry<,> . getKey ( ) ) . matches ( java.util.Map.Entry<,> . getKey ( ) ) && new IsEqual < java.lang.Object > ( java.util.Map.Entry<,> . getValue ( ) ) . matches ( java.util.Map.Entry<,> . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.keyvalue.test.util.IsEntry org.springframework.data.keyvalue.test.util.IsEntry ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { return org.springframework.data.keyvalue.test.util.IsEntry ( new org.springframework.data.keyvalue.test.util.IsEntry.EntryImpl ( java.lang.Object , java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.keyvalue.test.util.IsEntry org.springframework.data.keyvalue.test.util.IsEntry ( java.util.Map . java.util.Map.Entry<?,?> < ? , ? > java.util.Map.Entry<?,?> ) { return new org.springframework.data.keyvalue.test.util.IsEntry ( java.util.Map.Entry<,> ) ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { super( java.lang.Object , java.lang.Object ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
