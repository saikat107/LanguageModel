<METHOD_START> public void ( ) { this( HttpStatus . OK ); }  <METHOD_END>
<METHOD_START> public void ( HttpStatus org.springframework.boot.devtools.remote.server.HttpStatus ) { Assert . notNull ( org.springframework.boot.devtools.remote.server.HttpStatus , STRING ) ; this . org.springframework.boot.devtools.remote.server.HttpStatus = org.springframework.boot.devtools.remote.server.HttpStatus ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServerHttpRequest org.springframework.boot.devtools.remote.server.ServerHttpRequest , ServerHttpResponse org.springframework.boot.devtools.remote.server.ServerHttpResponse )			throws java.io.IOException { org.springframework.boot.devtools.remote.server.ServerHttpResponse . setStatusCode ( this . org.springframework.boot.devtools.remote.server.HttpStatus ) ; }  <METHOD_END>
