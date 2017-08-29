<METHOD_START> protected void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> , ResolvableType org.springframework.boot.test.json.ResolvableType ) { Assert . notNull ( java.lang.Class<> , STRING ) ; Assert . notNull ( org.springframework.boot.test.json.ResolvableType , STRING ) ; void ( java.lang.Class<> , org.springframework.boot.test.json.ResolvableType ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( java.lang.Class<?> < ? > java.lang.Class<?> , ResolvableType org.springframework.boot.test.json.ResolvableType ) { if ( this . java.lang.Class<> == null && this . org.springframework.boot.test.json.ResolvableType == null ) { this . java.lang.Class<?> = java.lang.Class<> ; this . org.springframework.boot.test.json.ResolvableType = org.springframework.boot.test.json.ResolvableType ; } }  <METHOD_END>
<METHOD_START> protected final org.springframework.boot.test.json.ResolvableType org.springframework.boot.test.json.ResolvableType ( ) { return this . org.springframework.boot.test.json.ResolvableType ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.JsonContent<T> < T > org.springframework.boot.test.json.JsonContent<T> ( T T ) throws java.io.IOException { void ( ) ; Assert . notNull ( T , STRING ) ; java.lang.String java.lang.String = java.lang.String ( T , this . org.springframework.boot.test.json.ResolvableType ) ; return new JsonContent <> ( this . java.lang.Class<> , this . org.springframework.boot.test.json.ResolvableType , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public T T ( byte [] byte[] ) throws java.io.IOException { void ( ) ; return org.springframework.boot.test.json.ObjectContent<T> ( byte[] ) . getObject ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.ObjectContent<T> < T > org.springframework.boot.test.json.ObjectContent<T> ( byte [] byte[] ) throws java.io.IOException { void ( ) ; Assert . notNull ( byte[] , STRING ) ; return org.springframework.boot.test.json.ObjectContent<T> ( new ByteArrayResource ( byte[] ) ) ; }  <METHOD_END>
<METHOD_START> public T T ( java.lang.String java.lang.String ) throws java.io.IOException { void ( ) ; return org.springframework.boot.test.json.ObjectContent<T> ( java.lang.String ) . getObject ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.ObjectContent<T> < T > org.springframework.boot.test.json.ObjectContent<T> ( java.lang.String java.lang.String ) throws java.io.IOException { void ( ) ; Assert . notNull ( java.lang.String , STRING ) ; return org.springframework.boot.test.json.ObjectContent<T> ( new java.io.StringReader ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public T T ( java.lang.String java.lang.String ) throws java.io.IOException { void ( ) ; return org.springframework.boot.test.json.ObjectContent<T> ( java.lang.String ) . getObject ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.ObjectContent<T> < T > org.springframework.boot.test.json.ObjectContent<T> ( java.lang.String java.lang.String ) throws java.io.IOException { void ( ) ; Assert . notNull ( java.lang.String , STRING ) ; return org.springframework.boot.test.json.ObjectContent<T> ( new ClassPathResource ( java.lang.String , this . java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> public T T ( java.io.File java.io.File ) throws java.io.IOException { void ( ) ; return org.springframework.boot.test.json.ObjectContent<T> ( java.io.File ) . getObject ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.ObjectContent<T> < T > org.springframework.boot.test.json.ObjectContent<T> ( java.io.File java.io.File ) throws java.io.IOException { void ( ) ; Assert . notNull ( java.io.File , STRING ) ; return org.springframework.boot.test.json.ObjectContent<T> ( new FileSystemResource ( java.io.File ) ) ; }  <METHOD_END>
<METHOD_START> public T T ( java.io.InputStream java.io.InputStream ) throws java.io.IOException { void ( ) ; return org.springframework.boot.test.json.ObjectContent<T> ( java.io.InputStream ) . getObject ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.ObjectContent<T> < T > org.springframework.boot.test.json.ObjectContent<T> ( java.io.InputStream java.io.InputStream ) throws java.io.IOException { void ( ) ; Assert . notNull ( java.io.InputStream , STRING ) ; return org.springframework.boot.test.json.ObjectContent<T> ( new InputStreamResource ( java.io.InputStream ) ) ; }  <METHOD_END>
<METHOD_START> public T T ( Resource org.springframework.boot.test.json.Resource ) throws java.io.IOException { void ( ) ; return org.springframework.boot.test.json.ObjectContent<T> ( org.springframework.boot.test.json.Resource ) . getObject ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.ObjectContent<T> < T > org.springframework.boot.test.json.ObjectContent<T> ( Resource org.springframework.boot.test.json.Resource ) throws java.io.IOException { void ( ) ; Assert . notNull ( org.springframework.boot.test.json.Resource , STRING ) ; java.io.InputStream java.io.InputStream = org.springframework.boot.test.json.Resource . getInputStream ( ) ; T T = T ( java.io.InputStream , this . org.springframework.boot.test.json.ResolvableType ) ; void ( java.io.InputStream ) ; return new ObjectContent <> ( this . org.springframework.boot.test.json.ResolvableType , T ) ; }  <METHOD_END>
<METHOD_START> public T T ( java.io.Reader java.io.Reader ) throws java.io.IOException { void ( ) ; return org.springframework.boot.test.json.ObjectContent<T> ( java.io.Reader ) . getObject ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.ObjectContent<T> < T > org.springframework.boot.test.json.ObjectContent<T> ( java.io.Reader java.io.Reader ) throws java.io.IOException { void ( ) ; Assert . notNull ( java.io.Reader , STRING ) ; T T = T ( java.io.Reader , this . org.springframework.boot.test.json.ResolvableType ) ; void ( java.io.Reader ) ; return new ObjectContent <> ( this . org.springframework.boot.test.json.ResolvableType , T ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.io.Closeable java.io.Closeable ) { try { java.io.Closeable . void ( ) ; } catch ( java.io.IOException java.io.IOException ) {		} }  <METHOD_END>
<METHOD_START> private void void ( ) { Assert . state ( this . java.lang.Class<> != null , STRING ) ; Assert . state ( this . org.springframework.boot.test.json.ResolvableType != null , STRING ) ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( T T , ResolvableType org.springframework.boot.test.json.ResolvableType )			throws java.io.IOException ;  <METHOD_END>
<METHOD_START> protected T T ( java.io.InputStream java.io.InputStream , ResolvableType org.springframework.boot.test.json.ResolvableType )			throws java.io.IOException { java.io.BufferedReader java.io.BufferedReader = new java.io.BufferedReader ( new java.io.InputStreamReader ( java.io.InputStream ) ) ; return T ( java.io.BufferedReader , org.springframework.boot.test.json.ResolvableType ) ; }  <METHOD_END>
<METHOD_START> protected abstract T T ( java.io.Reader java.io.Reader , ResolvableType org.springframework.boot.test.json.ResolvableType )			throws java.io.IOException ;  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected void ( java.lang.Class<? extends org.springframework.boot.test.json.AbstractJsonMarshalTester> < ? extends org.springframework.boot.test.json.AbstractJsonMarshalTester > java.lang.Class<? extends org.springframework.boot.test.json.AbstractJsonMarshalTester> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void void ( final java.lang.Object java.lang.Object , final M M ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( M , STRING ) ; void ( java.lang.Object , new ObjectFactory < M > ( ) { @ java.lang.Override public M M ( ) org.springframework.boot.test.json.BeansException { return M ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public M M ( ) org.springframework.boot.test.json.BeansException { return M ; }  <METHOD_END>
<METHOD_START> public void void ( final java.lang.Object java.lang.Object , final ObjectFactory < M > org.springframework.boot.test.json.ObjectFactory<M> ) { Assert . notNull ( java.lang.Object , STRING ) ; Assert . notNull ( org.springframework.boot.test.json.ObjectFactory<M> , STRING ) ; ReflectionUtils . doWithFields ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , new FieldCallback ( ) { @ java.lang.Override public void void ( java.lang.reflect.Field java.lang.reflect.Field )						throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { void ( java.lang.reflect.Field , java.lang.Object , org.springframework.boot.test.json.ObjectFactory<M> ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Field java.lang.reflect.Field )						throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { void ( java.lang.reflect.Field , java.lang.Object , org.springframework.boot.test.json.ObjectFactory<M> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.reflect.Field java.lang.reflect.Field , java.lang.Object java.lang.Object , ObjectFactory < M > org.springframework.boot.test.json.ObjectFactory<M> ) { if ( this . java.lang.Class<> . boolean ( java.lang.reflect.Field . java.lang.Class<?> ( ) ) ) { ReflectionUtils . makeAccessible ( java.lang.reflect.Field ) ; java.lang.Object java.lang.Object = ReflectionUtils . getField ( java.lang.reflect.Field , java.lang.Object ) ; if ( java.lang.Object == null ) { void ( java.lang.reflect.Field , java.lang.Object , org.springframework.boot.test.json.ObjectFactory<M> ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.reflect.Field java.lang.reflect.Field , java.lang.Object java.lang.Object , ObjectFactory < M > org.springframework.boot.test.json.ObjectFactory<M> ) { ResolvableType org.springframework.boot.test.json.ResolvableType = ResolvableType . forField ( java.lang.reflect.Field ) . getGeneric ( ) ; ReflectionUtils . setField ( java.lang.reflect.Field , java.lang.Object , org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , org.springframework.boot.test.json.ResolvableType , org.springframework.boot.test.json.ObjectFactory<M> . getObject ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> ( java.lang.Class<?> < ? > java.lang.Class<?> , ResolvableType org.springframework.boot.test.json.ResolvableType , M M );  <METHOD_END>