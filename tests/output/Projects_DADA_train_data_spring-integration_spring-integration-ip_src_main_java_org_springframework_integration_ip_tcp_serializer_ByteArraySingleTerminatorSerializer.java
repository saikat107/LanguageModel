<METHOD_START> public void ( byte byte ) { this . byte = byte ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected byte [] byte[] ( java.io.InputStream java.io.InputStream , byte [] byte[] ) throws java.io.IOException { int int = NUMBER ; int int ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.io.InputStream . int ( ) ) ; } try { while ( true ) { int = java.io.InputStream . int ( ) ; if ( int < NUMBER && int == NUMBER ) { throw new SoftEndOfStreamException ( STRING ) ; } checkClosure ( int ) ; if ( int == this . byte ) { break; } byte[] [ int ++ ] = ( byte ) int ; if ( int >= this . maxMessageSize ) { throw new java.io.IOException ( STRING + java.lang.Integer . java.lang.String ( this . byte & NUMBER ) + STRING + this . maxMessageSize ) ; } } return copyToSizedArray ( byte[] , int ) ; } catch ( SoftEndOfStreamException org.springframework.integration.ip.tcp.serializer.SoftEndOfStreamException ) { throw org.springframework.integration.ip.tcp.serializer.SoftEndOfStreamException ; } catch ( java.io.IOException java.io.IOException ) { publishEvent ( java.io.IOException , byte[] , int ) ; throw java.io.IOException ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { publishEvent ( java.lang.RuntimeException , byte[] , int ) ; throw java.lang.RuntimeException ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( byte [] byte[] , java.io.OutputStream java.io.OutputStream ) throws java.io.IOException { java.io.OutputStream . void ( byte[] ) ; java.io.OutputStream . void ( this . byte ) ; }  <METHOD_END>