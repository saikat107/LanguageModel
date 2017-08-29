<METHOD_START> public static java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; java.lang.Class<?> < ? > java.lang.Class<?> ; boolean boolean = false ; if ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( ) ) { java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.Class<?> ( ) ; boolean = true ; } else if ( java.lang.Object instanceof java.util.Collection ) { java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) java.lang.Object ; if ( java.util.Collection<> . boolean ( ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } java.lang.Object java.lang.Object = peekAhead ( java.util.Collection<> ) ; java.lang.Class<?> = java.lang.Class<?> ( java.lang.Object ) ; boolean = true ; } else { java.lang.Class<?> = java.lang.Class<?> ( java.lang.Object ) ; } java.lang.String java.lang.String = ClassUtils . getShortNameAsProperty ( java.lang.Class<> ) ; return ( boolean ? java.lang.String ( java.lang.String ) : java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( MethodParameter org.springframework.core.MethodParameter ) { Assert . notNull ( org.springframework.core.MethodParameter , STRING ) ; java.lang.Class<?> < ? > java.lang.Class<?> ; boolean boolean = false ; if ( org.springframework.core.MethodParameter . getParameterType ( ) . isArray ( ) ) { java.lang.Class<?> = org.springframework.core.MethodParameter . getParameterType ( ) . getComponentType ( ) ; boolean = true ; } else if ( java.util.Collection .class . boolean ( org.springframework.core.MethodParameter . getParameterType ( ) ) ) { java.lang.Class<?> = ResolvableType . forMethodParameter ( org.springframework.core.MethodParameter ) . asCollection ( ) . resolveGeneric ( ) ; if ( java.lang.Class<> == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } boolean = true ; } else { java.lang.Class<?> = org.springframework.core.MethodParameter . getParameterType ( ) ; } java.lang.String java.lang.String = ClassUtils . getShortNameAsProperty ( java.lang.Class<> ) ; return ( boolean ? java.lang.String ( java.lang.String ) : java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.reflect.Method java.lang.reflect.Method ) { return java.lang.String ( java.lang.reflect.Method , java.lang.reflect.Method . java.lang.Class<?> ( ) , null ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object java.lang.Object ) { return java.lang.String ( java.lang.reflect.Method , java.lang.reflect.Method . java.lang.Class<?> ( ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.reflect.Method , STRING ) ; if ( java.lang.Object .class == java.lang.Class<> ) { if ( java.lang.Object == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } return java.lang.String ( java.lang.Object ) ; } java.lang.Class<?> < ? > java.lang.Class<?> ; boolean boolean = false ; if ( java.lang.Class<> . boolean ( ) ) { java.lang.Class<?> = java.lang.Class<> . java.lang.Class<?> ( ) ; boolean = true ; } else if ( java.util.Collection .class . boolean ( java.lang.Class<> ) ) { java.lang.Class<?> = ResolvableType . forMethodReturnType ( java.lang.reflect.Method ) . asCollection ( ) . resolveGeneric ( ) ; if ( java.lang.Class<> == null ) { if ( ! ( java.lang.Object instanceof java.util.Collection ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) java.lang.Object ; if ( java.util.Collection<> . boolean ( ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } java.lang.Object java.lang.Object = peekAhead ( java.util.Collection<> ) ; java.lang.Class<?> = java.lang.Class<?> ( java.lang.Object ) ; } boolean = true ; } else { java.lang.Class<?> = java.lang.Class<> ; } java.lang.String java.lang.String = ClassUtils . getShortNameAsProperty ( java.lang.Class<> ) ; return ( boolean ? java.lang.String ( java.lang.String ) : java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; if ( ! java.lang.String . boolean ( STRING ) ) { return java.lang.String ; } char [] char[] = java.lang.String . char[] ( ) ; char [] char[] = new char [ char[] . int - NUMBER ] ; int int = NUMBER ; boolean boolean = false ; for ( char char : char[] ) { if ( char == '-' ) { boolean = true ; } else if ( boolean ) { char[] [ int ++ ] = java.lang.Character . char ( char ) ; boolean = false ; } else { char[] [ int ++ ] = char ; } } return new java.lang.String ( char[] , NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { Assert . notNull ( java.lang.Class<> , STRING ) ; Assert . notNull ( java.lang.String , STRING ) ; return java.lang.Class<> . java.lang.String ( ) + '.' + java.lang.String ; }  <METHOD_END>
<METHOD_START> private static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Object java.lang.Object ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; if ( java.lang.reflect.Proxy . boolean ( java.lang.Class<> ) ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.Class<> . java.lang.Class<?>[] ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { if ( ! java.util.Set<java.lang.Class<?>> . boolean ( java.lang.Class<> ) ) { return java.lang.Class<> ; } } } else if ( java.lang.Class<> . java.lang.String ( ) . int ( '$' ) != - NUMBER && java.lang.Class<> . java.lang.Class<?> ( ) == null ) { java.lang.Class<?> = java.lang.Class<> . java.lang.Class<? super > ( ) ; } return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String + java.lang.String ; }  <METHOD_END>
<METHOD_START> private static < E > E E ( java.util.Collection<E> < E > java.util.Collection<E> ) { java.util.Iterator<E> < E > java.util.Iterator<E> = java.util.Collection<E> . java.util.Iterator<E> ( ) ; if ( ! java.util.Iterator<E> . boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } E E = java.util.Iterator<E> . E ( ) ; if ( E == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } return E ; }  <METHOD_END>
