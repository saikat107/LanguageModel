<METHOD_START> public void ( ) { this( false ); }  <METHOD_END>
<METHOD_START> public void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( byte [] byte[] , java.io.OutputStream java.io.OutputStream )			throws java.io.IOException { java.io.OutputStream . void ( byte[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected byte [] byte[] ( java.io.InputStream java.io.InputStream , byte [] byte[] ) throws java.io.IOException { int int = NUMBER ; int int = NUMBER ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.io.InputStream . int ( ) ) ; } try { while ( int >= NUMBER ) { try { int = java.io.InputStream . int ( ) ; } catch ( java.net.SocketTimeoutException java.net.SocketTimeoutException ) { if ( ! this . boolean ) { throw java.net.SocketTimeoutException ; } int = - NUMBER ; } if ( int < NUMBER ) { if ( int == NUMBER ) { throw new SoftEndOfStreamException ( STRING ) ; } break; } if ( int >= this . maxMessageSize ) { throw new java.io.IOException ( STRING + this . maxMessageSize ) ; } byte[] [ int ++ ] = ( byte ) int ; } return copyToSizedArray ( byte[] , int ) ; } catch ( SoftEndOfStreamException org.springframework.integration.ip.tcp.serializer.SoftEndOfStreamException ) { throw org.springframework.integration.ip.tcp.serializer.SoftEndOfStreamException ; } catch ( java.io.IOException java.io.IOException ) { publishEvent ( java.io.IOException , byte[] , int ) ; throw java.io.IOException ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { publishEvent ( java.lang.RuntimeException , byte[] , int ) ; throw java.lang.RuntimeException ; } }  <METHOD_END>
