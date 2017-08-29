<METHOD_START> public static org.springframework.data.gemfire.support.ConnectionEndpoint org.springframework.data.gemfire.support.ConnectionEndpoint ( java.net.InetSocketAddress java.net.InetSocketAddress ) { return new org.springframework.data.gemfire.support.ConnectionEndpoint ( java.net.InetSocketAddress . java.lang.String ( ) , java.net.InetSocketAddress . int ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.gemfire.support.ConnectionEndpoint org.springframework.data.gemfire.support.ConnectionEndpoint ( java.lang.String java.lang.String ) { return org.springframework.data.gemfire.support.ConnectionEndpoint ( java.lang.String , int ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.gemfire.support.ConnectionEndpoint org.springframework.data.gemfire.support.ConnectionEndpoint ( java.lang.String java.lang.String , int int ) { Assert . hasText ( java.lang.String , STRING ) ; java.lang.String java.lang.String = StringUtils . trimAllWhitespace ( java.lang.String ) ; int int = int ; int int = java.lang.String . int ( STRING ) ; if ( int > - NUMBER ) { int = int ( java.lang.String ( java.lang.String . java.lang.String ( int ) ) , int ) ; java.lang.String = java.lang.String . java.lang.String ( NUMBER , int ) . java.lang.String ( ) ; } return new org.springframework.data.gemfire.support.ConnectionEndpoint ( java.lang.String , int ) ; }  <METHOD_END>
<METHOD_START> static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { for ( char char : java.lang.String . char[] ( ) ) { if ( java.lang.Character . boolean ( char ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( char ) ; } } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> static int int ( java.lang.String java.lang.String , int int ) { try { return java.lang.Integer . int ( java.lang.String ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { return int ; } }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , int int ) { Assert . isTrue ( boolean ( int ) , java.lang.String . java.lang.String ( STRING , int ) ) ; this . java.lang.String = SpringUtils . defaultIfEmpty ( java.lang.String , java.lang.String ) ; this . int = int ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( int int ) { return ( int >= NUMBER && int <= NUMBER ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> public java.net.InetSocketAddress java.net.InetSocketAddress ( ) { return new java.net.InetSocketAddress ( java.lang.String ( ) , int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected java.lang.Object java.lang.Object ( ) java.lang.CloneNotSupportedException { return new org.springframework.data.gemfire.support.ConnectionEndpoint ( this . java.lang.String ( ) , this . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public int int ( org.springframework.data.gemfire.support.ConnectionEndpoint org.springframework.data.gemfire.support.ConnectionEndpoint ) { int int = java.lang.String ( ) . int ( org.springframework.data.gemfire.support.ConnectionEndpoint . java.lang.String ( ) ) ; return ( int != NUMBER ? int : int ( ) - org.springframework.data.gemfire.support.ConnectionEndpoint . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( final java.lang.Object java.lang.Object ) { if ( java.lang.Object == this ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.data.gemfire.support.ConnectionEndpoint ) ) { return false ; } org.springframework.data.gemfire.support.ConnectionEndpoint org.springframework.data.gemfire.support.ConnectionEndpoint = ( org.springframework.data.gemfire.support.ConnectionEndpoint ) java.lang.Object ; return ObjectUtils . nullSafeEquals ( this . java.lang.String ( ) , org.springframework.data.gemfire.support.ConnectionEndpoint . java.lang.String ( ) ) && ObjectUtils . nullSafeEquals ( this . int ( ) , org.springframework.data.gemfire.support.ConnectionEndpoint . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = NUMBER ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( java.lang.String ( ) ) ; int = NUMBER * int + ObjectUtils . nullSafeHashCode ( int ( ) ) ; return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( STRING , java.lang.String ( ) , int ( ) ) ; }  <METHOD_END>
