<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . long = java.lang.String . int ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.io.Reader java.io.Reader , long long ) { this . java.io.Reader = java.io.Reader ; this . long = long ; }  <METHOD_END>
<METHOD_START> public void ( java.io.InputStream java.io.InputStream , long long ) { this . java.io.InputStream = java.io.InputStream ; this . long = long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) java.sql.SQLException { return this . long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.Reader java.io.Reader ( ) java.sql.SQLException { try { if ( this . java.lang.String != null ) { return new java.io.StringReader ( this . java.lang.String ) ; } else if ( this . java.io.Reader != null ) { return this . java.io.Reader ; } else { return new java.io.InputStreamReader ( this . java.io.InputStream , STRING ) ; } } catch ( java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException ) { throw new java.sql.SQLException ( STRING + java.io.UnsupportedEncodingException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.sql.SQLException { try { if ( this . java.lang.String != null ) { return new java.io.ByteArrayInputStream ( this . java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; } else if ( this . java.io.Reader != null ) { java.lang.String java.lang.String = FileCopyUtils . copyToString ( this . java.io.Reader ) ; return new java.io.ByteArrayInputStream ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; } else { return this . java.io.InputStream ; } } catch ( java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException ) { throw new java.sql.SQLException ( STRING + java.io.UnsupportedEncodingException ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.sql.SQLException ( STRING + java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.Reader java.io.Reader ( long long , long long ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.Writer java.io.Writer ( long long ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.OutputStream java.io.OutputStream ( long long ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( long long , int int ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( long long , java.lang.String java.lang.String ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( long long , java.lang.String java.lang.String , int int , int int ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( java.lang.String java.lang.String , long long ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( java.sql.Clob java.sql.Clob , long long ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( long long ) throws java.sql.SQLException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.sql.SQLException { }  <METHOD_END>
