<METHOD_START> private void ( ) {	}  <METHOD_END>
<METHOD_START> public static byte [] byte[] ( RandomAccessData org.springframework.boot.loader.jar.RandomAccessData ) throws java.io.IOException { java.io.InputStream java.io.InputStream = org.springframework.boot.loader.jar.RandomAccessData . getInputStream ( ResourceAccess . ONCE ) ; try { return byte[] ( java.io.InputStream , org.springframework.boot.loader.jar.RandomAccessData . getSize ( ) ) ; } finally { java.io.InputStream . void ( ) ; } }  <METHOD_END>
<METHOD_START> public static byte [] byte[] ( java.io.InputStream java.io.InputStream , long long ) throws java.io.IOException { if ( long == NUMBER ) { return byte[] ; } byte [] byte[] = new byte [ ( int ) long ] ; if ( ! boolean ( java.io.InputStream , byte[] ) ) { throw new java.io.IOException ( STRING ) ; } return byte[] ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( java.io.InputStream java.io.InputStream , byte [] byte[] ) throws java.io.IOException { return boolean ( java.io.InputStream , byte[] , NUMBER , byte[] . int ) ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( java.io.InputStream java.io.InputStream , byte [] byte[] , int int , int int ) throws java.io.IOException { while ( int > NUMBER ) { int int = java.io.InputStream . int ( byte[] , int , int ) ; if ( int == - NUMBER ) { return false ; } int += int ; int = - int ; } return true ; }  <METHOD_END>
<METHOD_START> public static long long ( byte [] byte[] , int int , int int ) { long long = NUMBER ; for ( int int = int - NUMBER ; int >= NUMBER ; int -- ) { long = ( ( long << NUMBER ) | ( byte[] [ int + int ] & NUMBER ) ) ; } return long ; }  <METHOD_END>
