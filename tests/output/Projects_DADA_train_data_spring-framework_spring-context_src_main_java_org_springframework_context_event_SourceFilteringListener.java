<METHOD_START> public void ( java.lang.Object java.lang.Object , ApplicationListener < ? > org.springframework.context.event.ApplicationListener<?> ) { this . java.lang.Object = java.lang.Object ; this . org.springframework.context.event.GenericApplicationListener = ( org.springframework.context.event.ApplicationListener<> instanceof GenericApplicationListener ? ( GenericApplicationListener ) org.springframework.context.event.ApplicationListener<> : new GenericApplicationListenerAdapter ( org.springframework.context.event.ApplicationListener<> ) ) ; }  <METHOD_END>
<METHOD_START> protected void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEvent org.springframework.context.event.ApplicationEvent ) { if ( org.springframework.context.event.ApplicationEvent . getSource ( ) == this . java.lang.Object ) { void ( org.springframework.context.event.ApplicationEvent ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.context.event.ResolvableType ) { return ( this . org.springframework.context.event.GenericApplicationListener == null || this . org.springframework.context.event.GenericApplicationListener . supportsEventType ( org.springframework.context.event.ResolvableType ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<? extends org.springframework.context.event.ApplicationEvent> < ? extends ApplicationEvent > java.lang.Class<? extends org.springframework.context.event.ApplicationEvent> ) { return boolean ( ResolvableType . forType ( java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ( java.lang.Class<> != null && java.lang.Class<> . boolean ( this . java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return ( this . org.springframework.context.event.GenericApplicationListener != null ? this . org.springframework.context.event.GenericApplicationListener . getOrder ( ) : Ordered . LOWEST_PRECEDENCE ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ApplicationEvent org.springframework.context.event.ApplicationEvent ) { if ( this . org.springframework.context.event.GenericApplicationListener == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } this . org.springframework.context.event.GenericApplicationListener . onApplicationEvent ( org.springframework.context.event.ApplicationEvent ) ; }  <METHOD_END>
