<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; if ( ! ( java.lang.Object instanceof Persistable ) ) { throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , Persistable .class ) ) ; } return ( ( Persistable < ? > ) java.lang.Object ) . isNew ( ) ; }  <METHOD_END>