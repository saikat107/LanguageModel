<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Set<?> < ? > java.util.Set<?> ) { this . java.util.Set<?> = java.util.Set<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public void void ( ConfigurableListableBeanFactory org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory ) throws org.springframework.beans.factory.annotation.BeansException { if ( this . java.util.Set<> != null ) { if ( ! ( org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory instanceof DefaultListableBeanFactory ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } DefaultListableBeanFactory org.springframework.beans.factory.annotation.DefaultListableBeanFactory = ( DefaultListableBeanFactory ) org.springframework.beans.factory.annotation.ConfigurableListableBeanFactory ; if ( ! ( org.springframework.beans.factory.annotation.DefaultListableBeanFactory . getAutowireCandidateResolver ( ) instanceof QualifierAnnotationAutowireCandidateResolver ) ) { org.springframework.beans.factory.annotation.DefaultListableBeanFactory . setAutowireCandidateResolver ( new QualifierAnnotationAutowireCandidateResolver ( ) ) ; } QualifierAnnotationAutowireCandidateResolver org.springframework.beans.factory.annotation.QualifierAnnotationAutowireCandidateResolver = ( QualifierAnnotationAutowireCandidateResolver ) org.springframework.beans.factory.annotation.DefaultListableBeanFactory . getAutowireCandidateResolver ( ) ; for ( java.lang.Object java.lang.Object : this . java.util.Set<> ) { java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> = null ; if ( java.lang.Object instanceof java.lang.Class ) { java.lang.Class<? extends java.lang.annotation.Annotation> = ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > ) java.lang.Object ; } else if ( java.lang.Object instanceof java.lang.String ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; java.lang.Class<? extends java.lang.annotation.Annotation> = ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > ) ClassUtils . resolveClassName ( java.lang.String , this . java.lang.ClassLoader ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object + STRING ) ; } if ( ! java.lang.annotation.Annotation .class . boolean ( java.lang.Class<> ) ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING ) ; } org.springframework.beans.factory.annotation.QualifierAnnotationAutowireCandidateResolver . addQualifierType ( java.lang.Class<> ) ; } } }  <METHOD_END>
