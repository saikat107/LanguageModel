<METHOD_START> public void ( ) { this( JsonbBuilder . create ( ) ); }  <METHOD_END>
<METHOD_START> public void ( JsonbConfig org.springframework.http.converter.json.JsonbConfig ) { this( JsonbBuilder . create ( org.springframework.http.converter.json.JsonbConfig ) ); }  <METHOD_END>
<METHOD_START> public void ( Jsonb org.springframework.http.converter.json.Jsonb ) { void ( org.springframework.http.converter.json.Jsonb ) ; }  <METHOD_END>
<METHOD_START> public void void ( Jsonb org.springframework.http.converter.json.Jsonb ) { Assert . notNull ( org.springframework.http.converter.json.Jsonb , STRING ) ; this . org.springframework.http.converter.json.Jsonb = org.springframework.http.converter.json.Jsonb ; }  <METHOD_END>
<METHOD_START> public org.springframework.http.converter.json.Jsonb org.springframework.http.converter.json.Jsonb ( ) { return this . org.springframework.http.converter.json.Jsonb ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.reflect.Type java.lang.reflect.Type , java.io.Reader java.io.Reader ) throws java.lang.Exception { return org.springframework.http.converter.json.Jsonb ( ) . fromJson ( java.io.Reader , java.lang.reflect.Type ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , java.lang.reflect.Type java.lang.reflect.Type , java.io.Writer java.io.Writer ) throws java.lang.Exception { if ( java.lang.reflect.Type != null ) { org.springframework.http.converter.json.Jsonb ( ) . toJson ( java.lang.Object , java.lang.reflect.Type , java.io.Writer ) ; } else { org.springframework.http.converter.json.Jsonb ( ) . toJson ( java.lang.Object , java.io.Writer ) ; } }  <METHOD_END>