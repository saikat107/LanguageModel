<METHOD_START> public void ( RepositoryPopulator org.springframework.data.repository.init.RepositoryPopulator , Repositories org.springframework.data.repository.init.Repositories ) { super( org.springframework.data.repository.init.RepositoryPopulator ); Assert . notNull ( org.springframework.data.repository.init.RepositoryPopulator , STRING ) ; Assert . notNull ( org.springframework.data.repository.init.Repositories , STRING ) ; this . org.springframework.data.repository.init.Repositories = org.springframework.data.repository.init.Repositories ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.repository.init.RepositoryPopulator org.springframework.data.repository.init.RepositoryPopulator ( ) { return ( RepositoryPopulator ) super. getSource ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.repository.init.Repositories org.springframework.data.repository.init.Repositories ( ) { return org.springframework.data.repository.init.Repositories ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( java.lang.Object == null || ! java.lang.Class<? extends org.springframework.data.repository.init.RepositoriesPopulatedEvent> ( ) . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) { return false ; } org.springframework.data.repository.init.RepositoriesPopulatedEvent org.springframework.data.repository.init.RepositoriesPopulatedEvent = ( org.springframework.data.repository.init.RepositoriesPopulatedEvent ) java.lang.Object ; return this . source . equals ( org.springframework.data.repository.init.RepositoriesPopulatedEvent . source ) && this . org.springframework.data.repository.init.Repositories . equals ( org.springframework.data.repository.init.RepositoriesPopulatedEvent . org.springframework.data.repository.init.Repositories ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = NUMBER ; int += NUMBER * source . hashCode ( ) ; int += NUMBER * org.springframework.data.repository.init.Repositories . hashCode ( ) ; return int ; }  <METHOD_END>