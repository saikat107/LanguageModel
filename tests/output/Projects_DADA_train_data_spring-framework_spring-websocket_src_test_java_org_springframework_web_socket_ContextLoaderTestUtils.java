<METHOD_START> public static void void ( WebApplicationContext org.springframework.web.socket.WebApplicationContext ) { void ( java.lang.Thread . java.lang.Thread ( ) . java.lang.ClassLoader ( ) , org.springframework.web.socket.WebApplicationContext ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.ClassLoader java.lang.ClassLoader , WebApplicationContext org.springframework.web.socket.WebApplicationContext ) { if ( org.springframework.web.socket.WebApplicationContext != null ) { java.util.Map<java.lang.ClassLoader,org.springframework.web.socket.WebApplicationContext> . put ( java.lang.ClassLoader , org.springframework.web.socket.WebApplicationContext ) ; } else { java.util.Map<java.lang.ClassLoader,org.springframework.web.socket.WebApplicationContext> . remove ( java.lang.ClassLoader ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private static java.util.Map<java.lang.ClassLoader,org.springframework.web.socket.WebApplicationContext> < java.lang.ClassLoader , WebApplicationContext > java.util.Map<java.lang.ClassLoader,org.springframework.web.socket.WebApplicationContext> ( ) { try { java.lang.reflect.Field java.lang.reflect.Field = ContextLoader .class . java.lang.reflect.Field ( STRING ) ; java.lang.reflect.Field . void ( true ) ; return ( java.util.Map<java.lang.ClassLoader,org.springframework.web.socket.WebApplicationContext> < java.lang.ClassLoader , WebApplicationContext > ) java.lang.reflect.Field . java.lang.Object ( null ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>