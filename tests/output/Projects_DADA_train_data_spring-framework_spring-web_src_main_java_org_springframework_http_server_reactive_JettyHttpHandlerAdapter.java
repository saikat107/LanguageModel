<METHOD_START> public void ( HttpHandler org.springframework.http.server.reactive.HttpHandler ) { super( org.springframework.http.server.reactive.HttpHandler ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.server.reactive.ServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponse ( HttpServletResponse org.springframework.http.server.reactive.HttpServletResponse , AsyncContext org.springframework.http.server.reactive.AsyncContext ) throws java.io.IOException { return new org.springframework.http.server.reactive.JettyHttpHandlerAdapter.JettyServerHttpResponse ( org.springframework.http.server.reactive.HttpServletResponse , org.springframework.http.server.reactive.AsyncContext , getDataBufferFactory ( ) , getBufferSize ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( HttpServletResponse org.springframework.http.server.reactive.HttpServletResponse , AsyncContext org.springframework.http.server.reactive.AsyncContext , DataBufferFactory org.springframework.http.server.reactive.DataBufferFactory , int int ) throws java.io.IOException { super( org.springframework.http.server.reactive.HttpServletResponse , org.springframework.http.server.reactive.AsyncContext , org.springframework.http.server.reactive.DataBufferFactory , int ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected int int ( DataBuffer org.springframework.http.server.reactive.DataBuffer ) throws java.io.IOException { java.nio.ByteBuffer java.nio.ByteBuffer = org.springframework.http.server.reactive.DataBuffer . asByteBuffer ( ) ; int int = java.nio.ByteBuffer . int ( ) ; ( ( HttpOutput ) getServletResponse ( ) . getOutputStream ( ) ) . write ( java.nio.ByteBuffer ) ; return int ; }  <METHOD_END>
