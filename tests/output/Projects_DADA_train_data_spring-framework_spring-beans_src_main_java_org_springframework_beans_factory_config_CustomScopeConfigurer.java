<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { this . java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , Scope org.springframework.beans.factory.config.Scope ) { if ( this . java.util.Map<java.lang.String,java.lang.Object> == null ) { this . java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( NUMBER ) ; } this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , org.springframework.beans.factory.config.Scope ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.beans.factory.config.ConfigurableListableBeanFactory ) throws org.springframework.beans.factory.config.BeansException { if ( this . java.util.Map<java.lang.String,java.lang.Object> != null ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map.Entry<java.lang.String,java.lang.Object> : this . java.util.Map<java.lang.String,java.lang.Object> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Object>> ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.String ( ) ; java.lang.Object java.lang.Object = java.util.Map.Entry<java.lang.String,java.lang.Object> . java.lang.Object ( ) ; if ( java.lang.Object instanceof Scope ) { org.springframework.beans.factory.config.ConfigurableListableBeanFactory . registerScope ( java.lang.String , ( Scope ) java.lang.Object ) ; } else if ( java.lang.Object instanceof java.lang.Class ) { java.lang.Class<?> < ? > java.lang.Class<?> = ( java.lang.Class<?> < ? > ) java.lang.Object ; Assert . isAssignable ( Scope .class , java.lang.Class<> , STRING ) ; org.springframework.beans.factory.config.ConfigurableListableBeanFactory . registerScope ( java.lang.String , ( Scope ) BeanUtils . instantiateClass ( java.lang.Class<> ) ) ; } else if ( java.lang.Object instanceof java.lang.String ) { java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . resolveClassName ( ( java.lang.String ) java.lang.Object , this . java.lang.ClassLoader ) ; Assert . isAssignable ( Scope .class , java.lang.Class<> , STRING ) ; org.springframework.beans.factory.config.ConfigurableListableBeanFactory . registerScope ( java.lang.String , ( Scope ) BeanUtils . instantiateClass ( java.lang.Class<> ) ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object + STRING + java.lang.String + STRING + Scope .class . java.lang.String ( ) + STRING ) ; } } } }  <METHOD_END>
