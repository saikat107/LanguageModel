<METHOD_START> public void ( java.io.InputStream java.io.InputStream , java.lang.String java.lang.String ) throws java.io.IOException { this( java.io.InputStream , null , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( java.io.InputStream java.io.InputStream , java.lang.ClassLoader java.lang.ClassLoader , java.lang.String java.lang.String ) throws java.io.IOException { super( java.io.InputStream , java.lang.ClassLoader ); this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( java.io.InputStream java.io.InputStream , java.lang.ClassLoader java.lang.ClassLoader , boolean boolean ) throws java.io.IOException { super( java.io.InputStream , java.lang.ClassLoader , boolean ); this . java.lang.String = null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String , java.lang.ClassNotFoundException java.lang.ClassNotFoundException )			throws java.io.IOException , java.lang.ClassNotFoundException { if ( this . java.lang.String == null ) { throw java.lang.ClassNotFoundException ; } return java.rmi.server.RMIClassLoader . java.lang.Class<?> ( this . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.ClassLoader java.lang.ClassLoader ( ) java.io.IOException { return java.rmi.server.RMIClassLoader . java.lang.ClassLoader ( this . java.lang.String ) ; }  <METHOD_END>