<METHOD_START> protected org.springframework.boot.actuate.autoconfigure.HealthIndicator org.springframework.boot.actuate.autoconfigure.HealthIndicator ( java.util.Map<java.lang.String,S> < java.lang.String , S > java.util.Map<java.lang.String,S> ) { if ( java.util.Map<java.lang.String,S> . int ( ) == NUMBER ) { return H ( java.util.Map<java.lang.String,S> . java.util.Collection<S> ( ) . java.util.Iterator<S> ( ) . S ( ) ) ; } CompositeHealthIndicator org.springframework.boot.actuate.autoconfigure.CompositeHealthIndicator = new CompositeHealthIndicator ( this . org.springframework.boot.actuate.autoconfigure.HealthAggregator ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,S> < java.lang.String , S > java.util.Map.Entry<java.lang.String,S> : java.util.Map<java.lang.String,S> . java.util.Set<java.util.Map.Entry<java.lang.String,S>> ( ) ) { org.springframework.boot.actuate.autoconfigure.CompositeHealthIndicator . addHealthIndicator ( java.util.Map.Entry<java.lang.String,S> . java.lang.String ( ) , H ( java.util.Map.Entry<java.lang.String,S> . S ( ) ) ) ; } return org.springframework.boot.actuate.autoconfigure.CompositeHealthIndicator ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected H H ( S S ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = ResolvableType . forClass ( org.springframework.boot.actuate.autoconfigure.CompositeHealthIndicatorConfiguration .class , java.lang.Class<? extends org.springframework.boot.actuate.autoconfigure.CompositeHealthIndicatorConfiguration> ( ) ) . resolveGenerics ( ) ; java.lang.Class<H> < H > java.lang.Class<H> = ( java.lang.Class<H> < H > ) java.lang.Class<?>[] [ NUMBER ] ; java.lang.Class<S> < S > java.lang.Class<S> = ( java.lang.Class<S> < S > ) java.lang.Class<?>[] [ NUMBER ] ; try { return java.lang.Class<H> . java.lang.reflect.Constructor<H> ( java.lang.Class<S> ) . H ( S ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Class<H> + STRING + java.lang.Class<S> , java.lang.Exception ) ; } }  <METHOD_END>
