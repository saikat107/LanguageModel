<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( DestinationResolver < D > org.springframework.messaging.core.DestinationResolver<D> ) { Assert . notNull ( org.springframework.messaging.core.DestinationResolver<D> , STRING ) ; this . org.springframework.messaging.core.DestinationResolver<D> = org.springframework.messaging.core.DestinationResolver<D> ; }  <METHOD_END>
<METHOD_START> public void void ( DestinationResolver < D > org.springframework.messaging.core.DestinationResolver<D> ) { this . org.springframework.messaging.core.DestinationResolver<D> = org.springframework.messaging.core.DestinationResolver<D> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.messaging.core.DestinationResolver<D> == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public D D ( java.lang.String java.lang.String ) throws org.springframework.messaging.core.DestinationResolutionException { D D = this . java.util.Map<java.lang.String,D> . D ( java.lang.String ) ; if ( D == null ) { D = this . org.springframework.messaging.core.DestinationResolver<D> . resolveDestination ( java.lang.String ) ; this . java.util.Map<java.lang.String,D> . D ( java.lang.String , D ) ; } return D ; }  <METHOD_END>
