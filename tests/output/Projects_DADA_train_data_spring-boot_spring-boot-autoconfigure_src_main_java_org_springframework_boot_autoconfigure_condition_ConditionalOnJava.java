<METHOD_START> void ( int int , java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . int = int ; this . java.lang.String = java.lang.String ; this . boolean = ClassUtils . isPresent ( java.lang.String , java.lang.Class<? extends org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion> ( ) . java.lang.ClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range , org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion ) { Assert . notNull ( org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range , STRING ) ; Assert . notNull ( org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion , STRING ) ; switch ( org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range ) { case org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range : return this . int >= org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion . int ; case org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range : return this . int < org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion . int ; } throw new java.lang.IllegalStateException ( STRING + org.springframework.boot.autoconfigure.condition.ConditionalOnJava.Range ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public static org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion ( ) { for ( org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion : org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion . org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion[] ( ) ) { if ( org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion . boolean ) { return org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion ; } } return org.springframework.boot.autoconfigure.condition.ConditionalOnJava.JavaVersion ; }  <METHOD_END>
