<METHOD_START> @ java.lang.Override public void void ( com.sun.net.httpserver.HttpExchange com.sun.net.httpserver.HttpExchange ) throws java.io.IOException { if ( ! STRING . boolean ( com.sun.net.httpserver.HttpExchange . java.lang.String ( ) ) ) { com.sun.net.httpserver.HttpExchange . com.sun.net.httpserver.Headers ( ) . void ( STRING , STRING ) ; com.sun.net.httpserver.HttpExchange . void ( NUMBER , - NUMBER ) ; return; } java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( NUMBER ) ; try { invoke ( com.sun.net.httpserver.HttpExchange . java.io.InputStream ( ) , java.io.ByteArrayOutputStream ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { com.sun.net.httpserver.HttpExchange . void ( NUMBER , - NUMBER ) ; logger . error ( STRING , java.lang.Throwable ) ; return; } com.sun.net.httpserver.HttpExchange . com.sun.net.httpserver.Headers ( ) . void ( STRING , CONTENT_TYPE_HESSIAN ) ; com.sun.net.httpserver.HttpExchange . void ( NUMBER , java.io.ByteArrayOutputStream . int ( ) ) ; FileCopyUtils . copy ( java.io.ByteArrayOutputStream . byte[] ( ) , com.sun.net.httpserver.HttpExchange . java.io.OutputStream ( ) ) ; }  <METHOD_END>