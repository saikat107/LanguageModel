<METHOD_START> @ java.lang.Override public int int ( ) { return Ordered . LOWEST_PRECEDENCE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEnvironmentPreparedEvent org.springframework.boot.context.ApplicationEnvironmentPreparedEvent ) { RelaxedPropertyResolver org.springframework.boot.context.RelaxedPropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.context.ApplicationEnvironmentPreparedEvent . getEnvironment ( ) , STRING ) ; if ( org.springframework.boot.context.RelaxedPropertyResolver . containsProperty ( STRING ) ) { java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.springframework.boot.context.RelaxedPropertyResolver . getProperty ( STRING ) ; if ( java.lang.String != null && ! java.lang.String . boolean ( java.lang.String ) ) { org.springframework.boot.context.Log . error ( STRING + java.lang.String + STRING + java.lang.String + STRING ) ; org.springframework.boot.context.Log . error ( STRING + java.lang.System . java.lang.String ( STRING ) + STRING + java.lang.String + STRING ) ; org.springframework.boot.context.Log . error ( STRING + java.lang.System . java.lang.String ( STRING ) + STRING + java.lang.String + STRING ) ; throw new java.lang.IllegalStateException ( STRING + STRING + java.lang.String + STRING ) ; } } }  <METHOD_END>
