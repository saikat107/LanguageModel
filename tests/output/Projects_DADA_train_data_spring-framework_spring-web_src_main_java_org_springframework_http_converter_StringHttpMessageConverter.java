<METHOD_START> public void ( ) { this( java.nio.charset.Charset ); }  <METHOD_END>
<METHOD_START> public void ( java.nio.charset.Charset java.nio.charset.Charset ) { super( java.nio.charset.Charset , MediaType . TEXT_PLAIN , MediaType . ALL ); this . java.util.List<java.nio.charset.Charset> = new java.util.ArrayList<java.nio.charset.Charset> <> ( java.nio.charset.Charset . java.util.SortedMap<java.lang.String,java.nio.charset.Charset> ( ) . java.util.Collection<java.nio.charset.Charset> ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.String .class == java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.Class<? extends java.lang.String> < ? extends java.lang.String > java.lang.Class<? extends java.lang.String> , HttpInputMessage org.springframework.http.converter.HttpInputMessage ) throws java.io.IOException { java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset ( org.springframework.http.converter.HttpInputMessage . getHeaders ( ) . getContentType ( ) ) ; return StreamUtils . copyToString ( org.springframework.http.converter.HttpInputMessage . getBody ( ) , java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Long java.lang.Long ( java.lang.String java.lang.String , MediaType org.springframework.http.converter.MediaType ) { java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset ( org.springframework.http.converter.MediaType ) ; return ( long ) java.lang.String . byte[] ( java.nio.charset.Charset ) . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String , HttpOutputMessage org.springframework.http.converter.HttpOutputMessage ) throws java.io.IOException { if ( this . boolean ) { org.springframework.http.converter.HttpOutputMessage . getHeaders ( ) . setAcceptCharset ( java.util.List<java.nio.charset.Charset> ( ) ) ; } java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset ( org.springframework.http.converter.HttpOutputMessage . getHeaders ( ) . getContentType ( ) ) ; StreamUtils . copy ( java.lang.String , java.nio.charset.Charset , org.springframework.http.converter.HttpOutputMessage . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> protected java.util.List<java.nio.charset.Charset> < java.nio.charset.Charset > java.util.List<java.nio.charset.Charset> ( ) { return this . java.util.List<java.nio.charset.Charset> ; }  <METHOD_END>
<METHOD_START> private java.nio.charset.Charset java.nio.charset.Charset ( MediaType org.springframework.http.converter.MediaType ) { if ( org.springframework.http.converter.MediaType != null && org.springframework.http.converter.MediaType . getCharset ( ) != null ) { return org.springframework.http.converter.MediaType . getCharset ( ) ; } else { return getDefaultCharset ( ) ; } }  <METHOD_END>
