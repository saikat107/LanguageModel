<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( Row org.springframework.cassandra.core.Row , int int ) { ColumnDefinitions org.springframework.cassandra.core.ColumnDefinitions = org.springframework.cassandra.core.Row . getColumnDefinitions ( ) ; int int = org.springframework.cassandra.core.ColumnDefinitions . size ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( int ) ; for ( int int = NUMBER ; int < int ; int ++ ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.cassandra.core.ColumnDefinitions . getName ( int ) ) ; java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.cassandra.core.Row , int ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( int int ) { return new LinkedCaseInsensitiveMap <> ( int ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( Row org.springframework.cassandra.core.Row , int int ) { return org.springframework.cassandra.core.Row . getObject ( int ) ; }  <METHOD_END>