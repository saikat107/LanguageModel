<METHOD_START> static java.lang.Object java.lang.Object ( ) { return doGetVisitorAttribute ( ) ; }  <METHOD_END>
<METHOD_START> static java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { return doGetPath ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> static java.lang.Object java.lang.Object ( java.net.URL java.net.URL ) throws java.io.IOException { return getRoot ( java.net.URL ) ; }  <METHOD_END>
<METHOD_START> static void void ( java.lang.Object java.lang.Object , java.lang.reflect.InvocationHandler java.lang.reflect.InvocationHandler ) throws java.io.IOException { java.lang.Object java.lang.Object = java.lang.reflect.Proxy . java.lang.Object ( VIRTUAL_FILE_VISITOR_INTERFACE . getClassLoader ( ) , new java.lang.Class<?> < ? > [] { VIRTUAL_FILE_VISITOR_INTERFACE } , java.lang.reflect.InvocationHandler ) ; invokeVfsMethod ( VIRTUAL_FILE_METHOD_VISIT , java.lang.Object , java.lang.Object ) ; }  <METHOD_END>