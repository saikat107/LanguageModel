<METHOD_START> public static org.springframework.validation.BindingResult org.springframework.validation.BindingResult ( java.util.Map<?,?> < ? , ? > java.util.Map<?,?> , java.lang.String java.lang.String ) { Assert . notNull ( java.util.Map<,> , STRING ) ; Assert . notNull ( java.lang.String , STRING ) ; java.lang.Object java.lang.Object = java.util.Map<,> . get ( BindingResult . MODEL_KEY_PREFIX + java.lang.String ) ; if ( java.lang.Object != null && ! ( java.lang.Object instanceof BindingResult ) ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object ) ; } return ( BindingResult ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> public static org.springframework.validation.BindingResult org.springframework.validation.BindingResult ( java.util.Map<?,?> < ? , ? > java.util.Map<?,?> , java.lang.String java.lang.String ) { BindingResult org.springframework.validation.BindingResult = org.springframework.validation.BindingResult ( java.util.Map<,> , java.lang.String ) ; if ( org.springframework.validation.BindingResult == null ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING ) ; } return org.springframework.validation.BindingResult ; }  <METHOD_END>