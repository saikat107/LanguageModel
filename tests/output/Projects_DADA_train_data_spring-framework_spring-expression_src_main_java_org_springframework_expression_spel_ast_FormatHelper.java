<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String , java.util.List<org.springframework.expression.spel.ast.TypeDescriptor> < TypeDescriptor > java.util.List<org.springframework.expression.spel.ast.TypeDescriptor> ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; for ( int int = NUMBER ; int < java.util.List<org.springframework.expression.spel.ast.TypeDescriptor> . size ( ) ; int ++ ) { if ( int > NUMBER ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } TypeDescriptor org.springframework.expression.spel.ast.TypeDescriptor = java.util.List<org.springframework.expression.spel.ast.TypeDescriptor> . get ( int ) ; if ( org.springframework.expression.spel.ast.TypeDescriptor != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ( org.springframework.expression.spel.ast.TypeDescriptor . getType ( ) ) ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ( null ) ) ; } } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ( java.lang.Class<> != null ? ClassUtils . getQualifiedName ( java.lang.Class<> ) : STRING ) ; }  <METHOD_END>
