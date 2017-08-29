<METHOD_START> @ java.lang.SafeVarargs public void ( java.lang.reflect.Constructor<T> < T > java.lang.reflect.Constructor<T> , org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P> < java.lang.Object , P > ... org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>[] ) { Assert . notNull ( java.lang.reflect.Constructor<T> , STRING ) ; Assert . notNull ( org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>[] , STRING ) ; ReflectionUtils . makeAccessible ( java.lang.reflect.Constructor<T> ) ; this . java.lang.reflect.Constructor<T> = java.lang.reflect.Constructor<T> ; this . java.util.List<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> = java.util.Arrays . java.util.List<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> ( org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>[] ) ; }  <METHOD_END>
<METHOD_START> public java.lang.reflect.Constructor<T> < T > java.lang.reflect.Constructor<T> ( ) { return java.lang.reflect.Constructor<T> ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mapping.Streamable<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> < org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P> < java.lang.Object , P > > org.springframework.data.mapping.Streamable<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> ( ) { return Streamable . of ( java.util.List<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! java.util.List<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return java.util.List<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return java.lang.reflect.Constructor<T> . boolean ( PersistenceConstructor .class ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( PersistentProperty < ? > org.springframework.data.mapping.PersistentProperty<?> ) { Assert . notNull ( org.springframework.data.mapping.PersistentProperty<> , STRING ) ; try { java.util.concurrent.locks.Lock . void ( ) ; java.lang.Boolean java.lang.Boolean = java.util.Map<org.springframework.data.mapping.PersistentProperty<?>,java.lang.Boolean> . get ( org.springframework.data.mapping.PersistentProperty<> ) ; if ( java.lang.Boolean != null ) { return java.lang.Boolean ; } } finally { java.util.concurrent.locks.Lock . void ( ) ; } try { java.util.concurrent.locks.Lock . void ( ) ; for ( org.springframework.data.mapping.PreferredConstructor.Parameter<?,P> < ? , P > org.springframework.data.mapping.PreferredConstructor.Parameter<?,P> : java.util.List<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> ) { if ( org.springframework.data.mapping.PreferredConstructor.Parameter<,P> . boolean ( org.springframework.data.mapping.PersistentProperty<> ) ) { java.util.Map<org.springframework.data.mapping.PersistentProperty<?>,java.lang.Boolean> . put ( org.springframework.data.mapping.PersistentProperty<> , true ) ; return true ; } } java.util.Map<org.springframework.data.mapping.PersistentProperty<?>,java.lang.Boolean> . put ( org.springframework.data.mapping.PersistentProperty<> , false ) ; return false ; } finally { java.util.concurrent.locks.Lock . void ( ) ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( org.springframework.data.mapping.PreferredConstructor.Parameter<?,P> < ? , P > org.springframework.data.mapping.PreferredConstructor.Parameter<?,P> ) { Assert . notNull ( org.springframework.data.mapping.PreferredConstructor.Parameter<,P> , STRING ) ; if ( java.util.List<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> . boolean ( ) || ! org.springframework.data.mapping.PreferredConstructor.Parameter<,P> . boolean ( ) ) { return false ; } return java.util.List<org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P>> . org.springframework.data.mapping.PreferredConstructor.Parameter<java.lang.Object,P> ( NUMBER ) . boolean ( org.springframework.data.mapping.PreferredConstructor.Parameter<,P> ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> , TypeInformation < T > org.springframework.data.mapping.TypeInformation<T> , java.lang.annotation.Annotation [] java.lang.annotation.Annotation[] , java.util.Optional<org.springframework.data.mapping.PersistentEntity<T,P>> < PersistentEntity < T , P > > java.util.Optional<org.springframework.data.mapping.PersistentEntity<T,P>> ) { Assert . notNull ( org.springframework.data.mapping.TypeInformation<T> , STRING ) ; Assert . notNull ( java.lang.annotation.Annotation[] , STRING ) ; this . java.util.Optional<java.lang.String> = java.util.Optional<java.lang.String> ; this . org.springframework.data.mapping.TypeInformation<T> = org.springframework.data.mapping.TypeInformation<T> ; this . java.util.Optional<java.lang.String> = java.util.Optional<java.lang.String> ( java.lang.annotation.Annotation[] ) ; this . java.util.Optional<org.springframework.data.mapping.PersistentEntity<T,P>> = java.util.Optional<org.springframework.data.mapping.PersistentEntity<T,P>> ; this . org.springframework.data.mapping.Lazy<java.lang.Boolean> = Lazy . of ( ( ) { Class < T > owningType = entity . orElseThrow ( IllegalStateException ::new ) . getType ( ) ; return owningType . isMemberClass ( ) && type . getType ( ) . equals ( owningType . getEnclosingClass ( ) ) ; } ) ; this . org.springframework.data.mapping.Lazy<java.lang.Boolean> = Lazy . of ( ( ) getSpelExpression ( ) . map ( StringUtils :: hasText ) . orElse ( false ) ) ; }  <METHOD_END>
<METHOD_START> private static java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> ( java.lang.annotation.Annotation [] java.lang.annotation.Annotation[] ) { return java.util.Arrays . java.util.stream.Stream<java.lang.annotation.Annotation> ( java.lang.annotation.Annotation[] ) . java.util.stream.Stream<java.lang.annotation.Annotation> ( java.lang.annotation.Annotation -> java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) == Value .class ) . java.util.Optional<java.lang.annotation.Annotation> ( ) . java.util.Optional<java.lang.Object> ( java.lang.annotation.Annotation -> ( ( Value ) java.lang.annotation.Annotation ) . value ( ) ) . filter ( StringUtils :: hasText ) ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> ( ) { return java.util.Optional<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mapping.TypeInformation<T> < T > org.springframework.data.mapping.TypeInformation<T> ( ) { return org.springframework.data.mapping.TypeInformation<T> ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<T> < T > java.lang.Class<T> ( ) { return org.springframework.data.mapping.TypeInformation<T> . getType ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> ( ) { return java.util.Optional<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return org.springframework.data.mapping.Lazy<java.lang.Boolean> . get ( ) ; }  <METHOD_END>
<METHOD_START> boolean boolean ( PersistentProperty < ? > org.springframework.data.mapping.PersistentProperty<?> ) { return java.util.Optional<java.lang.String> . java.util.Optional<java.lang.Object> ( java.lang.String -> java.util.Optional<org.springframework.data.mapping.PersistentEntity<T,P>> . flatMap ( it -> it . getPersistentProperty ( s ) ) . map ( org.springframework.data.mapping.PersistentProperty<> :: equals ) . orElse ( false ) ) . orElse ( false ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { return org.springframework.data.mapping.Lazy<java.lang.Boolean> . get ( ) ; }  <METHOD_END>