<METHOD_START> void ( byte [] byte[] , int int ) { this . byte[] = byte[] ; this . int = int ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return byte[] [ int ] ; }  <METHOD_END>
<METHOD_START> public int int ( int int ) { return byte[] [ int + NUMBER * int + NUMBER ] ; }  <METHOD_END>
<METHOD_START> public int int ( int int ) { return byte[] [ int + NUMBER * int + NUMBER ] ; }  <METHOD_END>
<METHOD_START> public static org.springframework.asm.TypePath org.springframework.asm.TypePath ( final java.lang.String java.lang.String ) { if ( java.lang.String == null || java.lang.String . int ( ) == NUMBER ) { return null ; } int int = java.lang.String . int ( ) ; ByteVector org.springframework.asm.ByteVector = new ByteVector ( int ) ; org.springframework.asm.ByteVector . putByte ( NUMBER ) ; for ( int int = NUMBER ; int < int ;) { char char = java.lang.String . char ( int ++ ) ; if ( char == '[' ) { org.springframework.asm.ByteVector . put11 ( int , NUMBER ) ; } else if ( char == '.' ) { org.springframework.asm.ByteVector . put11 ( int , NUMBER ) ; } else if ( char == '*' ) { org.springframework.asm.ByteVector . put11 ( int , NUMBER ) ; } else if ( char >= '0' && char <= '9' ) { int int = char - '0' ; while ( int < int && ( char = java.lang.String . char ( int ) ) >= '0' && char <= '9' ) { int = int * NUMBER + char - '0' ; int += NUMBER ; } if ( int < int && java.lang.String . char ( int ) == ';' ) { int += NUMBER ; } org.springframework.asm.ByteVector . put11 ( int , int ) ; } } out . data [ NUMBER ] = ( byte ) ( out . length / NUMBER ) ; return new org.springframework.asm.TypePath ( out . data , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { int int = int ( ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( int * NUMBER ) ; for ( int int = NUMBER ; int < int ; ++ int ) { switch ( int ( int ) ) { case int : java.lang.StringBuilder . java.lang.StringBuilder ( '[' ) ; break; case int : java.lang.StringBuilder . java.lang.StringBuilder ( '.' ) ; break; case int : java.lang.StringBuilder . java.lang.StringBuilder ( '*' ) ; break; case int : java.lang.StringBuilder . java.lang.StringBuilder ( int ( int ) ) . java.lang.StringBuilder ( ';' ) ; break; default: java.lang.StringBuilder . java.lang.StringBuilder ( '_' ) ; } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>