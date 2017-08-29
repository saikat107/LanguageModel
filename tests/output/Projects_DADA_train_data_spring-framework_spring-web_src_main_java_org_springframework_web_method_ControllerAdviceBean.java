<METHOD_START> public void ( java.lang.Object java.lang.Object ) { this( java.lang.Object , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , BeanFactory org.springframework.web.method.BeanFactory ) { this( ( java.lang.Object ) java.lang.String , org.springframework.web.method.BeanFactory ); }  <METHOD_END>
<METHOD_START> private void ( java.lang.Object java.lang.Object , BeanFactory org.springframework.web.method.BeanFactory ) { this . java.lang.Object = java.lang.Object ; this . org.springframework.web.method.BeanFactory = org.springframework.web.method.BeanFactory ; java.lang.Class<?> < ? > java.lang.Class<?> ; if ( java.lang.Object instanceof java.lang.String ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; Assert . hasText ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.web.method.BeanFactory , STRING ) ; if ( ! org.springframework.web.method.BeanFactory . containsBean ( java.lang.String ) ) { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.web.method.BeanFactory + STRING + java.lang.String + STRING ) ; } java.lang.Class<?> = this . org.springframework.web.method.BeanFactory . getType ( java.lang.String ) ; this . int = int ( java.lang.Class<> ) ; } else { Assert . notNull ( java.lang.Object , STRING ) ; java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; this . int = int ( java.lang.Object ) ; } ControllerAdvice org.springframework.web.method.ControllerAdvice = AnnotatedElementUtils . findMergedAnnotation ( java.lang.Class<> , ControllerAdvice .class ) ; if ( org.springframework.web.method.ControllerAdvice != null ) { this . java.util.Set<java.lang.String> = java.util.Set<java.lang.String> ( org.springframework.web.method.ControllerAdvice ) ; this . java.util.List<java.lang.Class<?>> = java.util.Arrays . java.util.List ( org.springframework.web.method.ControllerAdvice . assignableTypes ( ) ) ; this . java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> = java.util.Arrays . java.util.List ( org.springframework.web.method.ControllerAdvice . annotations ( ) ) ; } else { this . java.util.Set<java.lang.String> = java.util.Collections . java.util.Set<java.lang.String> ( ) ; this . java.util.List<java.lang.Class<?>> = java.util.Collections . java.util.List<java.lang.Class<?>> ( ) ; this . java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> = java.util.Collections . java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { java.lang.Class<?> < ? > java.lang.Class<?> = ( this . java.lang.Object instanceof java.lang.String ? this . org.springframework.web.method.BeanFactory . getType ( ( java.lang.String ) this . java.lang.Object ) : this . java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; return ClassUtils . getUserClass ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return ( this . java.lang.Object instanceof java.lang.String ? this . org.springframework.web.method.BeanFactory . getBean ( ( java.lang.String ) this . java.lang.Object ) : this . java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( ! boolean ( ) ) { return true ; } else if ( java.lang.Class<> != null ) { for ( java.lang.String java.lang.String : this . java.util.Set<java.lang.String> ) { if ( java.lang.Class<> . java.lang.String ( ) . boolean ( java.lang.String ) ) { return true ; } } for ( java.lang.Class<?> < ? > java.lang.Class<?> : this . java.util.List<java.lang.Class<?>> ) { if ( ClassUtils . isAssignable ( java.lang.Class<> , java.lang.Class<> ) ) { return true ; } } for ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> : this . java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> ) { if ( AnnotationUtils . findAnnotation ( java.lang.Class<> , java.lang.Class<> ) != null ) { return true ; } } } return false ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { return ( ! this . java.util.Set<java.lang.String> . boolean ( ) || ! this . java.util.List<java.lang.Class<?>> . boolean ( ) || ! this . java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.web.method.ControllerAdviceBean ) ) { return false ; } org.springframework.web.method.ControllerAdviceBean org.springframework.web.method.ControllerAdviceBean = ( org.springframework.web.method.ControllerAdviceBean ) java.lang.Object ; return ( this . java.lang.Object . boolean ( org.springframework.web.method.ControllerAdviceBean . java.lang.Object ) && this . org.springframework.web.method.BeanFactory == org.springframework.web.method.ControllerAdviceBean . org.springframework.web.method.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.lang.Object . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.Object . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.util.List<org.springframework.web.method.ControllerAdviceBean> < org.springframework.web.method.ControllerAdviceBean > java.util.List<org.springframework.web.method.ControllerAdviceBean> ( ApplicationContext org.springframework.web.method.ApplicationContext ) { java.util.List<org.springframework.web.method.ControllerAdviceBean> < org.springframework.web.method.ControllerAdviceBean > java.util.List<org.springframework.web.method.ControllerAdviceBean> = new java.util.ArrayList<org.springframework.web.method.ControllerAdviceBean> <> ( ) ; for ( java.lang.String java.lang.String : BeanFactoryUtils . beanNamesForTypeIncludingAncestors ( org.springframework.web.method.ApplicationContext , java.lang.Object .class ) ) { if ( org.springframework.web.method.ApplicationContext . findAnnotationOnBean ( java.lang.String , ControllerAdvice .class ) != null ) { java.util.List<org.springframework.web.method.ControllerAdviceBean> . boolean ( new org.springframework.web.method.ControllerAdviceBean ( java.lang.String , org.springframework.web.method.ApplicationContext ) ) ; } } return java.util.List<org.springframework.web.method.ControllerAdviceBean> ; }  <METHOD_END>
<METHOD_START> private static int int ( java.lang.Object java.lang.Object ) { return ( java.lang.Object instanceof Ordered ? ( ( Ordered ) java.lang.Object ) . getOrder ( ) : int ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private static int int ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return OrderUtils . getOrder ( java.lang.Class<> , Ordered . LOWEST_PRECEDENCE ) ; }  <METHOD_END>
<METHOD_START> private static java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ControllerAdvice org.springframework.web.method.ControllerAdvice ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : org.springframework.web.method.ControllerAdvice . basePackages ( ) ) { if ( StringUtils . hasText ( java.lang.String ) ) { java.util.Set<java.lang.String> . boolean ( java.lang.String ( java.lang.String ) ) ; } } for ( java.lang.Class<?> < ? > java.lang.Class<?> : org.springframework.web.method.ControllerAdvice . basePackageClasses ( ) ) { java.util.Set<java.lang.String> . boolean ( java.lang.String ( ClassUtils . getPackageName ( java.lang.Class<> ) ) ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return ( java.lang.String . boolean ( STRING ) ? java.lang.String : java.lang.String + STRING ) ; }  <METHOD_END>
