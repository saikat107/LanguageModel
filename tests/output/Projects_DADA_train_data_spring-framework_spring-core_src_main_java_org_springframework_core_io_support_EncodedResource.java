<METHOD_START> public void ( Resource org.springframework.core.io.support.Resource ) { this( org.springframework.core.io.support.Resource , null , null ); }  <METHOD_END>
<METHOD_START> public void ( Resource org.springframework.core.io.support.Resource , java.lang.String java.lang.String ) { this( org.springframework.core.io.support.Resource , java.lang.String , null ); }  <METHOD_END>
<METHOD_START> public void ( Resource org.springframework.core.io.support.Resource , java.nio.charset.Charset java.nio.charset.Charset ) { this( org.springframework.core.io.support.Resource , null , java.nio.charset.Charset ); }  <METHOD_END>
<METHOD_START> private void ( Resource org.springframework.core.io.support.Resource , java.lang.String java.lang.String , java.nio.charset.Charset java.nio.charset.Charset ) { super(); Assert . notNull ( org.springframework.core.io.support.Resource , STRING ) ; this . org.springframework.core.io.support.Resource = org.springframework.core.io.support.Resource ; this . java.lang.String = java.lang.String ; this . java.nio.charset.Charset = java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> public final org.springframework.core.io.support.Resource org.springframework.core.io.support.Resource ( ) { return this . org.springframework.core.io.support.Resource ; }  <METHOD_END>
<METHOD_START> public final java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public final java.nio.charset.Charset java.nio.charset.Charset ( ) { return this . java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ( this . java.lang.String != null || this . java.nio.charset.Charset != null ) ; }  <METHOD_END>
<METHOD_START> public java.io.Reader java.io.Reader ( ) java.io.IOException { if ( this . java.nio.charset.Charset != null ) { return new java.io.InputStreamReader ( this . org.springframework.core.io.support.Resource . getInputStream ( ) , this . java.nio.charset.Charset ) ; } else if ( this . java.lang.String != null ) { return new java.io.InputStreamReader ( this . org.springframework.core.io.support.Resource . getInputStream ( ) , this . java.lang.String ) ; } else { return new java.io.InputStreamReader ( this . org.springframework.core.io.support.Resource . getInputStream ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { return this . org.springframework.core.io.support.Resource . getInputStream ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.core.io.support.EncodedResource ) ) { return false ; } org.springframework.core.io.support.EncodedResource org.springframework.core.io.support.EncodedResource = ( org.springframework.core.io.support.EncodedResource ) java.lang.Object ; return ( this . org.springframework.core.io.support.Resource . equals ( org.springframework.core.io.support.EncodedResource . org.springframework.core.io.support.Resource ) && ObjectUtils . nullSafeEquals ( this . java.nio.charset.Charset , org.springframework.core.io.support.EncodedResource . java.nio.charset.Charset ) && ObjectUtils . nullSafeEquals ( this . java.lang.String , org.springframework.core.io.support.EncodedResource . java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . org.springframework.core.io.support.Resource . hashCode ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.core.io.support.Resource . toString ( ) ; }  <METHOD_END>
