<METHOD_START> public static < T > T T ( java.lang.Class<T> < T > java.lang.Class<T> ) { Assert . notNull ( java.lang.Class<T> , STRING ) ; return T ( java.lang.Class<T> , java.lang.Class<T> . java.lang.ClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> public static < T > T T ( java.lang.Class<T> < T > java.lang.Class<T> , java.lang.ClassLoader java.lang.ClassLoader ) { if ( MapId .class . boolean ( java.lang.Class<T> ) ) { return ( T ) new BasicMapId ( ) ; } IdInterfaceValidator . validate ( java.lang.Class<T> ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.Class<T> . java.lang.Class<?>[] ( ) ; switch ( java.lang.Class<?>[] . int ) { case NUMBER : java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { java.lang.Class<T> , MapId .class , java.io.Serializable .class } ; break; case NUMBER : java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?>[] [ NUMBER ] . boolean ( java.io.Serializable .class ) ? MapId .class : java.io.Serializable .class ; java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { java.lang.Class<T> , java.lang.Class<?>[] [ NUMBER ] , java.lang.Class<> } ; break; default: java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { java.lang.Class<T> , java.lang.Class<?>[] [ NUMBER ] , java.lang.Class<?>[] [ NUMBER ] } ; } return ( T ) java.lang.reflect.Proxy . java.lang.Object ( java.lang.ClassLoader , java.lang.Class<?>[] , new MapIdProxyDelegate ( java.lang.Class<T> ) ) ; }  <METHOD_END>
