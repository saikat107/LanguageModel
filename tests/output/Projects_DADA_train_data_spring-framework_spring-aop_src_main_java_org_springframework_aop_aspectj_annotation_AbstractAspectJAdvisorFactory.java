<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ( boolean ( java.lang.Class<> ) && ! boolean ( java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ( AnnotationUtils . findAnnotation ( java.lang.Class<> , Aspect .class ) != null ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { for ( java.lang.reflect.Field java.lang.reflect.Field : java.lang.Class<> . java.lang.reflect.Field[] ( ) ) { if ( java.lang.reflect.Field . java.lang.String ( ) . boolean ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) throws org.springframework.aop.aspectj.annotation.AopConfigException { if ( java.lang.Class<> . java.lang.Class<? super > ( ) . A ( Aspect .class ) != null && ! java.lang.reflect.Modifier . boolean ( java.lang.Class<> . java.lang.Class<? super > ( ) . int ( ) ) ) { throw new AopConfigException ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING + java.lang.Class<> . java.lang.Class<? super > ( ) . java.lang.String ( ) + STRING ) ; } AjType < ? > org.springframework.aop.aspectj.annotation.AjType<?> = AjTypeSystem . getAjType ( java.lang.Class<> ) ; if ( ! org.springframework.aop.aspectj.annotation.AjType<> . isAspect ( ) ) { throw new NotAnAtAspectException ( java.lang.Class<> ) ; } if ( org.springframework.aop.aspectj.annotation.AjType<> . getPerClause ( ) . getKind ( ) == PerClauseKind . PERCFLOW ) { throw new AopConfigException ( java.lang.Class<> . java.lang.String ( ) + STRING + STRING ) ; } if ( org.springframework.aop.aspectj.annotation.AjType<> . getPerClause ( ) . getKind ( ) == PerClauseKind . PERCFLOWBELOW ) { throw new AopConfigException ( java.lang.Class<> . java.lang.String ( ) + STRING + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected static org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<?> < ? > org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<?> ( java.lang.reflect.Method java.lang.reflect.Method ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = new java.lang.Class<?> < ? > [] { Before .class , Around .class , After .class , AfterReturning .class , AfterThrowing .class , Pointcut .class } ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<?> < ? > org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<?> = org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<java.lang.annotation.Annotation> ( java.lang.reflect.Method , ( java.lang.Class<java.lang.annotation.Annotation> < java.lang.annotation.Annotation > ) java.lang.Class<> ) ; if ( org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<> != null ) { return org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<> ; } } return null ; }  <METHOD_END>
<METHOD_START> private static < A extends java.lang.annotation.Annotation > org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<A> < A > org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<A> ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<A> < A > java.lang.Class<A> ) { A A = AnnotationUtils . findAnnotation ( java.lang.reflect.Method , java.lang.Class<A> ) ; if ( A != null ) { return new org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<A> <> ( A ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> public void ( A A ) { this . A = A ; this . org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType = org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType ( A ) ; try { this . java.lang.String = java.lang.String ( A ) ; this . java.lang.String = ( java.lang.String ) A . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) . java.lang.reflect.Method ( STRING ) . java.lang.Object ( A ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalArgumentException ( A + STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType ( A A ) { for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.util.Map<java.lang.Class<?>,org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType> . java.util.Set<java.lang.Class<?>> ( ) ) { if ( java.lang.Class<> . boolean ( A ) ) { return java.util.Map<java.lang.Class<?>,org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType> . org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType ( java.lang.Class<> ) ; } } throw new java.lang.IllegalStateException ( STRING + A . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( A A ) throws java.lang.Exception { java.lang.String java.lang.String = null ; for ( java.lang.String java.lang.String : java.lang.String[] ) { java.lang.reflect.Method java.lang.reflect.Method ; try { java.lang.reflect.Method = A . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) . java.lang.reflect.Method ( java.lang.String ) ; } catch ( java.lang.NoSuchMethodException java.lang.NoSuchMethodException ) { java.lang.reflect.Method = null ; } if ( java.lang.reflect.Method != null ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.reflect.Method . java.lang.Object ( A ) ; if ( StringUtils . hasText ( java.lang.String ) ) { java.lang.String = java.lang.String ; } } } return java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType ( ) { return this . org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotationType ; }  <METHOD_END>
<METHOD_START> public A A ( ) { return this . A ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . A . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( java.lang.reflect.Method java.lang.reflect.Method ) { if ( java.lang.reflect.Method . int ( ) == NUMBER ) { return new java.lang.String [ NUMBER ] ; } org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<?> < ? > org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<?> = org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<?> ( java.lang.reflect.Method ) ; if ( org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<> == null ) { return null ; } java.util.StringTokenizer java.util.StringTokenizer = new java.util.StringTokenizer ( org.springframework.aop.aspectj.annotation.AbstractAspectJAdvisorFactory.AspectJAnnotation<> . java.lang.String ( ) , STRING ) ; if ( java.util.StringTokenizer . int ( ) > NUMBER ) { java.lang.String [] java.lang.String[] = new java.lang.String [ java.util.StringTokenizer . int ( ) ] ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { java.lang.String[] [ int ] = java.util.StringTokenizer . java.lang.String ( ) ; } return java.lang.String[] ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
