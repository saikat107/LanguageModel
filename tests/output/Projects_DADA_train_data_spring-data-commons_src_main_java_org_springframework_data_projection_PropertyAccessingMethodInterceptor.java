<METHOD_START> public void ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; this . org.springframework.data.projection.BeanWrapper = new DirectFieldAccessFallbackBeanWrapper ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.data.projection.MethodInvocation ) throws java.lang.Throwable { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.projection.MethodInvocation . getMethod ( ) ; if ( ReflectionUtils . isObjectMethod ( java.lang.reflect.Method ) ) { return org.springframework.data.projection.MethodInvocation . proceed ( ) ; } java.beans.PropertyDescriptor java.beans.PropertyDescriptor = BeanUtils . findPropertyForMethod ( java.lang.reflect.Method ) ; if ( java.beans.PropertyDescriptor == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } if ( ! boolean ( java.lang.reflect.Method , java.beans.PropertyDescriptor ) ) { return org.springframework.data.projection.BeanWrapper . getPropertyValue ( java.beans.PropertyDescriptor . java.lang.String ( ) ) ; } if ( org.springframework.data.projection.MethodInvocation . getArguments ( ) . length != NUMBER ) { throw new java.lang.IllegalStateException ( STRING ) ; } org.springframework.data.projection.BeanWrapper . setPropertyValue ( java.beans.PropertyDescriptor . java.lang.String ( ) , org.springframework.data.projection.MethodInvocation . getArguments ( ) [ NUMBER ] ) ; return null ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method , java.beans.PropertyDescriptor java.beans.PropertyDescriptor ) { return java.lang.reflect.Method . boolean ( java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) ) ; }  <METHOD_END>